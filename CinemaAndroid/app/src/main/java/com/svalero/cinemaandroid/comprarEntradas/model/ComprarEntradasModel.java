package com.svalero.cinemaandroid.comprarEntradas.model;

import com.svalero.cinemaandroid.comprarEntradas.ComprarEntradasContract;
import com.svalero.cinemaandroid.entities.Entrada;
import com.svalero.cinemaandroid.utils.ApiClient;
import com.svalero.cinemaandroid.utils.ApiInterface;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ComprarEntradasModel implements ComprarEntradasContract.Model {
    @Override
    public void ComprarEntradasWS(Entrada entrada, OnComprarEntradasListener onComprarEntradasListener) {
        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);

        Call<ArrayList<Entrada>> call = apiService.comprarEntradas();
        call.enqueue(new Callback<ArrayList<Entrada>>() {
            @Override
            public void onResponse(Call<ArrayList<Entrada>> call, Response<ArrayList<Entrada>> response) {
                ArrayList<Entrada> ComprarEntradasRespuesta = response.body();
                onComprarEntradasListener.onSuccess(ComprarEntradasRespuesta);
            }

            @Override
            public void onFailure(Call<ArrayList<Entrada>> call, Throwable t) {
                onComprarEntradasListener.onFailure(t.getMessage());
            }
        });
    }
}
