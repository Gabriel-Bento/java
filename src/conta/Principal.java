package conta;

public class Principal {

	public static void main(String[] args) {
		ContaCorrente contaJoao = new ContaCorrente(1000, 1234);
		ContaCorrente contaMaria = new ContaCorrente(2000 , 4567);

		contaJoao.depositar(100);
		contaJoao.depositar(100);
		contaJoao.depositar(100);
		
		// System.out.println("N�mero da conta do Jo�o: " + contaJoao.getNumero());
		
		contaJoao.setLimite(1500);
		System.out.println("Limite da conta Jo�o: R$ " + contaJoao.getLimite());
		
		System.out.println("Saldo atual: R$ " + contaJoao.getSaldo());

		if (contaJoao.transfirir(contaMaria, 100))
			System.out.println("Transfer�ncia OK");
		else
			System.out.println("Sem saldo para tranfer�ncia");

		if (contaJoao.sacar(30))
			System.out.println("Conseguiu sacar");
		else
			System.out.println("N�o conseguiu sacar");
		
		System.out.println(contaJoao);

		// System.out.println("Saldo da conta: " + contaJoao.getSaldo());
	}

}
