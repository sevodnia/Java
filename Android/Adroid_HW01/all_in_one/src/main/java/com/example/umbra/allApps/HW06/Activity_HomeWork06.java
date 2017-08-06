package com.example.umbra.allApps.HW06;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.umbra.allApps.HW05.Activity_HomeWork05;
import com.example.umbra.allApps.R;

import java.util.ArrayList;

public class Activity_HomeWork06 extends Activity {
    ArrayList<Motorcycle> motors;
    RecyclerView recyclerView;
    GridLayoutManager layoutManager;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hw6_activity);

        Motorcycle motorcycle = new Motorcycle();
        motors = motorcycle.getMotorcycles();

        Log.e("MOTO", "ATTAY"+motors.toString());
        recyclerView = (RecyclerView) findViewById(R.id.resV);

        layoutManager = new GridLayoutManager(Activity_HomeWork06.this, 2);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);

        MyAdaptor myAdaptor = new MyAdaptor(Activity_HomeWork06.this, motors);
        recyclerView.setAdapter(myAdaptor);


    }
}
