package com.softgraf.control;

import java.util.List;

import javax.persistence.EntityManager;

import com.softgraf.entity.Pedido;
import com.softgraf.util.JpaUtil;

public class Listando {

	public static void main(String[] args) {
		EntityManager em = JpaUtil.getEntityManager();

		// lista todos os pedidos da tabela (entidade) pedido
		// JPA usa JPQL (Java Persistence Query language), mas também podemos usar SQL
		// nativo
		List<Pedido> pedidos = em.createQuery("from Pedido", Pedido.class).getResultList();

		System.out.println("Lista de pedidos retornados");
		pedidos.forEach(System.out::println);

	}

}
