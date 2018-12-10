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
        private ImageView avatar,home,logo,goal,la,ra,ava1,ava2;
        private LinearLayout L1, L2, L3,d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11,d12,d13,d14,d15,d16,d17,d18,d19,d20,d21;
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

            ava1=(ImageView)context.findViewById(R.id.avatar1) ;
            ava2=(ImageView)context.findViewById(R.id.avatar2) ;
            la=(ImageView)context.findViewById(R.id.leftArrowImage) ;
            ra=(ImageView)context.findViewById(R.id.rightArrowImage) ;

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

            d1=(LinearLayout)(context.findViewById(R.id.day1));
            d2=(LinearLayout)(context.findViewById(R.id.day2));
            d3=(LinearLayout)(context.findViewById(R.id.day3));
            d4=(LinearLayout)(context.findViewById(R.id.day4));
            d5=(LinearLayout)(context.findViewById(R.id.day5));
            d6=(LinearLayout)(context.findViewById(R.id.day6));
            d7=(LinearLayout)(context.findViewById(R.id.day7));

            d8=(LinearLayout)(context.findViewById(R.id.day8));
            d9=(LinearLayout)(context.findViewById(R.id.day9));
            d10=(LinearLayout)(context.findViewById(R.id.day10));
            d11=(LinearLayout)(context.findViewById(R.id.day11));
            d12=(LinearLayout)(context.findViewById(R.id.day12));
            d13=(LinearLayout)(context.findViewById(R.id.day13));
            d14=(LinearLayout)(context.findViewById(R.id.day14));

            d15=(LinearLayout)(context.findViewById(R.id.day15));
            d16=(LinearLayout)(context.findViewById(R.id.day16));
            d17=(LinearLayout)(context.findViewById(R.id.day17));
            d18=(LinearLayout)(context.findViewById(R.id.day18));
            d19=(LinearLayout)(context.findViewById(R.id.day19));
            d20=(LinearLayout)(context.findViewById(R.id.day20));
            d21=(LinearLayout)(context.findViewById(R.id.day21));

            initInfo(msg);
            initView(sex);
        }

        public void initInfo(String msg){//参数为username
            UserModel userModel=new UserModel();
            name.setText(msg);
            level.setText(userModel.dealLevel(msg));
            coin.setText(userModel.dealCoin(msg));
        }

        public void initView(int sex){
            switch(sex){
                case 0:
                    avatar.setImageResource(R.drawable.ava1);
                    home.setImageResource(R.drawable.homebutton_girl);
                    logo.setImageResource(R.drawable.logo_girl);
                    goal.setImageResource(R.drawable.goal_girl);
//                    la.setImageResource(R.drawable.arrow_left_templateg2);
//                    ra.setImageResource(R.drawable.arrow_left_templateg);
//                    ava1.setImageResource(R.drawable.ava1);
//                    ava2.setImageResource(R.drawable.ava2);

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
                    d1.setBackgroundColor(Color.parseColor("#ffefff"));
                    d2.setBackgroundColor(Color.parseColor("#ffefff"));
                    d3.setBackgroundColor(Color.parseColor("#ffefff"));
                    d4.setBackgroundColor(Color.parseColor("#ffefff"));
                    d5.setBackgroundColor(Color.parseColor("#ffefff"));
                    d6.setBackgroundColor(Color.parseColor("#ffefff"));
                    d7.setBackgroundColor(Color.parseColor("#ffefff"));
                    d8.setBackgroundColor(Color.parseColor("#fddbeb"));
                    d9.setBackgroundColor(Color.parseColor("#fddbeb"));
                    d10.setBackgroundColor(Color.parseColor("#fddbeb"));
                    d11.setBackgroundColor(Color.parseColor("#fddbeb"));
                    d12.setBackgroundColor(Color.parseColor("#fddbeb"));
                    d13.setBackgroundColor(Color.parseColor("#fddbeb"));
                    d14.setBackgroundColor(Color.parseColor("#fddbeb"));
                    d15.setBackgroundColor(Color.parseColor("#ffc4c5"));
                    d16.setBackgroundColor(Color.parseColor("#ffc4c5"));
                    d17.setBackgroundColor(Color.parseColor("#ffc4c5"));
                    d18.setBackgroundColor(Color.parseColor("#ffc4c5"));
                    d19.setBackgroundColor(Color.parseColor("#ffc4c5"));
                    d20.setBackgroundColor(Color.parseColor("#ffc4c5"));
                    d21.setBackgroundColor(Color.parseColor("#ffc4c5"));
                    break;
                case 1:
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
