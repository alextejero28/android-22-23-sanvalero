package com.svalero.cinemaandroid.comprarEntradas;

import com.svalero.cinemaandroid.entities.Entrada;
import com.svalero.cinemaandroid.entities.Pelicula;

import java.util.ArrayList;

public interface ComprarEntradasContract {
    public  interface  View{
        void successComprarEntradas(ArrayList<Pelicula> lstentradas);
        void failureComprarEntradas(String err);
    }
    public interface  Presenter{
        void comprarEntradas(String cine);
    }
    public interface  Model{
        interface  OnComprarEntradasListener{
            void  onSuccess(ArrayList<Pelicula> lstentradas);
            void  onFailure(String error);
        }
        void ComprarEntradasWS(String cine, ComprarEntradasContract.Model.OnComprarEntradasListener onComprarEntradasListener);

    }
}
