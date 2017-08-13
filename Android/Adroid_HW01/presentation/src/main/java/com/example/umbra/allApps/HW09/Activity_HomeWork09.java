package com.example.umbra.allApps.HW09;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.umbra.allApps.R;


public class Activity_HomeWork09 extends Activity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hw9_activity);



    }

    public static void show(Activity activity){

    Intent intent = new Intent(activity, Activity_HomeWork09.class);

    activity.startActivity(intent);

}



}
