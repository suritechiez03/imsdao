/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ims.dao.entitydao;

import java.util.List;
import java.util.Map;
import org.ims.dao.entity.ImsProductdetails;
import org.ims.dao.template.IGenericDao;
import org.ims.dao.template.ImsDAOTemplate;

/**
 * 
 * @author Suresh Kumar V
 */
public class ImsProductdetailsDAO extends ImsDAOTemplate<ImsProductdetails> implements IGenericDao<ImsProductdetails>{

    @Override
    public List<Map> executeCustomSQL(String sql) {
        return super.executeCustomSQL(sql); //To change body of generated methods, choose Tools | Templates.
    }

    public ImsProductdetailsDAO() {
        super.setClazz(ImsProductdetails.class);
    }

    @Override
    public void deleteById(String entityId) {
        super.deleteById(entityId); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(ImsProductdetails entity) {
        super.delete(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(ImsProductdetails entity) {
        super.update(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void create(ImsProductdetails entity) {
        super.create(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ImsProductdetails> findAll() {
        return super.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ImsProductdetails findOne(String searchstring) {
        return super.findOne(searchstring); //To change body of generated methods, choose Tools | Templates.
    }
    

}
