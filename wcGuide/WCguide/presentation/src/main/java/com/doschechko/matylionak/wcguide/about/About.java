package com.doschechko.matylionak.wcguide.about;

import android.app.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;


import com.doschechko.matylionak.wcguide.R;


public class About extends Activity {




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

  View backArrow = findViewById(R.id.back_arrow);
        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });




    }



}
