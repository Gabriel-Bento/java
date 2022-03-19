package poo;

// Gol É UM automovel e TEM um rádio
public class Gol extends Automovel implements Radio{

	// construtor da classe filha chama o construtor da classe mãe
	public Gol(Motor motor) {
		super(motor);

	}

	@Override
	public void tocarMusica() {
		System.out.println("AE EEE AO OOO");
		
		
	}

}
