package com.svalero.cinemaandroid.lstTopPeliculas.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.widget.Toast;

import com.svalero.cinemaandroid.R;
import com.svalero.cinemaandroid.entities.Pelicula;
import com.svalero.cinemaandroid.lstTopPeliculas.LstTopPeliculasContract;
import com.svalero.cinemaandroid.lstTopPeliculas.presenter.LstTopPeliculasPresenter;

import java.util.ArrayList;

public class LstTopPeliculasActivity extends AppCompatActivity implements LstTopPeliculasContract.View {
    private LstTopPeliculasPresenter lstTopPeliculasPresenter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lsttoppeliculas);
        initComponents();
        initPresenter();
        initData();

    }
    public void initComponents(){
        recyclerView = (RecyclerView) findViewById(R.id.recycler1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
    };
    public void initPresenter(){ lstTopPeliculasPresenter = new LstTopPeliculasPresenter(this) ; }
    public void initData(){lstTopPeliculasPresenter.lstTopPeliculas(null); }

    @Override
    public void successLstTopPeliculas(ArrayList<Pelicula> lsttoppelicula) {
        LstTopPeliculasAdapter adapter = new LstTopPeliculasAdapter(lsttoppelicula,getBaseContext());
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void failureLstTopPeliculas(String err) {
        Toast.makeText(this, err, Toast.LENGTH_LONG).show();
    }
}
