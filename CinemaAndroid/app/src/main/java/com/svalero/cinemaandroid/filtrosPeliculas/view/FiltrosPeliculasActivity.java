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

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


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
        Spinner spinnerCategorias=findViewById(R.id.categoriaSpinner);

        ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(this, R.array.categorias, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);

        spinnerCategorias.setAdapter(adapter);

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
