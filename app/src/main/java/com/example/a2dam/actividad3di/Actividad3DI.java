package com.example.a2dam.actividad3di;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.GridLayout;
import android.widget.TextView;

public class Actividad3DI extends AppCompatActivity implements View.OnClickListener{

    private TextView a1, a2, a3, a4;
    private final String TAG = "prueba";

    private TextView foto;
    private GridLayout fotos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad3_di);
        a1 = (TextView) findViewById(R.id.a1);
        a2 = (TextView) findViewById(R.id.a2);
        a3 = (TextView) findViewById(R.id.a3);
        a4 = (TextView) findViewById(R.id.a4);

        fotos = (GridLayout) findViewById(R.id.fotos);

        //f1 = (TextView) findViewById(R.id.f1);
        //f2 = (TextView) findViewById(R.id.f2);


        /*a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "Nombre: " + a1.getText());
                //String[] album1 = new String[9];
                    for (int i = 0; i<10; i++ ){
                        new TextView(this);
                        f1.setText("Foto "+i);
                        fotos.addView(f1);
                    }
                f1.setBackgroundColor(Color.parseColor("#FFFF4444"));
            }
        });*/


        a1.setOnClickListener(this);
        a2.setOnClickListener(this);
        a3.setOnClickListener(this);
        a4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == a1.getId()) {
            Log.d(TAG, "Nombre: " + a1.getText());
            fotos.removeAllViews();
            for (int i = 1; i < 10; i++) {
                foto = new TextView(this);
                foto.setText("Foto " + i);
                foto.setTextSize(18);
                fotos.addView(foto);
                foto.setBackgroundColor(Color.parseColor("#FFFF4444"));
                foto.setWidth(180);
                foto.setHeight(180);
                GridLayout.LayoutParams margins = new GridLayout.LayoutParams();
                margins.setMargins(10, 10, 10, 10);
                foto.setLayoutParams(margins);
            }
        }

        if (v.getId() == a2.getId()) {
            Log.d(TAG, "Nombre: " + a2.getText());
            fotos.removeAllViews();
            for (int i = 1; i < 23; i++) {
                foto = new TextView(this);
                foto.setText("Foto " + i);
                foto.setTextSize(18);
                fotos.addView(foto);
                foto.setBackgroundColor(Color.parseColor("#FF33B5E5"));
                foto.setWidth(180);
                foto.setHeight(180);
                GridLayout.LayoutParams margins = new GridLayout.LayoutParams();
                margins.setMargins(10, 10, 10, 10);
                foto.setLayoutParams(margins);
            }
        }

            if (v.getId() == a3.getId()) {
                Log.d(TAG, "Nombre: " + a3.getText());
                fotos.removeAllViews();
                for (int i = 1; i < 25; i++) {
                    foto = new TextView(this);
                    foto.setText("Foto " + i);
                    foto.setTextSize(18);
                    fotos.addView(foto);
                    foto.setBackgroundColor(Color.parseColor("#FF99CC00"));
                    foto.setWidth(180);
                    foto.setHeight(180);
                    GridLayout.LayoutParams margins = new GridLayout.LayoutParams();
                    margins.setMargins(10, 10, 10, 10);
                    foto.setLayoutParams(margins);
                }
            }

            if (v.getId() == a4.getId()) {
                Log.d(TAG, "Nombre: " + a4.getText());
                fotos.removeAllViews();
                for (int i = 1; i < 15; i++) {
                    foto = new TextView(this);
                    foto.setText("Foto " + i);
                    foto.setTextSize(18);
                    fotos.addView(foto);
                    foto.setBackgroundColor(Color.parseColor("#FFFFBB33"));
                    foto.setWidth(180);
                    foto.setHeight(180);
                    GridLayout.LayoutParams margins = new GridLayout.LayoutParams();
                    margins.setMargins(10, 10, 10, 10);
                    foto.setLayoutParams(margins);
                }
            }
        }
    }
