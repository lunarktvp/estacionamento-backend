package com.example.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="estacionamento")
public class Estacionamento {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private int totalVagas;
	private int totVagaCarro;
	private int totVagaMoto;
	private long idEmpresa;
	
	
	public long getIdEmpresa() {
		return idEmpresa;
	}
	public void setIdEmpresa(long empresa) {
		this.idEmpresa = empresa;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getTotalVagas() {
		return totalVagas;
	}
	public void setTotalVagas(int totalVagas) {
		this.totalVagas = totalVagas;
	}
	public int getTotVagaCarro() {
		return totVagaCarro;
	}
	public void setTotVagaCarro(int totVagaCarro) {
		this.totVagaCarro = totVagaCarro;
	}
	public int getTotVagaMoto() {
		return totVagaMoto;
	}
	public void setTotVagaMoto(int totVagaMoto) {
		this.totVagaMoto = totVagaMoto;
	}
	
	
}
