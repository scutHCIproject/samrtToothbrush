package com.example.max.smarttoothbrush.View;

import android.app.Activity;
import android.graphics.Color;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.max.smarttoothbrush.Model.UserModel;
import com.example.max.smarttoothbrush.R;

public class HomeView {
        private UserModel userModel;
        private TextView name,level,coin;
        private ImageView avatar,home,logo,goal;
        private LinearLayout L1,L2,L3;
        private FrameLayout L4;
        private TextView w1,w2,w3,w4,w5,w6,w7;

        /**msg为用户名*/
        public void homeview(Activity context,String msg,int sex) {
            /**注册组件*/
            name=(TextView)context.findViewById(R.id.textname);
            level=(TextView)context.findViewById(R.id.textlevel);
            coin=(TextView)context.findViewById(R.id.textcoin);
            home=(ImageView)context.findViewById(R.id.imghome);
            avatar=(ImageView)context.findViewById((R.id.imgavatar));
            logo=(ImageView)context.findViewById(R.id.imglogo);
            goal=(ImageView)context.findViewById(R.id.imggoal);

            L1= (LinearLayout) (context.findViewById(R.id.layoutmain1));
            L2= (LinearLayout) (context.findViewById(R.id.layoutmain2));
            L3= (LinearLayout) (context.findViewById(R.id.layoutmain3));
            L4= (FrameLayout) (context.findViewById(R.id.layoutmain4));

            w1=(TextView)(context.findViewById(R.id.w1));
            w2=(TextView)(context.findViewById(R.id.w2));
            w3=(TextView)(context.findViewById(R.id.w3));
            w4=(TextView)(context.findViewById(R.id.w4));
            w5=(TextView)(context.findViewById(R.id.w5));
            w6=(TextView)(context.findViewById(R.id.w6));
            w7=(TextView)(context.findViewById(R.id.w7));

            initInfo(msg);
            initView(sex);
        }

//
        public void initInfo(String msg){//参数为username
            UserModel userModel=new UserModel();
            name.setText(msg);
            level.setText(userModel.dealLevel(msg));
            coin.setText(userModel.dealCoin(msg));
        }
//
        public void initView(int sex){
            switch(sex){
                case 0:
                    home.setImageResource(R.drawable.homebutton_girl);
                    logo.setImageResource(R.drawable.logo_girl);
                    goal.setImageResource(R.drawable.girlgoal);
                    L1.setBackgroundColor(Color.parseColor("#f9bbdb"));
                    L2.setBackgroundColor(Color.parseColor("#f9bbdb"));
                    L3.setBackgroundColor(Color.parseColor("#f9bbdb"));
                    L4.setBackgroundColor(Color.parseColor("#f9bbdb"));
                    w1.setTextColor(Color.parseColor("#f9bbdb"));
                    w2.setTextColor(Color.parseColor("#f9bbdb"));
                    w3.setTextColor(Color.parseColor("#f9bbdb"));
                    w4.setTextColor(Color.parseColor("#f9bbdb"));
                    w5.setTextColor(Color.parseColor("#f9bbdb"));
                    w6.setTextColor(Color.parseColor("#f9bbdb"));
                    w7.setTextColor(Color.parseColor("#f9bbdb"));

                    break;
                case 1:
                    home.setImageResource(R.drawable.homebutton_boy);
                    logo.setImageResource(R.drawable.logo_boy);
                    goal.setImageResource(R.drawable.boygoal);
                    L1.setBackgroundColor(Color.parseColor("#88d4f6"));
                    L2.setBackgroundColor(Color.parseColor("#88d4f6"));
                    L3.setBackgroundColor(Color.parseColor("#88d4f6"));
                    L4.setBackgroundColor(Color.parseColor("#88d4f6"));
                    w1.setTextColor(Color.parseColor("#88d4f6"));
                    w2.setTextColor(Color.parseColor("#88d4f6"));
                    w3.setTextColor(Color.parseColor("#88d4f6"));
                    w4.setTextColor(Color.parseColor("#88d4f6"));
                    w5.setTextColor(Color.parseColor("#88d4f6"));
                    w6.setTextColor(Color.parseColor("#88d4f6"));
                    w7.setTextColor(Color.parseColor("#88d4f6"));
                    break;
            }
        }
}
