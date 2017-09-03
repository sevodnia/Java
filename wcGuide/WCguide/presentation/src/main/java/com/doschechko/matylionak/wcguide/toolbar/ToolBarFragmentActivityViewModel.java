package com.doschechko.matylionak.wcguide.toolbar;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.SlidingDrawer;
import android.widget.Toast;

import com.doschechko.matylionak.wcguide.R;
import com.doschechko.matylionak.wcguide.about.AboutFragment;
import com.doschechko.matylionak.wcguide.base.BaseFragmentActivityViewModel;
import com.doschechko.matylionak.wcguide.citaty.Activity_Quote;
import com.doschechko.matylionak.wcguide.horoscope.Activity_Horoscope;

/**
 * ViewModel for the ToolBar
 */

public class ToolBarFragmentActivityViewModel implements BaseFragmentActivityViewModel {

    private FragmentManager fragmentManager;
    private Activity activity;

    public void setFragmentManager(FragmentManager fragmentManager) {
        this.fragmentManager = fragmentManager;
    }

    public ToolBarFragmentActivityViewModel() {
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void init() {
    }

    @Override
    public void release() {

    }

    @Override
    public void resume() {
    }

    @Override
    public void pause() {

    }


    public void onClickOpenAbout() {
        //it starts an AboutUsActivity
        Toast.makeText(activity, "О нас", Toast.LENGTH_SHORT).show();
        showFragment(fragmentManager, new AboutFragment(), false);

    }


    public void onClickOpenQuote() {

        //it starts an Activity_Quote
        Toast.makeText(activity, "Цитаты", Toast.LENGTH_SHORT).show();
        showFragment(fragmentManager, new Activity_Quote(), false);
    }


    public void onClickOpenHoroscope() {

        //it starts an Activity_Horoscope
        Toast.makeText(activity, "Гороскоп на сегодня", Toast.LENGTH_SHORT).show();
        showFragment(fragmentManager, new Activity_Horoscope(), false);
    }


    public void onClickBack() {
        //backclick
        activity.onBackPressed();

    }


    public static void showFragment(FragmentManager fragmentManager, Fragment fragment, boolean addToBackStack) {
        //здесь мы все перенесли тупо в статический метод
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        //последний аргумент нужен только для индефикации - уникальный тег.
        fragmentTransaction.replace(R.id.container, fragment, fragment.getClass().getName());
        if (addToBackStack) fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }


}
