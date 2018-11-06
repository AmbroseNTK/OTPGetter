package ambrose.ntk.otpgetter;

public class APIUtils {
    public static final String Base_url = "http://appv2api.knbpay.com/";
    public static IParseSMS getData()
    {
        return Retrofitclient.getClient( Base_url ).create( IParseSMS.class );
    }

}
