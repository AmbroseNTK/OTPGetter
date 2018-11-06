package ambrose.ntk.otpgetter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    EditText etResult;
    SmsReceiver smsReceiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etResult=(EditText)findViewById(R.id.etResult);
        OTPParse otpParse = new OTPParse(etResult);
        SmsReceiver.smsParser =otpParse;

    }
}
