package com.svalero.cinemaandroid.entities;

public class Pelicula {
    private final int idPelicula;
    private String titulo;
    private String categoria;
    private String descripcion;
    private int historicoEntradas;
    private int entradasActuales;
    private static int nextIdPelicula = 0;

    public Pelicula(int idPelicula, String titulo, String categoria, String descripcion, int historicoEntradas, int entradasActuales) {
        this.idPelicula = idPelicula;
        this.titulo = titulo;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.historicoEntradas = historicoEntradas;
        this.entradasActuales = entradasActuales;
    }

    public Pelicula(String titulo, String categoria, String descripcion, int historicoEntradas, int entradasActuales) {
        this.idPelicula = nextIdPelicula;
        this.titulo = titulo;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.historicoEntradas = historicoEntradas;
        this.entradasActuales = entradasActuales;
        nextIdPelicula++;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getHistoricoEntradas() {
        return historicoEntradas;
    }

    public void setHistoricoEntradas(int historicoEntradas) {
        this.historicoEntradas = historicoEntradas;
    }

    public int getEntradasActuales() {
        return entradasActuales;
    }

    public void setEntradasActuales(int entradasActuales) {
        this.entradasActuales = entradasActuales;
    }

    public static int getNextIdPelicula() {
        return nextIdPelicula;
    }

    public static void setNextIdPelicula(int nextIdPelicula) {
        Pelicula.nextIdPelicula = nextIdPelicula;
    }
}
