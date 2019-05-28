package com.example.moneymanager.model;

import java.util.ArrayList;

public class WDay extends WBasic {
    private ArrayList<Payment> mListPayment;

    public WDay() {
        super();
        this.mListPayment = new ArrayList<>();
    }

    public ArrayList<Payment> getmListPayment() {
        return mListPayment;
    }

    public void setmListPayment(ArrayList<Payment> mListPayment) {
        this.mListPayment = mListPayment;
    }
}
