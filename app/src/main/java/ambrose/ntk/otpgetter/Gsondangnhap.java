package ambrose.ntk.otpgetter;


import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Gsondangnhap implements Parcelable {

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("gold")
    @Expose
    private String gold;
    @SerializedName("gold_hold")
    @Expose
    private String goldHold;
    @SerializedName("token")
    @Expose
    private String token;
    @SerializedName("usermvt")
    @Expose
    private String usermvt;
    @SerializedName("otp")
    @Expose
    private String otp;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("pmvt")
    @Expose
    private String pmvt;
    @SerializedName("card_id")
    @Expose
    private String cardId;
    @SerializedName("paygate_id")
    @Expose
    private String paygateId;
    @SerializedName("amount")
    @Expose
    private Object amount;
    @SerializedName("cid")
    @Expose
    private String cid;
    @SerializedName("note")
    @Expose
    private String note;
    @SerializedName("lastmoney")
    @Expose
    private String lastmoney;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("response")
    @Expose
    private String response;
    @SerializedName("seri")
    @Expose
    private String seri;
    @SerializedName("pin")
    @Expose
    private String pin;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("percent")
    @Expose
    private String percent;
    @SerializedName("transRef")
    @Expose
    private String transRef;
    @SerializedName("transId")
    @Expose
    private String transId;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("ip")
    @Expose
    private String ip;
    @SerializedName("stt")
    @Expose
    private Integer stt;
    @SerializedName("price")
    @Expose
    private Integer price;


    protected Gsondangnhap(Parcel in) {
        id = in.readString();
        phone = in.readString();
        gold = in.readString();
        goldHold = in.readString();
        token = in.readString();
        usermvt = in.readString();
        name = in.readString();
        pmvt = in.readString();
        cardId = in.readString();
        paygateId = in.readString();
        cid = in.readString();
        note = in.readString();
        lastmoney = in.readString();
        created = in.readString();
        status = in.readString();
        response = in.readString();
        seri = in.readString();
        pin = in.readString();
        code = in.readString();
        percent = in.readString();
        transRef = in.readString();
        transId = in.readString();
        type = in.readString();
        ip = in.readString();
        if (in.readByte() == 0) {
            stt = null;
        } else {
            stt = in.readInt();
        }
        if (in.readByte() == 0) {
            price = null;
        } else {
            price = in.readInt();
        }
    }

    public static final Creator<Gsondangnhap> CREATOR = new Creator<Gsondangnhap>() {
        @Override
        public Gsondangnhap createFromParcel(Parcel in) {
            return new Gsondangnhap( in );
        }

        @Override
        public Gsondangnhap[] newArray(int size) {
            return new Gsondangnhap[size];
        }
    };

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGold() {
        return gold;
    }

    public void setGold(String gold) {
        this.gold = gold;
    }

    public String getGoldHold() {
        return goldHold;
    }

    public void setGoldHold(String goldHold) {
        this.goldHold = goldHold;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUsermvt() {
        return usermvt;
    }

    public void setUsermvt(String usermvt) {
        this.usermvt = usermvt;
    }
    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPmvt() {
        return pmvt;
    }

    public void setPmvt(String pmvt) {
        this.pmvt = pmvt;
    }
    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getPaygateId() {
        return paygateId;
    }

    public void setPaygateId(String paygateId) {
        this.paygateId = paygateId;
    }

    public Object getAmount() {
        return amount;
    }

    public void setAmount(Object amount) {
        this.amount = amount;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getLastmoney() {
        return lastmoney;
    }

    public void setLastmoney(String lastmoney) {
        this.lastmoney = lastmoney;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getSeri() {
        return seri;
    }

    public void setSeri(String seri) {
        this.seri = seri;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPercent() {
        return percent;
    }

    public void setPercent(String percent) {
        this.percent = percent;
    }

    public String getTransRef() {
        return transRef;
    }

    public void setTransRef(String transRef) {
        this.transRef = transRef;
    }

    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getStt() {
        return stt;
    }

    public void setStt(Integer stt) {
        this.stt = stt;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString( id );
        parcel.writeString( phone );
        parcel.writeString( gold );
        parcel.writeString( goldHold );
        parcel.writeString( token );
        parcel.writeString( usermvt );
        parcel.writeString( name );
        parcel.writeString( pmvt );
        parcel.writeString( cardId );
        parcel.writeString( paygateId );
        parcel.writeString( cid );
        parcel.writeString( note );
        parcel.writeString( lastmoney );
        parcel.writeString( created );
        parcel.writeString( status );
        parcel.writeString( response );
        parcel.writeString( seri );
        parcel.writeString( pin );
        parcel.writeString( code );
        parcel.writeString( percent );
        parcel.writeString( transRef );
        parcel.writeString( transId );
        parcel.writeString( type );
        parcel.writeString( ip );
        if (stt == null) {
            parcel.writeByte( (byte) 0 );
        } else {
            parcel.writeByte( (byte) 1 );
            parcel.writeInt( stt );
        }
        if (price == null) {
            parcel.writeByte( (byte) 0 );
        } else {
            parcel.writeByte( (byte) 1 );
            parcel.writeInt( price );
        }
    }
}