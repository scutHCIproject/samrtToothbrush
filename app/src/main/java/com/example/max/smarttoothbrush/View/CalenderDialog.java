package com.example.max.smarttoothbrush.View;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.max.smarttoothbrush.R;

public class CalenderDialog extends Dialog implements View.OnClickListener {
    private ImageView LA, RA, content1, star;
    private TextView starnum;
    private ConstraintLayout L1;
    private LinearLayout L2;
    private String theme;

    private Context context;
    private CalenderDialogImgListener listener;

    public interface CalenderDialogImgListener {
        public void onClick(View view);
    }

    public CalenderDialog(Context context) {
        super(context);
        this.context = context;
    }

    public CalenderDialog(Context context,String msg) {
        super(context);
        this.context = context;
        this.theme=msg;
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
        LA = (ImageView) findViewById(R.id.leftArrowImage);
        RA = (ImageView) findViewById(R.id.rightArrowImage);
        content1 = (ImageView) findViewById(R.id.dayOrNightImage);
        star = (ImageView) findViewById(R.id.starimg);
        starnum = (TextView) findViewById(R.id.starNumber);
        L1=(ConstraintLayout)findViewById(R.id.dayAndNightLayout);
        L2=(LinearLayout)findViewById(R.id.dataLayout);

        LA.setOnClickListener(this);
        RA.setOnClickListener(this);
        content1.setOnClickListener(this);

        if(theme.equals("girl")){
            LA.setImageResource(R.drawable.arrow_left_templateg2);
            RA.setImageResource(R.drawable.arrow_left_templateg);
            L1.setBackgroundColor(Color.parseColor("#fddbeb"));
            L2.setBackgroundColor(Color.parseColor("#ffc4c5"));
        }

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.leftArrowImage:
                RA.setVisibility(View.VISIBLE);
                LA.setVisibility(View.INVISIBLE);
                content1.setImageResource(R.drawable.reward_daytime);
                starnum.setText(String.valueOf(4));
                break;
            case R.id.rightArrowImage:
                LA.setVisibility(View.VISIBLE);
                RA.setVisibility(View.INVISIBLE);
                content1.setImageResource(R.drawable.reward_night);
                starnum.setText(String.valueOf(3));
                break;
            default:
                break;
        }
    }
}
