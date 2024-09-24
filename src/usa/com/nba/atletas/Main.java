package usa.com.nba.atletas;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.SplitPane;

public class Main extends Application {
	@Override
	public void start(Stage palcoPrincipal) {

		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("telaUm.fxml"));
			Scene cenario = new Scene(root);
			cenario.getStylesheets().add(getClass().getResource("estilo.css").toExternalForm());
			palcoPrincipal.setScene(cenario);
			
			palcoPrincipal.setTitle("LAAnalytics Brazil LCC");
			
			palcoPrincipal.getIcons().add(new Image(getClass().getResourceAsStream("/usa/com/nba/atletas/bolaicone.png")));
			
			palcoPrincipal.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
