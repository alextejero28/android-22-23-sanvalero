package com.svalero.cinemaandroid.comprarEntradas;

import com.svalero.cinemaandroid.entities.Entrada;

import java.util.ArrayList;

public interface ComprarEntradasContract {
    public  interface  View{
        void successComprarEntradas(ArrayList<Entrada> lstentradas);
        void failureComprarEntradas(String err);
    }
    public interface  Presenter{
        void comprarEntradas(Entrada entrada);
    }
    public interface  Model{
        interface  OnComprarEntradasListener{
            void  onSuccess(ArrayList<Entrada> lstentradas);
            void  onFailure(String error);
        }
        void ComprarEntradasWS(Entrada entrada, ComprarEntradasContract.Model.OnComprarEntradasListener onComprarEntradasListener);

    }
}
