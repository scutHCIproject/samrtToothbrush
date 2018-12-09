package com.example.max.smarttoothbrush.Controller;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.max.smarttoothbrush.R;

public class MainActivity extends AppCompatActivity {
    private CalenderActivity  calenderActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
//        setContentView(R.layout.calender_layout);

        ImageView img1= (ImageView) findViewById( R.id.imageView);

        img1.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, CalenderActivity.class);
//                startActivity( intent);

                calenderActivity = new CalenderActivity(MainActivity.this);
                calenderActivity.show();
            }

        });
    }
}
