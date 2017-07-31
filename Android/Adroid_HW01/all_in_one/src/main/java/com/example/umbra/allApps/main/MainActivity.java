package com.example.umbra.allApps.main;

        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.support.annotation.Nullable;
        import android.support.v4.content.ContextCompat;
        import android.view.View;
        import android.widget.Button;

        import com.example.umbra.allApps.CW03.Activity_ClassWork03;
        import com.example.umbra.allApps.CW04.Activity_ClassWork04;
        import com.example.umbra.allApps.HW03.Activity_HomeWork03;
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

//классная работа №3


        Button cw3button = (Button) findViewById(R.id.cw3button);
        cw3button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity_ClassWork03.class);
                startActivity(intent);


            }
        });




//        домашняя работа №3

        Button hw3button  = (Button) findViewById(R.id.dz3button);
        hw3button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity_HomeWork03.class);
                startActivity(intent);
            }
        });



        //        лассная работа №4

        Button cw4button  = (Button) findViewById(R.id.cw4button);
        cw4button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity_ClassWork04.class);
                //overridePendingTransition(R.anim...., R.anim);
                startActivity(intent);
            }
        });


        // проверка на разрешения с помощью класса ContextCompat




    }


    //возврат на предыдущую активити  и эффект перехода
    //есть вариант устновки перехда общую для всего приложения в манифесте


//    @Override
//    public void onBackPressed() {
//        super.onBackPressed();
//        //overridePendingTransition(R.anim...., R.anim);
//
//
//    }



}
