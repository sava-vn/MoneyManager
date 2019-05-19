package com.example.moneymanager.model;

public class Wallet {
    private Year[] mArrYear;
    private long mMoneyIn;
    private long mMoneyOut;
    public Wallet() {
        mArrYear = new Year[31];
        for(int i=1;i<=30;i++)
            mArrYear[i] = new Year();
    }

    public Year[] getmArrYear() {
        return mArrYear;
    }

    public void setmArrYear(Year[] mArrYear) {
        this.mArrYear = mArrYear;
    }

    public long getmMoneyIn() {
        return mMoneyIn;
    }

    public void setmMoneyIn(long mMoneyIn) {
        this.mMoneyIn += mMoneyIn;
    }

    public long getmMoneyOut() {
        return mMoneyOut;
    }

    public void setmMoneyOut(long mMoneyOut) {
        this.mMoneyOut += mMoneyOut;
    }
}
