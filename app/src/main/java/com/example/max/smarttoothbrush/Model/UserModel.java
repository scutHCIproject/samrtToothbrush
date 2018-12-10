package com.example.max.smarttoothbrush.Model;

import com.example.max.smarttoothbrush.Entity.User;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import java.util.Date;
import java.text.SimpleDateFormat;

public class UserModel {
    private User user;
<<<<<<< HEAD
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

    public String getyestodayStar(){
        Random rand = new Random();rand.nextInt(10);
        return String.valueOf(rand.nextInt(10));
=======
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
>>>>>>> 85145aae2c43ab1f20850afeb401d84b46093db2
    }



}
