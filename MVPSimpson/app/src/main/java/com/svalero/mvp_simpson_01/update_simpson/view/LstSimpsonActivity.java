package com.svalero.mvp_simpson_01.update_simpson.view;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.svalero.mvp_simpson_01.R;
import com.svalero.mvp_simpson_01.entities.Simpson;
import com.svalero.mvp_simpson_01.update_simpson.UpdateSimpsonContract;

import com.svalero.mvp_simpson_01.update_simpson.presenter.UpdateSimpsonPresenter;

import java.util.ArrayList;

public class LstSimpsonActivity extends AppCompatActivity implements UpdateSimpsonContract.View{

    private UpdateSimpsonPresenter updateSimpsonPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lst_simpson);

        initComponents();
        initPresenter();
        initData();
    }

    public void initComponents(){

    }

    public void initPresenter(){
        updateSimpsonPresenter = new UpdateSimpsonPresenter(this);
    }

    public void initData(){
        updateSimpsonPresenter.UpdateSimpson(null); //SELECT * FROM SIMPSON
    }

    @Override
    public void successUpdateSimpson(Simpson simpson) {

    }

    @Override
    public void failureUpdateSimpson(String error) {
        Toast.makeText(this, "Los datos no han podido ser cargados", Toast.LENGTH_SHORT).show();
    }
}