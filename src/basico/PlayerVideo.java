package basico;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.AudioClip;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PlayerVideo extends Application {

	public static void main(String[] args) {
		System.out.println("\nCarregando audio da web...");
		launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception {

		// carrega o clip de áudio
		AudioClip audio = new AudioClip("https://softgraf.com/cursojava/multimidia/musica.wav");

		StackPane painel = new StackPane();
		painel.getChildren().add(new Text("Tocando Música..."));

		Scene cena = new Scene(painel, 300, 100);
		stage.setTitle("Tocando áudio com JavaFX");
		stage.setScene(cena);
		stage.show();

		// toca o ádio
		audio.play();

	}

}
