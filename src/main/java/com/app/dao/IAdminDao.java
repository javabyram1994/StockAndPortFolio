package com.app.dao;

import java.util.List;

import com.app.model.Admin;

public interface IAdminDao {
	
	public Integer saveAdmin(Admin a);
	public void updateAdmin(Admin a);
	public void deleteAdmin(Integer aId);
	public Admin getOneAdminById(Integer aId);
	public List<Admin> getAllAdmins();

}
