package com.svalero.cinemaandroid.filtrosPeliculas.presenter;

import com.svalero.cinemaandroid.entities.Pelicula;
import com.svalero.cinemaandroid.filtrosPeliculas.FiltrosPeliculasContract;
import com.svalero.cinemaandroid.filtrosPeliculas.model.FiltrosPeliculasModel;

import java.util.ArrayList;


public class FiltrosPeliculasPresenter implements FiltrosPeliculasContract.Presenter{

    private FiltrosPeliculasContract.View view;
    private FiltrosPeliculasModel filtrosPeliculasModel;

    public FiltrosPeliculasPresenter(FiltrosPeliculasContract.View view){
        this.view = view;
        this.filtrosPeliculasModel = new FiltrosPeliculasModel();
    }

    @Override
    public void FiltrosPeliculas(Pelicula pelicula) {
        filtrosPeliculasModel.FiltrosPeliculasWS(null, new FiltrosPeliculasContract.Model.OnFiltrosPeliculasListener() {
            @Override
            public void onSuccess(ArrayList<Pelicula> lstfiltrospeliculas) {
                if (lstfiltrospeliculas != null && lstfiltrospeliculas.size() > 0){
                    view.successFiltrosPeliculas(lstfiltrospeliculas);
                }else{
                    view.failureFiltrosPeliculas("Error en la lista de peliculas en base a los filtros introducidos");
                }
            }

            @Override
            public void onFailure(String error) {
                view.failureFiltrosPeliculas(error);
            }
        });
    }
}
