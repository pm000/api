package com.pablo.conversores;

import com.pablo.modelos.Usuario;
import com.pablo.respuestas.UsuarioJson;

/**
 * Created by colo on 20/11/16.
 */
public class ConversorUsuarios {
    public UsuarioJson convertir(Usuario usuario) {
        UsuarioJson u = new UsuarioJson();
        u.setNombre(usuario.getNombre());
        u.setUsuario(usuario.getUsuario());

        return u;
    }
}
