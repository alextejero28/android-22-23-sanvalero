package com.svalero.cinemaandroid.comprarEntradas.view;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.svalero.cinemaandroid.R;
import com.svalero.cinemaandroid.comprarEntradas.ComprarEntradasContract;
import com.svalero.cinemaandroid.comprarEntradas.presenter.ComprarEntradasPresenter;
import com.svalero.cinemaandroid.entities.Entrada;


import java.util.ArrayList;

public class ComprarEntradasActivity extends AppCompatActivity implements ComprarEntradasContract.View {
    private com.svalero.cinemaandroid.comprarEntradas.presenter.ComprarEntradasPresenter comprarEntradasPresenter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comprarentradas);
        initComponents();
        initPresenter();
        initData();

    }
    public void initComponents(){
        recyclerView = (RecyclerView) findViewById(R.id.recycler1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
    };
    public void initPresenter(){ comprarEntradasPresenter = new ComprarEntradasPresenter(this) ; }
    public void initData(){comprarEntradasPresenter.comprarEntradas(null); }
    @Override
    public void successComprarEntradas(ArrayList<Entrada> lstentradas) {
        ComprarEntradasAdapter adapter = new ComprarEntradasAdapter(lstentradas,getBaseContext());
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void failureComprarEntradas(String err) {
        Toast.makeText(this, err, Toast.LENGTH_LONG).show();
    }
}
