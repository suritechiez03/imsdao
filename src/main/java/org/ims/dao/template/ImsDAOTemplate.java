/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ims.dao.template;

import java.util.List;
import java.util.Map;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.ims.dao.session.HibernateUtil;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author suri
 */
public class ImsDAOTemplate< T> extends HibernateDaoSupport {

    private Class< T> clazz;

//    SessionFactory sessionFactory;
//    Transaction tx;
    public final void setClazz(Class< T> clazzToSet) {
        this.clazz = clazzToSet;
    }

    public T findOne(String searchstring) {
//        return (T) getCurrentSession().createQuery("from " + clazz.getName() + " where " + searchstring).uniqueResult();
        return (T) getHibernateTemplate().find("from " + clazz.getName() + " where " + searchstring).get(0);

    }

    public List< T> findAll() {
//        return getCurrentSession().createQuery("from " + clazz.getName()).list();
        return (List<T>) getHibernateTemplate().find("from " + clazz.getName());

    }

    public List< T> findAllByValue(String searchstring) {
        return (List<T>) getHibernateTemplate().find("from " + clazz.getName() + " where " + searchstring);
    }
    
    public void create(T entity) {
        getHibernateTemplate().save(entity);
    }
    
    public void update(T entity) {
        getHibernateTemplate().update(entity);
    }
    
    public void delete(T entity) {
        getHibernateTemplate().delete(entity);
    }
    @Transactional
    public void deleteById(String entityId) {
        T entity = findOne(entityId);
        this.delete(entity);
    }

    public List<Map> executeCustomSQL(final String sql) {
        List<Map> data=(List<Map>) getHibernateTemplate().execute(new HibernateCallback() {

            @Override
            public List<Map> doInHibernate(Session sn) throws HibernateException {
                SQLQuery query = sn.createSQLQuery(sql);
                query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
                return (List<Map>) query.list();
                
            }
        });
        return data;

    }

    protected final Session getCurrentSession() {
        return getHibernateTemplate().getSessionFactory().getCurrentSession();
    }

}
