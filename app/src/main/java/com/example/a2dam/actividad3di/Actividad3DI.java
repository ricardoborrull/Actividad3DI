package com.example.a2dam.actividad3di;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Actividad3DI extends AppCompatActivity {

    private TextView a1;
    private TextView a2;
    private TextView a3;
    private TextView a4;
    private final String TAG = "prueba";

    private TextView f1;
    private TextView f2;
    private TextView f3;
    private TextView f4;
    private TextView f5;
    private TextView f6;
    private TextView f7;
    private TextView f8;
    private TextView f9;
    private TextView f10;
    private TextView f11;
    private TextView f12;
    private TextView f13;
    private TextView f14;
    private TextView f15;
    private TextView f16;
    private TextView f17;
    private TextView f18;
    private TextView f19;
    private TextView f20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad3_di);
        a1 = (TextView) findViewById(R.id.a1);
        a2 = (TextView) findViewById(R.id.a2);
        a3 = (TextView) findViewById(R.id.a3);
        a4 = (TextView) findViewById(R.id.a4);

        f1 = (TextView) findViewById(R.id.f1);
        f2 = (TextView) findViewById(R.id.f2);
        f3 = (TextView) findViewById(R.id.f3);
        f4 = (TextView) findViewById(R.id.f4);
        f5 = (TextView) findViewById(R.id.f5);
        f6 = (TextView) findViewById(R.id.f6);
        f7 = (TextView) findViewById(R.id.f7);
        f8 = (TextView) findViewById(R.id.f8);
        f9 = (TextView) findViewById(R.id.f9);
        f10 = (TextView) findViewById(R.id.f10);
        f11 = (TextView) findViewById(R.id.f11);
        f12 = (TextView) findViewById(R.id.f12);
        f13 = (TextView) findViewById(R.id.f13);
        f14 = (TextView) findViewById(R.id.f14);
        f15 = (TextView) findViewById(R.id.f15);
        f16 = (TextView) findViewById(R.id.f16);
        f17 = (TextView) findViewById(R.id.f17);
        f18 = (TextView) findViewById(R.id.f18);
        f19 = (TextView) findViewById(R.id.f19);
        f20 = (TextView) findViewById(R.id.f20);


        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "Nombre: " + a1.getText());
                f1.setBackgroundColor(Color.parseColor("#FFFF4444"));
                f2.setBackgroundColor(Color.parseColor("#FFFF4444"));
                f3.setBackgroundColor(Color.parseColor("#FFFF4444"));
                f4.setBackgroundColor(Color.parseColor("#FFFF4444"));
                f5.setBackgroundColor(Color.parseColor("#FFFF4444"));
                f6.setBackgroundColor(Color.parseColor("#FFFF4444"));
                f7.setBackgroundColor(Color.parseColor("#FFFF4444"));
                f8.setBackgroundColor(Color.parseColor("#FFFF4444"));
                f9.setBackgroundColor(Color.parseColor("#FFFF4444"));
            }
        });

        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "Nombre: " + a2.getText());
                f1.setBackgroundColor(Color.parseColor("#FF33B5E5"));
                f2.setBackgroundColor(Color.parseColor("#FF33B5E5"));
                f3.setBackgroundColor(Color.parseColor("#FF33B5E5"));
                f4.setBackgroundColor(Color.parseColor("#FF33B5E5"));
                f5.setBackgroundColor(Color.parseColor("#FF33B5E5"));
            }
        });

        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "Nombre: " + a3.getText());
                f1.setBackgroundColor(Color.parseColor("#FF99CC00"));
                f2.setBackgroundColor(Color.parseColor("#FF99CC00"));
                f3.setBackgroundColor(Color.parseColor("#FF99CC00"));
                f4.setBackgroundColor(Color.parseColor("#FF99CC00"));
                f5.setBackgroundColor(Color.parseColor("#FF99CC00"));
                f6.setBackgroundColor(Color.parseColor("#FF99CC00"));
                f7.setBackgroundColor(Color.parseColor("#FF99CC00"));
                f8.setBackgroundColor(Color.parseColor("#FF99CC00"));
                f9.setBackgroundColor(Color.parseColor("#FF99CC00"));
                f10.setBackgroundColor(Color.parseColor("#FF99CC00"));
                f11.setBackgroundColor(Color.parseColor("#FF99CC00"));
                f12.setBackgroundColor(Color.parseColor("#FF99CC00"));
                f13.setBackgroundColor(Color.parseColor("#FF99CC00"));
                f14.setBackgroundColor(Color.parseColor("#FF99CC00"));
            }
        });

        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "Nombre: " + a4.getText());
                f1.setBackgroundColor(Color.parseColor("#FFFFBB33"));
                f2.setBackgroundColor(Color.parseColor("#FFFFBB33"));
                f3.setBackgroundColor(Color.parseColor("#FFFFBB33"));
                f4.setBackgroundColor(Color.parseColor("#FFFFBB33"));
                f5.setBackgroundColor(Color.parseColor("#FFFFBB33"));
            }
        });
    }
}