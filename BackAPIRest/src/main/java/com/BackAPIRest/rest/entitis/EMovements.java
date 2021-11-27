package com.BackAPIRest.rest.entitis;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movements")
public class EMovements {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_movement", columnDefinition = "INT")
	private Integer idMovement;

	public Integer getIdMovement() {
		return idMovement;
	}

	public void setIdMovement(Integer idMovement) {
		this.idMovement = idMovement;
	}

	@Column(name = "id_type", nullable = false, columnDefinition = "INT")
	private String idType;

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	@Column(name = "id_account", nullable = false, columnDefinition = "INT")
	private Float idAccount;

	public Float getIdAccount() {
		return idAccount;
	}

	public void setIdAccount(Float idAccount) {
		this.idAccount = idAccount;
	}

	@Column(name = "amount", nullable = false, columnDefinition = "REAL")
	private String amount;

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	@Column(name = "create_date", nullable = false, columnDefinition = "TIMESTAMP")
	private Double createDate;

	public Double getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Double createDate) {
		this.createDate = createDate;
	}

}
