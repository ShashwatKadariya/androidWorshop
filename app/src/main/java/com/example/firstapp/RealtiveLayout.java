package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class RealtiveLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realtive_layout);

        // set TextView1 to Hello World
        TextView text = findViewById(R.id.text1);
        text.setText("HELLO WORLD");
    }

}