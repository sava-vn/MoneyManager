package com.example.moneymanager.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.moneymanager.R;
import com.example.moneymanager.control.SupportMoney;
import com.example.moneymanager.model.Time;

import java.util.ArrayList;

public class TimeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private Context mContext;
    private ArrayList<Time> mList;
    private int[] dayOfweek = {R.drawable.ic_sun,R.drawable.ic_mon,R.drawable.ic_tue,R.drawable.ic_wed,R.drawable.ic_thur,R.drawable.ic_fri,R.drawable.ic_sat};
    public TimeAdapter(Context context, ArrayList<Time> list){
        this.mContext = context;
        this.mList = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view;
        if(viewType==0){
            view = inflater.inflate(R.layout.item_time_header,parent,false);
            return new HeaderV(view);
        }
        view = inflater.inflate(R.layout.item_time,parent,false);
        return new ItemV(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Time  time = mList.get(position);
        if(holder instanceof HeaderV){
            ((HeaderV) holder).tvHeader.setText(time.getmNote());
        }else{
            ItemV  itemV = (ItemV) holder;
            itemV.imgDate.setImageResource(dayOfweek[time.getmDate().getmDoW()-1]);
            itemV.tvDate.setText(time.toString());
            itemV.tvCoutPay.setText(time.getmCountPay()+"");
            itemV.tvMoneyIn.setText(SupportMoney.converToMoney(time.getmMoneyIn()));
            itemV.tvMoneyOut.setText(SupportMoney.converToMoney(time.getmMoneyOut()));
            itemV.tvBlance.setText(SupportMoney.converToMoney(time.getmBlance()));
        }
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    @Override
    public int getItemViewType(int position) {
        return mList.get(position).getmViewType();
    }

    public class ItemV extends RecyclerView.ViewHolder{
        private ImageView imgDate;
        private TextView tvCoutPay, tvMoneyIn, tvBlance, tvMoneyOut,tvDate;
        public ItemV(@NonNull View itemView) {
            super(itemView);
            imgDate = itemView.findViewById(R.id.item_time_img_date);
            tvDate = itemView.findViewById(R.id.item_time_tv_date);
            tvCoutPay = itemView.findViewById(R.id.item_time_tv_countPay);
            tvMoneyIn = itemView.findViewById(R.id.item_time_tv_moneyIn);
            tvMoneyOut = itemView.findViewById(R.id.item_time_tv_moneyOut);
            tvBlance = itemView.findViewById(R.id.item_time_tv_blance);
        }
    }
    public  class HeaderV extends RecyclerView.ViewHolder{
        private TextView tvHeader;
        public HeaderV(@NonNull View itemView) {
            super(itemView);
            tvHeader = itemView.findViewById(R.id.item_tiem_header);
        }
    }
}
