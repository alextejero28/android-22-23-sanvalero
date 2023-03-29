package com.svalero.cinemaandroid.comprarEntradas.view;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.svalero.cinemaandroid.LoginActivity;
import com.svalero.cinemaandroid.MailActivity;
import com.svalero.cinemaandroid.MenuActivity;
import com.svalero.cinemaandroid.R;
import com.svalero.cinemaandroid.comprarEntradas.ComprarEntradasContract;
import com.svalero.cinemaandroid.comprarEntradas.presenter.ComprarEntradasPresenter;
import com.svalero.cinemaandroid.entities.Entrada;
import com.svalero.cinemaandroid.entities.Pelicula;


import java.util.ArrayList;

public class ComprarEntradasActivity extends AppCompatActivity implements ComprarEntradasContract.View {
    private com.svalero.cinemaandroid.comprarEntradas.presenter.ComprarEntradasPresenter comprarEntradasPresenter;
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comprarentradas);

        Spinner spinnerCines=findViewById(R.id.cineSpinner);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this, R.array.cines, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);

        spinnerCines.setAdapter(adapter);

    }

    public void buscarP(View view){
        Spinner spinnerCines=findViewById(R.id.cineSpinner);
        String cineSeleccionado = spinnerCines.getSelectedItem().toString();

        initComponents();
        initPresenter();
        initData(cineSeleccionado);
    }

    public void comprar(View view){
        Toast.makeText(this, "Compra realizada con éxito", Toast.LENGTH_LONG).show();

        //mail

        Intent intent = new Intent(getBaseContext(), MenuActivity.class);
        startActivity(intent);

    }

    public void initComponents(){
        recyclerView = (RecyclerView) findViewById(R.id.recycler1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
    };
    public void initPresenter(){ comprarEntradasPresenter = new ComprarEntradasPresenter(this) ; }
    public void initData(String cine){
        comprarEntradasPresenter.comprarEntradas(cine);
    }
    @Override
    public void successComprarEntradas(ArrayList<Pelicula> lstentradas) {
        ComprarEntradasAdapter adapter = new ComprarEntradasAdapter(lstentradas,getBaseContext());
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void failureComprarEntradas(String err) {
        Toast.makeText(this, err, Toast.LENGTH_LONG).show();
    }
}
