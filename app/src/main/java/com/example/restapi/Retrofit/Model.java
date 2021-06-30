package com.example.restapi.Retrofit;

import com.google.gson.annotations.SerializedName;

public class Model {
  @SerializedName("albumId")
  int AlbumId;
    @SerializedName("id")
    int id;
    @SerializedName("title")
    String Title;
    @SerializedName("url")
    String Url;
    @SerializedName("thumbnailUrl")
    String Thumbail;

    //Constructor

    public Model(int albumId, int id, String title, String url, String thumbail) {
        AlbumId = albumId;
        this.id = id;
        Title = title;
        Url = url;
        Thumbail = thumbail;
    }

    //Getter And Setter

    public int getAlbumId() {
        return AlbumId;
    }

    public void setAlbumId(int albumId) {
        AlbumId = albumId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public String getThumbail() {
        return Thumbail;
    }

    public void setThumbail(String thumbail) {
        Thumbail = thumbail;
    }
}
