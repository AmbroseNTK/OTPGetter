package ambrose.ntk.otpgetter;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by root on 16/01/2018.
 */

public interface IParseSMS {
    void parse(String sms);
    @FormUrlEncoded
    @POST("otp.php")
    String Login(@Field( "otp" ) String a
                                   );

}
