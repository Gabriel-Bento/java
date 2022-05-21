package model;

public class Produto {

	// atributos ou variáveis da classe
	// campos do objeto
	// modificadores de variáveis: private, default, protected, public
	// public: todas as classes de qualquer pacote podem acessar
	// private: somente a classe pode acessar
	// default (sem nada): igual ao protected, porém pode ser acessado através de
	// herança

	// encapsulamento de variáveis => private
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
	
	// sobrescrita de método
	@Override
	public String toString() {
		return String.format("\nNome: %-20s Quantidade: %-7d Preço: R$ %-7.2f", nome, qtdeEstoque, precoUnitario);
	}

}
