package com.pablo.daos;

import com.pablo.modelos.Usuario;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by colo on 20/11/16.
 */

@Repository
public class DaoUsuario extends DaoAbstracto<Usuario> {

    @Autowired
    public DaoUsuario(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public List getAll() {
        Session session = this.sessionFactory.openSession();
        List<Usuario> usuarios = session.createQuery("FROM Usuario").list();
        session.close();
        return usuarios;
    }

    @Override
    Usuario getById(int id) {
        return null;
    }

    @Override
    void save(Usuario value) {

    }
}

