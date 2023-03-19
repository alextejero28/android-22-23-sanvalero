package com.svalero.cinemaandroid.utils;

import com.svalero.cinemaandroid.entities.Cine;
import com.svalero.cinemaandroid.entities.Pelicula;

import java.util.ArrayList;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("cine")
    Call<ArrayList<Cine>> getCines();

    @GET("lstTopPeliculas")
    Call<ArrayList<Pelicula>> getPeliculas();


}
