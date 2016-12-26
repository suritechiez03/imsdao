/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ims.dao.template;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.ims.dao.session.HibernateUtil;

/**
 *
 * @author suri
 */
public abstract class ImsDAOTemplate< T extends Serializable> {

    private Class< T> clazz;

    SessionFactory sessionFactory;

    Transaction tx;

    public final void setClazz(Class< T> clazzToSet) {
        this.clazz = clazzToSet;
    }

    public T findOne(String searchstring) {
        return (T) getCurrentSession().createQuery("from " + clazz.getName() + " where " + searchstring).uniqueResult();
    }

    public List< T> findAll() {
        return getCurrentSession().createQuery("from " + clazz.getName()).list();
    }

    public List< T> findAllByValue(String searchstring) {
        return getCurrentSession().createQuery("from " + clazz.getName() + " where " + searchstring).list();
    }

    public void create(T entity) {
//         this.tx = this.getCurrentSession().beginTransaction();
//              this.getCurrentSession().persist(entity);
//              this.getCurrentSession().flush();
//         this.tx.commit();
        Session session = HibernateUtil.getSessionFactory().openSession();
        org.hibernate.Transaction t = session.beginTransaction();
        session.save(entity);
        t.commit();
    }

    public void update(T entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        org.hibernate.Transaction t = session.beginTransaction();
        session.merge(entity);
        t.commit();
//      getCurrentSession().merge( entity );

    }

    public void delete(T entity) {
//        getCurrentSession().delete(entity);
        Session session = HibernateUtil.getSessionFactory().openSession();
        org.hibernate.Transaction t = session.beginTransaction();
        session.delete(entity);
        t.commit();
    }

    public void deleteById(String entityId) {
        T entity = findOne(entityId);
//        delete(entity);
        Session session = HibernateUtil.getSessionFactory().openSession();
        org.hibernate.Transaction t = session.beginTransaction();
        session.delete(entity);
        t.commit();
    }

    public List<Map> executeCustomSQL(String sql) {
        SQLQuery query = getCurrentSession().createSQLQuery(sql);
        query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
        List<Map> data = (List<Map>) query.list();
        return data;
    }

    protected final Session getCurrentSession() {
        return HibernateUtil.getSessionFactory().openSession();
    }

}
