package controller;

import java.util.List;

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
			/*
			if (dao.inserir(aluno))
				System.out.println("Dados salvos");
			else
				System.out.println("Erro ao salvar");
			*/
			/*
			
			List<Aluno> lista = dao.listar();
			System.out.println("Quantidade de alunos listados: " + lista.size());
			
			// para cada aluno da lista
			for (Aluno a : lista) {
				System.out.println(a);
			}
			 */
			
			boolean apagou = dao.apagar(33);
			if (apagou)
				System.out.println("Apagou id 2");
			else
				System.out.println("Erro: não apagou");
			
			Conexao.fecharConexao();
			
		} else
			System.out.println("Falha de conexão com o banco");

	}

}
