package com.example.restapi.Retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    @GET("photos")
    Call<List<Model>> getData();
}
