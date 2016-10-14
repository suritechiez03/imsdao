/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ims.dao.entitydao;

import java.util.List;
import java.util.Map;
import org.hibernate.Session;
import org.ims.dao.entity.ImsDealermaster;
import org.ims.dao.template.IGenericDao;
import org.ims.dao.template.ImsDAOTemplate;

/**
 *
 * @author suri
 */
public class ImsDealerDetailsDAO extends ImsDAOTemplate<ImsDealermaster> implements IGenericDao<ImsDealermaster> {

    @Override
    public void deleteById(String entityId) {
        super.deleteById(entityId); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(ImsDealermaster entity) {
        super.delete(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(ImsDealermaster entity) {
        super.update(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void create(ImsDealermaster entity) {
        super.create(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ImsDealermaster> findAll() {
        return super.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ImsDealermaster findOne(String id) {
        return super.findOne(id); //To change body of generated methods, choose Tools | Templates.
    }

    Session session = null;

    public ImsDealerDetailsDAO() {
        super.setClazz(ImsDealermaster.class);
    }

    public List<Map> imsGetMaxDealerNumber() {

        String sql = "SELECT COALESCE(Max(substr(DealerNumber,3,6)),0)  as DealerNo FROM IMS_DB.ims_dealermaster;";
        return executeCustomSQL(sql);
        
    }
    



}
