package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import model.Aluno;

public class AlunoDao implements Dao<Aluno> {

	private Connection conexao;

	public AlunoDao(Connection conexao) {
		this.conexao = conexao;
	}

	@Override
	public boolean inserir(Aluno aluno) {
		String sql = "INSERT INTO Aluno (nome, cpf, fone) VALUES (?, ?, ?)";

		PreparedStatement cmd;
		try {
			cmd = conexao.prepareStatement(sql);
			cmd.setString(1, aluno.getNome());
			cmd.setString(2, aluno.getCpf());
			cmd.setString(3, aluno.getFone());
			// retorna o número de linhas afetadas: 1
			int retorno = cmd.executeUpdate();
			return retorno > 0;

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean atualizar() {

		return false;
	}

	@Override
	public Aluno buscar(long id) {

		return null;
	}

	@Override
	public boolean apagar(long id) {

		return false;
	}

	@Override
	public List<Aluno> listar() {

		return null;
	}

}
