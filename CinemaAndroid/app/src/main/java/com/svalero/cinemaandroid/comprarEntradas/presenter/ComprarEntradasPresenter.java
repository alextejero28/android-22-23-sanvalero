package com.svalero.cinemaandroid.comprarEntradas.presenter;

import com.svalero.cinemaandroid.comprarEntradas.ComprarEntradasContract;
import com.svalero.cinemaandroid.comprarEntradas.model.ComprarEntradasModel;
import com.svalero.cinemaandroid.entities.Entrada;



import java.util.ArrayList;

public class ComprarEntradasPresenter implements ComprarEntradasContract.Presenter {

    private ComprarEntradasContract.View view;
    private ComprarEntradasModel comprarEntradasModel;

    public ComprarEntradasPresenter(ComprarEntradasContract.View view){
        this.view = view;
        this.comprarEntradasModel = new ComprarEntradasModel();
    }


    @Override
    public void comprarEntradas(Entrada entrada) {
        comprarEntradasModel.ComprarEntradasWS(null, new ComprarEntradasContract.Model.OnComprarEntradasListener() {
            @Override
            public void onSuccess(ArrayList<Entrada> lstentradas) {
                if (lstentradas != null && lstentradas.size() > 0){
                    view.successComprarEntradas(lstentradas);
                }else{
                    view.failureComprarEntradas("Error al comprar entrada");
                }
            }

            @Override
            public void onFailure(String error) {
                view.failureComprarEntradas(error);
            }
        });
    }
}
