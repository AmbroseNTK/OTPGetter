package ambrose.ntk.otpgetter;


import android.widget.TextView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SixDigitsOTP implements IParseSMS {
    private String otp;
    private Pattern pattern;
    private TextView etResult;
    //private TextView txtview;

    public SixDigitsOTP(TextView etResult){
        pattern=Pattern.compile("[0-9]{6}");
        this.etResult=etResult;
    }
    @Override
    public void parse(String sms) {
        try {
            Matcher matcher = pattern.matcher(sms);
            while (matcher.find()) {

                String sample = matcher.group();

                otp = sample;
                etResult.setText(otp);
                return;

            }
        } catch (Exception e) {
        }
    }

    @Override
    public String bankName() {
        return "VBB";
    }

    @Override
    public String getOTP() {
        return otp;
    }

    @Override
    public String Login(String a) {
        return null;
    }
}
