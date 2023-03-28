package com.svalero.cinemaandroid.utils;

import com.svalero.cinemaandroid.entities.Cine;
import com.svalero.cinemaandroid.entities.Entrada;
import com.svalero.cinemaandroid.entities.Pelicula;
import com.svalero.cinemaandroid.entities.Usuario;

import java.util.ArrayList;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ApiInterface {

    @GET("cine")
    Call<ArrayList<Cine>> getCines();

    @GET("lstTopPeliculas")
    Call<ArrayList<Pelicula>> getPeliculas();

    @GET("login/{correo}/{contrasena}")
    Call<ArrayList<Usuario>> login(
            @Path("correo") String correo,
            @Path("contrasena") String contrasena
    );

    @GET("filtrosPeliculas/{categoria}/{cine}/{edad}/{palabra}")
    Call<ArrayList<Pelicula>> getFiltrosPeliculas(
            @Path("categoria") String categoria,
            @Path("cine") String cine,
            @Path("edad") String edad,
            @Path("palabra") String palabra
    );

    @PUT("comprarEntradas")
    Call<ArrayList<Entrada>> comprarEntradas();

    @GET("historicoPeliculas")
    Call<ArrayList<Pelicula>> getHistoricoPeliculas();
}
