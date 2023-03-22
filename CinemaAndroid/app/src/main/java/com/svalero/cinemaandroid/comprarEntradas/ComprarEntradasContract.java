package com.svalero.cinemaandroid.comprarEntradas;

import com.svalero.cinemaandroid.entities.Entrada;

public interface ComprarEntradasContract {
    public interface View{
        void onSuccessComprarEntradas(Entrada entrada);
        void onFailureComprarEntradas(String err);
    }
    public interface Presenter{

        void entrada(Entrada entrada);
    }
    public interface Model{
        interface onComprarEntradasListener{
            void onSuccess(Entrada entrada);
            void onFailure(String err);
        }
        void ComprarEntradasWS(Entrada entrada, onComprarEntradasListener onComprarEntradasListener);
    }
}
