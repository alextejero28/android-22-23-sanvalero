package com.svalero.cinemaandroid.historicoPeliculas;

import com.svalero.cinemaandroid.entities.Pelicula;


import java.util.ArrayList;

public interface HistoricoPeliculasContract {
    public  interface  View{
        void successHistoricoPeliculas(ArrayList<Pelicula> lstpeliculas);
        void failureHistoricoPeliculas(String err);
    }
    public interface  Presenter{
        void historicoPeliculas(Pelicula pelicula);
    }
    public interface  Model{
        interface  OnHistoricoPeliculasListener{
            void  onSuccess(ArrayList<Pelicula> lstpeliculas);
            void  onFailure(String error);
        }
        void HistoricoPeliculasWS(Pelicula pelicula,HistoricoPeliculasContract.Model.OnHistoricoPeliculasListener onHistoricoPeliculasListener);

    }
}
