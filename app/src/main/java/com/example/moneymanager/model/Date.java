package com.example.moneymanager.model;


public class Date {
    private int mDay;
    private int mMonth;
    private int mYear;
    private int mDoW;
    private String[] months = {"","JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","STEP","OCT","NOV","DEC"};
    public Date() {
    }

    public Date(int mDay, int mMonth, int mYear,int mDoW) {
        this.mDay = mDay;
        this.mMonth = mMonth;
        this.mYear = mYear;
        this.mDoW = mDoW;
    }

    public int getmDay() {
        return mDay;
    }

    public void setmDay(int mDay) {
        this.mDay = mDay;
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

    public int getmDoW() {
        return mDoW;
    }

    public void setmDoW(int mDoW) {
        this.mDoW = mDoW;
    }

    @Override
    public String toString() {
        return mDay + " / 0" + mMonth + " / "+ mYear;
    }
    public String showMonth(){
        return months[mMonth]+" " + mYear;
    }
    public  String showDay(){
        String d = (mDay<10) ? ("0"+mDay) : ""+mDay;
        return d + " "+ months[mMonth] + " , " + mYear;
    }
}
