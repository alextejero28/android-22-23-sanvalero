package com.svalero.cinemaandroid.filtrosPeliculas.view;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.svalero.cinemaandroid.R;
import com.svalero.cinemaandroid.entities.Pelicula;
import com.svalero.cinemaandroid.filtrosPeliculas.FiltrosPeliculasContract;
import com.svalero.cinemaandroid.filtrosPeliculas.presenter.FiltrosPeliculasPresenter;
import com.svalero.cinemaandroid.lstTopPeliculas.view.LstTopPeliculasAdapter;

import java.util.ArrayList;

public class FiltrosPeliculasActivity extends AppCompatActivity implements FiltrosPeliculasContract.View {
    private FiltrosPeliculasPresenter FiltrosPeliculasPresenter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filtrospeliculas);
        initComponents();
        initPresenter();
        initData();

    }
    public void initComponents(){
        recyclerView = (RecyclerView) findViewById(R.id.recycler1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
    };
    public void initPresenter(){ FiltrosPeliculasPresenter = new FiltrosPeliculasPresenter(this) ; }
    public void initData(){FiltrosPeliculasPresenter.FiltrosPeliculas(null); }

    @Override
    public void successFiltrosPeliculas(ArrayList<Pelicula> lstfiltrospeliculas) {
        FiltrosPeliculasAdapter adapter = new FiltrosPeliculasAdapter(lstfiltrospeliculas,getBaseContext());
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void failureFiltrosPeliculas(String err) {
        Toast.makeText(this, err, Toast.LENGTH_LONG).show();
    }
}
