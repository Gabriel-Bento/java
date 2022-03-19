package conta;

// ContaCorrente É UMA Conta
public class ContaCorrente extends Conta {

	private float limite;

	public ContaCorrente(float limite, int numero) {
		super(numero);
		this.limite = limite;
		
	}
	
	public float getLimite() {
		return limite;
	}
	
	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	@Override
	public float getSaldo() {
		return super.getSaldo() + limite;
	}
}

