package enumeracao;

public class Teste {

	public static void main(String[] args) {
		Semana dia = Semana.SEGUNDA;
		
		for (Semana s : Semana.values()) {
			System.out.println(s);
		}

	}

}
