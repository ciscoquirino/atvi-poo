package com.wb.negocio;

import java.util.List;

import com.wb.io.Entrada;
import com.wb.modelo.ProdutoOuServico;


public class AtualizarProduto extends Atualizar{
	private List<ProdutoOuServico> prodservs;
	private Entrada entrada;
	
	public AtualizarProduto(List<ProdutoOuServico> prodservs) {
		this.prodservs = prodservs;
		this.entrada = new Entrada();
	}
	
	@Override
	public void atualizar() {
		System.out.println("Digite o código do produto ou serviço que deseja alterar: ");
		int cod = entrada.receberNumeroInteiro();
		ProdutoOuServico prodserv = prodservs.get(cod);
		System.out.println("Produto ou serviço escolhido: " + prodserv.nome);
		System.out.println("Selecione a opção que deseja alterar:");
		System.out.println("1 - Corrigir nome do produto");
		System.out.println("2 - Alterar valor unitário");
		int opcao = entrada.receberNumeroInteiro();
		switch(opcao) {
		case 1:
			prodserv.alterarNomeProd();
			break;
		case 2:
			prodserv.alterarValor();
			break;
		}
	}
}