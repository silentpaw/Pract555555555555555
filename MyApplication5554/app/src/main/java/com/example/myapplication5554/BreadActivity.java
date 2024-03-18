package com.example.myapplication5554;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BreadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bread);
    }
    public void OnMain(View v){
        Button Main = findViewById(R.id.Btn_Main);
        Intent intent = new Intent(this, MainActivity.class);
        Main.setOnClickListener(view->{
            startActivity(intent);
        });

    }
}