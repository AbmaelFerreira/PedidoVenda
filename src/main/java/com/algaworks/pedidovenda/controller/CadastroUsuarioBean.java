package com.algaworks.pedidovenda.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import com.algaworks.pedidovenda.model.Grupo;
import com.algaworks.pedidovenda.model.Usuario;

@Named
@ViewScoped
public class CadastroUsuarioBean implements Serializable {

		//Variáveis locais
	private static final long serialVersionUID = 1L;

	
		//Variáveis de instância
	
	private Usuario usuario;
	
	
	private List<Grupo> grupoRaizes;
	
	
	public void salvar() {
		
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public List<Grupo> getGrupoRaizes() {
		return grupoRaizes;
	}
	
	
}