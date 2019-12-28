package view;

import com.jfoenix.controls.JFXButton;
import application.Main;
import model.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class MenuController implements Initializable{

	 @FXML
	    private ResourceBundle resources;

	    @FXML
	    private URL location;

	    @FXML
	    private JFXButton signButton;

	    @FXML
	    private JFXButton helpButton;

	    @FXML
	    private JFXButton formButton;

	    @FXML
	    private JFXButton loginButton;

	    @FXML
	    private JFXButton devButton;

	    @FXML
	    private JFXButton importButton;

	    @FXML
	    void handleDevButton(ActionEvent event) throws IOException {
	    	URL ressource = Main.class.getResource("../view/developpers.fxml"); 
			Parent root = FXMLLoader.load(ressource);
			Scene scene = new Scene(root);	
			System.out.println("parent "+scene.getWidth());
			Stage secondStage = new Stage();
			secondStage.setTitle("MashApp");
			secondStage.setResizable(false);
			secondStage.setScene(scene);
			secondStage.show();
	    }

	    @FXML
	    void handleFormButton(ActionEvent event) {
	    	
	    	
	    }

	    @FXML
	    void handleHelpButton(ActionEvent event) {

	    }

	    @FXML
	    void handleImportButton(ActionEvent event) throws IOException {
	    	FileChooser fileChooser = new FileChooser();
	    	fileChooser.setTitle("Open Resource File");
	    	Stage secondStage = new Stage();
	    	List<File> files = fileChooser.showOpenMultipleDialog(secondStage);
	    	if(files!=null) {
	    		String chemin_filleul=files.get(0).getAbsolutePath();
	    		String chemin_parrain=files.get(1).getAbsolutePath();
	    		Excel.mashapp_algorithme(chemin_filleul, chemin_parrain);
	    		System.out.println(files);
	    	}
	    }

	    @FXML
	    void handleLoginButton(ActionEvent event) {	    	
	    }
	    
	    @FXML
	    void handleSignButton(ActionEvent event) throws IOException {
	    	URL ressource = Main.class.getResource("../view/login.fxml"); 
			Parent root = FXMLLoader.load(ressource);
			Scene scene = new Scene(root);	
			Stage secondStage = new Stage();
			System.out.println(secondStage.getProperties());
			secondStage.setTitle("MashApp");
			secondStage.setResizable(false);
			secondStage.setScene(scene);
			secondStage.show();
			

	    }
   
	    @FXML
	    void initialize() {
	        assert signButton != null : "fx:id=\"signButton\" was not injected: check your FXML file 'menu.fxml'.";
	        assert helpButton != null : "fx:id=\"helpButton\" was not injected: check your FXML file 'menu.fxml'.";
	        assert formButton != null : "fx:id=\"formButton\" was not injected: check your FXML file 'menu.fxml'.";
	        assert loginButton != null : "fx:id=\"loginButton\" was not injected: check your FXML file 'menu.fxml'.";
	        assert devButton != null : "fx:id=\"devButton\" was not injected: check your FXML file 'menu.fxml'.";
	        assert importButton != null : "fx:id=\"importButton\" was not injected: check your FXML file 'menu.fxml'.";

	    }
	    
	    @Override
		public void initialize(URL location, ResourceBundle resources) {
			// TODO Auto-generated method stub

		}
}
