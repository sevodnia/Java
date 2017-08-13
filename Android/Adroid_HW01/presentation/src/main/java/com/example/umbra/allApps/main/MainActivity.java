package com.example.umbra.allApps.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import com.example.umbra.allApps.CW03.Activity_ClassWork03;
import com.example.umbra.allApps.CW04.Activity_ClassWork04;
import com.example.umbra.allApps.CW05.Activity_ClassWork05;
import com.example.umbra.allApps.CW06.Activity_ClassWork06;
import com.example.umbra.allApps.CW07.Activity_ClassWork07;
import com.example.umbra.allApps.CW08.Activity_ClassWork08;
import com.example.umbra.allApps.CW09.Activity_ClassWork09;
import com.example.umbra.allApps.HW03.Activity_HomeWork03;
import com.example.umbra.allApps.HW04.Activity_HomeWork04;
import com.example.umbra.allApps.HW05.Activity_HomeWork05;
import com.example.umbra.allApps.HW06.Activity_HomeWork06;
import com.example.umbra.allApps.HW07.Activity_HomeWork07;
import com.example.umbra.allApps.HW09.Activity_HomeWork09;
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
                overridePendingTransition(R.anim.transition, R.anim.transition_back);

            }
        });

        Button cw1button = (Button) findViewById(R.id.cw1button);
        cw1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity_ClassWork02.class);
                startActivity(intent);
                overridePendingTransition(R.anim.transition, R.anim.transition_back);
            }
        });

        //домашка №2
        Button dz2button = (Button) findViewById(R.id.dz2button);
        dz2button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity_HomeWork02.class);
                startActivity(intent);
                overridePendingTransition(R.anim.transition, R.anim.transition_back);
            }
        });

//классная работа №3


        Button cw3button = (Button) findViewById(R.id.cw3button);
        cw3button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity_ClassWork03.class);
                startActivity(intent);
                overridePendingTransition(R.anim.transition, R.anim.transition_back);

            }
        });


//        домашняя работа №3

        Button hw3button = (Button) findViewById(R.id.dz3button);
        hw3button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity_HomeWork03.class);
                startActivity(intent);
                overridePendingTransition(R.anim.transition, R.anim.transition_back);
            }
        });


        //        лассная работа №4

        Button cw4button = (Button) findViewById(R.id.cw4button);
        cw4button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity_ClassWork04.class);
                startActivity(intent);
                overridePendingTransition(R.anim.transition, R.anim.transition_back);

            }
        });

        //        домашняя работа №4

        Button hw4button = (Button) findViewById(R.id.dz4button);
        hw4button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity_HomeWork04.class);
                startActivity(intent);
                overridePendingTransition(R.anim.transition, R.anim.transition_back);
            }
        });


        //        домашняя работа №5

        Button hw5button = (Button) findViewById(R.id.dz5button);
        hw5button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity_HomeWork05.class);
                startActivity(intent);
                overridePendingTransition(R.anim.transition, R.anim.transition_back);
            }
        });






        //       Классная работа №5

        Button cw5button = (Button) findViewById(R.id.cw5button);
        cw5button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity_ClassWork05.class);
                startActivity(intent);
                overridePendingTransition(R.anim.transition, R.anim.transition_back);


            }
        });



        //       Классная работа №6

        Button cw6button = (Button) findViewById(R.id.cw6button);
        cw6button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity_ClassWork06.class);
                startActivity(intent);
                overridePendingTransition(R.anim.transition, R.anim.transition_back);


            }
        });




        //        домашняя работа №6

        Button hw6button = (Button) findViewById(R.id.dz6button);
        hw6button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity_HomeWork06.class);
                startActivity(intent);
                overridePendingTransition(R.anim.transition, R.anim.transition_back);
            }
        });


        //       Классная работа №7

        Button cw7button = (Button) findViewById(R.id.cw7button);
        cw7button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity_ClassWork07.class);
                startActivity(intent);
                overridePendingTransition(R.anim.transition, R.anim.transition_back);


            }
        });

        //        домашняя работа №7

        Button hw7button = (Button) findViewById(R.id.dz7button);
        hw7button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity_HomeWork07.class);
                startActivity(intent);
                overridePendingTransition(R.anim.transition, R.anim.transition_back);
            }
        });




        //       Классная работа №8

        Button cw8button = (Button) findViewById(R.id.cw8button);
        cw8button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity_ClassWork08.class);
                startActivity(intent);
                overridePendingTransition(R.anim.transition, R.anim.transition_back);


            }
        });



        //       Классная работа №8

        Button cw9button = (Button) findViewById(R.id.cw9button);
        cw9button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity_ClassWork09.class);
                startActivity(intent);
                overridePendingTransition(R.anim.transition, R.anim.transition_back);


            }
        });

        //        домашняя работа №9

        Button hw9button = (Button) findViewById(R.id.hw9button);
        hw9button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Activity_HomeWork09.show(MainActivity.this);
            }
        });





        // проверка на разрешения с помощью класса ContextCompat


    }


//возврат на предыдущую активити  и эффект перехода
    //есть вариант устновки перехда общую для всего приложения в манифесте


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.transition, R.anim.myscale);


    }


}
