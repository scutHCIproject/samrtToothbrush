package com.example.max.smarttoothbrush.View;
import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.max.smarttoothbrush.Controller.BasicActivity;
import com.example.max.smarttoothbrush.Model.UserModel;
import com.example.max.smarttoothbrush.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class UserInfoActivity extends AppCompatActivity {
    private ImageView avatar1,avatar2;
    private TextView time,name2,level,coin,star,yesnum,todnum;
    private ConstraintLayout L1,L2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_info_layout);

        avatar1=(ImageView)findViewById(R.id.avatar1);
        avatar2=(ImageView)findViewById(R.id.avatar2);
        time=(TextView)findViewById(R.id.time);
        name2=(TextView)findViewById(R.id.name2);
        level=(TextView)findViewById(R.id.level);
        coin=(TextView)findViewById(R.id.coin);
        star=(TextView)findViewById(R.id.star);
        yesnum=(TextView)findViewById(R.id.yesnum);
        todnum=(TextView)findViewById(R.id.todnum);
        L1=(ConstraintLayout)findViewById(R.id.userinfolayout1);
        L2=(ConstraintLayout)findViewById(R.id.userinfolayout2);


        UserModel userModel=new UserModel();

        /**info*/
        time.setText(userModel.getDate());
        level.setText(userModel.getLevel());
        coin.setText(userModel.getCoin());
        star.setText(userModel.getStar());
        yesnum.setText(userModel.getyestodayStar());
        todnum.setText(userModel.gettodayStar());

        Intent intent=this.getIntent();
        final String msg = intent.getStringExtra("theme");
        if(msg.equals("girl")){
            avatar1.setImageResource(R.drawable.ava1);
            avatar2.setImageResource(R.drawable.ava2);
            name2.setText("宝宝_boy");
            L1.setBackgroundColor(Color.parseColor("#fddbeb"));
            L2.setBackgroundColor(Color.parseColor("#ffc4c5"));
        }

        avatar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                avatar1.setImageResource(R.drawable.ava1);
                avatar2.setImageResource(R.drawable.ava2);
                Intent intent = new Intent(UserInfoActivity.this, BasicActivity.class);
                intent.putExtra("login", "girl");
                startActivity(intent);
            }
        });
    }
}

