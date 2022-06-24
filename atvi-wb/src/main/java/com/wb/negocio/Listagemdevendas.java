package com.wb.negocio;

import java.util.ArrayList;
import java.util.List;

import com.wb.modelo.Cliente;
import com.wb.modelo.ProdutoOuServico;

public class Listagemdevendas {
	private List<Cliente> clientes;
	
	public Listagemdevendas(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public List<ProdutoOuServico> listageral(){
		List<ProdutoOuServico> vendas = new ArrayList<ProdutoOuServico>();
		for (Cliente cliente : clientes) {
			for (ProdutoOuServico prodserv : cliente.getProdservConsumidos()) {
				vendas.add(prodserv);
			}
		}
		
		return vendas;
	}
}
