package com.svalero.cinemaandroid.filtrosPeliculas;

import com.svalero.cinemaandroid.entities.Pelicula;


import java.util.ArrayList;

public interface FiltrosPeliculasContract {
    public  interface  View{
        void successFiltrosPeliculas(ArrayList<Pelicula> lstfiltrospeliculas);
        void failureFiltrosPeliculas(String err);
    }
    public interface  Presenter{
        void FiltrosPeliculas(String categoria, String cine, String edad, String palabra);
    }
    public interface  Model{
        interface  OnFiltrosPeliculasListener{
            void  onSuccess(ArrayList<Pelicula> lstfiltrospeliculas);
            void  onFailure(String error);
        }
        void FiltrosPeliculasWS(String categoria, String cine, String edad, String palabra, FiltrosPeliculasContract.Model.OnFiltrosPeliculasListener onFiltrosPeliculasListener);

    }
}
