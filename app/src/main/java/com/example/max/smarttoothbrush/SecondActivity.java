package com.example.max.smarttoothbrush;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        Intent intent = getIntent();
        String data = intent.getStringExtra("extra_data");
        Log.d("活動2,來自於活動1的數據",data);
        Toast.makeText(SecondActivity.this, data, Toast.LENGTH_SHORT).show();//測試接受上一個活動的數據

    }

}
