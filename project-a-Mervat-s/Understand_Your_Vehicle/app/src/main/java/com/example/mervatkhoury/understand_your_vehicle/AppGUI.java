package com.example.mervatkhoury.understand_your_vehicle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.example.mervatkhoury.understand_your_vehicle.R;

public class AppGUI extends AppCompatActivity {

    ImageView settings;
    ImageView add;
    ImageView start;
    ImageView stop;
    ImageView pause;
    ImageView refresh;
    ImageView load;
    ImageView share;
    ImageView delete;
    ImageView plus1;
    ImageView plus2;
    ImageView plus3;
    ImageView plus4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_gui);

        settings = (ImageView) findViewById(R.id.settings);
        add = (ImageView) findViewById(R.id.add);
        start = (ImageView) findViewById(R.id.start);
        stop = (ImageView) findViewById(R.id.stop);
        pause = (ImageView) findViewById(R.id.pause);
        refresh = (ImageView) findViewById(R.id.refresh);
        load = (ImageView) findViewById(R.id.load);
        share = (ImageView) findViewById(R.id.share);
        delete = (ImageView) findViewById(R.id.delete);
        plus1 = (ImageView) findViewById(R.id.plus1);
        plus2 = (ImageView) findViewById(R.id.plus2);
        plus3 = (ImageView) findViewById(R.id.plus3);
        plus4 = (ImageView) findViewById(R.id.plus4);


        start.setVisibility(View.VISIBLE);
        pause.setVisibility(View.GONE);
        stop.setVisibility(View.GONE);

        addListenerOnButton();
    }

    ////////////////begin Gestures////////////////////
    //change the return to true if handled

//    @Override
//    public boolean onSingleTapConfirmed(MotionEvent e) {
//        return false;
//    }
//
//    @Override
//    public boolean onDoubleTap(MotionEvent e) {
//        return false;
//    }
//
//    @Override
//    public boolean onDoubleTapEvent(MotionEvent e) {
//        return false;
//    }
//
//    @Override
//    public boolean onDown(MotionEvent e) {
//        return false;
//    }
//
//    @Override
//    public void onShowPress(MotionEvent e) {
//
//    }
//
//    @Override
//    public boolean onSingleTapUp(MotionEvent e) {
//        return false;
//    }
//
//    @Override
//    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
//        return false;
//    }
//
//    @Override
//    public void onLongPress(MotionEvent e) {
//
//    }
//
//    @Override
//    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
//        return false;
//    }
    ////////////////end Gestures////////////////////
    ////////////////begin Clicks////////////////////
    public void addListenerOnButton() {

        add.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent i = new Intent(getApplicationContext(),com.example.mervatkhoury.understand_your_vehicle.AppGUI.class);
                startActivity(i);
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
    //////////////////end Clicks/////////////////////
}
