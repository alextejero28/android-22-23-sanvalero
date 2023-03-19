package com.svalero.cinemaandroid.entities;

import com.google.gson.annotations.SerializedName;

public class Pelicula {
    @SerializedName("idPelicula")
    private int idPelicula;
    @SerializedName("titulo")
    private String titulo;
    @SerializedName("sinopsis")
    private String sinopsis;
    @SerializedName("categoria")
    private String categoria;
    @SerializedName("caracteristicas")
    private String caracteristicas;
    @SerializedName("trailer")
    private String trailer;
    @SerializedName("edadRecomendada")
    private int edadRecomendada;
    @SerializedName("historicoEntradas")
    private int historicoEntradas;
    @SerializedName("butacasLibre")
    private int butacasLibre;
    @SerializedName("butacasOcupadas")
    private int butacasOcupadas;
    @SerializedName("duracion")
    private int duracion;

    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", sinopsis" + sinopsis + '\'' +
                ", categoria" + categoria + '\'' +
                ", caracteristicas" + caracteristicas + '\'' +
                ", trailer" + trailer + '\'' +
                ", edadRecomendada" + edadRecomendada + '\'' +
                ", historicoEntradas" + historicoEntradas + '\'' +
                ", butacasLibre" + butacasLibre + '\'' +
                ", butacasOcupadas" + butacasOcupadas + '\'' +
                ", duracion" + duracion + '\'' +
                '}';

    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
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


    public int getHistoricoEntradas() {
        return historicoEntradas;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    public int getButacasLibre() {
        return butacasLibre;
    }

    public void setButacasLibre(int butacasLibre) {
        this.butacasLibre = butacasLibre;
    }

    public int getButacasOcupadas() {
        return butacasOcupadas;
    }

    public void setButacasOcupadas(int butacasOcupadas) {
        this.butacasOcupadas = butacasOcupadas;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setHistoricoEntradas(int historicoEntradas) {
        this.historicoEntradas = historicoEntradas;
    }

    public int getEdadRecomendada() {
        return edadRecomendada;
    }

    public void setEdadRecomendada(int edadRecomendada) {
        this.edadRecomendada = edadRecomendada;
    }
}
