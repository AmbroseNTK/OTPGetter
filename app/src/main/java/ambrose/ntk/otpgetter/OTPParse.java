package ambrose.ntk.otpgetter;

import android.widget.EditText;
import android.widget.TextView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by root on 16/01/2018.
 */

public  class OTPParse implements IParseSMS{
    private String otp;
    private Pattern pattern;
    private TextView etResult;
    //private TextView txtview;

    public OTPParse(TextView etResult){
        pattern=Pattern.compile("[a-z0-9]{10}");
        this.etResult=etResult;
    }
    public void parse(String sms){
        try {
            Matcher matcher = pattern.matcher(sms);
            while (matcher.find()) {

                int numCount = 0;
                int alphaCount = 0;
                String sample = matcher.group();
                for (char c : sample.toCharArray()) {
                    if (Character.isLetter(c))
                        alphaCount++;
                    else if (Character.isDigit(c))
                        numCount++;
                }
                if (numCount < 5 || alphaCount < 5) {
                    otp = sample;
                    etResult.setText(otp);
                }
                return;
            }
        }catch(Exception e){}
    }

    @Override
    public String bankName() {
        return "VCB";
    }

    @Override
    public String getOTP() {
        return otp;
    }

    @Override
    public String Login(String a) {
        return a;
    }



    public String getOtp() {
        return otp;
    }

}
