package com.softgraf.control;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Principal extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		// encontra o caminho do FXML
		URL fxml = this.getClass().getResource("/com/softgraf/view/TelaCalc.fxml");
		// agora carrega o FXML para uma variável java
		Parent painel = (Parent) FXMLLoader.load(fxml);

		stage.setScene(new Scene(painel));
		stage.setTitle("Calculadora FX");
		stage.setResizable(false);
		stage.show();

	}

}
