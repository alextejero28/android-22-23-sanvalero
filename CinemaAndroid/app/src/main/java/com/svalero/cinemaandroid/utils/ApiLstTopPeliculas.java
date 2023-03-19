package com.svalero.cinemaandroid.utils;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiLstTopPeliculas {
    public  static  final  String BASE_URL =
            "http://192.168.56.1:8080/CinemaNetbeans/webresources/";

    private  static Retrofit retrofit = null;

    public static Retrofit getPeliculas() {
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
