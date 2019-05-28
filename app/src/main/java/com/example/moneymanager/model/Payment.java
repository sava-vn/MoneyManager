package com.example.moneymanager.model;

public class Payment {
    protected String mIdPayment;
    protected int mType;
    protected Date mDate;
    protected long mMoney;
    protected String mNode;

    public Payment() {
        this.mDate = new Date();
        mNode ="Không có ghi chú";
    }

    public Payment(String mIdPayment, int mType, Date mDate, long mMoney, String mNode) {
        this.mIdPayment = mIdPayment;
        this.mType = mType;
        this.mDate = new Date(mDate.getmDayOfWeek(),mDate.getmDayOfMonth(),mDate.getmMonth(),mDate.getmYear());
        this.mMoney = mMoney;
        this.mNode = mNode;
    }

    public String getmIdPayment() {
        return mIdPayment;
    }

    public void setmIdPayment(String mIdPayment) {
        this.mIdPayment = mIdPayment;
    }

    public int getmType() {
        return mType;
    }

    public void setmType(int mType) {
        this.mType = mType;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public long getmMoney() {
        return mMoney;
    }

    public void setmMoney(long mMoney) {
        this.mMoney = mMoney;
    }

    public String getmNode() {
        return mNode;
    }

    public void setmNode(String mNode) {
        this.mNode = mNode;
    }
}
