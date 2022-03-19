package conta;

public abstract class Conta {
	private int numero;
	private float saldo;

	public Conta(int numero) {
		this.numero = numero;
	}

	// getters
	public float getSaldo() {
		return saldo;
	}

	public int getNumero() {
		return numero;
	}

	public boolean sacar(float valor) {
		if (getSaldo() >= valor) {
			this.saldo -= valor;
			return true;
		} else

			return false;
	}

	public void depositar(float valor) {
		this.saldo += valor;

	}

	public boolean transfirir(Conta para, float valor) {
		if (sacar(valor)) {
			para.depositar(valor);
			return true;
		}

		return false;
	}
	
	@Override
	public String toString() {
		return String.format("Conta Nr. %-10d Saldo R$ %.2f", getNumero(), getSaldo());
	}

}
