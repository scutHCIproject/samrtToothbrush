package com.example.max.smarttoothbrush.Controller;

import android.app.Dialog;
//import android.support.v7.app.AppCompatActivity;
import android.content.Context;
import android.os.Bundle;

import com.example.max.smarttoothbrush.R;

public class CalenderActivity extends Dialog {

    public CalenderActivity(Context context) {
        super(context,R.style.MyDialog);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calender_layout);
    }
}