package com.svalero.myapplication.contract;

import com.svalero.myapplication.model.pojo.Film;
import com.svalero.myapplication.model.pojo.User;

public interface LoginContract {
    public interface View{
        void successLogin(User user, String message);
        void failureLogin(String err);
    }
    public interface Presenter{
        void login(User user);
        void lstFilms(Film film);
    }
    public interface Model{
        interface OnLoginUserListener{
            void onSuccess(User user);
            void onFailure(String error);
        }
        void findUserWS(User user, OnLoginUserListener onLoginUserListener);
    }
}
