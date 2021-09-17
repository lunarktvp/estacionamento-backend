package com.example.demo.Model;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name="tickets")
public class Ticket {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="data_entrada")
	private String dataEntrada;
	
	
	@Column(name="hora_entrada")
	private String horaEntrada;
	
	@Column(name="data_saida")
	private String dataSaida;
	
	@Column(name="hora_saida")
	private String horaSaida;
	
	private float valor;
	
	private String situacao;
	
	

	@Column
	private String placa;

	
	@PrePersist
	public void prePersist () {
		
		if(horaEntrada.isEmpty()) {
			horaEntrada = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
			dataEntrada = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		}else {
			horaSaida = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
			dataSaida = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		}
		
		
		
		
		
	}
	
	public String getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(String dataSaida) {
		this.dataSaida = dataSaida;
	}

	public String getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(String horaSaida) {
		this.horaSaida = horaSaida;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(String horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
	
	

}
