package com.svalero.cinemaandroid.lstTopPeliculas;

import com.svalero.cinemaandroid.entities.Pelicula;

import java.util.ArrayList;

public interface LstTopPeliculasContract {

    public  interface  View{
        void successLstTopPeliculas(ArrayList<Pelicula> lsttoppelicula);
        void failureLstTopPeliculas(String err);
    }
    public interface  Presenter{
        void lstTopPeliculas(Pelicula pelicula);
    }
    public interface  Model{
        interface  OnLstTopPeliculasListener{
            void  onSuccess(ArrayList<Pelicula> lsttoppelicula);
            void  onFailure(String error);
        }
        void lstTopPeliculasWS(Pelicula pelicula, OnLstTopPeliculasListener onLstTopPeliculasListener);

    }
}
