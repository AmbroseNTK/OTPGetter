package ambrose.ntk.otpgetter;

public abstract class CustomParser implements IParseSMS {

    public abstract void process(String recievedSms);

    @Override
    public void parse(String sms) {
        process(sms);
    }

    @Override
    public String bankName() {
        return "";
    }

    @Override
    public String getOTP() {
        return "";
    }

    @Override
    public String Login(String a) {
        return "";
    }
}
