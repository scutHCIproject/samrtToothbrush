package com.example.max.smarttoothbrush.Entity;

import java.util.Date;

public class Day {
    private Date date;
    private int dayStar;
    private int nightStar;
    private int award;

    public Day(Date date) {
        this.date = date;
    }

    public Day(Date date, int dayStar, int nightStar, int award) {
        this.date = date;
        this.dayStar = dayStar;
        this.nightStar = nightStar;
        this.award = award;
    }

    public Day(Date date, int dayStar, int nightStar) {
        this.date = date;
        this.dayStar = dayStar;
        this.nightStar = nightStar;
    }

    public void setAward(int award) {
        this.award = award;
    }

    public void setDayStar(int dayStar) {
        this.dayStar = dayStar;
    }

    public void setNightStar(int nightStar) {
        this.nightStar = nightStar;
    }

    public Date getDate() {
        return date;
    }

    public int getDayStar() {
        return dayStar;
    }

    public int getNightStar() {
        return nightStar;
    }

    public int getAward() {
        return award;
    }

    public void setDate(Date date){
        this.date = date;
    }
}
