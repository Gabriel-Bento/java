package animais;

public class Cao extends Mamifero {

	public void latir() {
		System.out.println("Cao latindo...");

	}

	// sobrescrita = override
	@Override
	public void locomover() {
		System.out.println("Cao correndo...");
	}

}
