package com.example.umbra.allApps.CW12;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.umbra.allApps.R;
import com.example.umbra.allApps.base.BaseActivity;
import com.example.umbra.allApps.databinding.Cw12ActivityBinding;


public class Activity_ClassWork12 extends BaseActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {


        Activity_ClassWork12ViewModel viewModel = new Activity_ClassWork12ViewModel(this);
        this.viewModel = viewModel;
        Cw12ActivityBinding binding = DataBindingUtil
                .setContentView(this, R.layout.cw12_activity);
        binding.setViewModel(viewModel);//устанавливаем свять между xml и моей view model
binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
binding.recyclerView.setAdapter(viewModel.adapter);

        super.onCreate(savedInstanceState);
    }
}
