package view;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.stage.Stage;

public class SignUpController implements Initializable{
	    @FXML
	    private JFXTextField nom;

	    @FXML
	    private JFXTextField password;

	    @FXML
	    private JFXTextField passwordVerif;

	    @FXML
	    private JFXTextField gmailAdress;

	    @FXML
	    private JFXButton signUpButton;

	    @FXML
	    public void handleSignUpButton(ActionEvent event) {
	    	Node source=(Node) event.getSource();
	    	Stage stage = (Stage)source.getScene().getWindow();
	    	stage.close();
	    }
	   
	    
		@Override
		public void initialize(URL location, ResourceBundle resources) {
			// TODO Auto-generated method stub
			
		}

}
