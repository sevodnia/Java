package com.example.umbra.allApps.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import com.example.umbra.allApps.R;
import com.example.umbra.allApps.CW02.Activity_ClassWork02;
import com.example.umbra.allApps.HW01.Activity_HomeWork01;
import com.example.umbra.allApps.HW02.Activity_HomeWork02;
/**
 * Created by Umbra on 26.07.17.
 */

public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_activity);




        //домашка №1
        Button dz1button = (Button) findViewById(R.id.dz1Button);
        dz1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity_HomeWork01.class);
                startActivity(intent);


            }
        });

        Button cw1button = (Button) findViewById(R.id.cw1button);
        cw1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity_ClassWork02.class);
                startActivity(intent);
            }
        });

        //домашка №2
        Button dz2button = (Button) findViewById(R.id.dz2button);
        dz2button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity_HomeWork02.class);
                startActivity(intent);


            }
        });


    }
}
