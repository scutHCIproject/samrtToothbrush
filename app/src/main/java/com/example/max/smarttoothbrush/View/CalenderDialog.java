package com.example.max.smarttoothbrush.View;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.max.smarttoothbrush.R;

public class CalenderDialog extends Dialog implements View.OnClickListener {
    private ImageView LA, RA, content1, star;
    private TextView starnum;

    private Context context;
    private CalenderDialogImgListener listener;

    public interface CalenderDialogImgListener {
        public void onClick(View view);
    }

    public CalenderDialog(Context context) {
        super(context);
        this.context = context;
    }

    public CalenderDialog(Context context, int theme, CalenderDialogImgListener listener) {
        super(context, theme);
        this.context = context;
        this.listener = listener;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.calender_layout);
//        initViews();

        LA = (ImageView) findViewById(R.id.leftArrowImage);
        RA = (ImageView) findViewById(R.id.rightArrowImage);
        content1 = (ImageView) findViewById(R.id.dayOrNightImage);
        star = (ImageView) findViewById(R.id.starimg);
        starnum = (TextView) findViewById(R.id.starNumber);

        LA.setOnClickListener(this);
        RA.setOnClickListener(this);
        content1.setOnClickListener(this);
    }

//    private void initViews(){
//        LA=(ImageView)findViewById(R.id.l);
//        RA=(ImageView)findViewById(R.id.r);
//        content1=(ImageView)findViewById(R.id.c);
//        star=(ImageView)findViewById(R.id.s);
//        starnum=(TextView)findViewById(R.id.t);
//
//        LA.setOnClickListener(this);
//        RA.setOnClickListener(this);
//
//        LA.setImageResource(R.drawable.arrow_left_templateg);
//        RA.setImageResource(R.drawable.arrow_right_template);
//        content1.setImageResource(R.drawable.reward_daytime);
//        star.setImageResource(R.drawable.star);
//        starnum.setText("0");
//    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.leftArrowImage:
                RA.setVisibility(View.VISIBLE);
                LA.setVisibility(View.INVISIBLE);
                content1.setImageResource(R.drawable.reward_daytime);
                starnum.setText("l");
                break;
            case R.id.rightArrowImage:
                LA.setVisibility(View.VISIBLE);
                RA.setVisibility(View.INVISIBLE);
                content1.setImageResource(R.drawable.reward_night);
                starnum.setText("r");
                break;
            default:
                break;
        }
    }
}
