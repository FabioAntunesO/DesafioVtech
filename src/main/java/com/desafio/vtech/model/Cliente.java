package com.desafio.vtech.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	private String nomeCliente;
	
	@NotNull
	private long idade;
	
	@NotNull
	private String banco;
	
	@NotNull
	private double saldoBancario;
	
	@NotNull
	private double limiteBancario;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public long getIdade() {
		return idade;
	}

	public void setIdade(long idade) {
		this.idade = idade;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public double getSaldoBancario() {
		return saldoBancario;
	}

	public void setSaldoBancario(double saldoBancario) {
		this.saldoBancario = saldoBancario;
	}

	public double getLimiteBancario() {
		return limiteBancario;
	}

	public void setLimiteBancario(double limiteBancario) {
		this.limiteBancario = limiteBancario;
	}
}
