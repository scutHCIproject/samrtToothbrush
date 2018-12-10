package com.example.max.smarttoothbrush.Model;

import com.example.max.smarttoothbrush.Entity.User;

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



}
