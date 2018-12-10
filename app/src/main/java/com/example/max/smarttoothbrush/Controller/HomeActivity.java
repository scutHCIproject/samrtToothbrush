package com.example.max.smarttoothbrush.Controller;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.max.smarttoothbrush.Model.UserModel;
import com.example.max.smarttoothbrush.R;
import com.example.max.smarttoothbrush.View.CalenderDialog;
import com.example.max.smarttoothbrush.View.HomeView;
import com.example.max.smarttoothbrush.View.UserinfoDialog;

public class HomeActivity extends AppCompatActivity {
    private Context context;
    private UserModel userModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        ImageView home=(ImageView)findViewById(R.id.imghome);
        ImageView avatar=(ImageView)findViewById((R.id.imgavatar));

        Intent intent=this.getIntent();
        final String msg = intent.getStringExtra("login");

        userModel=new UserModel();

        HomeView homeView=new HomeView();
        homeView.homeview(this,msg,userModel.dealSex(msg));                                                     //根据登陆的角色 加载显示，msg为用户名

        avatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserinfoDialog userinfoDialog=new UserinfoDialog(HomeActivity.this);
                Window win = userinfoDialog.getWindow();
                userinfoDialog.show();
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalenderDialog calenderDialog=new CalenderDialog(HomeActivity.this);
                Window win = calenderDialog.getWindow();
                calenderDialog.show();
            }
        });

    }

}
