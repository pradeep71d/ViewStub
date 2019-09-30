package com.example.viewstubdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button showbutton;
    Button hidebutton;
    ViewStub viewStub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showbutton = findViewById(R.id.b1);
        hidebutton = findViewById(R.id.b2);
        viewStub = findViewById(R.id.viewstub);
        viewStub.inflate();//
        showbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewStub.setVisibility(View.VISIBLE);//setting visibility here for view stub
            }
        });
        hidebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewStub.setVisibility(View.GONE);//removing visibilty by clcik on hidebutton
            }
        });
    }
}
