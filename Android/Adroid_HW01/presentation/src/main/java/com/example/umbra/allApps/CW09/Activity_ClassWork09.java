package com.example.umbra.allApps.CW09;

import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.umbra.allApps.R;
import com.example.umbra.allApps.base.BaseActivity;
import com.example.umbra.allApps.databinding.Cw9ActivityBinding;


public class Activity_ClassWork09 extends BaseActivity {

//    просто статичный метод, который вызывает данную активити
    public  static  void show(Activity activity){
        Intent intent = new Intent(activity, Activity_ClassWork09.class);
        activity.startActivity(intent);
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {


        ClassWork9ViewModel viewModel = new ClassWork9ViewModel();

        this.viewModel = viewModel;
        Cw9ActivityBinding binding = DataBindingUtil
                .setContentView(this, R.layout.cw9_activity);

        binding.setViewModel(viewModel);
        super.onCreate(savedInstanceState);
    }
}
