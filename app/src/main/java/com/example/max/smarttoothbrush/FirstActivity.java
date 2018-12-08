package com.example.max.smarttoothbrush;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {

    private  Button mBtn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.first_layout);//為當前活動加載一個佈局

//        private void initView(){
//            mBtn1 =findViewById(R.id.button1);
//            bindOnClickLister(listen:this,mBtn1);
//        }
    }
}
