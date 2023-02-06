package com.svalero.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import com.svalero.myapplication.contract.LoginContract;
import com.svalero.myapplication.model.pojo.User;
import com.svalero.myapplication.presenter.LoginPresenter;
import com.svalero.myapplication.view.LoginActivity;

public class MainActivity extends AppCompatActivity implements LoginContract.View {
    private static final int SCREEN = 1;
    private LoginPresenter loginPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginPresenter = new LoginPresenter();
        loginPresenter.lstFilms(null);

        final Handler handler = new Handler();
        // setTimeOut - setInterval
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent screenChanger = new Intent(
                     getBaseContext(),
                     LoginActivity.class
                );
                startActivity(screenChanger);
            }
        }, 4000);


    }

    @Override
    public void successLogin(User user, String message) {
        Toast.makeText(this, message,
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public void failureLogin(String err) {
        Toast.makeText(this, err,
                Toast.LENGTH_SHORT).show();
    }
}