package com.svalero.cinemaandroid.entities;

import com.google.gson.annotations.SerializedName;

public class Entrada {
    @SerializedName("idEntrada")
    private int idEntrada;
    @SerializedName("descripcion")
    private String descripcion;
    @SerializedName("horario")
    private String horario;
    @SerializedName("precio")
    private double precio;
    @SerializedName("idUsuario")
    private int idUsuario;
    @SerializedName("idPelicula")
    private int idPelicula;

    public String toString() {
        return "Entrada{" +
                "descripcion ='"+ descripcion + '\'' +
                ",horario='"+ horario + '\'' +
                ",precio='"+ precio + '\'' +
                '}';
    }

    public int getIdEntrada() {
        return idEntrada;
    }

    public void setIdEntrada(int idEntrada) {
        this.idEntrada = idEntrada;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }
}
