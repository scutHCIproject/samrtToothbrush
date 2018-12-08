package com.example.max.smarttoothbrush;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {

    private  Button mBtn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {//加載佈局，綁定事件

        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);//為當前活動加載一個佈局


        /**測試*/
        Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data="數據來自於活動1";
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                intent.putExtra("extra_data",data);//在itent中暫時存放數據 參數爲 鍵與實際數據
                startActivity(intent);// 跳轉到活動2
            }
        });
    }
}
