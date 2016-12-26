/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ims.dao.entitydao;

import java.util.List;
import java.util.Map;
import org.ims.dao.entity.ImsTaxslab;
import org.ims.dao.template.IGenericDao;
import org.ims.dao.template.ImsDAOTemplate;

/**
 * 
 * @author Suresh Kumar V
 */
public class ImsTaxslabDAO extends ImsDAOTemplate<ImsTaxslab> implements IGenericDao<ImsTaxslab>{

    public ImsTaxslabDAO() {
        super.setClazz(ImsTaxslab.class);
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
    public void delete(ImsTaxslab entity) {
        super.delete(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(ImsTaxslab entity) {
        super.update(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void create(ImsTaxslab entity) {
        super.create(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ImsTaxslab> findAllByValue(String searchstring) {
        return super.findAllByValue(searchstring); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ImsTaxslab> findAll() {
        return super.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ImsTaxslab findOne(String searchstring) {
        return super.findOne(searchstring); //To change body of generated methods, choose Tools | Templates.
    }
    

}
