package com.wb.negocio;

import java.util.List;

import com.wb.io.Entrada;
import com.wb.modelo.ProdutoOuServico;


public class CadastroProduto extends Cadastro{
	private List<ProdutoOuServico> prodservs;
	private Entrada entrada;
	
	public CadastroProduto(List<ProdutoOuServico> prodservs) {
		this.prodservs = prodservs;
		this.entrada = new Entrada();
	}
	
	@Override
	public void cadastrar() {
		System.out.println("Início do cadastro de produtos e serviços");
		System.out.println("Por favor informe o nome ou a descrição do produto ou serviço:");
		String nome = entrada.receberTexto();
		System.out.println("Por valor informe o valor unitário do produto ou serviço:");
		double valorunit = entrada.receberNumeroDouble();
		ProdutoOuServico prodserv = new ProdutoOuServico(nome, valorunit);
		this.prodservs.add(prodserv);
	}

}
