package com.wb.negocio;

import java.util.List;

import com.wb.modelo.ProdutoOuServico;

public class ListarTodosProdutos extends Listagem{
	private List<ProdutoOuServico> prodservs;
	
	public ListarTodosProdutos(List<ProdutoOuServico> prodservs) {
		this.prodservs = prodservs;
	}
	
	@Override
	public void listar() {
		System.out.println("Lista de todos os Produtos e Serviços: ");
		for (ProdutoOuServico produtoOuServico : prodservs) {
			System.out.println("Código: " + prodservs.indexOf(produtoOuServico));
			System.out.println("Descrição: "+ produtoOuServico.nome);
			System.out.println("Valor unitário: " + produtoOuServico.valorunit);
		}
	}
}
