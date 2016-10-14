/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ims.dao.entitydao;

import java.util.List;
import java.util.Map;
import org.ims.dao.entity.ImsAppsettings;
import org.ims.dao.template.IGenericDao;
import org.ims.dao.template.ImsDAOTemplate;

/**
 *
 * @author suri
 */
public class ImsAppSettingDAO extends ImsDAOTemplate<ImsAppsettings> implements IGenericDao<ImsAppsettings> {

    public ImsAppSettingDAO() {
        super.setClazz(ImsAppsettings.class);
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
    public void delete(ImsAppsettings entity) {
        super.delete(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(ImsAppsettings entity) {
        super.update(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void create(ImsAppsettings entity) {
        super.create(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ImsAppsettings findOne(String searchstring) {
        return super.findOne(searchstring); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ImsAppsettings> findAll() {
        return super.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

}
