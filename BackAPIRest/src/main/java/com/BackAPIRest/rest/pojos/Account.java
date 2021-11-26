package com.BackAPIRest.rest.pojos;

import java.io.Serializable;

public class Account implements Serializable {

	private Integer id;

	private String name;

	private Float limit;

	private String createdAt;

	private Double balance;

	
	
	public Account() {
		super();
	}

	public Account(Integer id, String name, Float limit, String createdAt, Double balance) {
		super();
		this.id = id;
		this.name = name;
		this.limit = limit;
		this.createdAt = createdAt;
		this.balance = balance;
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

	public Float getLimit() {
		return limit;
	}

	public void setLimit(Float limit) {
		this.limit = limit;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

}
