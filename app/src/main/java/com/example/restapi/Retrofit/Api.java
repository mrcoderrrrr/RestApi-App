package com.example.restapi.Retrofit;

import android.view.Display;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    @GET("photos")
    Call<List<Model>> getAllData();
}
