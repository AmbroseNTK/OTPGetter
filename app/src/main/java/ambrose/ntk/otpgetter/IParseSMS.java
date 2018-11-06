package ambrose.ntk.otpgetter;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by root on 16/01/2018.
 */

public interface IParseSMS {
    void parse(String sms);


}
