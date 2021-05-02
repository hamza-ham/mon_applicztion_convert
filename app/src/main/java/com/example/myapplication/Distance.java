package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Distance extends AppCompatActivity {
    EditText input;
    EditText output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distance);
         input= findViewById(R.id.inputkm);
         output= findViewById(R.id.outputm);

        Button button= findViewById(R.id.btnconvert);
        button.setOnClickListener(this::convert);

    }
    void convert(View sender){

           final String inputStr= input.getText().toString();
           final float inputValue =Float.parseFloat(inputStr);
           final float outputValue= inputValue * 1.6f;

           final String outputStr = String.format("%.2f",outputValue);
           output.setText(outputStr);

    }
}