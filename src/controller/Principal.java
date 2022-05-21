package controller;

import java.util.Scanner;

import model.Armazem;
import model.Produto;
import view.Menu;
import view.Tela;

public class Principal {
	public static void main(String[] args) {
		
		Menu.mostrar(); // PARAMOS AQUI!

		char resp;
		Scanner teclado = new Scanner(System.in);
		Produto produto;

		do {
			produto = Tela.mostrar();
			Armazem.guardar(produto);
			System.out.println("Cadastra outro produto? Sim ou Não ");
			resp = teclado.next().toUpperCase().charAt(0);

		} while (resp == 'S');

		Armazem.imprimir();
	}

}
