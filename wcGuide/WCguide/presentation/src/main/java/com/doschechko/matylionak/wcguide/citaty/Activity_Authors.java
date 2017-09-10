package com.doschechko.matylionak.wcguide.citaty;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.GridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.doschechko.matylionak.wcguide.R;
import com.doschechko.matylionak.wcguide.base.BaseFragment;
import com.doschechko.matylionak.wcguide.databinding.ActivityAllAuthorsBinding;

/**
 * Фрагмент со всеми авторами, цитатами которых мы располагаем
 */

public class Activity_Authors extends BaseFragment {

    public static  String AUTHOR_NAME="AUTHOR_NAME";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        Activity_AuthorsViewModel viewModel = new Activity_AuthorsViewModel();
        this.viewModel = viewModel;

        ActivityAllAuthorsBinding binding = DataBindingUtil.inflate(
                inflater, R.layout.activity_all_authors, container, false);
        View view = binding.getRoot();


        //передаем необходимые переменные во вью модель
        viewModel.setActivity(getActivity());
        viewModel.setBinding(binding);


        //нам нужен фрагмент менеджер
        FragmentManager  manager = getFragmentManager();
        viewModel.setManager(manager);

        //подключаем к биндингу втю модель
        binding.setViewModel(viewModel);



        return view;
    }







}
