package com.pablo.controladoras;

import com.pablo.conversores.ConversorUsuarios;
import com.pablo.daos.DaoUsuario;
import com.pablo.modelos.Usuario;
import com.pablo.respuestas.UsuarioJson;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by colo on 20/11/16.
 */

@RestController
@RequestMapping(
        value = "/api",
        produces = MediaType.APPLICATION_JSON_VALUE
)
public class ControladoraUsuarios {

    @Autowired
    ConversorUsuarios conversor;

    @Autowired
    DaoUsuario du;

    @RequestMapping("/usuarios/")
    public List<UsuarioJson> todos() {
        List<Usuario> usuarios = du.getAll();
        return mapear(usuarios);


    }

    private List<UsuarioJson> mapear(List<Usuario> usuarios ){
        List<UsuarioJson> listado = new ArrayList<UsuarioJson>();
        for (Usuario u : usuarios) {
            listado.add(conversor.convertir(u));
        }
        return listado;
    }
}


