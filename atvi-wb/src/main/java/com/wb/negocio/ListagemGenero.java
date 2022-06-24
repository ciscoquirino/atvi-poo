package com.wb.negocio;

import java.util.ArrayList;
import java.util.List;

import com.wb.modelo.Cliente;


public class ListagemGenero extends Listagem {
	private List<Cliente> clientes;

	public ListagemGenero(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	@Override
	public void listar() {
		List<Cliente> listahomem = new ArrayList<Cliente>();
		List<Cliente> listamulher = new ArrayList<Cliente>();
		for (Cliente cliente : clientes) {
			if(cliente.genero == "homem") {
				listahomem.add(cliente);
			}else if(cliente.genero == "mulher") {
				listamulher.add(cliente);
			}
		}
		System.out.println("Listagem de clientes por gênero: ");
		System.out.println("Mulher: ");
		for (Cliente cliente : listamulher) {
			System.out.println(cliente.nome + " (" + cliente.nomeSocial + ")");
		}
		System.out.println("Homem: ");
		for (Cliente cliente : listahomem) {
			System.out.println(cliente.nome + " (" + cliente.nomeSocial + ")");
		}
		System.out.println("-------------------------------------------");
	}
}