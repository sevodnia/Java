package com.doschechko.matylionak.wcguide.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * The base abstract class for all Activities in this app that use the MVP pattern
 * just extend form this one and and set the ViewModel object
 */

public  abstract class BaseActivity extends Activity {

    protected BaseActivityViewModel viewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel.init();
    }

    @Override
    protected void onResume() {
        super.onResume();
    viewModel.resume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    viewModel.pause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    viewModel.release();
    }
}
