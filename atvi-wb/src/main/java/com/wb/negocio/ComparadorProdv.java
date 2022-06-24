package com.wb.negocio;

import java.util.Comparator;

import com.wb.modelo.ProdutoOuServico;

public class ComparadorProdv implements Comparator<ProdutoOuServico>{
	@Override
	public int compare(ProdutoOuServico p1, ProdutoOuServico p2) {
		if(p1.getQuantv() > p2.getQuantv()) {
			return 1;
		}else {
			if(p1.getQuantv() < p2.getQuantv()) {
				return -1;
			}else {
				return 0;
			}
		}
	}

}
