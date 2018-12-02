package com.example.mervatkhoury.understand_your_vehicle;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.google.firebase.database.collection.LLRBNode;
import com.jjoe64.graphview.GraphView;
import com.google.firebase.database.*;

public class AppGUI extends AppCompatActivity {

    private RTGraph graph1;
    private RTGraph graph2;
    private RTGraph graph3;
    private RTGraph graph4;

    private ImageView settings;
    private ImageView add;
    private ImageView start;
    private ImageView stop;
    private ImageView pause;
    private ImageView refresh;
    private ImageView load;
    private ImageView share;
    private ImageView delete;
    private ImageView plus1;
    private ImageView plus2;
    private ImageView plus3;
    private ImageView plus4;

    //FirebaseDatabase database = FirebaseDatabase.getInstance();
    //DatabaseReference myRef = database.getReference("message");

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

        graph1 = new RTGraph(1);
        graph1.graph = (GraphView) findViewById(R.id.graph1); //what's fucking wrong??
        graph2 = new RTGraph(2);
        graph2.graph = (GraphView) findViewById(R.id.graph2);
        graph3 = new RTGraph(3);
        graph3.graph = (GraphView) findViewById(R.id.graph3);
        graph4 = new RTGraph(4);
        graph4.graph = (GraphView) findViewById(R.id.graph4);

        init();
        addListenerOnButton();
    }

    private void init(){
        start.setVisibility(View.VISIBLE);
        pause.setVisibility(View.GONE);
        stop.setVisibility(View.GONE);
        graph1.graph.setVisibility(View.GONE);
        graph2.graph.setVisibility(View.GONE);
        graph3.graph.setVisibility(View.GONE);
        graph4.graph.setVisibility(View.GONE);

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

        plus1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                plus1.setVisibility(View.GONE);
                graph1.addPoint(1,1);
                graph1.addPoint(2,3);
                //graph1.addPoint(3,3); why ??
            }

        });
        plus2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                plus2.setVisibility(View.GONE);
                graph2.addPoint(5,5);
            }

        });
        plus3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                plus3.setVisibility(View.GONE);
                graph3.addPoint(0,0);
            }

        });
        plus4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                plus4.setVisibility(View.GONE);
                graph4.addPoint(-1,1);
            }

        });

    }
    //////////////////end Clicks/////////////////////
}
