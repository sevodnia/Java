package com.example.umbra.allApps.HW07;

import android.app.Activity;
import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.example.umbra.allApps.R;
import com.example.umbra.allApps.databinding.Hw7ActivityBinding;
import com.squareup.picasso.Picasso;

import java.lang.annotation.Annotation;


public class Activity_HomeWork07 extends Activity implements BindingAdapter {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Hw7ActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.hw7_activity);
        binding.setActivity(this);


        //вот только вдуматься в эту строчку кода.... фантастика
        President president = new President();
        president.setName("Александр");
        president.setPatronimic("Григорьевич");
        president.setSurname("Лукашенко");
        president.setAge(62);
        president.setGender(President.MAN);
        //president.setPicture("http://www.belaruspartisan.org/upload/iblock/5e5/5e5eb23ff9ce231c5e92b8d71d9b5bcf.jpg");
        president.setPicture("https://24smi.org/public/media/2017/3/7/02_tEiW1Lr.jpg");
        binding.setPresident(president);

    }

    @Override
    public String[] value() {
        return new String[0];
    }

    @Override
    public boolean requireAll() {
        return false;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }



    @BindingAdapter({"bind:imageUrl"})
    public static void loadImage(ImageView view, String url) {
        Picasso.with(view.getContext()).load(url).into(view);
    }

    public class President {


        private String name;
        private String patronimic;
        private String surname;
        private int age;
        private String picture;
        private String gender;
        public static final String MAN = "МУЖИК";
        public static final String WOMAN = "БАБА";

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPatronimic() {
            return patronimic;
        }

        public void setPatronimic(String patronimic) {
            this.patronimic = patronimic;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getPicture() {
            return picture;
        }

        public void setPicture(String picture) {
            this.picture = picture;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }
    }




}


