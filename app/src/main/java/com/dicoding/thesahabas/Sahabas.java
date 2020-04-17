package com.dicoding.thesahabas;

import android.os.Parcel;
import android.os.Parcelable;

public class Sahabas implements Parcelable {
    private String name;
    private String detail;
    private int photo;

    public Sahabas() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(detail);
        dest.writeInt(photo);
    }

    protected Sahabas(Parcel in) {
        this.name = in.readString();
        this.detail = in.readString();
        this.photo = in.readInt();
    }

    public static final Creator<Sahabas> CREATOR = new Creator<Sahabas>() {
        @Override
        public Sahabas createFromParcel(Parcel source) {
            return new Sahabas(source);
        }

        @Override
        public Sahabas[] newArray(int size) {
            return new Sahabas[size];
        }
    };
}
