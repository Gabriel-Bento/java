package view;

import java.util.Scanner;
import model.Produto;
import static java.lang.System.out;

public class Tela {

	public static Produto mostrar() {
		
		Scanner teclado = new Scanner(System.in);
		Produto produto = new Produto();
		
		out.println("Nome do produto: ");
		produto.setNome(teclado.nextLine().toUpperCase());
		
		out.println("Quantidade em estoque: ");
		produto.setQtdeEstoque(teclado.nextInt());
		
		out.println("Preço unitário");
		produto.setPrecoUnitario(teclado.nextFloat());
		
		return produto;
		
		

	}

}
