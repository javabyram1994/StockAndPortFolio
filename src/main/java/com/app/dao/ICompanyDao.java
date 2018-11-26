package com.app.dao;

import java.util.List;

import com.app.model.Company;

public interface ICompanyDao {

	Integer saveCompany(Company company);
	void updateCompany(Company company);
	void deleteCompany(int id);
	Company getCompanyById(int id);
	List<Company> getAllCompanies();
}
