package org.ims.dao.entitydao;

import java.util.List;
import java.util.Map;
import org.ims.dao.entity.ImsManageorders;

import org.ims.dao.entity.ImsOrderdetails;
import org.ims.dao.template.IGenericDao;
import org.ims.dao.template.ImsDAOTemplate;

public class ImsManageordersDAO extends ImsDAOTemplate<ImsManageorders> implements IGenericDao<ImsManageorders> {

	public ImsManageordersDAO() {
		setClazz(ImsManageorders.class);
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
    public void delete(ImsManageorders entity) {
        super.delete(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(ImsManageorders entity) {
        super.update(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void create(ImsManageorders entity) {
        super.create(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ImsManageorders> findAll() {
        return super.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ImsManageorders findOne(String searchstring) {
        return super.findOne(searchstring); //To change body of generated methods, choose Tools | Templates.
    }
        
    public List<Map> imsGetMaxOrderNumber() {

        String sql = "SELECT COALESCE(Max(substr(GeneratedOrderNo,4,10)),0)  as GeneratedOrderNo FROM IMS_DB.ims_manageorders;";
        return executeCustomSQL(sql);
        
    }
    
    public Boolean SaveOrUpdateOrder(ImsManageorders entity) {
        getHibernateTemplate().clear();
        getHibernateTemplate().saveOrUpdate(entity); //To change body of generated methods, choose Tools | Templates.
        getHibernateTemplate().flush();
        return true;
    }
    	

}
