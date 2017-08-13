package com.example.umbra.allApps.CW05;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.umbra.allApps.R;


public class Activity_ClassWork05 extends Activity {

    private TextView textView;
    private int i = 0;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cw5_activity);
        textView = (TextView) findViewById(R.id.textViewCW05);

        startService(new Intent(this, MyService.class));


        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_ClassWork05.this, MyService.class);
                stopService(intent);
            }
        });


        Intent intent = new Intent(Activity_ClassWork05.this, MyIntentService.class);
        intent.putExtra(MyIntentService.KEY_ACTION, "Задание 0");
        startService(intent);

        Intent intent2 = new Intent(Activity_ClassWork05.this, MyIntentService.class);
        intent2.putExtra(MyIntentService.KEY_ACTION, "Задание 1");
        startService(intent2);

        Intent intent3 = new Intent(Activity_ClassWork05.this, MyIntentService.class);
        intent3.putExtra(MyIntentService.KEY_ACTION, "Задание 2");
        startService(intent3);


    }


    private BroadcastReceiver reciever = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {

            Log.e("FGFGFGFGFGF", "onReceive");

            i++;
            textView.setText("i = " + i);


        }
    };

    @Override
    protected void onStart() {
        super.onStart();

//        подписываемся на получение
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);
        intentFilter.addAction(MyIntentService.MY_ACTION);
        registerReceiver(reciever, intentFilter);


        Intent intent = new Intent(Activity_ClassWork05.this, MyService.class);
        bindService(intent, serviceConnection, Context.BIND_AUTO_CREATE);
    }


    @Override
    protected void onStop() {
        super.onStop();
        //отписываемся от получения
        unregisterReceiver(reciever);

        unbindService(serviceConnection);
    }

    private ServiceConnection serviceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            Log.e("AAA", "onServiceConnected()");
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            Log.e("AAA", "onServiceDisconnected()");
        }


    };




}
