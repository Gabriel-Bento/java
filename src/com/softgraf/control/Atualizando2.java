package com.softgraf.control;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.softgraf.entity.Cliente;
import com.softgraf.util.JpaUtil;

public class Atualizando2 {

	public static void main(String[] args) {
		EntityManager em = JpaUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();

		tx.begin();

		// Recupera o cliente Luiz pelo id
		Cliente cliente = em.find(Cliente.class, 16);
		cliente.setNome("Márcio Oliveira dos Santos");
		cliente.getEndereco().setRua("XV de Novembro, 333");

		tx.commit();

		em.close();
		JpaUtil.close();

	}

}
