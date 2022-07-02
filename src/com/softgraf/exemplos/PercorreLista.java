package com.softgraf.exemplos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PercorreLista {

	public static void main(String[] args) {
		List<String> frutas = new ArrayList();
		frutas.add("uva");
		frutas.add("maçã");
		frutas.add("banana");
		frutas.add("laranja");
		frutas.add("kiwi");

		System.err.println("Percorrendo a lista com for normal");
		for (int i = 0; i < frutas.size(); i++) {
			System.out.println(frutas.get(i));
		}

		System.out.println("\nPercorrendo com for each");
		for (String f : frutas) {
			System.out.println(f);
		}

		// a paratir do java 8
		System.out.println("\nPercorrendo a lista com for each funcional");
		frutas.forEach(System.out::println);

		System.out.println("\nPercorrendo a coleção com Iterator");
		// obtém o interator da lista
		Iterator<String> iterator = frutas.iterator();
		while (iterator.hasNext())
			System.out.println(iterator.hasNext());

	}

}
