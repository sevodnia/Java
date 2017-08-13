package com.example.umbra.allApps.HW06;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.umbra.allApps.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;


public class MyAdaptor extends RecyclerView.Adapter<MyAdaptor.MyHolder> {

    private Context context;
    private ArrayList<Motorcycle> motors;
    private boolean show = false;

    //создаем еперменную интерфейси и сеттер для нее
    private onItemClickListener listener;

    public void setListener(onItemClickListener listener) {
        this.listener = listener;
    }




    //новый конструктор адаптера
    public MyAdaptor(Context context, ArrayList<Motorcycle> motors) {
        this.context = context;
        this.motors = motors;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_layout, null);
        MyHolder myHolder = new MyHolder(layout);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {

        holder.txt.setText(motors.get(position).getName());
        // Show progress bar
        final MyHolder MYHOLDER = holder;
        MYHOLDER.bar.setVisibility(View.VISIBLE);
        // Hide progress bar on successful load
        Picasso.with(context).load(motors.get(position).getPath())
                .into(MYHOLDER.img, new com.squareup.picasso.Callback() {
                    @Override
                    public void onSuccess() {
                        if (MYHOLDER.bar != null) {
                            MYHOLDER.bar.setVisibility(View.GONE);
                        }
                    }

                    @Override
                    public void onError() {

                    }
                });

    }

    @Override
    public int getItemCount() {
        return motors.size();
        //нужно пометить количество элементов

    }

    public static class MyHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView txt;
        ProgressBar bar;

        public MyHolder(View itemView) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.img);
            txt = (TextView) itemView.findViewById(R.id.txt);
            bar = (ProgressBar) itemView.findViewById(R.id.progressBar);
        }
    }


    //интерфейс для обработки кликов
    interface onItemClickListener {
        public void onItemClick(String item);
    }


}
