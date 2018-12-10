package com.example.max.smarttoothbrush.Model;

import com.example.max.smarttoothbrush.Entity.User;

public class UserModel {

    private User user;

    public String dealUser(){
        return user.getUsername();
    }

    public String dealLevel(String name){
        if(name.equals("username1"))
            return "1l";
        else
            return null;
    }

    public String dealCoin(String name){
        if(name.equals("username1"))
            return "1c";
        else
            return null;
    }

    public String dealStar(String name){
        if(name.equals("username1"))
            return "1s";
        else
            return null;
    }

    public int dealSex(String name){
        if(name.equals("username1"))
            return 1;
        else
            return 0;
    }

}
