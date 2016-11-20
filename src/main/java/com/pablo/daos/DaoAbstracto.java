package com.pablo.daos;

import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by colo on 20/11/16.
 */
public abstract class DaoAbstracto<K> {
    protected SessionFactory sessionFactory;

    public DaoAbstracto(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    abstract List<K> getAll();
    abstract K getById(int id);
    abstract void save(K value);
}
