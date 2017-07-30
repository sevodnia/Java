package com.example.umbra.allApps.HW03;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.umbra.allApps.R;
import com.squareup.picasso.Picasso;


public class Activity_HomeWork03 extends Activity {
    ImageView placeToLoadPicture;
    EditText placeText;
    String getText;
    String drink;
    RadioGroup group;
    boolean flag = false;
    public static final String VODKA = "http://kristal.by/upload/resize_cache/iblock/d44/210_400_1/%D0%A1%D1%82%D0%BE%D0%BB%D1%8C%D0%B3%D1%80%D0%B0%D0%B4%D0%BD%D0%B0%D1%8F%20%D1%81%D0%B0%D0%B9%D1%821.png";
    public static final String BEER = "http://krinitsa.by/upload/resize_cache/iblock/cc7/169_325_1/krinitsasvetloe.png";
    public static final String WISKEY = "http://kristal.by/upload/resize_cache/iblock/395/210_400_1/ROYAL-LEGEND-PRSENATIYA.png";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hw3_activity);

        //находим и получаем значения

        group = (RadioGroup) findViewById(R.id.radio_layout);
        placeToLoadPicture = (ImageView) findViewById(R.id.placeToLoadPicture);
        Button workButton = (Button) findViewById(R.id.pushLinkButton);


        workButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                placeText = (EditText) findViewById(R.id.putLink);
                getText = placeText.getText().toString();


                if (!flag && getText.isEmpty()) {
                    Toast toast = Toast.makeText(Activity_HomeWork03.this, "Ничего не выбрали, пора завязывать!", Toast.LENGTH_SHORT);
                    toast.show();
                }


                if (!getText.isEmpty()) {
                    //очищаем чекбоксы
                    group.clearCheck();
                    flag = false;
                    try {

                        //пытаемся загрузить картинку
                        Picasso.with(Activity_HomeWork03.this)
                                .load(getText)
                                //.placeholder(R.drawable.placeholder)
                                //.error(R.drawable.placeholder)
                                .into(placeToLoadPicture);
                    } catch (Exception e) {
                        Toast toast = Toast.makeText(Activity_HomeWork03.this, "Ошибка загрузки 1", Toast.LENGTH_SHORT);
                        toast.show();
                    }


                }
                if (flag) {
                    try {
                        //пытаемся загрузить картинку
                        Picasso.with(Activity_HomeWork03.this)
                                .load(drink)
                                //.placeholder(R.drawable.placeholder)
                                //.error(R.drawable.placeholder)
                                .into(placeToLoadPicture);
                        Toast toast = Toast.makeText(Activity_HomeWork03.this, "Бухнем!", Toast.LENGTH_SHORT);
                        toast.show();
                    } catch (Exception e) {
                        Toast toast = Toast.makeText(Activity_HomeWork03.this, "Ошибка загрузки 2", Toast.LENGTH_SHORT);
                        toast.show();
                    }

                    group.clearCheck();
                    flag = false;
                }

            }
        });


    }


    public void onRadioButtonClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.radio_pivo:
                if (checked) {
                    drink = BEER;
                    flag = true;
                }
                break;


            case R.id.radio_vodka:
                if (checked) {
                    drink = VODKA;
                    flag = true;
                }
                break;


            case R.id.radio_wiskey:
                if (checked) {
                    drink = WISKEY;
                    flag = true;
                }
                break;

        }


    }


}



