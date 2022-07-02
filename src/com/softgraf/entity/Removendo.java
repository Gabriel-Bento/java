package com.softgraf.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.softgraf.util.JpaUtil;

public class Removendo {

	public static void main(String[] args) {
		EntityManager em = JpaUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();

		Cliente cliente = em.find(Cliente.class, 1);

		em.remove(cliente);

		tx.begin();

		em.close();
		JpaUtil.close();

	}

}
