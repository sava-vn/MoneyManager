package com.example.moneymanager.model;

public class WBasic {
    protected Date mDate;
    protected long mMoneyIn;
    protected long mMoneyOut;
    protected long mBlance;
    protected int mCountPayment;
    protected int mViewType;

    public WBasic() {
        mDate = new Date();
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = new Date(mDate.getmDayOfWeek(),mDate.getmDayOfMonth(),mDate.getmMonth(),mDate.getmYear());
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

    public int getmCountPayment() {
        return mCountPayment;
    }

    public void setmCountPayment(int mCountPayment) {
        this.mCountPayment += mCountPayment;
    }

    public int getmViewType() {
        return mViewType;
    }

    public void setmViewType(int mViewType) {
        this.mViewType = mViewType;
    }
}
