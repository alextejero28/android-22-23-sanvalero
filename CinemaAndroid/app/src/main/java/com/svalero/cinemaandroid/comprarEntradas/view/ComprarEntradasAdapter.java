package com.svalero.cinemaandroid.comprarEntradas.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.svalero.cinemaandroid.R;
import com.svalero.cinemaandroid.entities.Entrada;
import com.svalero.cinemaandroid.entities.Pelicula;
import com.svalero.cinemaandroid.filtrosPeliculas.view.FiltrosPeliculasAdapter;


import java.util.ArrayList;
import java.util.Random;

public class ComprarEntradasAdapter extends RecyclerView.Adapter<ComprarEntradasAdapter.ViewHolder>{

    private ArrayList<Pelicula> lstentradas;
    private Context mContext;

    public ComprarEntradasAdapter(ArrayList<Pelicula> lstentradas, Context mContext) {
        this.lstentradas = lstentradas;
        this.mContext = mContext;
    }

    @Override
    public ComprarEntradasAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_entrada, parent, false);
        return new ComprarEntradasAdapter.ViewHolder(view);
    }

    //TAKE DATA
    @Override
    public void onBindViewHolder(ComprarEntradasAdapter.ViewHolder holder, int position) {
        Pelicula peli = lstentradas.get(position);
        //holder.Id_Pelicula.setText(String.valueOf(peli.getIdPelicula()));
        holder.titulo.setText(String.valueOf(peli.getTitulo()));
        //holder.sinopsis.setText(String.valueOf(peli.getSinopsis()));
        //holder.categoria.setText(String.valueOf(peli.getCategoria()));
        //holder.caracteristicas.setText(String.valueOf(peli.getCaracteristicas()));
        //holder.trailer.setText(String.valueOf(peli.getTrailer()));
        //holder.edadRecomendada.setText(String.valueOf("+ " + peli.getEdadRecomendada()));
        //holder.historicoEntradas.setText(String.valueOf(peli.getHistoricoEntradas()));
        holder.butacasLibre.setText(String.valueOf(peli.getButacasLibre()) + " butacas libres");
        //holder.butacasOcupadas.setText(String.valueOf(peli.getButacasOcupadas()));
        //holder.duracion.setText(String.valueOf(peli.getDuracion() + " min"));
        //holder.rating.setText(String.valueOf(peli.getRating()));


        Random rd = new Random();
        int n = rd.nextInt(4);

        switch(n){
            case 1:
                holder.horario.setText("18:00 PM");
                holder.precio.setText("9.00€");
                break;
            case 2:
                holder.horario.setText("16:00 PM");
                holder.precio.setText("5.00€");
                break;
            case 3:
                holder.horario.setText("22:00 PM");
                holder.precio.setText("12.00€");
                break;
            default:
                holder.horario.setText("10:00 AM");
                holder.precio.setText("4.00€");
                break;

        }
    }

    @Override
    public int getItemCount() {
        return lstentradas.size();
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
        private TextView rating;
        private TextView horario;
        private TextView precio;


        public ViewHolder(View itemView) {
            super(itemView);

            //Id_Pelicula = itemView.findViewById(R.id.Id_Pelicula);
            titulo = itemView.findViewById(R.id.titulo);
            //sinopsis = itemView.findViewById(R.id.sinopsis);
            //categoria = itemView.findViewById(R.id.categoria);
            //caracteristicas = itemView.findViewById(R.id.caracteristicas);
            //trailer = itemView.findViewById(R.id.trailer);
            //edadRecomendada = itemView.findViewById(R.id.edadRecomendada);
            //historicoEntradas = itemView.findViewById(R.id.historicoEntradas);
            butacasLibre = itemView.findViewById(R.id.butacasLibre);
            //butacasOcupadas = itemView.findViewById(R.id.butacasOcupadas);
            //duracion = itemView.findViewById(R.id.duracion);
            //rating = itemView.findViewById(R.id.rating);
            //star = (ImageView) itemView.findViewById(R.id.star);
            horario = itemView.findViewById(R.id.horario);
            precio = itemView.findViewById(R.id.precio);
        }
    }

}


