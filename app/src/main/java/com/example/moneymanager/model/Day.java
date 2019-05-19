package com.example.moneymanager.model;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class Day extends Time {
    private ArrayList<Payment> mListPayment;

    public Day() {
        super();
        mListPayment = new ArrayList<>();
    }

    public ArrayList<Payment> getmListPayment() {
        return mListPayment;
    }

    public void setmListPayment(ArrayList<Payment> mListPayment) {
        this.mListPayment = mListPayment;
    }

    @NonNull
    @Override
    public String toString() {
        return mDate.showDay();
    }
}
