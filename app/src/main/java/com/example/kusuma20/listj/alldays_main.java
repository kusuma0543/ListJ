package com.example.kusuma20.listj;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by kusuma20 on 13/6/17.
 */

public class alldays_main implements Parcelable{
    String id;
    String name;


    protected alldays_main(Parcel in) {
        id = in.readString();
        name = in.readString();

    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String alldays) {
        this.name = alldays;
    }


    @Override

    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(id);
        dest.writeString(name);

    }
    public static final Creator<alldays_main> CREATOR = new Creator<alldays_main>() {
        @Override
        public alldays_main createFromParcel(Parcel in) {
            return new alldays_main(in);
        }

        @Override
        public alldays_main[] newArray(int size) {
            return new alldays_main[size];
        }
    };
}
