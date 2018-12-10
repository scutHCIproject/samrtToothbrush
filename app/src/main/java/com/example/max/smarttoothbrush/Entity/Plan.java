package com.example.max.smarttoothbrush.Entity;

import java.util.Calendar;
import java.util.Date;

public class Plan {
    private Day[] dayList;
    private String goal;

    //构造函数，自动根据第一天来填充后21天
    public Plan(Date startDay, String goal){
        this.goal = goal;

        this.dayList = new Day[21];
        Date today = new Date();
        this.dayList[0].setDate(today);
        Calendar c = Calendar.getInstance();
        c.setTime(today);
        for (int i=1; i<21; i++){
            c.add(Calendar.DAY_OF_MONTH,1);
            Date tomorrow = c.getTime();
            this.dayList[i].setDate(tomorrow);
        }
    }

    //number从0开始，即第一天为dayList[0]
    public Day getDay(int number){
        return dayList[number];
    }

    public String getGoal() {
        return goal;
    }
}
