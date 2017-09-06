package com.doschechko.matylionak.wcguide.anekdot;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.doschechko.matylionak.wcguide.R;
import com.doschechko.matylionak.wcguide.base.BaseFragment;
import com.doschechko.matylionak.wcguide.databinding.ActivityAnekdotBinding;

/*
Фрагмент для настройкий вью модели с анекдотами
 */

public class Activity_Anekdot extends BaseFragment {

    public Activity_Anekdot() {
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        //датабиндинг
        //подключение ресайкл вью
        Activity_AnekdotViewModel viewModel = new Activity_AnekdotViewModel();
        this.viewModel = viewModel;


        ActivityAnekdotBinding binding = DataBindingUtil.inflate(
                inflater, R.layout.activity_anekdot, container, false);
        View view = binding.getRoot();

        binding.setViewModel(viewModel);
        binding.recycleViewAndekdot.setLayoutManager(new LinearLayoutManager(getActivity()));
        binding.recycleViewAndekdot.setAdapter(viewModel.adaptor);


        return view;
    }


}
