package com.example.umbra.allApps.CW06;


import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.umbra.allApps.R;

import java.util.ArrayList;

/*
реализация паттерна адаптер для RECYCLE VIEW
 */

public class ClassWork6Adapter extends RecyclerView.Adapter<ClassWork6Adapter.Holder> {


    private ArrayList<String> items;

    public ClassWork6Adapter(ArrayList<String> items) {

        this.items = items;


    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
//здесь создаем свой лоуаут

//магическая конструкция, которая парсит xml и создает объектную модель
        View root = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_recycle_view, parent, false);
        Log.e("AAA", "onCreateViewHolder");
        return new Holder(root);
    }


    @Override
    public void onBindViewHolder(Holder holder, int position) {
//заполняем какимито данными
//бужет вызывать для каждой строчки
        Log.e("AAA", "onBindViewHolder () position = " + position);
//position - всегда будет в рамках того, сколько итемов вы задаи
        String item = items.get(position);
//        ImageView v = (ImageView) v.findViewById(R.id.imageView666);
//        holder.imageView.setImageDrawable(R.id.imageView666);
        holder.textView.setText(item);
    }


    @Override
    public int getItemCount() {
        return items == null ? 0 : items.size();
    }


    public static class Holder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;


        public Holder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.imageView666);
            textView = (TextView) itemView.findViewById(R.id.textView);


        }
    }


}
