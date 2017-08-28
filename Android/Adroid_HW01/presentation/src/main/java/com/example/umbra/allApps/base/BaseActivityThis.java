package com.example.umbra.allApps.base;
/*
Абстрактный класс, от которого будут наследоваться все мои базовые активити
 */

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

public abstract class BaseActivityThis extends Activity{


    protected BaseViewModelThis viewModel;

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
