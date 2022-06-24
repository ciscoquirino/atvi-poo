package com.wb.negocio;

import java.util.List;

import com.wb.io.Entrada;

import com.wb.modelo.ProdutoOuServico;


public class DeletarProdServ extends Delete{
	private List<ProdutoOuServico> prodservs;
	private Entrada entrada;
	
	public DeletarProdServ(List<ProdutoOuServico> prodservs) {
		this.prodservs = prodservs;
		this.entrada = new Entrada();
	}
	
	@Override
	public void deletar() {
		System.out.println("Digite o código do produto ou serviço que será deletado: ");
		int cod = entrada.receberNumeroInteiro();
		prodservs.remove(cod);
		System.out.println("Registro deletado com sucesso! ");
		System.out.println("_________________________________");
	}

}
