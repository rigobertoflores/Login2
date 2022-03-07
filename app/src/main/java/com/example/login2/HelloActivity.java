package com.example.login2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class HelloActivity extends AppCompatActivity implements RecyclerAdapter.ListItemClick{

    private RecyclerView recyclerView;
    Context context;
    private Toast toast;
public static final int numberList=100;
//    public HelloActivity(Context context) {
//        this.context = context;
//    }

      @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        recyclerView=findViewById(R.id.rvnumeros);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerAdapter recyclerAdapter=new RecyclerAdapter(numberList,this);
        recyclerView.setAdapter(recyclerAdapter);
    }


    @Override
    public void onListItemClick(int clickeditem) {
        if(toast!=null){
            toast.cancel();
        }
            toast=Toast.makeText(this,"Hola"+clickeditem,Toast.LENGTH_LONG);
            toast.show();
    }
}