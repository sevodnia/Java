package com.example.umbra.allApps.HW11;


import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.domain.entity.entityForHW11.PeopleProfile;
import com.example.domain.interaction.useCaseForHW11.UseCaseOnlyName;
import com.example.umbra.allApps.HW02.Activity_HomeWork02;
import com.example.umbra.allApps.R;
import com.example.umbra.allApps.base.BaseViewModelThis;
import com.example.umbra.allApps.main.MainActivity;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;


public class HomeWork11ActivityViewModel implements BaseViewModelThis {

    private Activity activity;
    RecyclerView recyclerView;
    Observable<List<PeopleProfile>> listObservable;
    HomeWork11Adapter adapter;
    Disposable disposable;

    public HomeWork11ActivityViewModel(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void init() {

        //подключаем сюда нормальный юзкейс
        UseCaseOnlyName onlyName = new UseCaseOnlyName();
        listObservable = onlyName.getList(); //получаем Observable<List<PeopleProfile>>
        adapter = new HomeWork11Adapter(activity);

        disposable= listObservable
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableObserver<List<PeopleProfile>>() {
                    @Override
                    public void onNext(@NonNull List<PeopleProfile> peopleProfiles) {
                        adapter.setList(peopleProfiles);
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                    }

                    @Override
                    public void onComplete() {
                    }
                });



        recyclerView = (RecyclerView) activity.findViewById(R.id.recyclerViewPeople);//создаем RecycleView
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));           //подключаем layoutManager
        recyclerView.setAdapter(adapter);                       //подключаем адаптер
        Log.e("ActivityViewModel", "Запуск вью модели прошел успешно");

    }

    @Override
    public void release() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void pause() {
        disposable.dispose();
    }








}
