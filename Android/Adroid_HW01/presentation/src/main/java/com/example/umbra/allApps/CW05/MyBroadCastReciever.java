package com.example.umbra.allApps.CW05;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;


public class MyBroadCastReciever extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {


        Log.e("ssxsx", "onReceive");


//писать тяжёлый код внутри онресив нельзя.
//        можно слать уведомления (свеху телефона)
    }
}
