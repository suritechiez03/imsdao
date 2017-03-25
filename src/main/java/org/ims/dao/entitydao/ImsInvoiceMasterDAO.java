/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ims.dao.entitydao;

import java.util.List;
import java.util.Map;
import org.hibernate.Session;
import org.ims.dao.entity.ImsInvoiceMaster;
import org.ims.dao.entity.ImsManageorders;
import org.ims.dao.entity.ImsTransactiondetails;
import org.ims.dao.session.HibernateUtil;
import org.ims.dao.template.IGenericDao;
import org.ims.dao.template.ImsDAOTemplate;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * @author Suresh Kumar V
 */
public class ImsInvoiceMasterDAO extends ImsDAOTemplate<ImsInvoiceMaster> implements IGenericDao<ImsInvoiceMaster>{

    public ImsInvoiceMasterDAO() {
        super.setClazz(ImsInvoiceMaster.class);
    }

    @Override
    public List<Map> executeCustomSQL(String sql) {
        return super.executeCustomSQL(sql); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteById(String entityId) {
        super.deleteById(entityId); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(ImsInvoiceMaster entity) {
        super.delete(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(ImsInvoiceMaster entity) {
        super.update(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void create(ImsInvoiceMaster entity) {
        super.create(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ImsInvoiceMaster> findAllByValue(String searchstring) {
        return super.findAllByValue(searchstring); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ImsInvoiceMaster> findAll() {
        return super.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ImsInvoiceMaster findOne(String searchstring) {
        return super.findOne(searchstring); //To change body of generated methods, choose Tools | Templates.
    }
   // @Transactional
    public void saveInvoice(ImsInvoiceMaster invoice,ImsTransactiondetails transactions){
       
        //getHibernateTemplate().saveOrUpdate(orders);
        getHibernateTemplate().clear();
        getHibernateTemplate().saveOrUpdate(invoice);
        
    }
    

}
