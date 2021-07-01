package com.example.restapi.Retrofit;

import com.google.gson.annotations.SerializedName;

import retrofit2.http.GET;

public class Model {
    @SerializedName("id")
    int Id;
    @SerializedName("title")
    String title;
    @SerializedName("url")
    String Url;
    @SerializedName("thumbnailUrl")
    String TUrl;

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public String getTUrl() {
        return TUrl;
    }

    public void setTUrl(String TUrl) {
        this.TUrl = TUrl;
    }

    public Model(String url, String TUrl) {
        Url = url;
        this.TUrl = TUrl;
    }

    public Model(int id, String title) {
        Id = id;
        this.title = title;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
