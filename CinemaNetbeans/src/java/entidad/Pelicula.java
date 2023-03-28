/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.ArrayList;

/**
 
 * @author Alex
 */
public class Pelicula {
    private int idPelicula;
    private String titulo;
    private String sinopsis;
    private String categoria;
    private String caracteristicas;
    private String trailer;
    private int edadRecomendada;
    private int historicoEntradas;
    private int butacasLibre;
    private int butacasOcupadas;
    private int duracion;
    private double rating;

    public Pelicula() {
    }

    public Pelicula(int idPelicula, String titulo, String sinopsis, String categoria, String caracteristicas, String trailer, int edadRecomendada, int historicoEntradas, int butacasLibre, int butacasOcupadas, int duracion, double rating) {
        this.idPelicula = idPelicula;
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.categoria = categoria;
        this.caracteristicas = caracteristicas;
        this.trailer = trailer;
        this.edadRecomendada = edadRecomendada;
        this.historicoEntradas = historicoEntradas;
        this.butacasLibre = butacasLibre;
        this.butacasOcupadas = butacasOcupadas;
        this.duracion = duracion;
        this.rating = rating;
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

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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

    public int getEdadRecomendada() {
        return edadRecomendada;
    }

    public void setEdadRecomendada(int edadRecomendada) {
        this.edadRecomendada = edadRecomendada;
    }

    public int getHistoricoEntradas() {
        return historicoEntradas;
    }

    public void setHistoricoEntradas(int historicoEntradas) {
        this.historicoEntradas = historicoEntradas;
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

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
    
    
    
    public static String fromArrayListToJson(ArrayList<Pelicula> lstPeliculas) {
        String resp = "[";
        for (Pelicula peli : lstPeliculas) {
            resp += "{"
                    + "\"idPelicula\" :\"" + peli.getIdPelicula() + "\", "
                    + "\"titulo\" :\"" + peli.getTitulo() + "\", "
                    + "\"sinopsis\" : \"" + peli.getSinopsis() + "\","
                    + "\"categoria\" : \"" + peli.getCategoria() + "\","
                    + "\"caracteristicas\" : \"" + peli.getCaracteristicas() + "\","
                    + "\"trailer\" : \"" + peli.getTrailer() + "\","
                    + "\"edadRecomendada\" : \"" + peli.getEdadRecomendada() + "\","
                    + "\"historicoEntradas\" : \"" + peli.getHistoricoEntradas() + "\","
                    + "\"butacasLibre\" : \"" + peli.getButacasLibre() + "\","
                    + "\"butacasOcupadas\" : \"" + peli.getButacasOcupadas() + "\","
                    + "\"duracion\" : \"" + peli.getDuracion() + "\","
                    + "\"rating\" : \"" + peli.getRating() + "\"}";
            resp += ",";
        }
        resp = resp.substring(0, resp.length() - 1);
        resp += "]";
        return resp;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "idPelicula=" + idPelicula + ", titulo=" + titulo + ", sinopsis=" + sinopsis + ", categoria=" + categoria + ", caracteristicas=" + caracteristicas + ", trailer=" + trailer + ", edadRecomendada=" + edadRecomendada + ", historicoEntradas=" + historicoEntradas + ", butacasLibre=" + butacasLibre + ", butacasOcupadas=" + butacasOcupadas + ", duracion=" + duracion + ", rating=" + rating + '}';
    }
    
    
  
}
