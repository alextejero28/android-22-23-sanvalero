package com.svalero.cinemaandroid.entities;

public class Cine {
    private final int idCine;
    private String direccion;
    private int capacidad;
    private static int nextIdCine = 0;

    public Cine(int idCine, String direccion, int capacidad) {
        this.idCine = idCine;
        this.direccion = direccion;
        this.capacidad = capacidad;
    }

    public Cine(String direccion, int capacidad) {
        this.idCine = nextIdCine;
        this.direccion = direccion;
        this.capacidad = capacidad;
        nextIdCine++;
    }

    public int getIdCine() {
        return idCine;
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

    public static int getNextIdCine() {
        return nextIdCine;
    }

    public static void setNextIdCine(int nextIdCine) {
        Cine.nextIdCine = nextIdCine;
    }
}
