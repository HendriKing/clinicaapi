package br.com.hendrik.clinicaapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	

public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



@Column(name = "nomecliente",length = 30, nullable = false)	
	private String nome;

@Column(nullable =false)
	private Integer idade;

@Column(length = 100)
	private String endereço;

@Column
	private String telefone;
	


public Cliente() {
}



public Cliente(String nome, Integer idade, String endereço, String telefone) {
	this.nome = nome;
	this.idade = idade;
	this.endereço = endereço;
	this.telefone = telefone;
}



public String getNome() {
	return nome;
}



public void setNome(String nome) {
	this.nome = nome;
}



public Integer getIdade() {
	return idade;
}



public void setIdade(Integer idade) {
	this.idade = idade;
}



public String getEndereço() {
	return endereço;
}



public void setEndereço(String endereço) {
	this.endereço = endereço;
}



public String getTelefone() {
	return telefone;
}



public void setTelefone(String telefone) {
	this.telefone = telefone;
}
}
