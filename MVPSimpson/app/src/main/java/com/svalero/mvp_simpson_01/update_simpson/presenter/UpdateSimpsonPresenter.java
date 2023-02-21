package com.svalero.mvp_simpson_01.update_simpson.presenter;

import com.svalero.mvp_simpson_01.entities.Simpson;
import com.svalero.mvp_simpson_01.update_simpson.UpdateSimpsonContract;
import com.svalero.mvp_simpson_01.update_simpson.model.UpdateSimpsonModel;




public class UpdateSimpsonPresenter implements UpdateSimpsonContract.Presenter {
    private UpdateSimpsonModel updateSimpsonModel;
    private UpdateSimpsonContract.View view;
    public UpdateSimpsonPresenter(UpdateSimpsonContract.View view){
        this.view = view;
        updateSimpsonModel = new UpdateSimpsonModel();

    }
    @Override
    public void UpdateSimpson(Simpson simpson) {
        updateSimpsonModel.UpdateSimpsonWS(null, new UpdateSimpsonContract.Model.OnUpdateSimpsonListener() {
            @Override
            public void onSuccess(Simpson simpson) {
                view.successUpdateSimpson(simpson);
            }

            @Override
            public void onFailure(String error) {
                view.failureUpdateSimpson(error);
            }
        });
    }


}
