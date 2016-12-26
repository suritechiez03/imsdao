/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ims.dao.entitydao;

import java.util.List;
import java.util.Map;
import org.ims.dao.entity.ImsManageorderdetails;
import org.ims.dao.template.IGenericDao;
import org.ims.dao.template.ImsDAOTemplate;

/**
 * 
 * @author Suresh Kumar V
 */
public class ImsManageorderdetailsDAO extends ImsDAOTemplate<ImsManageorderdetails> implements IGenericDao<ImsManageorderdetails>  {
    public ImsManageorderdetailsDAO() {
		setClazz(ImsManageorderdetails.class);
		// TODO Auto-generated constructor stub
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
    public void delete(ImsManageorderdetails entity) {
        super.delete(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(ImsManageorderdetails entity) {
        super.update(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void create(ImsManageorderdetails entity) {
        super.create(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ImsManageorderdetails> findAll() {
        return super.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ImsManageorderdetails findOne(String searchstring) {
        return super.findOne(searchstring); //To change body of generated methods, choose Tools | Templates.
    }

}
