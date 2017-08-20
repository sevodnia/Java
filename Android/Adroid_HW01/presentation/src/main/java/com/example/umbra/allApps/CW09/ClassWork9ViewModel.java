package com.example.umbra.allApps.CW09;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.util.Log;

import com.example.domain.entity.ProfileModel;
import com.example.domain.entity.ProfileId;
import com.example.domain.interaction.ProfileUseCase;
import com.example.domain.interaction.SaveProfileUseCase;
import com.example.umbra.allApps.base.BaseViewModel;

import io.reactivex.annotations.NonNull;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.subjects.PublishSubject;


public class ClassWork9ViewModel implements BaseViewModel {



    public enum STATE {PROGRESS, DATA}


    public ObservableField<String> name = new ObservableField<>("По умолчанию будет подтянуты данные");
    public ObservableField<String> surname = new ObservableField<>("По умолчанию будет подтянуты данные");
    public ObservableInt age = new ObservableInt(0);
    public ObservableField<STATE> state = new ObservableField<>(STATE.PROGRESS);

    private ProfileUseCase useCase = new ProfileUseCase();
    private SaveProfileUseCase saveProfileUseCase = new SaveProfileUseCase();
    @Override
    public void init() {

    }

    @Override
    public void release() {


    }

    @Override
    public void resume() {

        ProfileModel profileModel = new ProfileModel();
        profileModel.setAge(28);
        profileModel.setName("Тадэвуш");
        profileModel.setSurname("Кастюшко");
        saveProfileUseCase.execute(profileModel, new DisposableObserver<Void>(){

            @Override
            public void onNext(@NonNull Void aVoid) {

            }

            @Override
            public void onError(@NonNull Throwable e) {

            }

            @Override
            public void onComplete() {

            }




        });







        ProfileId profileId = new ProfileId();
        profileId.setId("123"); //как будло у енас есть ид

        useCase.execute(profileId, new DisposableObserver<ProfileModel>() {
            @Override
            public void onNext(@NonNull ProfileModel profile) {

//                ProfileModel profile = useCase.execute(profileId);
                name.set(profile.getName());
                surname.set(profile.getSurname());
                age.set(profile.getAge());
                state.set(STATE.DATA);


            }

            @Override
            public void onError(@NonNull Throwable e) {
                Log.e("EEE", "error =", e);
            }

            @Override
            public void onComplete() {

            }
        });


    }

    @Override
    public void pause() {
        useCase.dispose();
    }


}
