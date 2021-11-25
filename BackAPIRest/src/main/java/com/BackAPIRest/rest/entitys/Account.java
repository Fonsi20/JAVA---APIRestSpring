package com.BackAPIRest.rest.entitys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name = "accounts")
public class Account implements Serializable {

	private static final long serialVersionUID = 1L;

//	@Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

//	@Column(name = "name", nullable = false)
	private String name;

//	@Column(name = "limit", nullable = false)
	private Float limit;

//	@Column(name = "createdAt", nullable = false)
	private String createdAt;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(Integer id, String name, Float limit, String createdAt) {
		super();
		this.id = id;
		this.name = name;
		this.limit = limit;
		this.createdAt = createdAt;
	}
	
	public Account( String name, Float limit) {
		super();
		this.name = name;
		this.limit = limit;
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

}
