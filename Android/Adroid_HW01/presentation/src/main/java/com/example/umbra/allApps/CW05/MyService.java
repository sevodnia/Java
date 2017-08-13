package com.example.umbra.allApps.CW05;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;


public class MyService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }


    @Override
    public void onCreate() {
        super.onCreate();

        Log.e("SERVISEEEEEE", "onCreate()");

        // метод останвливающий самого себя stopSelf();
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.e("SERVISEEEEEE", "onUnbind()");
        return super.onUnbind(intent);

    }


    @Override
    public int onStartCommand(Intent intent,int flags, int startId) {
        Log.e("SERVISEEEEEE", "onStartCommand()");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Log.e("SERVISEEEEEE", "onDestroy()");
        super.onDestroy();
    }
}
