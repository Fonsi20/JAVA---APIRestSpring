package com.BackAPIRest.rest.entitis;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movements_types")
public class EMovementsTypes {

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

	@Column(name = "multiplicador", nullable = false, columnDefinition = "INT")
	private Float multiplicador;

	public Float getMultiplicador() {
		return multiplicador;
	}

	public void setMultiplicador(Float multiplicador) {
		this.multiplicador = multiplicador;
	}

}
