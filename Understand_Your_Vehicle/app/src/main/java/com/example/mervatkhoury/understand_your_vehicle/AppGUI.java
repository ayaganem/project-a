package com.example.mervatkhoury.understand_your_vehicle;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mervatkhoury.understand_your_vehicle.R;

public class AppGUI extends AppCompatActivity {

    ImageView add;
    ImageView start;
    ImageView stop;
    ImageView pause;
    ImageView refresh;
    ImageView load;
    ImageView share;
    ImageView delete;
    ImageView setting;
    ImageView settings_bg1;
    ImageView settings_bg2;
    ImageView settings_ok;
    TextView s1;
    TextView s2;
    TextView s3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_gui);

        add = (ImageView) findViewById(R.id.add);
        start = (ImageView) findViewById(R.id.start);
        stop = (ImageView) findViewById(R.id.stop);
        pause = (ImageView) findViewById(R.id.pause);
        refresh = (ImageView) findViewById(R.id.refresh);
        load = (ImageView) findViewById(R.id.load);
        share = (ImageView) findViewById(R.id.share);
        delete = (ImageView) findViewById(R.id.delete);
        setting = (ImageView) findViewById(R.id.settings);
        settings_bg1 = (ImageView) findViewById(R.id.settingsBar);
        settings_bg2 = (ImageView) findViewById(R.id.settingsBar2);
        settings_ok = (ImageView) findViewById(R.id.ok);

        s1 = (TextView) findViewById(R.id.s1);
        s2 = (TextView) findViewById(R.id.s2);
        s3 = (TextView) findViewById(R.id.s3);

        start.setVisibility(View.VISIBLE);
        pause.setVisibility(View.GONE);
        stop.setVisibility(View.GONE);
        settings_bg1.setVisibility(View.GONE);
        settings_bg2.setVisibility(View.GONE);
        settings_ok.setVisibility(View.GONE);
        s1.setVisibility(View.GONE);
        s2.setVisibility(View.GONE);
        s3.setVisibility(View.GONE);

        addListenerOnButton();
    }

    public void addListenerOnButton() {

        add.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent i = new Intent(getApplicationContext(),com.example.mervatkhoury.understand_your_vehicle.AppGUI.class);
                startActivity(i);
            }

        });

        setting.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                settings_bg1.setVisibility(View.VISIBLE);
                settings_bg2.setVisibility(View.VISIBLE);
                settings_ok.setVisibility(View.VISIBLE);

                s1.setVisibility(View.VISIBLE);
                s2.setVisibility(View.VISIBLE);
                s3.setVisibility(View.VISIBLE);
            }

        });

        settings_ok.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                settings_bg1.setVisibility(View.GONE);
                settings_bg2.setVisibility(View.GONE);
                settings_ok.setVisibility(View.GONE);

                s1.setVisibility(View.GONE);
                s2.setVisibility(View.GONE);
                s3.setVisibility(View.GONE);

            }

        });

        start.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stop.setVisibility(View.VISIBLE);
                pause.setVisibility(View.VISIBLE);
            }

        });

        pause.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                start.setVisibility(View.VISIBLE);
                pause.setVisibility(View.GONE);
            }

        });

        stop.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                start.setVisibility(View.VISIBLE);
                pause.setVisibility(View.GONE);
                stop.setVisibility(View.GONE);
            }

        });

    }

}
