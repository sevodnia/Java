package com.example.umbra.allApps.HW10;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.umbra.allApps.R;
import com.example.umbra.allApps.base.BaseActivityThis;
import com.example.umbra.allApps.databinding.Hw10ActivityBinding;


public class Activity_HomeWork10 extends BaseActivityThis {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {


        Activity_HomeWork10ViewModel viewModel = new Activity_HomeWork10ViewModel(this);
        this.viewModel = viewModel;

        Hw10ActivityBinding binding = DataBindingUtil
                .setContentView(this, R.layout.hw10_activity);
        binding.setViewModel(viewModel);//устанавливаем свять между xml и моей view model
        super.onCreate(savedInstanceState);

    }
}
