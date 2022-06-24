package com.wb.negocio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.wb.modelo.Cliente;
import com.wb.modelo.ProdutoOuServico;

public class ListagemProdGen extends Listagem{
	private List<Cliente> clientes;
	private List<ProdutoOuServico> prodservs;
	
	public ListagemProdGen(List<Cliente> clientes, List<ProdutoOuServico> prodservs) {
		this.clientes = clientes;
		this.prodservs = prodservs;
	}
	
	public void listar() {
		System.out.println("Listagem de produtos e serviços mais consumidos por gênero: ");
		List<Cliente> listahomem = new ArrayList<Cliente>();
		List<Cliente> listamulher = new ArrayList<Cliente>();
		for (Cliente cliente : clientes) {
			if(cliente.genero == "homem") {
				listahomem.add(cliente);
			}else if(cliente.genero == "mulher") {
				listamulher.add(cliente);
			}
		}
		System.out.println("Homens:");
		List<ProdutoOuServico> vendash = new ArrayList<ProdutoOuServico>();
		for (ProdutoOuServico prodserv : prodservs) {
			prodserv.contarVendas(listahomem);
			if(prodserv.quantv != 0) {vendash.add(prodserv);}
		}
		Comparator<ProdutoOuServico> cp = new ComparadorProdv();
		Collections.sort(vendash, cp.reversed());
		for (ProdutoOuServico prodserv : vendash) {
			System.out.println(prodserv.nome + " - " + prodserv.quantv + " vendidos.");
		}
		System.out.println("------------------------------------------");
		System.out.println("Mulheres:");
		List<ProdutoOuServico> vendasm = new ArrayList<ProdutoOuServico>();
		for (ProdutoOuServico prodserv : prodservs) {
			prodserv.contarVendas(listamulher);
			if(prodserv.quantv != 0) { vendasm.add(prodserv);}
		}
		Collections.sort(vendasm, cp.reversed());
		for (ProdutoOuServico prodserv : vendasm) {
			System.out.println(prodserv.nome + " - " + prodserv.quantv + " vendidos.");
		}
		System.out.println("-----------------------------------------");
	}

}
