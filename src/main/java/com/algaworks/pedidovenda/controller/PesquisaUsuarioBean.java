package com.algaworks.pedidovenda.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.algaworks.pedidovenda.model.Usuario;
import com.algaworks.pedidovenda.repository.Usuarios;
import com.algaworks.pedidovenda.repository.filter.UsuarioFilter;
import com.algaworks.pedidovenda.util.jsf.FacesUtil;

@Named
@ViewScoped
public class PesquisaUsuarioBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private Usuarios usuarios;	
	private UsuarioFilter filtro;
	private List<Usuario> usuarioFiltrados;
	
	private Usuario usuarioSelecionado;
	
	
	public PesquisaUsuarioBean() {
		filtro = new UsuarioFilter();		
		
	}
	
	public void excluir() {
		 usuarios.remover(usuarioSelecionado);
		 usuarioFiltrados.remove(usuarioSelecionado);
		 
		 FacesUtil.addInfoMessage("Usuario "+usuarioSelecionado.getId()
		 									+" excluido com sucesso ");
	}
	
	public void pesquisar() {
			usuarioFiltrados = usuarios.filtrados(filtro);
}
	

	
	public List<Usuario> getUsuarioFiltrados() {
		return usuarioFiltrados;
	}


	public UsuarioFilter getFiltro() {
		return filtro;
	}

	public Usuario getUsuarioSelecionado() {
		return usuarioSelecionado;
	}

	public void setUsuarioSelecionado(Usuario usuarioSelecionado) {
		this.usuarioSelecionado = usuarioSelecionado;
	}
}