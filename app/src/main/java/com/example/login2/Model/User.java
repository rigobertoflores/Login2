package com.example.login2.Model;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.login2.BR;

public class User extends BaseObservable {
    private String usuario;
    private String pass;

    public User(String usuario, String pass) {
        this.usuario = usuario;
        this.pass = pass;
    }


    @Bindable
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
        notifyPropertyChanged(BR.usuario);
    }
    @Bindable
    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
        notifyPropertyChanged(BR.usuario);
    }

}
