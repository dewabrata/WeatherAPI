
package com.juara.weatherapi.model;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Clouds implements Serializable, Parcelable
{

    @SerializedName("all")
    @Expose
    private Integer all;
    public final static Creator<Clouds> CREATOR = new Creator<Clouds>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Clouds createFromParcel(Parcel in) {
            return new Clouds(in);
        }

        public Clouds[] newArray(int size) {
            return (new Clouds[size]);
        }

    }
    ;
    private final static long serialVersionUID = 7220270707040307376L;

    protected Clouds(Parcel in) {
        this.all = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Clouds() {
    }

    /**
     * 
     * @param all
     */
    public Clouds(Integer all) {
        super();
        this.all = all;
    }

    public Integer getAll() {
        return all;
    }

    public void setAll(Integer all) {
        this.all = all;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(all);
    }

    public int describeContents() {
        return  0;
    }

}
