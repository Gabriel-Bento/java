package controller;

import java.net.URL;

import dao.AlunoDao;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Conexao;

// Application ativa o JavaFX no projeto
public class Principal extends Application {
	
	public static AlunoDao daoAluno = null;

	public static void main(String[] args) {
		if (Conexao.conectar()) {

			daoAluno = new AlunoDao(Conexao.getConexao());
			launch();

			Conexao.fecharConexao();

		} else
			System.out.println("Falha de conexão com o banco");
	}

	@Override
	public void start(Stage stage) throws Exception {
		URL fxml = this.getClass().getResource("/view/Tela.fxml");
		Parent painel = (Parent) FXMLLoader.load(fxml);

		stage.setScene(new Scene(painel));
		stage.setTitle("Cadastro Aluno");
		stage.setResizable(false);
		stage.show();

	}

}
