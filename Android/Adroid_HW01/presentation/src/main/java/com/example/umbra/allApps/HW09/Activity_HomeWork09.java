package com.example.umbra.allApps.HW09;

import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.umbra.allApps.R;
import com.example.umbra.allApps.base.BaseActivityThis;
import com.example.umbra.allApps.databinding.Hw9ActivityBinding;


public class Activity_HomeWork09 extends BaseActivityThis {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {


        //создаем объект вью модели дла ресайклер вью
        Activity_HomeWork09ViewModel viewModel = new Activity_HomeWork09ViewModel(this);
        this.viewModel = viewModel;

        Hw9ActivityBinding binding = DataBindingUtil
                .setContentView(this, R.layout.hw9_activity);
        binding.setViewModelThis(viewModel);//устанавливаем свять между xml и моей view model
        super.onCreate(savedInstanceState);
    }


    //статический метод для запуска активити из класса main
    public static void show(Activity activity) {
        Intent intent = new Intent(activity, Activity_HomeWork09.class);
        activity.startActivity(intent);

    }


}
