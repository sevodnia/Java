package com.doschechko.matylionak.wcguide.toolbar;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.doschechko.matylionak.wcguide.R;
import com.doschechko.matylionak.wcguide.base.BaseActivity;
import com.doschechko.matylionak.wcguide.databinding.ToolbarBinding;

/**
 * ToolBar with changeble fragments
 */

public class ToolBarActivity extends BaseActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        //создаем дата-биндинг
        ToolBarActivityViewModel viewModel = new ToolBarActivityViewModel();
        this.viewModel = viewModel;

        ToolbarBinding binding = DataBindingUtil
                .setContentView(this, R.layout.toolbar);
        binding.setViewModel(viewModel);




        super.onCreate(savedInstanceState);
    }
}
