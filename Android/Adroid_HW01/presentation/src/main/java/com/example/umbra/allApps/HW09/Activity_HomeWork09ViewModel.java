package com.example.umbra.allApps.HW09;


import android.app.Activity;
import android.databinding.ObservableField;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.domain.entity.Girl;
import com.example.domain.interaction.GirlsUseCase;
import com.example.umbra.allApps.R;
import com.example.umbra.allApps.base.BaseViewModelThis;

import java.util.ArrayList;

public class Activity_HomeWork09ViewModel implements BaseViewModelThis {


    private GirlsUseCase girlsUseCase = new GirlsUseCase();

    RecyclerView recyclerView;
    GridLayoutManager layoutManager;
    public Activity activity;

    ArrayList<Girl> girls;

    public Activity_HomeWork09ViewModel(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void init() {

    }

    @Override
    public void release() {

    }

    @Override
    public void resume() {

        girls = girlsUseCase.execute();


        recyclerView = (RecyclerView) activity.findViewById(R.id.recycleViewGirls);
        layoutManager = new GridLayoutManager(activity, 2);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);

        MyGirlsAdaptor myAdaptor = new MyGirlsAdaptor(girls, activity);
        recyclerView.setAdapter(myAdaptor);


    }

    @Override
    public void pause() {

    }
}
