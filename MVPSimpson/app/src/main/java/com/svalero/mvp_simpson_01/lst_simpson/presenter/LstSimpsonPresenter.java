package com.svalero.mvp_simpson_01.lst_simpson.presenter;

import com.svalero.mvp_simpson_01.entities.Simpson;
import com.svalero.mvp_simpson_01.lst_simpson.LstSimpsonContract;
import com.svalero.mvp_simpson_01.lst_simpson.model.LstSimpsonModel;


import java.util.ArrayList;

public class LstSimpsonPresenter implements LstSimpsonContract.Presenter {
    private LstSimpsonModel lstSimpsonModel;
    private LstSimpsonContract.View view;

    public LstSimpsonPresenter(LstSimpsonContract.View view) {
        this.view = view;
        lstSimpsonModel = new LstSimpsonModel();

    }

    @Override
    public void lstSimpson(Simpson simpson) {
        lstSimpsonModel.lstSimpsonWS(null, new LstSimpsonContract.Model.OnLstSimpsonListener() {
            @Override
            public void onSuccess(ArrayList<Simpson> lstSimpson) {
                if (lstSimpson != null && lstSimpson.size() > 0) {
                    view.successLstSimpson(lstSimpson);
                } else {
                    view.failureLstSimpson("LOS DATOS NO HAN LLEGADO CORRECTAMENTE");
                }
            }

            @Override
            public void onFailure(String error) {
                view.failureLstSimpson(error);
            }

        });


    }
}
