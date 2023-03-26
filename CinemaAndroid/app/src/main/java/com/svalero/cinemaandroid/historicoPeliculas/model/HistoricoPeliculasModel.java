package com.svalero.cinemaandroid.historicoPeliculas.model;

import com.svalero.cinemaandroid.entities.Pelicula;
import com.svalero.cinemaandroid.historicoPeliculas.HistoricoPeliculasContract;
import com.svalero.cinemaandroid.utils.ApiClient;
import com.svalero.cinemaandroid.utils.ApiInterface;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HistoricoPeliculasModel implements HistoricoPeliculasContract.Model {
    @Override
    public void HistoricoPeliculasWS(Pelicula pelicula, OnHistoricoPeliculasListener onHistoricoPeliculasListener) {
        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<ArrayList<Pelicula>> call = apiService.getHistoricoPeliculas();
        call.enqueue(new Callback<ArrayList<Pelicula>>() {
            @Override
            public void onResponse(Call<ArrayList<Pelicula>> call, Response<ArrayList<Pelicula>> response) {
                ArrayList<Pelicula> historicoPeliculasRespuesta = response.body();

                onHistoricoPeliculasListener.onSuccess(historicoPeliculasRespuesta);
            }

            @Override
            public void onFailure(Call<ArrayList<Pelicula>> call, Throwable t) {
                onHistoricoPeliculasListener.onFailure(t.getMessage());
            }
        });
    }
}
