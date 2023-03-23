package com.svalero.cinemaandroid;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.svalero.cinemaandroid.lstTopPeliculas.view.LstTopPeliculasActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);

        final Handler handler = new Handler();
        // SetTimeOut - setInterval
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent screenChanger = new Intent(getBaseContext(),
                        MainActivity2.class
                );
                startActivity(screenChanger);
            }
        }, 2000);
    }

    private void volver(){

    }

    private void login(){

    }

}