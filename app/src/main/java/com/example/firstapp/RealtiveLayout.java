package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.text.Editable;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.os.Bundle;
import android.widget.RelativeLayout;

import com.google.android.material.textfield.TextInputEditText;

public class RealtiveLayout extends AppCompatActivity {

    private TextView text;
    private TextInputEditText input;
    private Button button;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realtive_layout);

        text = findViewById(R.id.text1);
        input = findViewById(R.id.inputText1);
        button = findViewById(R.id.button1);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Editable inputText = input.getText();
                text.setText(inputText);
            }
        });

    }

}