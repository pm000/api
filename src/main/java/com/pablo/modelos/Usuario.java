package com.pablo.modelos;

import javax.persistence.*;

/**
 * Created by colo on 20/11/16.
 */

@Entity
@Table(name = "usuarios")
public class Usuario {

    private int id;
    private String nombre;
    private String usuario;
    private String direccion;
    private String telefono;
    private String ciudad;
    private String provincia;
    private String pais;
    private String password;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id" , unique = true, nullable=false)
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="nombre", nullable = false, length = 30)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Column(name="usuario", nullable = false, length = 30)
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Column(name="password", nullable = false, length = 20)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name="direccion", nullable = false, length = 20)
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Column(name="ciudad", nullable = false, length = 20)
    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Column(name="provincia", nullable = false, length = 20)
    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Column(name="pais", nullable = false, length = 20)
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Column(name="telefono", nullable = false, length = 20)
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}

