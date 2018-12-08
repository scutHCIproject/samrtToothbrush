package com.example.max.smarttoothbrush;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    private String name;
    private int level;
    private int coin;
    private int stars;
    private String goal;

    private TextView t1;
    private TextView t2;
    private TextView t3;
    private TextView t4;
    private TextView t5;

//    public String getName(){
//        return name;
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);//加載本活動頁面佈局

        /**測試*/
        Intent intent = getIntent();
        String data = intent.getStringExtra("extra_data");
        Log.d("活動2,來自於活動1的數據",data);
        Toast.makeText(SecondActivity.this, data, Toast.LENGTH_SHORT).show();//測試接受上一個活動的數據


        t1 = (TextView)findViewById(R.id.textView4);
//        t2 = (TextView)findViewById(R.id.textView5);
//        t3 = (TextView)findViewById(R.id.textView6);
//        t4 = (TextView)findViewById(R.id.textView7);
//        t5 = (TextView)findViewById(R.id.textView8);

          t1.setText(data);
//        t1.setText(name);
//        t2.setText(level);
//        t3.setText(coin);
//        t4.setText(stars);
//        t5.setText(goal);





    }

}
