package com.svalero.cinemaandroid.filtrosPeliculas.model;

import com.svalero.cinemaandroid.entities.Pelicula;
import com.svalero.cinemaandroid.filtrosPeliculas.FiltrosPeliculasContract;

import com.svalero.cinemaandroid.utils.ApiClient;
import com.svalero.cinemaandroid.utils.ApiInterface;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FiltrosPeliculasModel implements FiltrosPeliculasContract.Model {
    @Override
    public void FiltrosPeliculasWS(Pelicula pelicula, OnFiltrosPeliculasListener onFiltrosPeliculasListener) {
        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);

        Call<ArrayList<Pelicula>> call = apiService.getFiltrosPeliculas();
        call.enqueue(new Callback<ArrayList<Pelicula>>() {
            @Override
            public void onResponse(Call<ArrayList<Pelicula>> call, Response<ArrayList<Pelicula>> response) {
                ArrayList<Pelicula> lstFiltrosPeliculasRespuesta = response.body();

                onFiltrosPeliculasListener.onSuccess(lstFiltrosPeliculasRespuesta);
            }

            @Override
            public void onFailure(Call<ArrayList<Pelicula>> call, Throwable t) {
                onFiltrosPeliculasListener.onFailure(t.getMessage());
            }
        });
    }
}
