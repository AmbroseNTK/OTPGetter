package ambrose.ntk.otpgetter;


import android.widget.EditText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OTPSixNumber implements IParseSMS {
    private String otp;
    private Pattern pattern;
    private EditText etResult;
    public OTPSixNumber(EditText etResult){

        this.etResult=etResult;
    }
    public void parse(String sms){
       int length=0;
       boolean isNum=false;
       for(int i=0;i<sms.length();i++){
           if(Character.isDigit(sms.toCharArray()[i])){
               if(!isNum){
                   isNum=true;
                   length=0;
               }
               length++;
           }
           else{
               if(isNum){
                   if(length==6){
                       otp=sms.substring(i-length,i);
                       length=0;
                   }
               }
           }
           isNum=Character.isDigit(sms.toCharArray()[i]);
       }
       etResult.setText(otp);
    }

    public String getOtp() {
        return otp;
    }

    public void setEtResult(EditText etResult) {
        this.etResult = etResult;
    }
}
