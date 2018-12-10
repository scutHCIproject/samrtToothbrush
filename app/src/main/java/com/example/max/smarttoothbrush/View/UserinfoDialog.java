package com.example.max.smarttoothbrush.View;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.max.smarttoothbrush.R;

public class UserinfoDialog extends Dialog implements View.OnClickListener {
//    private ImageView avatar1,avatar2;
//    private TextView name2,level,coin,star,yesnum,todnum,time;

    private ImageView avatar2;

    private Context context;
    private UserinfoDialog.UserinfoDialogImgListener listener;

    public interface UserinfoDialogImgListener{
        public void onClick(View view);
    }

    public UserinfoDialog(Context context) {
        super(context);
        this.context = context;
    }

    public UserinfoDialog(Context context, int theme, UserinfoDialog.UserinfoDialogImgListener listener) {
        super(context, theme);
        this.context = context;
        this.listener = listener;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.layout_userinfo);
//        initViews();

//        avatar1=(ImageView)findViewById(R.id.avatar1);
//        avatar2=(ImageView)findViewById(R.id.avatar2);
//        name2=(TextView)findViewById(R.id.name2);
//        level=(TextView)findViewById(R.id.level);
//        coin=(TextView)findViewById(R.id.coin);
//        star=(TextView)findViewById(R.id.star);
//        yesnum=(TextView)findViewById(R.id.yesnum);
//        todnum=(TextView)findViewById(R.id.todnum);
//        time=(TextView)findViewById(R.id.time);

//         avatar2.setOnClickListener(this);

        avatar2=(ImageView)findViewById(R.id.avatart);
        avatar2.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.avatart:
                avatar2.setImageResource(R.drawable.award4);
                ((TextView)findViewById(R.id.yesnumt)).setText("测试点击");
                break;
            default:
                break;
        }
    }
}
