package com.svalero.cinemaandroid.comprarEntradas.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.svalero.cinemaandroid.R;
import com.svalero.cinemaandroid.entities.Entrada;


import java.util.ArrayList;

public class ComprarEntradasAdapter extends RecyclerView.Adapter<ComprarEntradasAdapter.ViewHolder>{

    private ArrayList<Entrada> lstentradas;
    private Context mContext;

    public ComprarEntradasAdapter(ArrayList<Entrada> lstentradas, Context mContext) {
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
        Entrada entrada = lstentradas.get(position);
        holder.idEntrada.setText(String.valueOf(entrada.getIdEntrada()));
        holder.descripcion.setText(String.valueOf(entrada.getDescripcion()));
        holder.horario.setText(String.valueOf(entrada.getHorario()));
        holder.precio.setText(String.valueOf(entrada.getPrecio()));
        holder.idUsuario.setText(String.valueOf(entrada.getIdUsuario()));
        holder.idPelicula.setText(String.valueOf(entrada.getIdPelicula()));

    }

    @Override
    public int getItemCount() {
        return lstentradas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView idEntrada;
        private TextView descripcion;
        private TextView horario;
        private TextView precio;
        private TextView idUsuario;
        private TextView idPelicula;


        public ViewHolder(View itemView) {
            super(itemView);


            idEntrada = itemView.findViewById(R.id.idEntrada);
            descripcion = itemView.findViewById(R.id.descripcion);
            horario = itemView.findViewById(R.id.horario);
            precio = itemView.findViewById(R.id.precio);
            //idUsuario = itemView.findViewById(R.id.idUsuario);
            //idPelicula = itemView.findViewById(R.id.idPelicula);

        }
    }

}


