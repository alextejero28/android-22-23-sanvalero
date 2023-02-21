package com.svalero.mvp_simpson_01.update_simpson.model;

import com.svalero.mvp_simpson_01.entities.Simpson;
import com.svalero.mvp_simpson_01.update_simpson.UpdateSimpsonContract;


public class UpdateSimpsonModel implements UpdateSimpsonContract.Model {

    @Override
    public void UpdateSimpsonWS(Simpson simpson,
                                OnUpdateSimpsonListener onUpdateSimpsonListener) {
        //Si ha ido bien !!!!!!!!!!!
        onUpdateSimpsonListener.onSuccess(null);
        //Si ha ido mal !!!!!!!!!!!
        onUpdateSimpsonListener.onFailure("ERRRRRORRRRRR!!!!!!!!!!!!");
    }
}
