package com.example.moneymanager.control;

import com.example.moneymanager.model.Date;
import com.example.moneymanager.model.Day;
import com.example.moneymanager.model.Month;
import com.example.moneymanager.model.Payment;
import com.example.moneymanager.model.Time;
import com.example.moneymanager.model.Wallet;
import com.example.moneymanager.model.Year;

import java.util.ArrayList;

public class SupportWallet {
    private Wallet mWallet;

    public SupportWallet() {
    }

    public SupportWallet(Wallet mWallet) {
        this.mWallet = mWallet;
    }
    public void addNewPayment(Payment payment) {
        long money = payment.getmMoney();
        Date date = payment.getmDate();
        int d = date.getmDay();
        int m = date.getmMonth();
        int y = date.getmYear() - 2014;
        if (money > 0) {
            this.mWallet.setmMoneyIn(money);
            this.mWallet.getmArrYear()[y].setmMoneyIn(money);
            this.mWallet.getmArrYear()[y].getmArrMonth()[m].setmMoneyIn(money);
            this.mWallet.getmArrYear()[y].getmArrMonth()[m].getmArrDay()[d].setmMoneyIn(money);
        } else {
            this.mWallet.setmMoneyOut(money);
            this.mWallet.getmArrYear()[y].setmMoneyOut(money);
            this.mWallet.getmArrYear()[y].getmArrMonth()[m].setmMoneyOut(money);
            this.mWallet.getmArrYear()[y].getmArrMonth()[m].getmArrDay()[d].setmMoneyOut(money);
        }
        this.mWallet.getmArrYear()[y].setmCountPay(1);
        this.mWallet.getmArrYear()[y].setmDate(date);

        this.mWallet.getmArrYear()[y].getmArrMonth()[m].setmCountPay(1);
        this.mWallet.getmArrYear()[y].getmArrMonth()[m].setmDate(date);

        this.mWallet.getmArrYear()[y].getmArrMonth()[m].getmArrDay()[d].setmCountPay(1);
        this.mWallet.getmArrYear()[y].getmArrMonth()[m].getmArrDay()[d].setmDate(date);
        this.mWallet.getmArrYear()[y].getmArrMonth()[m].getmArrDay()[d].getmListPayment().add(payment);
    }

    public ArrayList<Time> getAllDay() {
        ArrayList<Time> listDay = new ArrayList<>();
        long BL = this.mWallet.getmMoneyIn()+mWallet.getmMoneyOut();
        for (int i = 30; i > 0; i--) {
            Year year = this.mWallet.getmArrYear()[i];
            if (year.getmCountPay() > 0) {
                for (int ii = 12; ii > 0; ii--) {
                    Month month = year.getmArrMonth()[ii];
                    if (month.getmCountPay() > 0) {
                        Day  dayX  = new Day();
                        dayX.setmNote(month.getmDate().showMonth());
                        listDay.add(dayX);
                        for (int iii = 31; iii > 0; iii--) {
                            Day day = month.getmArrDay()[iii];
                            if (day.getmCountPay() > 0) {
                                day.setmBlance(BL);
                                day.setmViewType(1);
                                BL -= (day.getmMoneyIn() + day.getmMoneyOut());
                                listDay.add(day);
                            }
                        }
                    }
                }
            }
        }
        return listDay;
    }
    public ArrayList<Time> getAllMonth(){
        long BL = this.mWallet.getmMoneyIn()+mWallet.getmMoneyOut();
        ArrayList<Time> listMonth = new ArrayList<>();
        for(int i =30;i>0;i--){
            Year year = this.mWallet.getmArrYear()[i];
            if(year.getmCountPay()>0){
                Month monthX = new Month();
                monthX.setmNote(year.getmDate().getmYear()+"");
                listMonth.add(monthX);
                for(int ii=12;ii>0;ii-- ){
                    Month month = year.getmArrMonth()[ii];
                    if(month.getmCountPay()>0){
                        month.setmBlance(BL);
                        month.setmViewType(1);
                        BL -= (month.getmMoneyIn() + month.getmMoneyOut());
                        listMonth.add(month);
                    }
                }
            }
        }
        return listMonth;
    }
    public ArrayList<Time> getAllYear(){
        long BL = this.mWallet.getmMoneyIn()+mWallet.getmMoneyOut();
        ArrayList<Time> listYear = new ArrayList<>();
        for(int i=30;i>0;i--){
            Year year = this.mWallet.getmArrYear()[i];
            if(year.getmCountPay()>0){
                year.setmViewType(1);
                year.setmBlance(BL);
                BL -= (year.getmMoneyIn() - year.getmMoneyOut());
                listYear.add(year);
            }
        }
        return listYear;
    }
}
