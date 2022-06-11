package com.softgraf.control;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.softgraf.entity.Cliente;

public class TesteInicial {

	public static void main(String[] args) {
		Cliente joao = new Cliente();
		joao.setNome("João da Silva");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("softgraf_pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		em.persist(joao);
		tx.commit();
		
		em.close();
		emf.close();

	}

}
