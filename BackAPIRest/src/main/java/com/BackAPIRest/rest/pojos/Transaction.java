package com.BackAPIRest.rest.pojos;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Transaction implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonProperty("id")
	private Integer id;

	@JsonProperty("amount")
	private Float amount;

	@JsonProperty("type")
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

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
