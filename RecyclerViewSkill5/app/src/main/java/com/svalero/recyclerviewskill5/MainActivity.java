package com.svalero.recyclerviewskill5;

import androidx.appcompat.app.AppCompatActivity;
<<<<<<< HEAD

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

=======
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> listDatos;

    RecyclerView recycler;

>>>>>>> b2a90bdaf90d0b9af82884921f901339c08bfda4
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
<<<<<<< HEAD
=======

        recycler = (RecyclerView) findViewById(R.id.recyclerId);
        //recycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));
        recycler.setLayoutManager(new GridLayoutManager(this, 2));
        listDatos = new ArrayList<String>();

        for (int i = 0; i<50; i++){
            listDatos.add("Dato # "+i+" ");
        }

        AdapterDatos adapter = new AdapterDatos(listDatos);

        recycler.setAdapter(adapter);

>>>>>>> b2a90bdaf90d0b9af82884921f901339c08bfda4
    }
}