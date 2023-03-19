package com.svalero.cinemaandroid.entities;

import com.google.gson.annotations.SerializedName;

public class Cine {

    @SerializedName("idCine")
    private int idCine;
    @SerializedName("nombre")
    private String nombre;
    @SerializedName("direccion")
    private String direccion;
    @SerializedName("capacidad")
    private int capacidad;

    public String toString() {
        return "Cine{" +
                "nombre ='"+ nombre + '\'' +
                ",direccion='"+ direccion + '\'' +
                ",capacidad='"+ capacidad + '\'' +
                '}';
    }

    public int getIdCine() {
        return idCine;
    }

    public void setIdCine(int idCine) {
        this.idCine = idCine;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
