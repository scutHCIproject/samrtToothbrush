package com.example.max.smarttoothbrush.Model;

import com.example.max.smarttoothbrush.Entity.User;

import java.util.Date;
import java.text.SimpleDateFormat;

public class UserModel {

    private User user;
    DataAccessObject dao;

    public UserModel(String username){
        this.dao = new DataAccessObject(username);
        if(!dao.getCreated()){
            if(username.equals("user1")){//如果为user1就设置为男生，其他全为女生
                this.user = new User(username,1);
            }else{
                this.user = new User(username,0);
            }

            initialization(dao);
        }
    }

    private void initialization(DataAccessObject dao){
        user.setPlan(new Date(),"我要坚持刷牙");
        int count = 0;
        int tempStar;
        for(int i =0;i<21;i++)
        {
            tempStar= (int)Math.random()*(10-1)+1;
            user.getPlan().getDay(i).setDayStar(tempStar);
            count += tempStar;
            tempStar= (int)Math.random()*(10-1)+1;
            user.getPlan().getDay(i).setNightStar(tempStar);
            count += tempStar;
        }

        user.setLittleStar(count%3);
        user.setMiddleStar(count/3%3);
        user.setMaxStar(count/3/3%3);


        dao.save("username",this.user.getUsername());
        dao.save("sex",this.user.getSex());
        dao.save("userLevel",this.user.getMaxStar());
        dao.save("coin",this.user.getMiddleStar());
        dao.save("star",this.user.getLittleStar());
        dao.save("goal",this.user.getPlan().getGoal());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String startDay = sdf.format(this.user.getPlan().getDay(0).getDate());
        dao.save("startDay",startDay);
        String day;
        for(int i=0;i<21;i++){
            day = "day"+i+"star";
            dao.save(day,user.getPlan().getDay(i).getDayStar());
            day = "night"+i+"star";
            dao.save(day, user.getPlan().getDay(i).getNightStar());
        }
    }

    public String getUsername(){
        return dao.getUserName();
    }

    public String getUserLevel(){
        return String.valueOf(dao.getInt("userLevel",0));
    }

    public String getCoin(){
        return String.valueOf(dao.getInt("coin",0));
    }

    //获取某一天的star
    public String getTotalStar(int number){
        return String.valueOf(dao.getInt("day"+number+"star",0) + dao.getInt("night"+number+"star",0));
    }

    public int getSex(){
        return dao.getInt("sex",0);
    }

    public String getGoal(){
        return dao.getString("goal","好好刷牙");
    }



}
