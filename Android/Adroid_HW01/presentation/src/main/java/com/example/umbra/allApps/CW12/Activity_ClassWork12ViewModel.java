package com.example.umbra.allApps.CW12;


import android.app.Activity;
import android.databinding.ObservableField;
import android.util.Log;

import com.example.domain.entity.ProfileModel;
import com.example.domain.interaction.GetProfileListUseCase;
import com.example.umbra.allApps.base.BaseViewModel;

import java.util.List;

import io.reactivex.annotations.NonNull;
import io.reactivex.observers.DisposableObserver;


public class Activity_ClassWork12ViewModel implements BaseViewModel {

    public enum STATE {PROGRESS, DATA}

    public ObservableField<STATE> state = new ObservableField<>(STATE.PROGRESS);

    private Activity activity;


    private GetProfileListUseCase getProfileListUseCase = new GetProfileListUseCase();
    public ProfileAdapter adapter =new ProfileAdapter(activity);

    public Activity_ClassWork12ViewModel(Activity activity) {
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

        getProfileListUseCase.execute(null, new DisposableObserver<List<? extends ProfileModel>>(){

            @Override
            public void onNext(List<? extends ProfileModel> profileModels) {

                Log.e("AAAA items = " + profileModels.size(), "");

            }

            @Override
            public void onError(Throwable e) {
            }

            @Override
            public void onComplete() {
            }
        });



    }

    @Override
    public void pause() {

    }
}
