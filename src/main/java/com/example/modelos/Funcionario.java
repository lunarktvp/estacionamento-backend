package com.example.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="funcionarios")
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long matricula;
	
	private String nome;
	private String cpf;
	private String nascimento;
	private String cep;
	private String logradouro;
	private String complemento;
	private String cidade;
	private String estado;
	private String telefone;
	private String email;
	private String senha;
	
	public long getMatricula() {
		return matricula;
	}
	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome.toUpperCase();
	}
	public void setNome(String nome) {
		this.nome = nome.toLowerCase();
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getLogradouro() {
		return logradouro.toUpperCase();
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro.toLowerCase();
	}
	public String getComplemento() {
		return complemento.toUpperCase();
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento.toLowerCase();
	}
	public String getCidade() {
		return cidade.toUpperCase();
	}
	public void setCidade(String cidade) {
		this.cidade = cidade.toLowerCase();
	}
	public String getEstado() {
		return estado.toUpperCase();
	}
	public void setEstado(String estado) {
		this.estado = estado.toLowerCase();
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
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	
	
	
}
