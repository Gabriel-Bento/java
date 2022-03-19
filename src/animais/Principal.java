package animais;

public class Principal {

	public static void main(String[] args) {
		
		// cria um objeto animal
		Animal animal = new Animal();
		animal.nome = "Tot�";
		animal.especie = "Mam�fero";
		
		
		// a partir do objeto acesso os m�todos
		animal.locomover();
		animal.comer();
		animal.dormir();
		
		
		// cria um objeto do tipo Mamifero
		Mamifero mamifero = new Mamifero();
		mamifero.locomover();
		mamifero.mamar();
		mamifero.comer();
		mamifero.dormir();
		
		
		// cria um objeto do tipo Reptil
		Reptil reptil = new Reptil();
		reptil.rastejar();
		reptil.dormir();
		
		
		// cria um objeto do tipo Ave
		Ave ave = new Ave();
		ave.voar();
		ave.dormir();
		
		
		// cria um objeto do tipo Gato
		Gato gato = new Gato();
		gato.miar();
		gato.dormir();
		gato.locomover();
		
		
		// cria um objeto do tipo Cao
		Cao cao = new Cao();
		cao.latir();
		cao.dormir();
		cao.locomover();
		
		
		
	}

}
