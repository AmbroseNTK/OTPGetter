package ambrose.ntk.otpgetter;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface API {
    @FormUrlEncoded
    @POST("otp.php")
    Call<List<Gsondangnhap>> Login(@Field( "otp" ) String username);
}
