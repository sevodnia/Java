package com.example.umbra.allApps.CW08;

import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.umbra.allApps.R;
import com.example.umbra.allApps.base.BaseActivity;
import com.example.umbra.allApps.databinding.Cw8ActivityBinding;


public class Activity_ClassWork08 extends BaseActivity {

//    просто статичный метод, который вызывает данную активити
    public  static  void show(Activity activity){
        Intent intent = new Intent(activity, Activity_ClassWork08.class);
        activity.startActivity(intent);
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {


        ClassWork8ViewModel viewModel = new ClassWork8ViewModel(this);

        this.viewModel = viewModel;
        Cw8ActivityBinding binding = DataBindingUtil
                .setContentView(this, R.layout.cw8_activity);

        binding.setViewModel(viewModel);
        super.onCreate(savedInstanceState);
    }
}
