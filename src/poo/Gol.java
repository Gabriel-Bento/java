package poo;

// Gol � UM automovel e TEM um r�dio
public class Gol extends Automovel implements Radio{

	// construtor da classe filha chama o construtor da classe m�e
	public Gol(Motor motor) {
		super(motor);

	}

	@Override
	public void tocarMusica() {
		System.out.println("AE EEE AO OOO");
		
		
	}

}
