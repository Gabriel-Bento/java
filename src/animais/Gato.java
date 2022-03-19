package animais;

public class Gato extends Mamifero {

	public void miar() {
		System.out.println("Gato miando...");

	}

	// sobrescrita = override
	@Override
	public void locomover() {
		System.out.println("Gato correndo...");
	}

}
