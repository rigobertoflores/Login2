package com.example.login2;

import com.example.login2.Model.User;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserResponse {

    @SerializedName("result")
    @Expose
    private User user;

    public User getUser() {
        return user;
    }
}
