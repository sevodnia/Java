package com.example.umbra.allApps.HW09;

import android.app.Activity;
import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.domain.entity.Girl;
import com.example.umbra.allApps.R;
import com.example.umbra.allApps.databinding.ItemGridLayoutGirlsBinding;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;


public class MyGirlsAdaptor extends RecyclerView.Adapter<MyGirlsAdaptor.MyGirlHolder> {


    ArrayList<Girl> girls;
    private Activity activity;


    public MyGirlsAdaptor(ArrayList<Girl> girls, Activity activity) {
        this.girls = girls;
        this.activity = activity;
    }

    @Override
    public MyGirlHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ItemGridLayoutGirlsBinding binding = ItemGridLayoutGirlsBinding.inflate(inflater, parent, false);
        return new MyGirlHolder(binding.getRoot());

    }

    @Override
    public void onBindViewHolder(MyGirlHolder holder, int position) {
        Log.e("FFFF", girls.get(position).getImage());

        MyGirlsAdaptorViewModel model = new MyGirlsAdaptorViewModel();
        model.setGirl(girls.get(position));
        holder.binding.setMyGirlsAdaptorViewModel(model);

    }


    @Override
    public int getItemCount() {
        return girls.size();
    }


    public static class MyGirlHolder extends RecyclerView.ViewHolder {

        // его роль сперва, при первом создании, запомнить все ссылки на виджеты той вьюшки,
        // которую ему передадут в аргументе конструктора, а после, просто, по просьбе адаптера наполнять
        // эти виджеты данными из объекта модели
        ItemGridLayoutGirlsBinding binding;

        public MyGirlHolder(View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);

        }
    }


}
