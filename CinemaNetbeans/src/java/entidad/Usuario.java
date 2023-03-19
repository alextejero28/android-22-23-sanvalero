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
public class Usuario {
    private int idUsuario;
    private String nombre;
    private String apellido;
    private String correo;
    private String contrasena;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombre, String apellido, String correo, String contrasena) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    public static String fromArrayListToJson(ArrayList<Usuario> lstUsuarios) {
        String resp = "[";
        for (Usuario user : lstUsuarios) {
            resp += "{"
                    + "\"IDUSUARIO\" :\"" + user.getIdUsuario() + "\", "
                    + "\"NOMBRE\" :\"" + user.getNombre() + "\", "
                    + "\"APELLIDO\" : \"" + user.getApellido() + "\","
                    + "\"CORREO\" : \"" + user.getCorreo() + "\","
                    + "\"CONTRASENA\" : \"" + user.getContrasena() + "\"}";
            resp += ",";
        }
        resp = resp.substring(0, resp.length() - 1);
        resp += "]";
        return resp;
    }
}


