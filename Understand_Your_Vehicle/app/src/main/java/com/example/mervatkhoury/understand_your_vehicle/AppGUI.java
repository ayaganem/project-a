package com.example.mervatkhoury.understand_your_vehicle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.mervatkhoury.understand_your_vehicle.R;

public class AppGUI extends AppCompatActivity {

    ImageView add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_gui);

        addListenerOnButton();
    }

    public void addListenerOnButton() {

        add = (ImageView) findViewById(R.id.appCompatImageButton3);
        add.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent i = new Intent(getApplicationContext(),com.example.mervatkhoury.understand_your_vehicle.AppGUI.class);
                startActivity(i);
            }

        });

    }

}
