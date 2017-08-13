package com.example.umbra.allApps.CW06;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.umbra.allApps.R;

import java.util.ArrayList;


public class Activity_ClassWork06 extends Activity {

    private RecyclerView recyclerView;
    private ArrayList<String> stringArrayList = new ArrayList<String>();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cw6_activity);

        stringArrayList.add("Item 1");
        stringArrayList.add("Item 2");
        stringArrayList.add("Item 3");
        stringArrayList.add("Item 4");
        stringArrayList.add("Item 5");
        stringArrayList.add("Item 6");
        stringArrayList.add("Item 7");
        stringArrayList.add("Item 8");
        stringArrayList.add("Item 9");
        stringArrayList.add("Item 10");


//        нужно задать как рисовать ресайкл вью. для этого существуют менеджеры, отвечающшие за то, как рисовать элементы.

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        //отвечает за то, как будет располагаться менеджер
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        //запихиваем менджер в лайаут
        recyclerView.setLayoutManager(layoutManager);

        //создаем адаптер и поключаем его
        ClassWork6Adapter adapter = new ClassWork6Adapter(stringArrayList);
        recyclerView.setAdapter(adapter);


    }
}
