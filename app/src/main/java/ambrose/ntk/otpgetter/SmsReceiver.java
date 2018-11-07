package ambrose.ntk.otpgetter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.widget.Toast;

/**
 * Created by root on 16/01/2018.
 */

public class SmsReceiver extends BroadcastReceiver {
    public static String receiveSMS;
    public static String receivePhone;
    public static IParseSMS smsParser;

    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle intentExtras = intent.getExtras();

        if (intentExtras != null) {
            /* Get Messages */
            Object[] sms = (Object[]) intentExtras.get("pdus");

            for (int i = 0; i < sms.length; ++i) {
                /* parse Each Message */
                SmsMessage smsMessage = SmsMessage.createFromPdu((byte[]) sms[i]);

                String phone = smsMessage.getOriginatingAddress();
                String message = smsMessage.getMessageBody().toString();
                receivePhone = phone;
                receiveSMS=message;
                Toast.makeText(context, phone + ": " + message, Toast.LENGTH_SHORT).show();
                if(smsParser!=null) {

                    smsParser.parse(receiveSMS);
                }
                else{
                    Toast.makeText(context,"Parser not found",Toast.LENGTH_LONG).show();
                }
            }

        }
    }


}
