package com.example.umbra.allApps.CW12;

import android.databinding.ObservableField;

import com.example.domain.entity.ProfileModel;
import com.example.umbra.allApps.base.BaseItemViewModel;



public class ProfileItemViewModel extends BaseItemViewModel <ProfileModel> {

    public ObservableField <String>  name = new ObservableField<>("");

    @Override
    public void setItem(ProfileModel item, int position) {
        name.set(item.getName());
    }
}
