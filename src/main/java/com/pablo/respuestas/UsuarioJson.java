package com.pablo.respuestas;

/**
 * Created by colo on 20/11/16.
 */
public class UsuarioJson {
    String usuario;
    String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUsuario() {
        return usuario;
    }
}