package com.app.service;

import java.util.List;

import com.app.model.Admin;

public interface IAdminService {
	
	public Integer saveAdmin(Admin a);
	public void updateAdmin(Admin a);
	public void deleteAdmin(Integer aId);
	public Admin getOneAdminById(Integer aId);
	public List<Admin> getAllAdmins();


}
