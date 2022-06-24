package com.wb.negocio;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.wb.modelo.Cliente;

public class Listagem10menorconsumoq extends Listagem {
	private List<Cliente> clientes;
	
	public Listagem10menorconsumoq(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	@Override
	public void listar() {
		System.out.println("Listagem dos 10 clientes que mais consumiram (em quantidade de produtos ou serviços)");
		Comparator<Cliente> cq = new ComparadorQuantProd();
		Collections.sort(clientes, cq);
		for(int i = 0; i <10; i++) {
			System.out.println((i + 1) + " - " + clientes.get(i).nomeSocial);
		}		
	}

}



