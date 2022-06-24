package com.wb.modelo;

import java.util.List;

import com.wb.io.Entrada;

public class ProdutoOuServico {
	private Entrada entrada;
	public int codigo;
	public String nome;
	public double valorunit;
	public ProdutoOuServico(String nome, double valorunit) {
		this.entrada = new Entrada();
		this.nome = nome;
		this.valorunit = valorunit;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValorunit() {
		return valorunit;
	}
	public void setValorunit(double valorunit) {
		this.valorunit = valorunit;
	}
	public void alterarNomeProd() {
		System.out.println("Digite o novo nome do produto ou serviço:");
		String novonome = entrada.receberTexto();
		setNome(novonome);
		System.out.println("Nome do produto ou serviço atualizado!");
		System.out.println("------------------------------------------");
	}
	public void alterarValor() {
		System.out.println("Digite o novo valor unitário do produto ou serviço:");
		double novovalor = entrada.receberNumeroDouble();
		setValorunit(novovalor);
		System.out.println("Valor unitário do produto ou serviço atualizado!");
		System.out.println("------------------------------------------");
	}
	public int contarVendas(List<Cliente> c) {
		int cont = 0;
		for (Cliente cliente : c) {
			for (ProdutoOuServico p : cliente.getProdservConsumidos()) {
				if(p.nome == getNome()) {
					cont = cont + 1;
				}
			}
		}
		return cont;
	}
	
}