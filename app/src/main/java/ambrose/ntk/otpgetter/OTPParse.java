package ambrose.ntk.otpgetter;

import android.widget.EditText;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import retrofit2.Call;

/**
 * Created by root on 16/01/2018.
 */

public class OTPParse implements IParseSMS{
    private String otp;
    private Pattern pattern;
    private EditText etResult;
    public OTPParse(EditText etResult){
        pattern=Pattern.compile("[0-9]{6}");
        this.etResult=etResult;
    }
    public void parse(String sms) {
        try {
            Matcher matcher = pattern.matcher(sms);
            while (matcher.find()) {


                String sample = matcher.group();

                otp = sample;
                etResult.setText(otp);


            }
        } catch (Exception e) {
        }
    }



    public String getOtp() {
        return otp;
    }

}
