package x27.com.submission;

import android.os.Parcel;
import android.os.Parcelable;

public class Buah implements Parcelable {

    private String name, remarks, photo, deskripsi, lahir, wafat;

    protected Buah(Parcel in) {
        name = in.readString();
        remarks = in.readString();
        photo = in.readString();
        deskripsi = in.readString();
        lahir = in.readString();
        wafat = in.readString();
    }

    public static final Creator<Buah> CREATOR = new Creator<Buah>() {
        @Override
        public Buah createFromParcel(Parcel in) {
            return new Buah(in);
        }

        @Override
        public Buah[] newArray(int size) {
            return new Buah[size];
        }
    };

    public Buah() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getLahir() {
        return lahir;
    }

    public void setLahir(String lahir) {
        this.lahir = lahir;
    }

    public String getWafat() {
        return wafat;
    }

    public void setWafat(String wafat) {
        this.wafat = wafat;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.remarks);
        parcel.writeString(this.photo);
        parcel.writeString(this.deskripsi);
        parcel.writeString(this.lahir);
        parcel.writeString(this.wafat);
    }
}
