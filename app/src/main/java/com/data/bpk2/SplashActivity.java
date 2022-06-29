package com.data.bpk2;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
//        Intent i = new Intent(getApplicationContext(), MainActivity.class);
//        startActivity(i);

        start();
    }


    private void start() {
        Thread background = new Thread() {
            @Override
            public void run() {
                try {
                    // Thread will sleep for 2 seconds
                    sleep(2 * 1000);
                    // After 5 seconds redirect to another intent
                    Intent i = new Intent(getApplicationContext(),
                            MainActivity.class);
                    startActivity(i);

                    finish();

                } catch (Exception e) {

                }
            }
        };
        background.start();
    }
}