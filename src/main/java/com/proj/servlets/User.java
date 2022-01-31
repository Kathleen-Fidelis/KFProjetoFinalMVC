package com.proj.servlets;

public class User {

	private int id;
	private String nome;
	private String email;
	private String pais;
	
	
	public User(int id, String nome, String email, String pais) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.pais = pais;
	}
	

	public User(String nome, String email, String pais) {
		this.nome = nome;
		this.email = email;
		this.pais = pais;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
}
