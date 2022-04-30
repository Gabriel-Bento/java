package controller;

import dao.AlunoDao;
import model.Aluno;
import model.Conexao;

public class TestaConexao {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setNome("Gabriel da Silva");
		aluno.setCpf("664.445.799-69");
		aluno.setFone("(42)32240705");

		if (Conexao.conectar()) {
			
			AlunoDao dao = new AlunoDao(Conexao.getConexao());
			if (dao.inserir(aluno))
				System.out.println("Dados salvos");
			else
				System.out.println("Erro ao salvar");
			
			
			
			
			Conexao.fecharConexao();
			
		} else
			System.out.println("Falha de conexão com o banco");

	}

}
