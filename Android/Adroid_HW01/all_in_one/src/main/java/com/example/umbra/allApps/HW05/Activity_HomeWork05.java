package com.example.umbra.allApps.HW05;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Switch;

import com.example.umbra.allApps.R;


public class Activity_HomeWork05 extends Activity {
    public static final String FLAG = "FLAG";
    Switch aSwitch;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hw5_activity);

      //  запускаем сервис
        startService(new Intent(this, HomeWorkService.class));

        aSwitch = (Switch) findViewById(R.id.toggleButton);
        boolean flag = getIntent().getBooleanExtra(FLAG, false);

            aSwitch.setChecked(flag);

    }



    @Override
    protected void onPause() {
        super.onPause();
    }


    @Override
    protected void onStop() {
        stopService(new Intent(this, HomeWorkService.class));
        Log.e("FUCK", "активити  onStop()");


        super.onStop();
    }







}
