package com.example.moneymanager.model;

public class Time {
    protected long mMoneyIn;
    protected long mMoneyOut;
    protected long mBlance;
    protected Date mDate;
    protected int mViewType;
    protected int mCountPay;
    protected String mNote;

    public Time() {
        this.mDate = new Date();
        this.mNote = "Không có ghi chú nào";
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

    public long getmBlance() {
        return mBlance;
    }

    public void setmBlance(long mBlance) {
        this.mBlance = mBlance;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = new Date(mDate.getmDay(),mDate.getmMonth(),mDate.getmYear(),mDate.getmDoW());
    }

    public int getmViewType() {
        return mViewType;
    }

    public void setmViewType(int mViewType) {
        this.mViewType = mViewType;
    }

    public int getmCountPay() {
        return mCountPay;
    }

    public void setmCountPay(int mCountPay) {
        this.mCountPay += mCountPay;
    }

    public String getmNote() {
        return mNote;
    }

    public void setmNote(String mNote) {
        this.mNote = mNote;
    }
}
