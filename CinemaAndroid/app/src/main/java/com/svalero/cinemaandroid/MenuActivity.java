package com.svalero.cinemaandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.svalero.cinemaandroid.comprarEntradas.view.ComprarEntradasActivity;
import com.svalero.cinemaandroid.filtrosPeliculas.view.FiltrosPeliculasActivity;
import com.svalero.cinemaandroid.lstTopPeliculas.view.LstTopPeliculasActivity;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

    }
    public void event(View view){
        Class crearIntent = null;
        switch (view.getId()){

            case R.id.vistaLstTopPeliculas:
                crearIntent = LstTopPeliculasActivity.class;
                break;

            case R.id.filtros:
                crearIntent = FiltrosPeliculasActivity.class;
                break;

            case R.id.comprarEntradas:
                crearIntent = ComprarEntradasActivity.class;
                break;

            case R.id.historicoPeliculas:
                //crearIntent = LstTopPeliculasActivity.class;
                break;




        }
        Intent intent = new Intent(getBaseContext(), crearIntent);
        startActivity(intent);
    }
}