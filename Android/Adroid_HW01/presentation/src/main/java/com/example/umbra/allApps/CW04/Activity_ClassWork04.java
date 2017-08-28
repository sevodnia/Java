package com.example.umbra.allApps.CW04;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.umbra.allApps.R;

/**
 * Created by Umbra on 31.07.17.
 */

public class Activity_ClassWork04 extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cw4_activity);
        //интент - намерение открыть ресурсы, программы и т.д. в его также можно положить какие-то другие параметры, которые можно передать.
        //данные передаенные через интент сохранятся даже в том случае, если мы свернули активити
        //вседанные которые мы передаем через интент  они хранятся внутри хмл
        //интент
        //контекст
        //апликакэйшен
        //метод финиш в манифесте - и история не сохранияется
        //метод финиш - при уходе с активити предыдущая удаляется.ф
        //*Все эелменты интерфейса наследуются от класса VIEW

    }
}
