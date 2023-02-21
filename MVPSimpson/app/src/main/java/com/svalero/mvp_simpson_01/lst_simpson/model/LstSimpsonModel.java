package com.svalero.mvp_simpson_01.lst_simpson.model;

import com.svalero.mvp_simpson_01.entities.Simpson;
import com.svalero.mvp_simpson_01.lst_simpson.LstSimpsonContract;
import com.svalero.mvp_simpson_01.utils.ApiClient;
import com.svalero.mvp_simpson_01.utils.ApiInterface;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class LstSimpsonModel implements LstSimpsonContract.Model {

    @Override
    public void lstSimpsonWS(Simpson simpson,
                             OnLstSimpsonListener onLstSimpsonListener) {
        //Si ha ido bien !!!!!!!!!!!
        //.onSuccess(null);
        //Si ha ido mal !!!!!!!!!!!
        //onLstSimpsonListener.onFailure("ERRRRRORRRRRR!!!!!!!!!!!!");
        getSimpsonService(onLstSimpsonListener);
    }

    public void getSimpsonService(final OnLstSimpsonListener onLstSimpsonListener) {
        /*Ejecuto Webservice con retrofit*/
        ApiInterface apiService = ApiClient.getClient()
                .create(ApiInterface.class);
        Call<ArrayList<Simpson>> call = apiService.getPopularSimpson(5);
        call.enqueue(new Callback<ArrayList<Simpson>>() {
            @Override
            public void onResponse(Call<ArrayList<Simpson>> call, Response<ArrayList<Simpson>> response) {
                ArrayList<Simpson> lstSimpson = response.body();
                if (lstSimpson!=null){
                    onLstSimpsonListener.onSuccess(lstSimpson);
                }
            }

            @Override
            public void onFailure(Call<ArrayList<Simpson>> call, Throwable t) {
                onLstSimpsonListener.onFailure(t.getMessage());
            }
        });
    }
}
