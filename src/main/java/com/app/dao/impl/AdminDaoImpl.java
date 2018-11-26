package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IAdminDao;
import com.app.model.Admin;
@Repository
public class AdminDaoImpl implements IAdminDao {
	@Autowired
	private HibernateTemplate ht;

	
	public Integer saveAdmin(Admin a) {
		return (Integer) ht.save(a);
	}

	
	public void updateAdmin(Admin a) {
		ht.update(a);
	}

	
	public void deleteAdmin(Integer aId) {
		ht.delete(new Admin(aId));
	}

	
	public Admin getOneAdminById(Integer aId) {
		return ht.get(Admin.class, aId);
	}

	
	public List<Admin> getAllAdmins() {
		return ht.loadAll(Admin.class);
	}
	
	

}
