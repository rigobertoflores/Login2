package com.example.login2;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.databinding.BindingAdapter;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.login2.Model.User;

public class UserViewModel extends ViewModel {
public MutableLiveData<String>user =new MutableLiveData<String>();
public MutableLiveData<String>pass =new MutableLiveData<String>();


public UserViewModel(){
    user=new MutableLiveData<>();
    pass=new MutableLiveData<>();
}
public LiveData<String>getUsuarios(){
    return user;
}



public void addUser(Context context, String data){
    user.setValue(data);
    Toast.makeText(context, "Hola"+user.getValue(), Toast.LENGTH_SHORT).show();
}
//  @BindingAdapter("android:text")
//public static void setText(TextView view,String texts){
//      Toast.makeText(view.getContext(), texts, Toast.LENGTH_SHORT).show();
//
//  }
}
