package exemplo_interface;

// uma interface è como uma classe 100% abstrata
// ou seja, todos os métodos são implicitamente abstratos.
// Você pode interpretar uma interface como sendo um contrato
public interface ControleRemoto {

	// imolicitamente público e abstrato
	void mudarCanal(int canal);

	void aumentarVolume(int taxa);

	void diminuirVolume(int taxa);

	boolean ligar();

	boolean desligar();

}
