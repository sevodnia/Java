package com.doschechko.matylionak.wcguide.toolbar;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.widget.SlidingDrawer;

import com.doschechko.matylionak.wcguide.R;
import com.doschechko.matylionak.wcguide.base.BaseFragmentActivity;
import com.doschechko.matylionak.wcguide.databinding.ToolbarBinding;

/**
 * ToolBar with changeble fragments
 */

public class ToolBarFragmentActivity extends BaseFragmentActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        //создаем дата-биндинг
        ToolBarFragmentActivityViewModel viewModel = new ToolBarFragmentActivityViewModel();
        viewModel.setActivity(this);
        FragmentManager manager = getSupportFragmentManager();
        viewModel.setFragmentManager(manager);
        this.viewModel = viewModel;

        ToolbarBinding binding = DataBindingUtil
                .setContentView(this, R.layout.toolbar);
        binding.setViewModel(viewModel);

        SlidingDrawer drawer=binding.SlidingDrawer;
        viewModel.setSlidingDrawer(drawer);

        super.onCreate(savedInstanceState);
    }
}
