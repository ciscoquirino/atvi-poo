package com.wb.negocio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.wb.modelo.Cliente;
import com.wb.modelo.ProdutoOuServico;

public class Listagemdevendas extends Listagem{
	private List<Cliente> clientes;
	private List<ProdutoOuServico> prodservs;
	
	public Listagemdevendas(List<Cliente> clientes, List<ProdutoOuServico> prodservs) {
		this.clientes = clientes;
		this.prodservs = prodservs;
	}

	public void listar(){
		System.out.println("Listagem geral de produtos e serviços mais consumidos:");
		List<ProdutoOuServico> vendas = new ArrayList<ProdutoOuServico>();
		for (ProdutoOuServico prodserv : prodservs) {
			prodserv.contarVendas(clientes);
			vendas.add(prodserv);
		}
		Comparator<ProdutoOuServico> cp = new ComparadorProdv();
		Collections.sort(vendas, cp.reversed());
		for (ProdutoOuServico prodserv : vendas) {
			System.out.println(prodserv.nome + " - " + prodserv.quantv + " vendidos.");
		}
		System.out.println("------------------------------------------");
	}
}
