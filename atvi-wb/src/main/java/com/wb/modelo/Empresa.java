package com.wb.modelo;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private List<Cliente> clientes;
	private List<ProdutoOuServico> prodserv;
	public Empresa() {
		this.clientes = new ArrayList<>();
		this.prodserv = new ArrayList<>();
	}
	public List<Cliente> getClientes() {
		return clientes;
	}
	public List<ProdutoOuServico> getProdserv() {
		return prodserv;
	}
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	public void setProdserv(List<ProdutoOuServico> prodserv) {
		this.prodserv = prodserv;
	}
	
}