package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.ICompanyDao;
import com.app.model.Company;
import com.app.service.ICompanyService;

@Service
public class CompanyServiceImpl implements ICompanyService{
	@Autowired
	private ICompanyDao dao;

	@Transactional
	public Integer saveCompany(Company company) {
		return dao.saveCompany(company);
	}

	@Transactional
	public void updateCompany(Company company) {
		dao.updateCompany(company);
	}

	@Transactional
	public void deleteCompany(int id) {
		dao.deleteCompany(id);
	}

	@Transactional(readOnly=true)
	public Company getCompanyById(int id) {
		return dao.getCompanyById(id);
	}

	@Transactional(readOnly=true)
	public List<Company> getAllCompanies() {
		return dao.getAllCompanies();
	}

}
