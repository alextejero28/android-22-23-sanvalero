package com.svalero.cinemaandroid.historicoPeliculas.view;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.svalero.cinemaandroid.R;
import com.svalero.cinemaandroid.entities.Pelicula;
import com.svalero.cinemaandroid.historicoPeliculas.HistoricoPeliculasContract;
import com.svalero.cinemaandroid.historicoPeliculas.presenter.HistoricoPeliculasPresenter;
import com.svalero.cinemaandroid.lstTopPeliculas.presenter.LstTopPeliculasPresenter;
import com.svalero.cinemaandroid.lstTopPeliculas.view.LstTopPeliculasAdapter;

import java.util.ArrayList;

public class HistoricoPeliculasActivity extends AppCompatActivity implements HistoricoPeliculasContract.View {
    private HistoricoPeliculasPresenter historicoPeliculasPresenter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historicopeliculas);
        initComponents();
        initPresenter();
        initData();

    }
    public void initComponents(){
        recyclerView = (RecyclerView) findViewById(R.id.recycler1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
    };
    public void initPresenter(){ historicoPeliculasPresenter = new HistoricoPeliculasPresenter(this) ; }
    public void initData(){historicoPeliculasPresenter.historicoPeliculas(null); }

    @Override
    public void successHistoricoPeliculas(ArrayList<Pelicula> lstpeliculas) {
        HistoricoPeliculasAdapter adapter = new HistoricoPeliculasAdapter(lstpeliculas,getBaseContext());
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void failureHistoricoPeliculas(String err) {
        Toast.makeText(this, err, Toast.LENGTH_LONG).show();
    }
}
