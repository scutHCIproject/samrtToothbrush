package com.example.max.smarttoothbrush.View;

import android.app.Activity;
import android.graphics.Color;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.max.smarttoothbrush.R;

public class HomeView {
        public void homeview(Activity context,String msg) {
            /**注册组件*/
            TextView textView1=(TextView) context.findViewById(R.id.textname);
            TextView textView2=(TextView) context.findViewById(R.id.textlevel);
            TextView textView3=(TextView) context.findViewById(R.id.textcoin);
            ImageView home=(ImageView) context.findViewById(R.id.imghome);
            ImageView avatar=(ImageView) context.findViewById((R.id.imgavatar));
            ImageView logo=(ImageView) context.findViewById(R.id.imglogo);
            ImageView goal=(ImageView) context.findViewById(R.id.imggoal);

            LinearLayout layout1= (LinearLayout) ( context.findViewById(R.id.layoutmain1));
            LinearLayout layout2= (LinearLayout) ( context.findViewById(R.id.layoutmain2));
            LinearLayout layout3= (LinearLayout) ( context.findViewById(R.id.layoutmain3));
            FrameLayout layout4= (FrameLayout) ( context.findViewById(R.id.layoutmain4));


            /**根据不同的条件加载不同的东西*/
            if( msg.equals("0")){
                textView1.setText("girl");
                textView2.setText("等级g");
                textView3.setText("代币g");
                home.setImageResource(R.drawable.homebutton_girl);
                logo.setImageResource(R.drawable.logo_girl);
                goal.setImageResource(R.drawable.girlgoal);
                layout1.setBackgroundColor(Color.parseColor("#f9bbdb"));
                layout2.setBackgroundColor(Color.parseColor("#f9bbdb"));
                layout3.setBackgroundColor(Color.parseColor("#f9bbdb"));
                layout4.setBackgroundColor(Color.parseColor("#f9bbdb"));
            }else if(msg.equals("1")){
                textView1.setText("boy");
                textView2.setText("等级b");
                textView3.setText("代币b");
                home.setImageResource(R.drawable.homebutton_boy);
                logo.setImageResource(R.drawable.logo_boy);
                goal.setImageResource(R.drawable.boygoal);
                layout1.setBackgroundColor(Color.parseColor("#88d4f6"));
                layout2.setBackgroundColor(Color.parseColor("#88d4f6"));
                layout3.setBackgroundColor(Color.parseColor("#88d4f6"));
                layout4.setBackgroundColor(Color.parseColor("#88d4f6"));
            }
        }
}
