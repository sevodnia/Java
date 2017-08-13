package com.example.umbra.allApps.CW07;

import android.app.Activity;


import android.databinding.DataBindingUtil;
import android.databinding.ObservableField;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.umbra.allApps.R;
import com.example.umbra.allApps.databinding.Cw7ActivityBinding;


public class Activity_ClassWork07 extends Activity {
//типо устанавливаем значение по умолчанию
    public ObservableField<String> myText = new ObservableField<>("Ура, все работает!");

    private Thread thread;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //этот класс - это мой xml
        Cw7ActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.cw7_activity);
        //это установка <variable>
        binding.setActivity(this);

        //можно через биндинг обратиться к id моего view
        //binding.superTextView.setText("Что-то не работает");


    }


    @Override
    protected void onResume() {
        super.onResume();
        thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    final int a = i;
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    //чтобы  поменть textView нужно его менять в другом потоке
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            myText.set(String.valueOf(a));
                        }
                    });

                }
            }
        });
        thread.start();

    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
