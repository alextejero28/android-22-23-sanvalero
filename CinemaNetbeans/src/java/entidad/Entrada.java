/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class Entrada {
    private int idEntrada;
    private String descripcion;
    private String horario;
    private Double precio;
    private int idUsuario;
    private int idPelicula;

    public Entrada() {
    }

    public Entrada(int idEntrada, String descripcion, String horario, Double precio, int idUsuario, int idPelicula) {
        this.idEntrada = idEntrada;
        this.descripcion = descripcion;
        this.horario = horario;
        this.precio = precio;
        this.idUsuario = idUsuario;
        this.idPelicula = idPelicula;
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

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
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
    
    public static String fromArrayListToJson(ArrayList<Entrada> lstEntradas) {
        String resp = "[";
        for (Entrada entrada : lstEntradas) {
            resp += "{"
                    + "\"IDENTRADA\" :\"" + entrada.getIdEntrada() + "\", "
                    + "\"DESCRIPCION\" :\"" + entrada.getDescripcion() + "\", "
                    + "\"HORARIO\" : \"" + entrada.getHorario() + "\","
                    + "\"PRECIO\" : \"" + entrada.getPrecio() + "\","
                    + "\"IDUSUARIO\" : \"" + entrada.getIdUsuario() + "\","
                    + "\"IDPELICULA\" : \"" + entrada.getIdPelicula() + "\"}";
            resp += ",";
        }
        resp = resp.substring(0, resp.length() - 1);
        resp += "]";
        return resp;
    }
}
