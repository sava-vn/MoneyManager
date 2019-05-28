package com.example.moneymanager.model;

public class WMonth extends WBasic{
    private WDay[] mArrWDay;

    public WMonth() {
        super();
        this.mArrWDay = new WDay[32];
        for(int i=1;i<=31;i++)
            this.mArrWDay[i]= new WDay();
    }

    public WDay[] getmArrWDay() {
        return mArrWDay;
    }

    public void setmArrWDay(WDay[] mArrWDay) {
        this.mArrWDay = mArrWDay;
    }
}
