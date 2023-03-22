package com.svalero.cinemaandroid.comprarEntradas.view;

import androidx.appcompat.app.AppCompatActivity;

import com.svalero.cinemaandroid.comprarEntradas.ComprarEntradasContract;
import com.svalero.cinemaandroid.entities.Entrada;

public class ComprarEntradasActivity extends AppCompatActivity implements ComprarEntradasContract.View {
    @Override
    public void onSuccessComprarEntradas(Entrada entrada) {

    }

    @Override
    public void onFailureComprarEntradas(String err) {

    }
}
