package com.example.restapi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.restapi.RecyclerView.Myadpter;
import com.example.restapi.Retrofit.Model;
import com.example.restapi.Retrofit.MyApi;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
RecyclerView rcv;
String url="https://reqres.in/api/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcv=findViewById(R.id.rcView);
        rcv.setLayoutManager(new LinearLayoutManager(this));
        //retrofit
        retrofit();
    }


    private void retrofit() {
    Retrofit retrofit=new Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

        MyApi api=retrofit.create(MyApi.class);
        Call<List<Model>> call=api.getData();

        call.enqueue(new Callback<List<Model>>() {
            @Override
            public void onResponse(Call<List<Model>> call, Response<List<Model>> response) {
                List<Model> list=response.body();
                if (response.isSuccessful()){
                    Myadpter myadpter=new Myadpter(list);
                    rcv.setAdapter(myadpter);
                }
            }

            @Override
            public void onFailure(Call<List<Model>> call, Throwable t) {
                Toast.makeText(MainActivity.this,"error"+t.getMessage(),Toast.LENGTH_LONG).show();
            }
        });
    }
}