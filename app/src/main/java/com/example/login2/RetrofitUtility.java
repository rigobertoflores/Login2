package com.example.login2;

import android.app.Application;

import com.example.login2.Interface.UserApi;
import com.example.login2.Model.User;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitUtility extends Application {
    final String Tag = getClass().getSimpleName();
    private static RetrofitUtility mInstance;
    private static String BaseUrl = "https://jsonplaceholder.typicode.com/";


    private static Retrofit retrofit = null;
    public static RetrofitUtility getApiService() {
        if (retrofit == null) {
            retrofit = new Retrofit
                    .Builder()
                    .baseUrl(BaseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(RetrofitUtility.class);
    }


}