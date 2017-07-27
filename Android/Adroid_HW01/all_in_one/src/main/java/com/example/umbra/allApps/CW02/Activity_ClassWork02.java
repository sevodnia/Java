package com.example.umbra.allApps.CW02;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.umbra.allApps.R;
import com.example.umbra.allApps.HW01.Activity_HomeWork01;

/**
 * Created by Umbra on 26.07.17.
 */

public class Activity_ClassWork02 extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cw2_activity);
        final EditText userName = (EditText) findViewById(R.id.userNameText);
        final EditText password = (EditText) findViewById(R.id.passwordText);
        Button loginButton = (Button) findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_ClassWork02.this, Activity_HomeWork01.class);
                intent.putExtra(Activity_HomeWork01.KEY_USERNAME, userName.getText().toString());
                intent.putExtra(Activity_HomeWork01.KEY_PASSWORD, password.getText().toString());
                Activity_HomeWork01.flag = true;
                intent.putExtra(Activity_HomeWork01.FLAG, Activity_HomeWork01.flag);
                startActivity(intent);
            }
        });


    }
}
