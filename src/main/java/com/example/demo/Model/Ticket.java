package com.example.demo.Model;


import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PostLoad;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name="tickets")
public class Ticket {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column
	private LocalDateTime entrada;
	
	@Column
	private LocalDateTime saida;
	
	@Column
	private int permanencia;
	
	@Column
	private float valor;

	@ManyToOne
	@JoinColumn(name="id_cliente")
	private Cliente cliente;
	
	@Column
	private int situacao;
	
	@NotEmpty
	private String placa;
	
	@Column(name="tipo_pagamento")
	private int tipoPagamento;
	
	
	@PrePersist
	public void prePersist () {
		
		if(id>0) {
			saida = LocalDateTime.now().withSecond(0);
			permanencia = (int) entrada.until(saida, ChronoUnit.MINUTES);
		}else {
			entrada = LocalDateTime.now().withSecond(0);
			permanencia = 0;
		}
	}
	
	@PostLoad
	public void postLoad() {
		saida = LocalDateTime.now().withSecond(0);
		permanencia = (int) entrada.until(saida, ChronoUnit.MINUTES);
		System.out.println(saida);
	}


	
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}

	@JsonFormat(pattern="HH:mm dd/MM/yyyy")
	public LocalDateTime getEntrada(){
		return entrada;
	}

	
	public void setEntrada(LocalDateTime entrada) {
		this.entrada = entrada;
	}

	@JsonFormat(pattern="HH:mm dd/MM/yyyy")
	public LocalDateTime getSaida() {
		return saida;
	}


	public void setSaida(LocalDateTime saida) {
		this.saida = saida;
	}


	public float getValor() {
		return valor;
	}


	public void setValor(float valor) {
		this.valor = valor;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public int getSituacao() {
		return situacao;
	}


	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa.toUpperCase();
	}


	public int getTipoPagamento() {
		return tipoPagamento;
	}


	public void setTipoPagamento(int tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

	public int getPermanencia() {
		return permanencia;
	}

	public void setPermanencia(int permanencia) {
		this.permanencia = permanencia;
	}
	
	
	
	
	

}
