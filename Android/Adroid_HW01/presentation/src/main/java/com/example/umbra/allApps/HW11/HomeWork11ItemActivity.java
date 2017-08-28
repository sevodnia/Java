package com.example.umbra.allApps.HW11;

import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.umbra.allApps.R;
import com.example.umbra.allApps.base.BaseActivityThis;
import com.example.umbra.allApps.databinding.ActivityHomework11ItemBinding;



public class HomeWork11ItemActivity extends BaseActivityThis {

public static String id = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {


        HomeWork11ItemActivityViewModel model = new HomeWork11ItemActivityViewModel(this);
        this.viewModel = model;
        model.setId(id);

        ActivityHomework11ItemBinding binding = DataBindingUtil
                .setContentView(this, R.layout.activity_homework11_item);
        binding.setViewModel(model);//устанавливаем свять между xml и моей view model



        super.onCreate(savedInstanceState);

    }


    //статический метод
    public static void show(Activity activity, String s) {
        Intent intent = new Intent(activity, HomeWork11ItemActivity.class);
               id = s;
        activity.startActivity(intent);

        //отправляем интент во вью модель с данными id


    }


    @Override
    protected void onPause() {


        super.onPause();
    }




}
