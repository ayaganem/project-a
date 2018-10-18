package com.example.mervatkhoury.understand_your_vehicle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.mervatkhoury.understand_your_vehicle.R;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "LogMsg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate"); // helps for debug

        final android.os.Handler handler = new android.os.Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, com.example.mervatkhoury.understand_your_vehicle.AppGUI.class);
                startActivity(intent);
                overridePendingTransition(R.transition.fade_in, R.transition.fade_out);
            }
        }, 2000);
    }

}