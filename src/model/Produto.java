package model;

public class Produto {

	// atributos ou vari�veis da classe
	// campos do objeto
	// modificadores de vari�veis: private, default, protected, public
	// public: todas as classes de qualquer pacote podem acessar
	// private: somente a classe pode acessar
	// default (sem nada): igual ao protected, por�m pode ser acessado atrav�s de
	// heran�a

	// encapsulamento de vari�veis => private
	private String nome;
	private int qtdeEstoque;
	private float precoUnitario;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtdeEstoque() {
		return qtdeEstoque;
	}

	public void setQtdeEstoque(int qtdeEstoque) {
		this.qtdeEstoque = qtdeEstoque;
	}

	public float getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(float precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	
	// sobrescrita de m�todo
	@Override
	public String toString() {
		return String.format("\nNome: %-20s Quantidade: %-7d Pre�o: R$ %-7.2f", nome, qtdeEstoque, precoUnitario);
	}

}
