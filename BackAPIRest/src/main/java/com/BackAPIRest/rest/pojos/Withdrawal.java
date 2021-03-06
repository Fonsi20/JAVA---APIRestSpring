package com.BackAPIRest.rest.pojos;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Withdrawal implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonProperty("id")
	private Integer id;

	@JsonProperty("amount")
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
