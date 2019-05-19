package com.example.moneymanager.model;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class Month extends Time{
    private  Day[] mArrDay;

    public Month(){
        super();
        mArrDay = new Day[32];
        for(int i=1;i<=31;i++)
            mArrDay[i] = new Day();
    }

    public Day[] getmArrDay() {
        return mArrDay;
    }

    public void setmArrDay(Day[] mArrDay) {
        this.mArrDay = mArrDay;
    }

    @NonNull
    @Override
    public String toString() {
        return  mDate.showMonth();
    }
}
