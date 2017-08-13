package com.example.umbra.allApps.HW01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.umbra.allApps.R;

public class Activity_HomeWork01 extends AppCompatActivity implements View.OnClickListener {

    //объявляем переменные (элементы экрана)
    TextView text_no1;
    TextView text_no2;
    Button button;
    public String stringNo1;
    public String stringNo2;
    Button buttonReplaceAll;

    public static final String KEY_USERNAME = "KEY_USERNAME";
    public static final String KEY_PASSWORD = "KEY_PASSWORD";
    public static final String FLAG = "FLAG";
    public static boolean flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hw1_activity);
        CharSequence username = getIntent().getStringExtra("KEY_USERNAME");
        CharSequence password = getIntent().getStringExtra("KEY_PASSWORD");

        //инициализируем, находим их и присваиваем значения
        text_no1 = (TextView) findViewById(R.id.text_no1);
        text_no2 = (TextView) findViewById(R.id.text_no2);
        button = (Button) findViewById(R.id.button);


        //способ первый для кнопки
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceText(v);
            }
        };

        text_no1.setOnClickListener(listener);

        //способ второй с активити
        text_no2.setOnClickListener(this);

        //способ третий с анонимным классом

        buttonReplaceAll = (Button) findViewById(R.id.buttonReplaceAll);
        buttonReplaceAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceText(v);
            }
        });


        //получаем данные из другого активити и выводим их только после того, как заполнили форму.
        if (flag) {
            text_no1.setText(username);
            text_no2.setText(password);

        }


    }


    @Override
    public void onClick(View v) {
        replaceText(v);
    }

    //способ четвертый - с атрибутом xml тега onClick, который вызывает следющий метод
    public void replaceText(View v) {
        stringNo1 = text_no1.getText().toString();
        stringNo2 = text_no2.getText().toString();
        text_no1.setText(stringNo2);
        text_no2.setText(stringNo1);


    }


}
