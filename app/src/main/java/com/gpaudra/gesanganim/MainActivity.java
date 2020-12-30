package com.gpaudra.gesanganim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button Tombol1 = findViewById(R.id.tombol1);
        Tombol1.setOnClickListener(v->AnimFadeIn());

        Button Tombol2 = findViewById(R.id.tombol2);
        Tombol2.setOnClickListener(v->AnimFadeOut());

        Button Tombol3 = findViewById(R.id.tombol3);
        Tombol3.setOnClickListener(v->AnimZoomIn());

        Button Tombol4 = findViewById(R.id.tombol4);
        Tombol4.setOnClickListener(v->AnimZoonOut());


    }

    public void AnimFadeIn(){
        Intent AktivitasIn = new Intent(this, MasukDalam.class);
        startActivity(AktivitasIn);
    }
    public void AnimFadeOut(){
        Intent AktivitasOut = new Intent(this, MasukLuar.class);
        startActivity(AktivitasOut);
    }
    public void AnimZoomIn(){
        Intent AktivitasZoomIn = new Intent(this, PerbesarDalam.class);
        startActivity(AktivitasZoomIn);
    }
    public void AnimZoonOut(){
        Intent AktivitasZoomOut = new Intent(this, PerbesarLuar.class);
        startActivity(AktivitasZoomOut);
    }

}