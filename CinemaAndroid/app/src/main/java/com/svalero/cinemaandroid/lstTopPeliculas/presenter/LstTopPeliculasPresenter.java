package com.svalero.cinemaandroid.lstTopPeliculas.presenter;

import com.svalero.cinemaandroid.entities.Pelicula;
import com.svalero.cinemaandroid.lstTopPeliculas.LstTopPeliculasContract;
import com.svalero.cinemaandroid.lstTopPeliculas.model.LstTopPeliculasModel;

import java.util.ArrayList;

public class LstTopPeliculasPresenter implements LstTopPeliculasContract.Presenter {

    private LstTopPeliculasContract.View view;
    private LstTopPeliculasModel lstTopPeliculasModel;

    public LstTopPeliculasPresenter(LstTopPeliculasContract.View view){
        this.view = view;
        this.lstTopPeliculasModel = new LstTopPeliculasModel();
    }

    @Override
    public void lstTopPeliculas(Pelicula pelicula) {
        lstTopPeliculasModel.lstTopPeliculasWS(null,
                new LstTopPeliculasContract.Model.OnLstTopPeliculasListener() {
                    @Override
                    public void onSuccess(ArrayList<Pelicula> lsttoppelicula) {
                        if (lsttoppelicula != null && lsttoppelicula.size() > 0){
                            view.successLstTopPeliculas(lsttoppelicula);
                        }else{
                            view.failureLstTopPeliculas("Error en la lista de peliculas mejor valoradas");
                        }
                    }

                    @Override
                    public void onFailure(String error) {
                        view.failureLstTopPeliculas(error);
                    }
                });
    }
}
