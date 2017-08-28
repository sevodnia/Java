package com.example.umbra.allApps.HW11;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.domain.entity.entityForHW11.PeopleProfile;
import com.example.umbra.allApps.databinding.ItemHomework11Binding;

import java.util.ArrayList;
import java.util.List;


public class HomeWork11Adapter extends RecyclerView.Adapter<HomeWork11Adapter.Holder> {


    Activity activity;
    List<PeopleProfile> list = new ArrayList<>();

    //подвязываем список
    public void setList(List<PeopleProfile> array) {
        list.clear();
        list.addAll(array);
        notifyDataSetChanged();
    }

    public HomeWork11Adapter(Activity activity) {
        Log.e("HomeWork11Adapter", "запускай адаптер");
        this.activity = activity;
    }


    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ItemHomework11Binding binding = ItemHomework11Binding.inflate(inflater, parent, false);
        return new Holder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {

        HomeWork11AdapterViewModel model = new HomeWork11AdapterViewModel();
        model.setName(list.get(position).getName());
        model.setSurname(list.get(position).getSurname());
        holder.binding.setItemViewModel(model);
        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void OnClick(View view, int position) {
                HomeWork11ItemActivity.show(activity, list.get(position).getObjectId());
            }
        });
    }


    @Override
    public int getItemCount() {
        return list.size();
    }




    public class Holder extends RecyclerView.ViewHolder implements View.OnClickListener {
        // его роль сперва, при первом создании, запомнить все ссылки на виджеты той вьюшки,
        // которую ему передадут в аргументе конструктора, а после, просто, по просьбе адаптера наполнять
        // эти виджеты данными из объекта модели

        ItemHomework11Binding binding;
        private ItemClickListener itemClickListener;

        public Holder(View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
            itemView.setOnClickListener(this);
        }

        public void setItemClickListener(ItemClickListener itemClickListener){
            this.itemClickListener = itemClickListener;
        }

        @Override
        public void onClick(View v) {
            itemClickListener.OnClick(v, getAdapterPosition());
        }
    }
}
