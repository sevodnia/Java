package com.example.umbra.allApps.CW12;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.domain.entity.ProfileModel;
import com.example.umbra.allApps.base.BaseItemViewHolder;
import com.example.umbra.allApps.databinding.ItemProfileBinding;



public class ProfileItemViewHolder extends BaseItemViewHolder<ProfileModel,
        ProfileItemViewModel, ItemProfileBinding> {

    public ProfileItemViewHolder(ItemProfileBinding dataBinding,
                                 ProfileItemViewModel viewModel) {
        super(dataBinding, viewModel);
    }

    public static ProfileItemViewHolder create(LayoutInflater inflater, ViewGroup parent,
                                               ProfileItemViewModel viewModel) {
        ItemProfileBinding binding = ItemProfileBinding.inflate(inflater, parent, false);
        return new ProfileItemViewHolder(binding, viewModel);
    }
}
