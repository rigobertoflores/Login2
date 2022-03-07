package com.example.login2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.login2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

 private EditText user;
 private EditText pass;
 private Button button;
private UserViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        configView();
    }

    private void configView() {
    viewModel= new ViewModelProvider(this).get(UserViewModel.class);
    ActivityMainBinding mainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        mainBinding.setLifecycleOwner(this);

    mainBinding.button2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            mainBinding.setUser(viewModel);
            Toast.makeText(MainActivity.this, "Hi todo salio OKKK", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(MainActivity.this,HelloActivity.class));

        }});
  }
//    public void setUserPass(){
//        Toast.makeText(this, "Hola again", Toast.LENGTH_SHORT).show();
//    }
}