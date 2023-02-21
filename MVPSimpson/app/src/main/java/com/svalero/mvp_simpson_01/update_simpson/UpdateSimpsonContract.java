package com.svalero.mvp_simpson_01.update_simpson;

import com.svalero.mvp_simpson_01.entities.Simpson;




public interface UpdateSimpsonContract {
    public interface View {
        void successUpdateSimpson(Simpson simpson);
        void failureUpdateSimpson(String error);

    }
    public interface Presenter{
        void UpdateSimpson(Simpson simpson);
    }
    public interface Model{
        interface OnUpdateSimpsonListener{
            void onSuccess(Simpson simpson);
            void onFailure(String error);
        }
        void UpdateSimpsonWS(Simpson simpson,
                          OnUpdateSimpsonListener onUpdateSimpsonListener);
    }
}
