package com.example.umbra.allApps.CW12;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.domain.entity.ProfileModel;
import com.example.umbra.allApps.base.BaseAdapter;
import com.example.umbra.allApps.base.BaseItemViewHolder;

public class ProfileAdapter extends BaseAdapter<ProfileModel, ProfileItemViewModel> {

    private Context context;

    public ProfileAdapter(Context context) {
        this.context = context;
    }

    @Override
    public BaseItemViewHolder<ProfileModel, ProfileItemViewModel, ?>
    onCreateViewHolder(ViewGroup parent, int viewType) {
        ProfileItemViewModel itemViewModel = new ProfileItemViewModel();
        return  ProfileItemViewHolder.create(LayoutInflater.from(context),
                parent, itemViewModel);
    }
}