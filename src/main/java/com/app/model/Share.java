package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Share {
	@Id
	@GeneratedValue(generator="share")
	@GenericGenerator(name="share",strategy="increment")
	private int id;
	private Integer sharePrice;
	private Integer numberOfShares;
	public Share() {
		super();
	}

	public Integer getNumberOfShares() {
		return numberOfShares;
	}

	public void setNumberOfShares(Integer numberOfShares) {
		this.numberOfShares = numberOfShares;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(Integer sharePrice) {
		this.sharePrice = sharePrice;
	}

	@Override
	public String toString() {
		return "Share [id=" + id + ", sharePrice=" + sharePrice + ", numberOfShares=" + numberOfShares + "]";
	}

	

}
