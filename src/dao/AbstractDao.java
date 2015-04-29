/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import java.io.Serializable;
import java.util.List;
import util.HibernateUtil;

/**
 *
 * @author Khalid
 */
public class AbstractDao<T> {

    Class entityClass;

    public AbstractDao(Class entityClass) {
        this.entityClass = entityClass;
    }

    public void create(T t) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(t);
        transaction.commit();
    }

    public void update(T t) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(t);
        transaction.commit();
    }

    public void delete(T t) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(t);
        transaction.commit();
    }

    public void find(Object id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.get(entityClass.getClass(), (Serializable) id);
    }

    public List<T> findAll(Object id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return session.createQuery("from " + entityClass.getSimpleName()).list();
    }

}
