package com.example.moneymanager.control;

import com.example.moneymanager.model.Date;
import com.example.moneymanager.model.Payment;
import com.example.moneymanager.model.WBasic;
import com.example.moneymanager.model.WDay;
import com.example.moneymanager.model.WMonth;
import com.example.moneymanager.model.WYear;

import java.util.ArrayList;

public class Wallet {
    private WYear[] mYears;
    private long mBlance;

    public Wallet() {
        this.mYears = new WYear[31];
        for (int i = 1; i <= 30; i++)
            this.mYears[i] = new WYear();
    }

    public void addPayment(Payment payment) {
        Date date = payment.getmDate();
        int day = date.getmDayOfMonth();
        int month = date.getmMonth();
        int year = date.getmYear() - 2009;
        long money = payment.getmMoney();

        WYear wYear = this.mYears[year];
        WMonth wMonth = wYear.getmArrWMonth()[month];
        WDay wDay = wMonth.getmArrWDay()[day];

        this.mBlance += money;

        if (money < 0) {
            wYear.setmMoneyOut(money);
            wMonth.setmMoneyOut(money);
            wDay.setmMoneyOut(money);
        } else {
            wYear.setmMoneyIn(money);
            wMonth.setmMoneyIn(money);
            wDay.setmMoneyIn(money);
        }

        wYear.setmDate(date);
        wMonth.setmDate(date);
        wDay.setmDate(date);

        wYear.setmCountPayment(1);
        wMonth.setmCountPayment(1);
        wDay.setmCountPayment(1);

        wDay.getmListPayment().add(payment);
    }

    public ArrayList<WBasic> getAllWDay() {
        ArrayList<WBasic> listWDay = new ArrayList<>();
        long BLANCE = this.mBlance;
        for (int i = 30; i >= 1; i--) {
            WYear wYear = this.mYears[i];
            if (wYear.getmCountPayment() > 0) {
                for (int ii = 12; ii >= 1; ii--) {
                    WMonth wMonth = wYear.getmArrWMonth()[ii];
                    if (wMonth.getmCountPayment() > 0) {
                        WDay dayHeader = new WDay();
                        dayHeader.setmDate(wMonth.getmDate());
                        dayHeader.setmViewType(1);
                        listWDay.add(dayHeader);
                        for (int iii = 31; iii >= 1; iii--) {
                            WDay wDay = wMonth.getmArrWDay()[iii];
                            if (wDay.getmCountPayment() > 0) {
                                wDay.setmBlance(BLANCE);
                                BLANCE -= (wDay.getmMoneyIn() + wDay.getmMoneyOut());
                                listWDay.add(wDay);
                            }
                        }
                    }
                }
            }
        }
        return listWDay;
    }

    public ArrayList<WBasic> getAllWMonth() {
        ArrayList<WBasic> listWMonth = new ArrayList<>();
        long BLANCE = this.mBlance;
        for (int i = 30; i >= 1; i--) {
            WYear wYear = this.mYears[i];
            if (wYear.getmCountPayment() > 0) {
                WMonth monthHeader = new WMonth();
                monthHeader.setmDate(wYear.getmDate());
                monthHeader.setmViewType(1);
                listWMonth.add(monthHeader);
                for (int ii = 12; ii >= 1; ii--) {
                    WMonth wMonth = wYear.getmArrWMonth()[ii];
                    if (wMonth.getmCountPayment() > 0) {
                        wMonth.setmBlance(BLANCE);
                        BLANCE -= (wMonth.getmMoneyIn() + wMonth.getmMoneyOut());
                        listWMonth.add(wMonth);
                    }
                }
            }
        }
        return listWMonth;
    }

    public ArrayList<WBasic> getAllWYear() {
        ArrayList<WBasic> listYear = new ArrayList<>();
        long BLANCE = this.mBlance;
        for (int i = 30; i >= 1; i--) {
            WYear wYear = this.mYears[i];
            if (wYear.getmCountPayment() > 0) {
                wYear.setmBlance(BLANCE);
                BLANCE -= (wYear.getmMoneyIn() + wYear.getmMoneyOut());
                listYear.add(wYear);
            }
        }
        return listYear;
    }
}
