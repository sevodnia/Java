package com.example.umbra.allApps.HW11;

import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.umbra.allApps.R;
import com.example.umbra.allApps.base.BaseActivityThis;
import com.example.umbra.allApps.databinding.ActivityHomework11ItemEditBinding;


public class HomeWork11ItemEditActivity  extends BaseActivityThis{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

       HomeWork11ItemEditActivityViewModel model = new HomeWork11ItemEditActivityViewModel(this);
        this.viewModel = model;
        ActivityHomework11ItemEditBinding binding = DataBindingUtil
                .setContentView(this, R.layout.activity_homework11_item_edit);
        binding.setViewModel(model);//устанавливаем свять между xml и моей view model
        super.onCreate(savedInstanceState);
    }



    //статический метод вызова активити
    public static void show(Activity activity) {
        Intent intent = new Intent(activity, HomeWork11ItemEditActivity.class);
        activity.startActivity(intent);


    }
}
