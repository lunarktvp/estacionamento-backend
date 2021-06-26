package com.example.modelos;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empresa")
public class Empresa {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String nome;
	private String cnpj;
	private String endereco;
	private String telefone;
	private String email;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome.toUpperCase();
	}
	public void setNome(String nome) {
		this.nome = nome.toLowerCase();
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		
		this.cnpj = cnpj;
	}
	public String getEndereco() {
		return endereco.toUpperCase();
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco.toLowerCase();
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email.toLowerCase();
	}
	public void setEmail(String email) {
		this.email = email.toLowerCase();
	}
	

}
