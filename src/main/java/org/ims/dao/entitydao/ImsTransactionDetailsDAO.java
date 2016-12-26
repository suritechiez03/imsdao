/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ims.dao.entitydao;

import java.util.List;
import java.util.Map;
import org.ims.dao.entity.ImsTransactiondetails;
import org.ims.dao.template.IGenericDao;
import org.ims.dao.template.ImsDAOTemplate;

/**
 * 
 * @author Suresh Kumar V
 */
public class ImsTransactionDetailsDAO extends ImsDAOTemplate<ImsTransactiondetails> implements IGenericDao<ImsTransactiondetails> {

    public ImsTransactionDetailsDAO() {
        super.setClazz(ImsTransactiondetails.class);
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
    public void delete(ImsTransactiondetails entity) {
        super.delete(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(ImsTransactiondetails entity) {
        super.update(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void create(ImsTransactiondetails entity) {
        super.create(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ImsTransactiondetails> findAllByValue(String searchstring) {
        return super.findAllByValue(searchstring); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ImsTransactiondetails> findAll() {
        return super.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ImsTransactiondetails findOne(String searchstring) {
        return super.findOne(searchstring); //To change body of generated methods, choose Tools | Templates.
    }
    

}
