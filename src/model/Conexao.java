package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	private static String urlConexao = "jdbc:mysql://localhost:3306/escola?useSSL=false&useTimezone=true&serverTimezone=UTC";
	private static String usuario = "root";
	private static String senha = "softgraf";
	private static Connection conexao = null;

	public static boolean conectar() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver OK");

			conexao = DriverManager.getConnection(urlConexao, usuario, senha);

		} catch (ClassNotFoundException e) {
			System.out.println("Driver do banco mysql não encontrado");
			e.printStackTrace();
			return false;

		} catch (SQLException e) {
			System.out.println("Falha de conexão com o banco");
			e.printStackTrace();
			return false;
		}

		System.out.println("Conectou!");
		return true;

	}

	public static Connection getConexao() {
		return conexao;

	}

	public static void fecharConexao() {
		try {
			conexao.close();
			System.out.println("Desconectou!");
		} catch (SQLException e) {
			System.out.println("Falha ao fechat conexão com o banco de dados");
			e.printStackTrace();
		}
	}

}
