package application;
	
import java.io.IOException;
import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	@Override
	public void start(Stage stage) throws IOException {
		URL ressource = Main.class.getResource("../view/menu.fxml"); 
		Parent root = FXMLLoader.load(ressource);
		Scene scene = new Scene(root);	
		stage.setTitle("MashApp");
		stage.setResizable(false);
		stage.setScene(scene);
		stage.show();
	}
	
	public void menu(Stage stage) throws IOException {
		URL ressource = Main.class.getResource("../view/Menu.fxml"); 
		Parent root = FXMLLoader.load(ressource);
		Scene scene = new Scene(root);	
		stage.setTitle("MashApp");
		stage.setResizable(false);
		stage.setScene(scene);
		stage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
