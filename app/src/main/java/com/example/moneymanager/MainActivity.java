package com.example.moneymanager;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.moneymanager.adapter.TimeAdapter;
import com.example.moneymanager.control.SupportWallet;
import com.example.moneymanager.model.Date;
import com.example.moneymanager.model.Payment;
import com.example.moneymanager.model.Time;
import com.example.moneymanager.model.Wallet;
import com.google.android.material.bottomappbar.BottomAppBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private BottomAppBar mBar;
    private TextView mTvTitle;
    private Wallet mWallet;
    private RecyclerView mRecyclerView;
    private TimeAdapter mAdapter;
    private ArrayList<Time> mList;
    private SupportWallet mSupportWallet;
    private int FLAG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initView() {
        this.mBar = findViewById(R.id.main_toolbar);
        setSupportActionBar(mBar);
        mTvTitle = findViewById(R.id.main_title);
        mTvTitle.setTextColor(Color.BLACK);
        FLAG = 1;
        mRecyclerView = findViewById(R.id.main_rcv);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(layoutManager);
    }

    private void initData() {
        this.mWallet = new Wallet();
        mSupportWallet = new SupportWallet(this.mWallet);
        Payment payment = new Payment("sava0", 1500000, new Date(16, 5, 2019, 5), "Liên hoan hoàn thành thực tập", 2);
        mSupportWallet.addNewPayment(payment);
        payment = new Payment("sava1", 1500000, new Date(16, 5, 2019, 5), "Liên hoan hoàn thành thực tập", 2);
        mSupportWallet.addNewPayment(payment);
        payment = new Payment("sava2", 1500000, new Date(15, 5, 2019, 4), "Liên hoan hoàn thành thực tập", 2);
        mSupportWallet.addNewPayment(payment);
        payment = new Payment("sava3", 1500000, new Date(14, 5, 2019, 3), "Liên hoan hoàn thành thực tập", 2);
        mSupportWallet.addNewPayment(payment);
        payment = new Payment("sava4", 1500000, new Date(13, 5, 2019, 2), "Liên hoan hoàn thành thực tập", 2);
        mSupportWallet.addNewPayment(payment);
        payment = new Payment("sava5", 1500000, new Date(12, 5, 2019, 1), "Liên hoan hoàn thành thực tập", 2);
        mSupportWallet.addNewPayment(payment);
        payment = new Payment("sava6", 1500000, new Date(11, 5, 2019, 7), "Liên hoan hoàn thành thực tập", 2);
        mSupportWallet.addNewPayment(payment);
        payment = new Payment("sava7", 1500000, new Date(10, 5, 2019, 6), "Liên hoan hoàn thành thực tập", 2);
        mSupportWallet.addNewPayment(payment);
        payment = new Payment("sava8", 1500000, new Date(9, 5, 2019, 5), "Liên hoan hoàn thành thực tập", 2);
        mSupportWallet.addNewPayment(payment);
        payment = new Payment("sava9", 1500000, new Date(8, 5, 2019, 4), "Liên hoan hoàn thành thực tập", 2);
        mSupportWallet.addNewPayment(payment);
        mList = mSupportWallet.getAllDay();
        mAdapter = new TimeAdapter(this, mList);
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.main_action_day:
                if (FLAG != 1) {
                    mTvTitle.setText("All day");
                    FLAG = 1;
                    mList.clear();
                    mList.addAll(mSupportWallet.getAllDay());
                    mAdapter.notifyDataSetChanged();
                }
                break;
            case R.id.main_action_month:
                if (FLAG != 2) {
                    mTvTitle.setText("All month");
                    FLAG = 2;
                    mList.clear();
                    mList.addAll(mSupportWallet.getAllMonth());
                    mAdapter.notifyDataSetChanged();
                }
                break;
            case R.id.main_action_year:
                if (FLAG != 3) {
                    mTvTitle.setText("All year");
                    FLAG =3;
                    mList.clear();
                    mList.addAll(mSupportWallet.getAllYear());
                    mAdapter.notifyDataSetChanged();
                }
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
