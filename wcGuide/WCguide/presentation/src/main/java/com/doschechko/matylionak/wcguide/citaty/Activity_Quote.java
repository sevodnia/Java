package com.doschechko.matylionak.wcguide.citaty;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.doschechko.matylionak.wcguide.R;
import com.doschechko.matylionak.wcguide.base.BaseFragment;
import com.doschechko.matylionak.wcguide.databinding.ActivityQuoteBinding;


public class Activity_Quote extends BaseFragment {

    public Activity_Quote() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        Activity_QuoteViewModel viewModel = new Activity_QuoteViewModel();
        this.viewModel = viewModel;

        ActivityQuoteBinding binding  = DataBindingUtil.inflate(
                inflater, R.layout.activity_quote, container, false);
        View view = binding.getRoot();
        //here data must be an instance of the class MarsDataProvider
        binding.setViewModel(viewModel);
        binding.recycleViewQuotes.setLayoutManager(new LinearLayoutManager(getActivity()));
        binding.recycleViewQuotes.setAdapter(viewModel.adaptor);

        Log.e("F", "Activity_Quote starts");
        return view;

    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
//        Activity_QuoteViewModel viewModel = new Activity_QuoteViewModel();
//        this.viewModel = viewModel;
//        ActivityQuoteBinding binding = DataBindingUtil.setContentView(getActivity(), R.layout.activity_quote);
//        binding.setViewModel(viewModel);
        super.onViewCreated(view, savedInstanceState);




    }


}
