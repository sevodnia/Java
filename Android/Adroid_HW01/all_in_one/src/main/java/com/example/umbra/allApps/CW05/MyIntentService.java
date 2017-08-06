package com.example.umbra.allApps.CW05;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;


//работает сразу в другом потоке, представляет из себя очередь
public class MyIntentService extends IntentService {

    public static final String KEY_ACTION = "KEY_ACTION";

    //название события
    public static final String MY_ACTION = "Activity_ClassWork05.KEY_ACTION";


    public MyIntentService() {
        super("MyIntentService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {

        String action = intent.getStringExtra(KEY_ACTION);

        //  Log.e("AAA", "onHandleIntent() action = " + action);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent intentReceiver = new Intent(MY_ACTION);
        sendBroadcast(intentReceiver);
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("AAA","onDestroy()");
    }
}
