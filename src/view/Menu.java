package view;

import java.io.PrintStream;
import java.util.Scanner;

public class Menu {

	public static int mostrar() {
		int opcao;

		Scanner teclado = new Scanner(System.in);
		PrintStream s = System.out;
		s.println("####################################");
		s.println("# Bem vindo ao controle de estoque #");
		s.println("1 = cadastrar produtos");
		s.println("2 = imprimir produtos");
		s.println("3 = apagar produto");
		s.println("4 = editar produto");
		s.println("0 = sair do programa");
		do {
			s.println("Qual opção? ");
			opcao = teclado.nextInt();
		} while (opcao < 0 || opcao > 4);

		return opcao;

	}

}
