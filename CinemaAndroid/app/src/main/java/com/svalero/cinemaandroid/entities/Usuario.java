package com.svalero.cinemaandroid.entities;

import com.google.gson.annotations.SerializedName;

public class Usuario {
    @SerializedName("idUsuario")
    private int idUsuario;
    @SerializedName("nombre")
    private String nombre;
    @SerializedName("apellido")
    private String apellido;
    @SerializedName("correo")
    private String correo;
    @SerializedName("contrasena")
    private String contrasena;

    public String toString() {
        return "Usuario{" +
                "nombre ='"+ nombre + '\'' +
                ",apellido='"+ apellido + '\'' +
                ",correo='"+ correo + '\'' +
                ",contrasena='"+ contrasena + '\'' +
                '}';
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
}
