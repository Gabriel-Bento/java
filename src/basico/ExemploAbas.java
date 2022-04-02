package basico;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ExemploAbas extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception {
		TabPane painel = new TabPane();

		// cria as abas do painel
		Tab aba1 = new Tab("Produto");
		Tab aba2 = new Tab("Fornecedor");
		Tab aba3 = new Tab("Cliente");

		painel.getTabs().addAll(aba1, aba2, aba3);
		painel.setMinSize(600, 300);

		aba1.setClosable(false);
		aba2.setClosable(false);
		aba3.setClosable(false);

		aba1.setContent(new Label("Esta aba foi criada contendo um texto"));
		aba2.setContent(new Button("Contém um botão"));

		Rectangle retCiano = new Rectangle(500, 250);
		retCiano.setFill(Color.CYAN);
		aba3.setContent(retCiano);

		Scene cena = new Scene(painel);
		stage.setTitle("Exemplo de Painel com Abas");
		stage.setScene(cena);
		stage.show();

	}

}
