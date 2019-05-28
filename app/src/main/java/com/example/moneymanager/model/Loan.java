package com.example.moneymanager.model;

public class Loan extends Payment {
    private Date mDate2;
    private Date mDate3;
    private String mPerson;
    private boolean isPay;

    public Loan() {
        super();
        mDate2 = new Date();
        mDate3 = new Date();
        mPerson = "Anonymous";
        isPay = false;
    }

    public Loan(String mIdPayment, int mType, Date mDate, long mMoney, String mNode, Date mDate2, Date mDate3, String mPerson, boolean isPay) {
        super(mIdPayment, mType, mDate, mMoney, mNode);
        this.mDate2 = new Date(mDate2.getmDayOfWeek(),mDate2.getmDayOfMonth(),mDate2.getmMonth(),mDate2.getmYear());
        this.mDate3 = new Date(mDate3.getmDayOfWeek(),mDate3.getmDayOfMonth(),mDate3.getmMonth(),mDate3.getmYear());
        this.mPerson = mPerson;
        this.isPay = isPay;
    }

    public Date getmDate2() {
        return mDate2;
    }

    public void setmDate2(Date mDate2) {
        this.mDate2 = mDate2;
    }

    public Date getmDate3() {
        return mDate3;
    }

    public void setmDate3(Date mDate3) {
        this.mDate3 = mDate3;
    }

    public String getmPerson() {
        return mPerson;
    }

    public void setmPerson(String mPerson) {
        this.mPerson = mPerson;
    }

    public boolean isPay() {
        return isPay;
    }

    public void setPay(boolean pay) {
        isPay = pay;
    }
}
