package com.wb.negocio;

import java.util.List;

import com.wb.io.Entrada;
import com.wb.modelo.Cliente;
import com.wb.modelo.ProdutoOuServico;


public class RegistroConsumo {
	private List<Cliente> clientes;
	private List<ProdutoOuServico> prodservs;
	private Entrada entrada;
	
	public RegistroConsumo(List<Cliente> clientes, List<ProdutoOuServico> prodservs) {
		this.clientes = clientes;
		this.prodservs = prodservs;
		this.entrada = new Entrada();
	}
	
	public void registrarConsumo() {
		System.out.println("Digite o código do cliente: ");
		int codcli = entrada.receberNumeroInteiro();
		Cliente cliente = clientes.get(codcli);
		System.out.println("Digite o código do produto: ");
		int codps = entrada.receberNumeroInteiro();
		ProdutoOuServico prodserv = prodservs.get(codps);
		cliente.venda(prodserv);
		System.out.println("Consumo registrado com sucesso!");
		}
}


