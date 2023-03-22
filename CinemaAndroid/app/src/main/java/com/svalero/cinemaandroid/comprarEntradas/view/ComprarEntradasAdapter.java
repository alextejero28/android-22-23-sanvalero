package com.svalero.cinemaandroid.comprarEntradas.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.svalero.cinemaandroid.R;
import com.svalero.cinemaandroid.entities.Pelicula;
import com.svalero.cinemaandroid.lstTopPeliculas.view.LstTopPeliculasAdapter;

import java.util.ArrayList;

public class ComprarEntradasAdapter extends RecyclerView.Adapter<LstTopPeliculasAdapter.ViewHolder> {
    private ArrayList<Pelicula> lstTopPeliculas;
    private Context mContext;

    public LstTopPeliculasAdapter(ArrayList<Pelicula> lstTopPeliculas, Context mContext) {
        this.lstTopPeliculas = lstTopPeliculas;
        this.mContext = mContext;
    }

    @Override
    public LstTopPeliculasAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_pelicula, parent, false);
        return new LstTopPeliculasAdapter.ViewHolder(view);
    }

    //TAKE DATA
    @Override
    public void onBindViewHolder(LstTopPeliculasAdapter.ViewHolder holder, int position) {
        Entrada entrada = lstTopPeliculas.get(position);

    }

    @Override
    public int getItemCount() {
        return lstTopPeliculas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {



        public ViewHolder(View itemView) {
            super(itemView);



        }
}
