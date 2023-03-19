package com.svalero.cinemaandroid.lstTopPeliculas.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.svalero.cinemaandroid.R;
import com.svalero.cinemaandroid.entities.Pelicula;

import java.util.ArrayList;

public class LstTopPeliculasAdapter extends RecyclerView.Adapter<LstTopPeliculasAdapter.ViewHolder> {

    private ArrayList<Pelicula> lstTopPeliculas;
    private Context mContext;

    public LstTopPeliculasAdapter(ArrayList<Pelicula> lstTopPeliculas, Context mContext) {
        this.lstTopPeliculas = lstTopPeliculas;
        this.mContext = mContext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_pelicula, parent, false);
        return new ViewHolder(view);
    }

    //TAKE DATA
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Pelicula peli = lstTopPeliculas.get(position);
        holder.Id_Pelicula.setText(String.valueOf(peli.getIdPelicula()));
        holder.titulo.setText(String.valueOf(peli.getTitulo()));
        holder.sinopsis.setText(String.valueOf(peli.getSinopsis()));
        holder.categoria.setText(String.valueOf(peli.getCategoria()));
        holder.caracteristicas.setText(String.valueOf(peli.getCaracteristicas()));
        holder.trailer.setText(String.valueOf(peli.getTrailer()));
        holder.edadRecomendada.setText(String.valueOf(peli.getEdadRecomendada()));
        holder.historicoEntradas.setText(String.valueOf(peli.getHistoricoEntradas()));
        holder.butacasLibre.setText(String.valueOf(peli.getButacasLibre()));
        holder.butacasOcupadas.setText(String.valueOf(peli.getButacasOcupadas()));
        holder.duracion.setText(String.valueOf(peli.getDuracion()));
    }

    @Override
    public int getItemCount() {
        return lstTopPeliculas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView Id_Pelicula;
        private TextView titulo;
        private TextView sinopsis;
        private TextView categoria;
        private TextView caracteristicas;
        private TextView trailer;
        private TextView edadRecomendada;
        private TextView historicoEntradas;
        private TextView butacasLibre;
        private TextView butacasOcupadas;
        private TextView duracion;

        public ViewHolder(View itemView) {
            super(itemView);

            //Id_Pelicula = itemView.findViewById(R.id.Id_Pelicula);
            titulo = itemView.findViewById(R.id.titulo);
            sinopsis = itemView.findViewById(R.id.sinopsis);
            categoria = itemView.findViewById(R.id.categoria);
            //caracteristicas = itemView.findViewById(R.id.caracteristicas);
            //trailer = itemView.findViewById(R.id.trailer);
            edadRecomendada = itemView.findViewById(R.id.edadRecomendada);
            //historicoEntradas = itemView.findViewById(R.id.historicoEntradas);
            //butacasLibre = itemView.findViewById(R.id.butacasLibre);
            //butacasOcupadas = itemView.findViewById(R.id.butacasOcupadas);
            duracion = itemView.findViewById(R.id.duracion);

        }
    }
}
