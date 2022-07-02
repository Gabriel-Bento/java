package com.softgraf.control;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.softgraf.entity.Cliente;
import com.softgraf.entity.Endereco;
import com.softgraf.util.JpaUtil;

public class Consultando {

	public static void main(String[] args) {
		EntityManager em = JpaUtil.getEntityManager();

		// Buscando cliente contendo a palavra "carlos"
		TypedQuery<Cliente> queryCarlos = em.createQuery("select c from Cliente c where c.nome like '%carlos%'",
				Cliente.class);
		List<Cliente> listaCarlos = queryCarlos.getResultList();
		listaCarlos.forEach(System.out::println);

		// buscando todos os endereços dos clientes
		List<Endereco> lista = em.createQuery("select c.endereco from Cliente c where c.endereco.rua like '%XV%'", Endereco.class)
				.getResultList();
		lista.forEach(System.out::println);
		
		// buscando apenas o nome da cidade do endereço do cliente 'Joao da Silva'
		TypedQuery<String> queryCidade = em.createQuery("select c.endereco.cidade from Cliente c where c.nome = 'Joao da Silva'", String.class);
		String cidade = queryCidade.getSingleResult();
		System.out.println(cidade);
		
		em.close();
		JpaUtil.close();

	}

}
