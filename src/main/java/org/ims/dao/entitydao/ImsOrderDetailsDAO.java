package org.ims.dao.entitydao;

import java.util.List;
import java.util.Map;

import org.ims.dao.entity.ImsOrderdetails;
import org.ims.dao.template.IGenericDao;
import org.ims.dao.template.ImsDAOTemplate;

public class ImsOrderDetailsDAO extends ImsDAOTemplate<ImsOrderdetails> implements IGenericDao<ImsOrderdetails> {

	public ImsOrderDetailsDAO() {
		setClazz(ImsOrderdetails.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ImsOrderdetails findOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map> executeCustomSQL(String sql) {
		// TODO Auto-generated method stub
		return super.executeCustomSQL(sql);
	}

	@Override
	public List<ImsOrderdetails> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(ImsOrderdetails entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(ImsOrderdetails entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(ImsOrderdetails entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(String entityId) {
		// TODO Auto-generated method stub

	}

}
