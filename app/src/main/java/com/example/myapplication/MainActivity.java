package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnDistance = findViewById(R.id.btndistance);
        btnDistance.setOnClickListener((v) -> {
            Intent intent = new Intent(this, Distance.class);
            startActivity(intent);
        });
        Button btnweight = findViewById(R.id.btnweight);
        btnweight.setOnClickListener((v) -> {
            Intent intent = new Intent(this, weightActivity.class);
            startActivity(intent);
        });
        Button btntemperature;
        btntemperature = findViewById(R.id.btntemp);
        btntemperature.setOnClickListener((v) -> {
            Intent intent = new Intent(this, tempconvert.class);
            startActivity(intent);
        });
    }
    }
