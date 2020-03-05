package com.example.slash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT= 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new  Runnable(){

            public void run(){
                Intent Homeintent=new Intent(MainActivity.this,HomeActivity.class);
                startActivity(Homeintent);
                finish();
            }

        },SPLASH_TIME_OUT);
    }
}
