package com.algaworks.pedidovenda.repository.filter;

import java.io.Serializable;

import com.algaworks.pedidovenda.validation.ID_Usuario;

public class UsuarioFilter implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String id;
	private String nome;
	
	
	
	@ID_Usuario
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id == null ? null : id.toUpperCase();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
