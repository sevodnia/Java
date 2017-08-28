package com.example.umbra.allApps.HW11;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.umbra.allApps.R;
import com.example.umbra.allApps.base.BaseActivityThis;
import com.example.umbra.allApps.databinding.*;
import com.example.umbra.allApps.databinding.ActivityHomework11Binding;


public class HomeWork11Activity extends BaseActivityThis {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        //создаем объект вью модели
        HomeWork11ActivityViewModel model = new HomeWork11ActivityViewModel(this);
        //синхронизируем жизненные циклы активити и собственной вью модели
        this.viewModel = model;


        //подключаем датабиндинг ко вью модели
        ActivityHomework11Binding binding = DataBindingUtil
                .setContentView(this, R.layout.activity_homework11);
        binding.setViewModel(model);//устанавливаем свять между xml и моей view model

        super.onCreate(savedInstanceState);
    }
}
