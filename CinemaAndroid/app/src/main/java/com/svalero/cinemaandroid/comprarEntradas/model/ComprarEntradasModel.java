package com.svalero.cinemaandroid.comprarEntradas.model;

import com.svalero.cinemaandroid.comprarEntradas.ComprarEntradasContract;
import com.svalero.cinemaandroid.entities.Entrada;
import com.svalero.cinemaandroid.entities.Pelicula;
import com.svalero.cinemaandroid.utils.ApiClient;
import com.svalero.cinemaandroid.utils.ApiInterface;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ComprarEntradasModel implements ComprarEntradasContract.Model {
    @Override
    public void ComprarEntradasWS(String cine, OnComprarEntradasListener onComprarEntradasListener) {
        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);

        Call<ArrayList<Pelicula>> call = apiService.comprarEntradas(cine);
        call.enqueue(new Callback<ArrayList<Pelicula>>() {
            @Override
            public void onResponse(Call<ArrayList<Pelicula>> call, Response<ArrayList<Pelicula>> response) {
                ArrayList<Pelicula> ComprarEntradasRespuesta = response.body();
                onComprarEntradasListener.onSuccess(ComprarEntradasRespuesta);
            }

            @Override
            public void onFailure(Call<ArrayList<Pelicula>> call, Throwable t) {
                onComprarEntradasListener.onFailure(t.getMessage());
            }
        });
    }
}
