package com.example.umbra.allApps.main;


import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by Umbra on 30.07.17.
 */

public class ExampleApplication extends Application {

    @Override public void onCreate() {
        super.onCreate();
        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }
        LeakCanary.install(this);
        // Normal app init code...
    }



}
