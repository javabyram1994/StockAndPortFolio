package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IAdminDao;
import com.app.model.Admin;
import com.app.service.IAdminService;
@Service
public class AdminServiceImpl implements IAdminService {
	
	@Autowired
	private IAdminDao dao;

	@Transactional
	public Integer saveAdmin(Admin a) {
		return dao.saveAdmin(a);
	}

	@Transactional
	public void updateAdmin(Admin a) {
		dao.updateAdmin(a);
	}

	@Transactional
	public void deleteAdmin(Integer aId) {
		dao.deleteAdmin(aId);
	}

	@Transactional(readOnly=true)
	public Admin getOneAdminById(Integer aId) {
		return dao.getOneAdminById(aId);
	}

	@Transactional(readOnly=true)
	public List<Admin> getAllAdmins() {
		return dao.getAllAdmins();
	}

}
