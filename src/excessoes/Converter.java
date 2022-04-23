package excessoes;

public class Converter {

	public static int paraInteiro(String valor) throws MinhaExcessao {
		try {
			int v = Integer.parseInt(valor);
			return v;

		} catch (NumberFormatException e) {
			MinhaExcessao excessao = new MinhaExcessao("Erro de conversão de valor");
			throw excessao;
		}
	}

}
