package com.example.umbra.allApps.CW13;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.example.umbra.allApps.R;


public class Activity_ClassWork13 extends FragmentActivity {

    public Activity_ClassWork13() {
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.cw13_activity);


//        //говорим активити, чтобы он отобразил наш фрагменты
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        //трансакции откатываются назад, если выполняются с ошиюбклой
//        FragmentTransaction  fragmentTransaction = fragmentManager.beginTransaction();
//
//        //здесь просто как обычно создем фрагменты
//        ClassWork13Fragment fragment = new ClassWork13Fragment();
//        //первым задаем ид элемента, который хотим заменить
//        fragmentTransaction.replace(R.id.container, fragment, null);
//        //выполняем с помощью функции commit
//        fragmentTransaction.commit();


        if (savedInstanceState == null) {
//проверка на наличие экрана
            showFragment(getSupportFragmentManager(), new ClassWork13Fragment(), false);
        }

        findViewById(R.id.b1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showFragment(getSupportFragmentManager(), new ClassWork13Fragment()
                        .newInstance(getSupportFragmentManager(),"ddsd"), true);
            }
        });

        findViewById(R.id.b2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showFragment(getSupportFragmentManager(), new ClassWork13SecondFragment(), true);
            }
        });


    }


    public static void showFragment(FragmentManager fragmentManager, Fragment fragment, boolean addToBackStack) {
//здесь мы все перенесли тупо в статический метод
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        //последний аргумент нужен только для индефикации - уникальный тег.
        //сюда можно также подавать null
        fragmentTransaction.replace(R.id.container, fragment, fragment.getClass().getName());
        if (addToBackStack)fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }

}
