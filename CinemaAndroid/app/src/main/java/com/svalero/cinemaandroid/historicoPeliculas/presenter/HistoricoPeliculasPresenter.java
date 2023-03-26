package com.svalero.cinemaandroid.historicoPeliculas.presenter;

import com.svalero.cinemaandroid.entities.Pelicula;
import com.svalero.cinemaandroid.historicoPeliculas.HistoricoPeliculasContract;
import com.svalero.cinemaandroid.historicoPeliculas.model.HistoricoPeliculasModel;


import java.util.ArrayList;

public class HistoricoPeliculasPresenter implements HistoricoPeliculasContract.Presenter {

    private HistoricoPeliculasContract.View view;
    private HistoricoPeliculasModel historicoPeliculasModel;

    public HistoricoPeliculasPresenter(HistoricoPeliculasContract.View view){
        this.view = view;
        this.historicoPeliculasModel = new HistoricoPeliculasModel();
    }

    @Override
    public void historicoPeliculas(Pelicula pelicula) {
        historicoPeliculasModel.HistoricoPeliculasWS(null,
                new HistoricoPeliculasContract.Model.OnHistoricoPeliculasListener() {
                    @Override
                    public void onSuccess(ArrayList<Pelicula> lstpeliculas) {
                        if (lstpeliculas != null && lstpeliculas.size() > 0){
                            view.successHistoricoPeliculas(lstpeliculas);
                        }else{
                            view.failureHistoricoPeliculas("Error en el histórico de películas");
                        }
                    }

                    @Override
                    public void onFailure(String error) {
                        view.failureHistoricoPeliculas(error);
                    }
                });
    }
}
