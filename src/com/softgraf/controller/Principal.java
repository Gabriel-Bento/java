package com.softgraf.controller;

import java.util.Date;

import com.softgraf.model.Cliente;
import com.softgraf.model.Endereco;
import com.softgraf.model.Item;
import com.softgraf.model.Pedido;
import com.softgraf.model.Produto;

public class Principal {

	public static void main(String[] args) {
		Produto p1 = new Produto("123", "Melhoral Infantil", 1.99f);

		System.out.println(p1);

		Produto p2 = new Produto("456", "Vitamina D com Zinco", 49.99f);

		Endereco ruaXv = new Endereco();
		ruaXv.setRua("XV de Novembro, 123");
		ruaXv.setCidade("Ponta Grossa");
		ruaXv.setEstado("Paraná");
		ruaXv.setCep("84010-080");

		System.out.println(ruaXv.getRua());
		System.out.println(ruaXv.getCidade());
		System.out.println(ruaXv.getEstado());
		System.out.println(ruaXv.getCep());

		Cliente joao = new Cliente();
		joao.setCodigo("C999");
		joao.setNome("João da Silva");
		joao.setEndereco(ruaXv);

		System.out.println(joao.getCodigo());
		System.out.println(joao.getNome());
		System.out.println(joao.getEndereco().getRua());

		Pedido ped1 = new Pedido();
		ped1.setNumero(3333);
		ped1.setData(new Date());
		ped1.setCliente(joao);

		System.out.println(ped1.getNumero());
		System.out.println(ped1.getData());
		System.out.println(ped1.getCliente().getNome());

		Item item1 = new Item();
		item1.setNumero(1);
		item1.setQtdeProduto(10);
		item1.setProduto(p1);

		Item item2 = new Item();
		item2.setNumero(2);
		item2.setQtdeProduto(20);
		item2.setProduto(p2);

		System.out.println(item1.getNumero());
		System.out.println(item1.getQtdeProduto());
		System.out.println(item1.getProduto().getDescricao());

		System.out.println(item2.getNumero());
		System.out.println(item2.getQtdeProduto());
		System.out.println(item2.getProduto().getDescricao());

		ped1.addItem(item1);
		ped1.addItem(item2);

		System.out.println(ped1.listaItens().get(0).getNumero());
		System.out.println(ped1.listaItens().get(0).getProduto().getDescricao());
		System.out.println(ped1.listaItens().get(0).getQtdeProduto());

		System.out.println(ped1.listaItens().get(1).getNumero());
		System.out.println(ped1.listaItens().get(1).getProduto().getDescricao());
		System.out.println(ped1.listaItens().get(1).getQtdeProduto());

	}

}
