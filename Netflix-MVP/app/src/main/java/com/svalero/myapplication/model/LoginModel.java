package com.svalero.myapplication.model;

import com.svalero.myapplication.contract.LoginContract;
import com.svalero.myapplication.model.pojo.User;

public class LoginModel implements LoginContract.Model {
    @Override
    public void findUserWS(User user,
                           OnLoginUserListener onLoginUserListener) {

    }
}
