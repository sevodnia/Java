package com.doschechko.matylionak.wcguide.horoscope;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.doschechko.matylionak.wcguide.R;
import com.doschechko.matylionak.wcguide.base.BaseFragment;
import com.doschechko.matylionak.wcguide.databinding.ActivityHoroscopeBinding;


public class Activity_Horoscope extends BaseFragment {

    public Activity_Horoscope() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        Activity_HoroscopeViewModel viewModel = new Activity_HoroscopeViewModel();
        this.viewModel = viewModel;

        ActivityHoroscopeBinding binding = DataBindingUtil.inflate(
                inflater, R.layout.activity_horoscope, container, false);
        View view = binding.getRoot();
        binding.setViewModel(viewModel);


        return view;
    }
}
