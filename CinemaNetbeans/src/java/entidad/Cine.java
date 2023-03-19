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
public class Cine {
    private int idCine;
    private String nombre;
    private String direccion;
    private int capacidad;

    public Cine() {
    }

    public Cine(int idCine, String nombre, String direccion, int capacidad) {
        this.idCine = idCine;
        this.nombre = nombre;
        this.direccion = direccion;
        this.capacidad = capacidad;
    }

    public int getIdCine() {
        return idCine;
    }

    public void setIdCine(int idCine) {
        this.idCine = idCine;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    
    public static String fromArrayListToJson(ArrayList<Cine> lstCines) {
        String resp = "[";
        for (Cine cine : lstCines) {
            resp += "{"
                    + "\"IDCINE\" :\"" + cine.getIdCine() + "\", "
                    + "\"NOMBRE\" :\"" + cine.getNombre() + "\", "
                    + "\"DIRECCION\" : \"" + cine.getDireccion() + "\","
                    + "\"CAPACIDAD\" : \"" + cine.getCapacidad() + "\"}";
            resp += ",";
        }
        resp = resp.substring(0, resp.length() - 1);
        resp += "]";
        return resp;
    }
}
