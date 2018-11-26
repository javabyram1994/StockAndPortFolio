package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="admin_tab")
public class Admin {

	@Id
	@Column(name="aid")
	@GenericGenerator(name = "ad_inc", strategy = "increment")
	@GeneratedValue(generator="ad_inc")
	private Integer id;
	@Column(name="aname")
	private String name;
	@Column(name="pwd")
	private String pwd;
	public Admin() {
		super();
	}
	
	
	public Admin(Integer id) {
		super();
		this.id = id;
	}


	public Admin(Integer id, String name, String pwd) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + ", pwd=" + pwd + "]";
	}
	
	
}
