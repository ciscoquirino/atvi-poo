package com.wb.negocio;

import java.util.Comparator;

import com.wb.modelo.Cliente;

public class ComparadorQuantProd implements Comparator<Cliente>{

	@Override
	public int compare(Cliente o1, Cliente o2) {
		if(o1.getProdservConsumidos().size() > o2.getProdservConsumidos().size()) {
			return 1;
		}else {
			if(o1.getProdservConsumidos().size() < o2.getProdservConsumidos().size()) {
				return -1;
			}else {
				return 0;
			}
		}
	}
}