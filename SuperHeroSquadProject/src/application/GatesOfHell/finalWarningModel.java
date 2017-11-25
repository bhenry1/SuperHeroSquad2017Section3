package application.GatesOfHell;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class finalWarningModel 
{
	public void closeWindow(ActionEvent event) throws IOException
	{
		Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow());  
    	window.close();
		
	}

}
