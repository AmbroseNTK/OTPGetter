package ambrose.ntk.otpgetter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etResult;
    SmsReceiver smsReceiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etResult=(EditText)findViewById(R.id.etResult);
        OTPSixNumber otpParse = new OTPSixNumber(etResult);
        SmsReceiver.smsParser =otpParse;
    }
}
