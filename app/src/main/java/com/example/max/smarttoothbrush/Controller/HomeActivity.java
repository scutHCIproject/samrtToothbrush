package com.example.max.smarttoothbrush.Controller;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.max.smarttoothbrush.Model.UserModel;
import com.example.max.smarttoothbrush.R;
import com.example.max.smarttoothbrush.View.CalenderDialog;
import com.example.max.smarttoothbrush.View.HomeView;
import com.example.max.smarttoothbrush.View.UserInfoActivity;

public class HomeActivity extends AppCompatActivity{
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


        /**点击头像*/
        avatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,UserInfoActivity.class);
                intent.putExtra("theme",msg);
                startActivity(intent);
            }
        });

        /**监听日历*/
        ((LinearLayout)findViewById(R.id.day3)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalenderDialog calenderDialog=new CalenderDialog(HomeActivity.this,msg);
                Window win = calenderDialog.getWindow();
                calenderDialog.show();
            }
        });
        ((LinearLayout)findViewById(R.id.day8)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalenderDialog calenderDialog=new CalenderDialog(HomeActivity.this,msg);
                Window win = calenderDialog.getWindow();
                calenderDialog.show();
            }
        });
        ((LinearLayout)findViewById(R.id.day9)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalenderDialog calenderDialog=new CalenderDialog(HomeActivity.this,msg);
                Window win = calenderDialog.getWindow();
                calenderDialog.show();
            }
        });
        ((LinearLayout)findViewById(R.id.day17)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalenderDialog calenderDialog=new CalenderDialog(HomeActivity.this,msg);
                Window win = calenderDialog.getWindow();
                calenderDialog.show();
            }
        });
        ((LinearLayout)findViewById(R.id.day20)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalenderDialog calenderDialog=new CalenderDialog(HomeActivity.this,msg);
                Window win = calenderDialog.getWindow();
                calenderDialog.show();
            }
        });


    }
}
