package ambrose.ntk.otpgetter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    TextView etResult;
    SmsReceiver smsReceiver;
    Button btnclick;
    //  TextView txtview;
    String a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        etResult = (TextView) findViewById( R.id.textView );
        btnclick = (Button) findViewById( R.id.btRunGetter );
        //  txtview = (TextView) findViewById( R.id.textView );
        final OTPParse otpParse = new OTPParse( etResult );

            SmsReceiver.smsParser = otpParse;

            SmsReceiver.processor = new IProcessor() {
                @Override
                public void process() {
                    API apiclient = APIUtils.getData();
                    Call<List<Gsondangnhap>> callback = apiclient.Login( String.valueOf( otpParse.getOtp() ) );
                    callback.enqueue( new Callback<List<Gsondangnhap>>() {
                        @Override
                        public void onResponse(Call<List<Gsondangnhap>> call, Response<List<Gsondangnhap>> response) {
                            ArrayList<Gsondangnhap> gsondangnhaps = (ArrayList<Gsondangnhap>) response.body();
                            Toast.makeText( MainActivity.this, "cailon", Toast.LENGTH_SHORT ).show();
                        }

                        @Override
                        public void onFailure(Call<List<Gsondangnhap>> call, Throwable t) {
                            Toast.makeText( MainActivity.this, "concac", Toast.LENGTH_SHORT ).show();
                        }
                    } );
                }
            };

        }
    }

