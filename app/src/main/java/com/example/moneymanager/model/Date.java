package com.example.moneymanager.model;

public class Date {
    private int mDayOfWeek;
    private int mDayOfMonth;
    private int mMonth;
    private int mYear;

    public Date() {
    }

    public Date(int mDayOfWeek, int mDayOfMonth, int mMonth, int mYear) {
        this.mDayOfWeek = mDayOfWeek;
        this.mDayOfMonth = mDayOfMonth;
        this.mMonth = mMonth;
        this.mYear = mYear;
    }

    public int getmDayOfWeek() {
        return mDayOfWeek;
    }

    public void setmDayOfWeek(int mDayOfWeek) {
        this.mDayOfWeek = mDayOfWeek;
    }

    public int getmDayOfMonth() {
        return mDayOfMonth;
    }

    public void setmDayOfMonth(int mDayOfMonth) {
        this.mDayOfMonth = mDayOfMonth;
    }

    public int getmMonth() {
        return mMonth;
    }

    public void setmMonth(int mMonth) {
        this.mMonth = mMonth;
    }

    public int getmYear() {
        return mYear;
    }

    public void setmYear(int mYear) {
        this.mYear = mYear;
    }
}
