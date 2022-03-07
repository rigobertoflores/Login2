package com.example.login2.Interface;

import com.example.login2.Model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface UserApi {
    @GET("group/{id}/users")
    Call<List<User>> groupList(@Path("id") int groupId);
}
