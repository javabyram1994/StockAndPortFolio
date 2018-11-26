package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.ICompanyDao;
import com.app.model.Company;
@Repository
public class CompanyDaoImpl implements ICompanyDao {
	@Autowired
	private HibernateTemplate ht;

	@Override
	public Integer saveCompany(Company company) {
		return (Integer) ht.save(company);
	}

	@Override
	public void updateCompany(Company company) {
		ht.update(company);
	}

	@Override
	public void deleteCompany(int id) {
		Company c=new Company();
		c.setId(id);
		ht.delete(c);
	}

	@Override
	public Company getCompanyById(int id) {
		return ht.get(Company.class, id);
	}

	@Override
	public List<Company> getAllCompanies() {
		return ht.loadAll(Company.class);
	}
}
