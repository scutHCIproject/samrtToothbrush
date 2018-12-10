package com.example.max.smarttoothbrush.Model;

import com.example.max.smarttoothbrush.Entity.User;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import java.util.Date;
import java.text.SimpleDateFormat;

public class UserModel {
    private User user;
    public String dealUser(){
        return user.getUsername();
    }

    public String dealLevel(String name){
        if(name.equals("boy"))
            return "5";
        else
            return "8";
    }

    public String dealCoin(String name){
        if(name.equals("boy"))
            return "13";
        else
            return "12";
    }

    public String dealStar(String name){
        if(name.equals("boy"))
            return "17";
        else
            return "30";
    }

    public int dealSex(String name){
        if(name.equals("boy"))
            return 1;
        else
            return 0;
    }

    public String getDate(){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date curDate = new Date(System.currentTimeMillis());//获取当前时间
        return formatter.format(curDate);
    }

    public String getLevel(){
        Random rand = new Random();rand.nextInt(10);
        return String.valueOf(rand.nextInt(10));
    }

    public String getCoin(){
        Random rand = new Random();rand.nextInt(10);
        return String.valueOf(rand.nextInt(10));
    }

    public String getStar(){
        Random rand = new Random();rand.nextInt(10);
        return String.valueOf(rand.nextInt(10));
    }

    public String gettodayStar(){
        Random rand = new Random();rand.nextInt(10);
        return String.valueOf(rand.nextInt(10));
    }

    public String getyestodayStar() {
        Random rand = new Random();
        rand.nextInt(10);
        return String.valueOf(rand.nextInt(10));


    }
}
