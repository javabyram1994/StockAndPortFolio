package com.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="company_tab")
public class Company {
	@Id
	@GeneratedValue(generator="company")
	@GenericGenerator(name="company",strategy="increment")
	@Column(name="pk_col")
	private Integer id;
	@Column(name="company_name")
	private String companyName;
	@Column(name="company_symbol",unique=true)
	private String companySymbol;
	
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)	
	@JoinColumn(name="cidfk",unique=true)
	private Share companyShare;
	
	public Company() {
		super();
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanySymbol() {
		return companySymbol;
	}

	public void setCompanySymbol(String companySymbol) {
		this.companySymbol = companySymbol;
	}

	public Share getCompanyShare() {
		return companyShare;
	}

	public void setCompanyShare(Share companyShare) {
		this.companyShare = companyShare;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", companyName=" + companyName + ", companySymbol=" + companySymbol
				+ ", companyShare=" + companyShare + "]";
	}

	

	
	
}
