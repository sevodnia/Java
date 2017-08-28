package com.example.umbra.allApps.HW05;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.Gravity;
import android.widget.Toast;

public class HomeWorkService extends Service {
    private HomeWorkBroadCastReciever reciever;
    public static boolean WIFI_FLAG;


    @Override
    public void onCreate() {

        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        //тут нужно реализовать broadcastreciever
        Log.e("FUCK", " onStartCommand - HOMEWORKSERVISE начал работу");
        reciever = new HomeWorkBroadCastReciever() {
            @Override
            public void onReceive(Context context, Intent intent) {

                Log.e("FUCK", "Запустили HomeWorkBroadCastReciever");

                WifiManager manager = (WifiManager) context.getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                int number = manager.getWifiState();

                switch (number) {

                    case WifiManager.WIFI_STATE_DISABLED:
                        Log.e("FUCK", "Вот в чем: WIFI_STATE_DISABLED");
                        WIFI_FLAG = false;
                        Log.e("FUCK", "FLAG IS" + WIFI_FLAG);
                        Toast toast = Toast.makeText(context, "Вай-фая блядь няма", Toast.LENGTH_SHORT);
                        toast.show();

                        //тут мы отправляем событие
                        Intent newIntent1 = new Intent();
                        newIntent1.setAction(Activity_HomeWork05.ACTION);
                        newIntent1.putExtra(Activity_HomeWork05.FLAG, false);
                        sendBroadcast(newIntent1);
                        break;

                    case WifiManager.WIFI_STATE_ENABLED:
                        Log.e("FUCK", "Вот в чем: WIFI_STATE_ENABLED");
                        WIFI_FLAG = true;
                        Log.e("FUCK", "FLAG IS " + WIFI_FLAG);
                        Toast toast2 = Toast.makeText(context, "Вай-фая блядь есть!", Toast.LENGTH_SHORT);
                        toast2.show();

                        //тут мы отправляем событие
                        Intent newIntent2 = new Intent();
                        newIntent2.setAction(Activity_HomeWork05.ACTION);
                        newIntent2.putExtra(Activity_HomeWork05.FLAG, true);
                        sendBroadcast(newIntent2);


                        break;
                }
            }
        };


        Log.e("FUCK", "---->>>>>От тут какая-то шняга происходит -  = " + WIFI_FLAG);

        IntentFilter filter = new IntentFilter();
        filter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);
        registerReceiver(reciever, filter);
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Log.e("FUCK", " удаляем свервис с помощью onDestroy");
        unregisterReceiver(reciever);
        super.onDestroy();
    }

    @Override
    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }


}
