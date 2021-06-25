package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.TextView;
import android.view.View;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class RealtiveLayout extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realtive_layout);
    }

    public void onTouch(View view)
    {
        view.setEnabled(false);
    }
}