package com.example.max.smarttoothbrush.Entity;

import java.util.Date;

public class User {
    private String username;
    private int sex; //女是0，男是1
    private int maxStar;
    private int middleStar;
    private int littleStar;
    private Plan plan;

    public User(String username, int sex) {
        this.username = username;
        this.sex = sex;
    }

    public String getUsername() {
        return username;
    }

    public int getSex() {
        return sex;
    }

    public int getMaxStar() {
        return maxStar;
    }

    public int getMiddleStar() {
        return middleStar;
    }

    public int getLittleStar() {
        return littleStar;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setMaxStar(int maxStar) {
        this.maxStar = maxStar;
    }

    public void setMiddleStar(int middleStar) {
        this.middleStar = middleStar;
    }

    public void setLittleStar(int littleStar) {
        this.littleStar = littleStar;
    }

    public void setPlan(Date date, String goal) {
        this.plan = new Plan(date,goal);
    }
}
