package com.example.umbra.allApps.HW05;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Switch;

import com.example.umbra.allApps.R;


public class Activity_HomeWork05 extends Activity {
    //что кладем
    public static final String FLAG = "FLAG";
    //название дейсьвия
    public static final String ACTION = "IS_WIFI_ENABLE";
    Switch aSwitch;
    boolean flag = false;
    BroadcastReceiver thisBroadcastReceiver;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hw5_activity);

        //  запускаем сервис
        startService(new Intent(this, HomeWorkService.class));
        //находим нужный вью
        aSwitch = (Switch) findViewById(R.id.toggleButton);
        // boolean flag = getIntent().getBooleanExtra(FLAG, false);

        aSwitch.setChecked(flag);

        //создаем слушатель, который слушает наши события
         thisBroadcastReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                if (intent.getBooleanExtra(FLAG, true)) {
                    aSwitch.setChecked(true);
                } else if (!intent.getBooleanExtra(FLAG, false)) {
                    aSwitch.setChecked(false);
                }
            }
        };

        IntentFilter filter = new IntentFilter();
        filter.addAction(Activity_HomeWork05.ACTION);
        registerReceiver(thisBroadcastReceiver, filter);
    }


    @Override
    protected void onPause() {
        super.onPause();
    }


    @Override
    protected void onStop() {
        stopService(new Intent(this, HomeWorkService.class));
        Log.e("FUCK", "активити  onStop()");
        unregisterReceiver(thisBroadcastReceiver);
        super.onStop();

    }


}
