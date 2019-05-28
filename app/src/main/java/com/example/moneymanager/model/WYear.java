package com.example.moneymanager.model;

public class WYear extends WBasic{
    private WMonth[] mArrWMonth;

    public WYear() {
        super();
        this.mArrWMonth = new WMonth[13];
        for(int i=1;i<=12;i++)
            this.mArrWMonth[i] = new WMonth();
    }

    public WMonth[] getmArrWMonth() {
        return mArrWMonth;
    }

    public void setmArrWMonth(WMonth[] mArrWMonth) {
        this.mArrWMonth = mArrWMonth;
    }
}
