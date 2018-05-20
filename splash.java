package coba;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import coba.ir.R;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new android.os.Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splash.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 2000); //waktu dalam miliSecond
    }}
