package excessoes;

public class ExemploDeExcessao {

	public static void main(String[] args) {

		try {
			int valor = Converter.paraInteiro("123a");
			System.out.println(valor + 1);

		} catch (MinhaExcessao e) {
			System.out.println("Erro na entrada: " + e.getMessage());

		} finally {
			System.out.println("Executa com ou sem excessão!");
		}

		System.out.println("Fim do programa");

	}

}
