package com.svalero.cinemaandroid.utils;

import com.svalero.cinemaandroid.entities.Cine;
import com.svalero.cinemaandroid.entities.Entrada;
import com.svalero.cinemaandroid.entities.Pelicula;
import com.svalero.cinemaandroid.entities.Usuario;

import java.util.ArrayList;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.PUT;

public interface ApiInterface {

    @GET("cine")
    Call<ArrayList<Cine>> getCines();

    @GET("lstTopPeliculas")
    Call<ArrayList<Pelicula>> getPeliculas();

    @GET("lstUsuarios")
    Call<ArrayList<Usuario>> getUsuarios();

    @GET("filtrosPeliculas")
    Call<ArrayList<Pelicula>> getFiltrosPeliculas();

    @PUT("comprarEntradas")
    Call<ArrayList<Entrada>> comprarEntradas();

    @GET("historicoPeliculas")
    Call<ArrayList<Pelicula>> getHistoricoPeliculas();
}
