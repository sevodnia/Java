package com.example.umbra.allApps.CW09;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;

import com.example.domain.entity.Profile;
import com.example.domain.entity.ProfileId;
import com.example.domain.interaction.ProfileUseCase;
import com.example.umbra.allApps.base.BaseViewModel;


public class ClassWork9ViewModel implements BaseViewModel {

    public enum STATE {PROGRESS, DATA}


    public ObservableField<String> name = new ObservableField<>("Тадэуш");
    public ObservableField<String> surname = new ObservableField<>("Бонавентура");
    public ObservableInt age = new ObservableInt(23);
    public ObservableField<STATE> state = new ObservableField<>(STATE.PROGRESS);

    private ProfileUseCase useCase = new ProfileUseCase();

    @Override
    public void init() {

    }

    @Override
    public void release() {


    }

    @Override
    public void resume() {
        ProfileId profileId = new ProfileId();
        profileId.setId("123");
        Profile profile = useCase.execute(profileId);
        name.set(profile.getName());
        surname.set(profile.getSurname());
        age.set(profile.getAge());
        state.set(STATE.DATA);

    }

    @Override
    public void pause() {

    }


}
