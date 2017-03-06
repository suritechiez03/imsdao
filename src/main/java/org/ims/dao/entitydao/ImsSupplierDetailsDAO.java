/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ims.dao.entitydao;

import java.util.List;
import java.util.Map;
import org.hibernate.Session;
import org.ims.dao.entity.ImsSuppliermaster;
import org.ims.dao.template.IGenericDao;
import org.ims.dao.template.ImsDAOTemplate;

/**
 * 
 * @author Suresh Kumar V
 */
public class ImsSupplierDetailsDAO extends ImsDAOTemplate<ImsSuppliermaster> implements IGenericDao<ImsSuppliermaster> {
     Session session = null;
     public ImsSupplierDetailsDAO() {
        super.setClazz(ImsSuppliermaster.class);
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
    public void delete(ImsSuppliermaster entity) {
        super.delete(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(ImsSuppliermaster entity) {
        super.update(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void create(ImsSuppliermaster entity) {
        super.create(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ImsSuppliermaster> findAll() {
        return super.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ImsSuppliermaster findOne(String id) {
        return super.findOne(id); //To change body of generated methods, choose Tools | Templates.
    }
     public List<Map> imsGetMaxSupplierNumber() {

        String sql = "SELECT COALESCE(Max(substr(SupplierNumber,3,6)),0)  as SupplierNo FROM IMS_DB.ims_suppliermaster;";
        return executeCustomSQL(sql);
        
    }

}
