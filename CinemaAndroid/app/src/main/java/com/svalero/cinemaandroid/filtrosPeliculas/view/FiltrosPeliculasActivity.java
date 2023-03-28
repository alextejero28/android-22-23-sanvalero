package com.svalero.cinemaandroid.filtrosPeliculas.view;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
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
    private FiltrosPeliculasPresenter filtrosPeliculasPresenter;
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filtrospeliculas);

        Spinner spinnerCategorias=findViewById(R.id.categoriaSpinner);

        ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(this, R.array.categorias, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);

        spinnerCategorias.setAdapter(adapter);

        Spinner spinnerCines=findViewById(R.id.cineSpinner);
        ArrayAdapter<CharSequence>adapter2=ArrayAdapter.createFromResource(this, R.array.cines, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_item);

        spinnerCines.setAdapter(adapter2);




    }

    public void buscar(View view){
        Spinner spinnerCategorias=findViewById(R.id.categoriaSpinner);
        String categoriaSeleccionada = spinnerCategorias.getSelectedItem().toString();
        Spinner spinnerCines=findViewById(R.id.cineSpinner);
        String cineSeleccionado = spinnerCines.getSelectedItem().toString();
        EditText edadEditText = findViewById(R.id.edad);
        String edad = edadEditText.getText().toString();
        EditText palabraEditText = findViewById(R.id.palabra);
        String palabra = palabraEditText.getText().toString();

        initComponents();
        initPresenter();
        initData(categoriaSeleccionada, cineSeleccionado, edad, palabra);
    }


    public void initComponents(){
        recyclerView = (RecyclerView) findViewById(R.id.recycler1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
    };
    public void initPresenter(){ filtrosPeliculasPresenter = new FiltrosPeliculasPresenter(this) ; }
    public void initData(String categoria, String cine, String edad, String palabra){
        filtrosPeliculasPresenter.FiltrosPeliculas(categoria, cine, edad, palabra);
    }

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
