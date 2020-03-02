package com.ardianeffendi.toptenuniversities;

import android.os.Parcel;
import android.os.Parcelable;

public class Uni implements Parcelable {
    private String name;
    private String detail;
    private int photo;

    public Uni(String mName, String mDetail, int mPhoto) {
        name = mName;
        detail = mDetail;
        photo = mPhoto;
    }

    protected Uni(Parcel in) {
        name = in.readString();
        detail = in.readString();
        photo = in.readInt();
    }

    public static final Creator<Uni> CREATOR = new Creator<Uni>() {
        @Override
        public Uni createFromParcel(Parcel in) {
            return new Uni(in);
        }

        @Override
        public Uni[] newArray(int size) {
            return new Uni[size];
        }
    };


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
}
