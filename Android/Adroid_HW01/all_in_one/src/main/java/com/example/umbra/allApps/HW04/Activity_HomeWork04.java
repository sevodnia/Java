package com.example.umbra.allApps.HW04;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.example.umbra.allApps.R;


public class Activity_HomeWork04 extends Activity {

    private  AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.hw4_activity);

        ImageView imageView = (ImageView) findViewById(R.id.imageSova);
        imageView.setBackgroundResource(R.drawable.sova);
        animationDrawable = (AnimationDrawable) imageView.getBackground();
        animationDrawable.start();







    }
}
