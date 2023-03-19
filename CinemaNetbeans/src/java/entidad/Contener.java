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
public class Contener {
    private int idCine;
    private int idPelicula;

    public Contener() {
    }

    public Contener(int idCine, int idPelicula) {
        this.idCine = idCine;
        this.idPelicula = idPelicula;
    }

    public int getIdCine() {
        return idCine;
    }

    public void setIdCine(int idCine) {
        this.idCine = idCine;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }
    
    public static String fromArrayListToJson(ArrayList<Contener> lstContener) {
        String resp = "[";
        for (Contener contener : lstContener) {
            resp += "{"
                    + "\"IDCINE\" :\"" + contener.getIdCine() + "\", "
                    + "\"IDPELICULA\" : \"" + contener.getIdPelicula() + "\"}";
            resp += ",";
        }
        resp = resp.substring(0, resp.length() - 1);
        resp += "]";
        return resp;
    }
}
