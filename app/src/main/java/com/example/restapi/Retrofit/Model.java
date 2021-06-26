package com.example.restapi.Retrofit;

import com.google.gson.annotations.SerializedName;
public class Model {
    @SerializedName("data")
  private MoreData moreData;
//constructor
    public Model(MoreData moreData) {
        this.moreData = moreData;
    }
//getter setter
    public MoreData getMoreData() {
        return moreData;
    }

    public void setMoreData(MoreData moreData) {
        this.moreData = moreData;
    }
}
