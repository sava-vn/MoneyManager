package com.example.moneymanager.model;

public class Payment {
    private String mId;
    private long mMoney;
    private Date mDate;
    private String mNote;
    private int mType;

    public Payment() {

    }
    public Payment(String mId, long mMoney, Date mDate, String mNote, int mType) {
        this.mId = mId;
        this.mMoney = mMoney;
        this.mDate = mDate;
        this.mNote = mNote;
        this.mType = mType;
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public long getmMoney() {
        return mMoney;
    }

    public void setmMoney(long mMoney) {
        this.mMoney = mMoney;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public String getmNote() {
        return mNote;
    }

    public void setmNote(String mNote) {
        this.mNote = mNote;
    }

    public int getmType() {
        return mType;
    }

    public void setmType(int mType) {
        this.mType = mType;
    }
}
