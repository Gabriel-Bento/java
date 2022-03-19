package poo;

public class Bmw extends Automovel implements Radio, Gps, ArCondicionado {

	public Bmw(Motor motor) {
		super(motor);

	}

	@Override
	public void tocarMusica() {
		System.out.println("AE EEE AO OOO");
		
	}

	@Override
	public void gelar() {
		System.out.println("Ar condicionado gelando o ambiente...");
		
	}

	@Override
	public void seguir(Endereco endereco) {
		System.out.println("Vire à esquerda");
		System.out.println("Rode 1km");
		System.out.println("Você chegou ao seu destino!");
		
	}

}
