package com.example.moneymanager.model;

import androidx.annotation.NonNull;

public class Year extends Time{
    private Month[] mArrMonth;

    public Year(){
        super();
        mArrMonth = new Month[13];
        for(int i=1;i<=12;i++)
            mArrMonth[i] = new Month();
    }

    public Month[] getmArrMonth() {
        return mArrMonth;
    }

    public void setmArrMonth(Month[] mArrMonth) {
        this.mArrMonth = mArrMonth;
    }

    @NonNull
    @Override
    public String toString() {
        return mDate.getmYear() + "";
    }
}
