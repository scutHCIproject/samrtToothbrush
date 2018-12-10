package com.example.max.smarttoothbrush.Controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.max.smarttoothbrush.R;

public class BasicActivity extends AppCompatActivity{

    private ImageView login_boy;
    private ImageView login_girl;
    private Button btntemp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_basic);

        //关联
        login_boy=(ImageView)findViewById(R.id.imgloginboy);
        login_girl=(ImageView)findViewById((R.id.imglogingirl));

        login_boy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BasicActivity.this,HomeActivity.class);
                intent.putExtra("login","boy");
                startActivity(intent);
            }
        });
        login_girl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BasicActivity.this,HomeActivity.class);
                intent.putExtra("login","girl");
                startActivity(intent);
            }
        });
    }
}
