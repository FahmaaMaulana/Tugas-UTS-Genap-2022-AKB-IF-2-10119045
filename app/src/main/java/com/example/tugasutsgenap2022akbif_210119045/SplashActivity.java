package com.example.tugasutsgenap2022akbif_210119045;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);
        Thread thread = runOnUiThread();
            try {
                sleep();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                startActivity(new Intent(SplashActivity.this,MainActivity.class));
                finish();
            }
        };
    thread.start();
    }
}