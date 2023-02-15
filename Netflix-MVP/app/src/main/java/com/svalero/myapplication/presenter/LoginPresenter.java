package com.svalero.myapplication.presenter;

import com.svalero.myapplication.contract.LoginContract;
import com.svalero.myapplication.model.pojo.Film;
import com.svalero.myapplication.model.pojo.User;

public class LoginPresenter implements LoginContract.Presenter,
                            LoginContract.Model.OnLoginUserListener{
    @Override
    public void login(User user) {

    }

    @Override
    public void lstFilms(Film film) {

    }
    //public void lstFilms(){}
}
