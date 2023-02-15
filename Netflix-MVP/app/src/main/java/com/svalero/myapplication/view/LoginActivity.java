package com.svalero.myapplication.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.svalero.myapplication.R;
import com.svalero.myapplication.contract.LoginContract;
import com.svalero.myapplication.model.pojo.User;
import com.svalero.myapplication.presenter.LoginPresenter;

public class LoginActivity extends AppCompatActivity implements LoginContract.View {
    private EditText edtUserLogin;
    private EditText edtPasswordLogin;
    private Button btnLogin;
    private LoginPresenter loginPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }

    private void initComponents(){
        edtUserLogin = findViewById(R.id.edtUserLogin);
        edtPasswordLogin = findViewById(R.id.edtPasswordLogin);
        btnLogin = findViewById(R.id.btnLogin);
    }

    private void initPresenter(){
        loginPresenter = new LoginPresenter();
        loginPresenter.lstFilms(null);
    }

    @Override
    public void successLogin(User user, String message) {

    }

    @Override
    public void failureLogin(String err) {

    }
}