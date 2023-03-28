package com.svalero.cinemaandroid.lstTopPeliculas.model;

import com.svalero.cinemaandroid.entities.Pelicula;
import com.svalero.cinemaandroid.lstTopPeliculas.LstTopPeliculasContract;
import com.svalero.cinemaandroid.utils.ApiClient;
import com.svalero.cinemaandroid.utils.ApiInterface;


import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LstTopPeliculasModel implements LstTopPeliculasContract.Model {


    @Override
    public void lstTopPeliculasWS(Pelicula pelicula, OnLstTopPeliculasListener onLstTopPeliculasListener) {
        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<ArrayList<Pelicula>> call = apiService.getPeliculas();
        call.enqueue(new Callback<ArrayList<Pelicula>>() {
            @Override
            public void onResponse(Call<ArrayList<Pelicula>> call, Response<ArrayList<Pelicula>> response) {
                ArrayList<Pelicula> lstTopPeliculasRespuesta = response.body();
                onLstTopPeliculasListener.onSuccess(lstTopPeliculasRespuesta);
            }

            @Override
            public void onFailure(Call<ArrayList<Pelicula>> call, Throwable t) {
                onLstTopPeliculasListener.onFailure(t.getMessage());
            }
        });
    }
}