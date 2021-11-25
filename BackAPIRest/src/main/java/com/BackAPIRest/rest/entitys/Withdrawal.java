package com.BackAPIRest.rest.entitys;

import java.io.Serializable;

public class Withdrawal implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;

	private Float amount;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

}