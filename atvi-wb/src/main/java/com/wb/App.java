package com.wb;

import java.util.ArrayList;

import java.util.List;

import com.wb.io.Entrada;
import com.wb.modelo.CPF;
import com.wb.modelo.Cliente;
import com.wb.modelo.Empresa;
import com.wb.modelo.ProdutoOuServico;
import com.wb.negocio.Atualizar;
import com.wb.negocio.AtualizarCliente;
import com.wb.negocio.AtualizarProduto;
import com.wb.negocio.Cadastro;
import com.wb.negocio.CadastroCliente;
import com.wb.negocio.CadastroProduto;
import com.wb.negocio.DeletarCliente;
import com.wb.negocio.DeletarProdServ;
import com.wb.negocio.Delete;
import com.wb.negocio.Listagem;
import com.wb.negocio.Listagem10MaiorConsumoq;
import com.wb.negocio.Listagem10menorconsumoq;
import com.wb.negocio.Listagem5valor;
import com.wb.negocio.ListagemGenero;
import com.wb.negocio.ListagemProdGen;
import com.wb.negocio.Listagemdevendas;
import com.wb.negocio.ListarTodosClientes;
import com.wb.negocio.ListarTodosProdutos;
import com.wb.negocio.RegistroConsumo;

public class App {
	public static void main(String[] args) {
		System.out.println("Bem-vindo ao cadastro de clientes do Grupo World Beauty");
		Empresa empresa = new Empresa();
		

		
		List<ProdutoOuServico> listadeprodserv = new ArrayList<ProdutoOuServico>();
		ProdutoOuServico p1 = new ProdutoOuServico("Xampu Sedosso", 10.5);
		ProdutoOuServico p2 = new ProdutoOuServico("Condicionador Sedosso", 12);
		ProdutoOuServico p3 = new ProdutoOuServico("Corte de Cabelo", 50);
		ProdutoOuServico p4 = new ProdutoOuServico("Hidratação", 80);
		ProdutoOuServico p5 = new ProdutoOuServico("Barba", 35);
		ProdutoOuServico p6 = new ProdutoOuServico("Manicure", 70);
		ProdutoOuServico p7 = new ProdutoOuServico("Pedicure", 70);
		ProdutoOuServico p8 = new ProdutoOuServico("Corte de máquina", 30);
		ProdutoOuServico p9 = new ProdutoOuServico("Shampoo para barba", 25);
		ProdutoOuServico p10 = new ProdutoOuServico("Escova Marroquina", 120);
		ProdutoOuServico p11 = new ProdutoOuServico("Spray fixador", 40);
		ProdutoOuServico p12 = new ProdutoOuServico("Shampoo FinoTrato", 80);
		ProdutoOuServico p13 = new ProdutoOuServico("Condicionador FinoTrato", 90);
		ProdutoOuServico p14 = new ProdutoOuServico("Maquiagem completa", 150);
		ProdutoOuServico p15 = new ProdutoOuServico("Alongamento de unhas", 80);
		ProdutoOuServico p16 = new ProdutoOuServico("Cabelo + Barba", 75);
		ProdutoOuServico p17 = new ProdutoOuServico("Escova", 50);
		ProdutoOuServico p18 = new ProdutoOuServico("Shampoo Jubalinda", 40);
		ProdutoOuServico p19 = new ProdutoOuServico("Condicionador Jubalinda", 47);
		ProdutoOuServico p20 = new ProdutoOuServico("Óleo para barba", 30);
		listadeprodserv.add(p1); listadeprodserv.add(p2); listadeprodserv.add(p3); listadeprodserv.add(p4);
		listadeprodserv.add(p5); listadeprodserv.add(p6); listadeprodserv.add(p7); listadeprodserv.add(p8);
		listadeprodserv.add(p9); listadeprodserv.add(p10); listadeprodserv.add(p11); listadeprodserv.add(p12);
		listadeprodserv.add(p13); listadeprodserv.add(p14); listadeprodserv.add(p15); listadeprodserv.add(p16);
		listadeprodserv.add(p17); listadeprodserv.add(p18); listadeprodserv.add(p19); listadeprodserv.add(p20);
		empresa.setProdserv(listadeprodserv); 
		
		List<Cliente> listadeclientes = new ArrayList<Cliente>();
		Cliente c1 = new Cliente("Zerosvaldo da Silva", "Cliente Zero", new CPF(null, "11111111111"), "homem");
		c1.getProdservConsumidos().add(p3);c1.getProdservConsumidos().add(p1);
		Cliente c2 = new Cliente("Humberto dos Santos", "Cliente Um", new CPF(null, "22222222222"), "homem");
		c2.getProdservConsumidos().add(p12);c2.getProdservConsumidos().add(p14);c2.getProdservConsumidos().add(p13);c2.getProdservConsumidos().add(p10);
		Cliente c3 = new Cliente("Doisilda Soares", "Cliente Dois", new CPF(null, "12312312312"), "mulher");
		c3.getProdservConsumidos().add(p17);c3.getProdservConsumidos().add(p16);c3.getProdservConsumidos().add(p11);
		Cliente c4 = new Cliente("João Cortrês", "Cliente Três", new CPF(null, "12312432312"), "homem");
		c4.getProdservConsumidos().add(p15);c4.getProdservConsumidos().add(p19);
		Cliente c5 = new Cliente("Torquatro de Oliveira", "Cliente Quatro", new CPF(null, "12312444412"), "homem");
		c5.getProdservConsumidos().add(p4);c5.getProdservConsumidos().add(p5);c5.getProdservConsumidos().add(p16);
		Cliente c6 = new Cliente("Suelen Cinqueira", "Cliente Cinco", new CPF(null, "12555512312"), "mulher");
		c6.getProdservConsumidos().add(p12);c6.getProdservConsumidos().add(p11);c6.getProdservConsumidos().add(p18);c6.getProdservConsumidos().add(p17);c6.getProdservConsumidos().add(p20);
		Cliente c7 = new Cliente("ConSeisção Moura", "Cliente Seis", new CPF(null, "12312666312"), "mulher");
		c7.getProdservConsumidos().add(p7);c7.getProdservConsumidos().add(p8);c7.getProdservConsumidos().add(p10);
		Cliente c8 = new Cliente("Setembrina Silva", "Cliente Sete", new CPF(null, "17772312312"), "mulher");
		c8.getProdservConsumidos().add(p15);c8.getProdservConsumidos().add(p19);c8.getProdservConsumidos().add(p18);
		Cliente c9 = new Cliente("Oiton Bastos", "Cliente Oito", new CPF(null, "12388812312"), "homem");
		c9.getProdservConsumidos().add(p2);
		Cliente c10 = new Cliente("Courtney Nove", "Cliente Nove", new CPF(null, "12319992312"), "mulher");
		c10.getProdservConsumidos().add(p10);c10.getProdservConsumidos().add(p7);c10.getProdservConsumidos().add(p15);c10.getProdservConsumidos().add(p19);c10.getProdservConsumidos().add(p6);c10.getProdservConsumidos().add(p11);c10.getProdservConsumidos().add(p4);
		Cliente c11 = new Cliente("Dézcio Amarante", "Cliente Dez", new CPF(null, "12312101012"), "homem");
		c11.getProdservConsumidos().add(p2);c11.getProdservConsumidos().add(p13);
		Cliente c12 = new Cliente("Marionze Neves", "Cliente Onze", new CPF(null, "12311111312"), "mulher");
		c12.getProdservConsumidos().add(p12);c12.getProdservConsumidos().add(p20);c12.getProdservConsumidos().add(p9);c12.getProdservConsumidos().add(p19);c12.getProdservConsumidos().add(p1);c12.getProdservConsumidos().add(p8);
		Cliente c13 = new Cliente("Dozelina Félix", "Cliente Doze", new CPF(null, "17772987312"), "mulher");
		c13.getProdservConsumidos().add(p13);c13.getProdservConsumidos().add(p18);c13.getProdservConsumidos().add(p6);
		Cliente c14 = new Cliente("Tereza Porto", "Cliente Treze", new CPF(null, "17131312312"), "mulher");
		c14.getProdservConsumidos().add(p16);c14.getProdservConsumidos().add(p14);c14.getProdservConsumidos().add(p4);
		Cliente c15 = new Cliente("Rebeca Torze", "Cliente Quatorze", new CPF(null, "17714142312"), "mulher");
		c15.getProdservConsumidos().add(p2);c15.getProdservConsumidos().add(p3);c15.getProdservConsumidos().add(p18);
		Cliente c16 = new Cliente("Zerosvaldo da Silva2", "Cliente Zero2", new CPF(null, "11111111111"), "homem");
		c16.getProdservConsumidos().add(p3);c16.getProdservConsumidos().add(p1);
		Cliente c17 = new Cliente("Humberto dos Santos2", "Cliente Um2", new CPF(null, "22222222222"), "homem");
		c17.getProdservConsumidos().add(p12);c17.getProdservConsumidos().add(p14);c17.getProdservConsumidos().add(p13);c17.getProdservConsumidos().add(p10);
		Cliente c18 = new Cliente("Doisilda Soares2", "Cliente Dois2", new CPF(null, "12312312312"), "mulher");
		c18.getProdservConsumidos().add(p17);c18.getProdservConsumidos().add(p16);c18.getProdservConsumidos().add(p11);
		Cliente c19 = new Cliente("João Cortrês2", "Cliente Três2", new CPF(null, "12312432312"), "homem");
		c19.getProdservConsumidos().add(p15);c19.getProdservConsumidos().add(p19);
		Cliente c20 = new Cliente("Torquatro de Oliveira2", "Cliente Quatro2", new CPF(null, "12312444412"), "homem");
		c20.getProdservConsumidos().add(p4);c20.getProdservConsumidos().add(p5);c20.getProdservConsumidos().add(p16);
		Cliente c21 = new Cliente("Suelen Cinqueira2", "Cliente Cinco2", new CPF(null, "12555512312"), "mulher");
		c21.getProdservConsumidos().add(p12);c21.getProdservConsumidos().add(p11);c21.getProdservConsumidos().add(p18);c21.getProdservConsumidos().add(p17);c21.getProdservConsumidos().add(p20);
		Cliente c22 = new Cliente("ConSeisção Moura2", "Cliente Seis2", new CPF(null, "12312666312"), "mulher");
		c22.getProdservConsumidos().add(p7);c22.getProdservConsumidos().add(p8);c22.getProdservConsumidos().add(p10);
		Cliente c23 = new Cliente("Setembrina Silva2", "Cliente Sete2", new CPF(null, "17772312312"), "mulher");
		c23.getProdservConsumidos().add(p15);c23.getProdservConsumidos().add(p19);c23.getProdservConsumidos().add(p18);
		Cliente c24 = new Cliente("Oiton Bastos2", "Cliente Oito2", new CPF(null, "12388812312"), "homem");
		c24.getProdservConsumidos().add(p2);c24.getProdservConsumidos().add(p3);
		Cliente c25 = new Cliente("Courtney Nove2", "Cliente Nove2", new CPF(null, "12319992312"), "mulher");
		c25.getProdservConsumidos().add(p10);c25.getProdservConsumidos().add(p7);c25.getProdservConsumidos().add(p15);c25.getProdservConsumidos().add(p5);
		Cliente c26 = new Cliente("Dézcio Amarante2", "Cliente De2z", new CPF(null, "12312101012"), "homem");
		c26.getProdservConsumidos().add(p2);c26.getProdservConsumidos().add(p13);
		Cliente c27 = new Cliente("Marionze Neves2", "Cliente Onze2", new CPF(null, "12311111312"), "mulher");
		c27.getProdservConsumidos().add(p12);c27.getProdservConsumidos().add(p20);c27.getProdservConsumidos().add(p9);c27.getProdservConsumidos().add(p19);c27.getProdservConsumidos().add(p1);c27.getProdservConsumidos().add(p8);c27.getProdservConsumidos().add(p8);
		Cliente c28 = new Cliente("Dozelina Félix2", "Cliente Doze2", new CPF(null, "17772987312"), "mulher");
		c28.getProdservConsumidos().add(p13);c28.getProdservConsumidos().add(p18);c28.getProdservConsumidos().add(p6);
		Cliente c29 = new Cliente("Tereza Porto2", "Cliente Treze2", new CPF(null, "17131312312"), "mulher");
		c29.getProdservConsumidos().add(p16);c29.getProdservConsumidos().add(p14);c29.getProdservConsumidos().add(p4);
		Cliente c30 = new Cliente("Rebeca Torze2", "Cliente Quatorze2", new CPF(null, "17714142312"), "mulher");
		c30.getProdservConsumidos().add(p2);c30.getProdservConsumidos().add(p3);c30.getProdservConsumidos().add(p18);
		listadeclientes.add(c1); listadeclientes.add(c2); listadeclientes.add(c3);
		listadeclientes.add(c4); listadeclientes.add(c5); listadeclientes.add(c6);
		listadeclientes.add(c7); listadeclientes.add(c8); listadeclientes.add(c9);
		listadeclientes.add(c10); listadeclientes.add(c11); listadeclientes.add(c12);
		listadeclientes.add(c13); listadeclientes.add(c14); listadeclientes.add(c15);
		listadeclientes.add(c16); listadeclientes.add(c17); listadeclientes.add(c18);
		listadeclientes.add(c19); listadeclientes.add(c20); listadeclientes.add(c21);
		listadeclientes.add(c22); listadeclientes.add(c23); listadeclientes.add(c24);
		listadeclientes.add(c25); listadeclientes.add(c26); listadeclientes.add(c27);
		listadeclientes.add(c28); listadeclientes.add(c29); listadeclientes.add(c30);
		empresa.setClientes(listadeclientes);
		
		
		boolean execucao = true;
		while (execucao) {
			System.out.println("Que tipo de operação você deseja fazer:");
			System.out.println("1 - Cadastrar cliente");
			System.out.println("2 - Listar todos os clientes");
			System.out.println("3 - Atualizar dados de Cliente");
			System.out.println("4 - Deletar Cliente");
			System.out.println("5 - Cadastrar produto ou serviço");
			System.out.println("6 - Listar todos os produtos e serviços");
			System.out.println("7 - Atualizar informações de produtos e serviços");
			System.out.println("8 - Deletar produto ou serviço");
			System.out.println("9 - Registrar consumo");
			System.out.println("10 - Listagem de clientes por gênero");
			System.out.println("11 - Lista dos 10 maiores consumidores (em quantidade)");
			System.out.println("12 - Lista dos 10 menores consumidores (em quantidade)");
			System.out.println("13 - Lista dos 5 maiores consumidores (em valores)");
			System.out.println("14 - Listagem geral dos produtos e serviços mais consumidos");
			System.out.println("15 - Lista dos produtos e serviços mais consumidos por gênero");
			System.out.println("0 - Sair");

			Entrada entrada = new Entrada();
			int operacao = entrada.receberNumeroInteiro();

			switch (operacao) {
			case 0:
				execucao = false;
				System.out.println("Até mais!\n");
				break;
			case 1:
				Cadastro cadastro = new CadastroCliente(empresa.getClientes());
				cadastro.cadastrar();
				break;
			case 2:
				Listagem listagem = new ListarTodosClientes(empresa.getClientes());
				listagem.listar();
				break;
			case 3:
				Atualizar atualizacli = new AtualizarCliente(empresa.getClientes());
				atualizacli.atualizar();
				break;
			case 4:
				Delete delecao = new DeletarCliente(empresa.getClientes());
				delecao.deletar();
				break;
			case 5:
				Cadastro cadastrops = new CadastroProduto(empresa.getProdserv());
				cadastrops.cadastrar();
				break;
			case 6:
				Listagem listagemps = new ListarTodosProdutos(empresa.getProdserv());
				listagemps.listar();
				break;
			case 7:
				Atualizar atualizaps = new AtualizarProduto(empresa.getProdserv());
				atualizaps.atualizar();
				break;
			case 8:
				Delete delecaops = new DeletarProdServ(empresa.getProdserv());
				delecaops.deletar();
				break;
			case 9:
				RegistroConsumo registroconsumo = new RegistroConsumo(empresa.getClientes(), empresa.getProdserv());
				registroconsumo.registrarConsumo();
				break;
			case 10:
				Listagem listagenero = new ListagemGenero(empresa.getClientes());
				listagenero.listar();
			case 11:
				Listagem lista10maisq = new Listagem10MaiorConsumoq(empresa.getClientes());
				lista10maisq.listar();
				break;
			case 12:
				Listagem lista10menosq = new Listagem10menorconsumoq(empresa.getClientes());
				lista10menosq.listar();
				break;
			case 13:
				Listagem lista5maisv = new Listagem5valor(empresa.getClientes());
				lista5maisv.listar();
				break;
			case 14:
				Listagem listaprod = new Listagemdevendas(empresa.getClientes(), empresa.getProdserv());
				listaprod.listar();
				break;
			case 15:
				Listagem listapg = new ListagemProdGen(empresa.getClientes(), empresa.getProdserv());
				listapg.listar();
				break;
			default:
				System.out.println("Operação não entendida");
			}
		}
	}
}