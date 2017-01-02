/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ims.dao.entitydao;


import java.util.List;
import java.util.Map;
import org.hibernate.Query;
import org.ims.dao.entity.ImsLogindetails;
import org.ims.dao.template.IGenericLoginDao;
import org.ims.dao.template.ImsDAOTemplate;

/**
 *
 * @author suri
 */
public class ImsLogindetailsDAO extends ImsDAOTemplate<ImsLogindetails> implements IGenericLoginDao<ImsLogindetails>{

   public ImsLogindetailsDAO(){
       setClazz(ImsLogindetails.class);
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
    public void delete(ImsLogindetails entity) {
        super.delete(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(ImsLogindetails entity) {
        super.update(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void create(ImsLogindetails entity) {
        super.create(entity); //To change body of generated methods, choose Tools | Templates.
    }
  
    @Override
    public List<ImsLogindetails> findAll() {
        return super.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ImsLogindetails findOne(String searchstring) {
        return super.findOne(" username='"+searchstring+"'"); //To change body of generated methods, choose Tools | Templates.
    }


 

    
    
}
