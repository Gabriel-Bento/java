package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class LayoutVbox extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception {
		VBox painelVertical = new VBox();
		painelVertical.setSpacing(15);
		painelVertical.setAlignment(Pos.CENTER);
		
		Rectangle retVerde = new Rectangle(500, 250);
		retVerde.setFill(Color.GREEN);

		Rectangle retAzul = new Rectangle(500, 250);
		retAzul.setFill(Color.BLUE);
		
		
		Rectangle retAmarelo = new Rectangle(500, 250);
		retAmarelo.setFill(Color.YELLOW);
		
		painelVertical.getChildren().addAll(retVerde, retAzul, retAmarelo);

		Scene cena = new Scene(painelVertical, 200, 250);
		stage.setTitle("Layout VBox");
		stage.setScene(cena);
		stage.show();

	}

}
