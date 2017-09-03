package com.doschechko.matylionak.wcguide.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.doschechko.matylionak.wcguide.R;
import com.doschechko.matylionak.wcguide.toolbar.ToolBarFragmentActivity;

public class MainActivity extends Activity {
    Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        startButton = (Button) findViewById(R.id.buttonFindWC);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ToolBarFragmentActivity.class);
                MainActivity.this.startActivity(intent);


            }
        });


    }
}
