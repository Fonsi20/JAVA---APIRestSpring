package com.BackAPIRest.rest.entitis;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "accounts")
public class EAccounts {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", columnDefinition = "INT")
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "name", nullable = false, columnDefinition = "NVARCHAR")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "limit_", nullable = false, columnDefinition = "REAL")
	private Float limit;

	public Float getLimit() {
		return limit;
	}

	public void setLimit(Float limit) {
		this.limit = limit;
	}

	@Column(name = "createdAt", nullable = false, columnDefinition = "TIMESTAMP")
	private String createdAt;

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	@Column(name = "balance", nullable = false, columnDefinition = "DOUBLE")
	private Double balance;

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

}
