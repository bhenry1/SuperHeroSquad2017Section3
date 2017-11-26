package application.GatesOfHell;

import java.io.IOException;

import application.Main;
import application.Combat.CombatControl;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class GatesOfHellModel 
{
	public void rtnToWorldMap(ActionEvent event) throws IOException
	{
	
		Parent root = FXMLLoader.load(Main.class.getResource("WorldMap/WorldMapView.fxml"));
    	Scene scene2 = new Scene(root);
		Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow());  
    	window.setScene(scene2);
    	window.show();
		
	}
	
	public void goToMainMenu(ActionEvent event) throws IOException
	{
		Parent root = FXMLLoader.load(Main.class.getResource("MainMenu/MainMenuView.fxml"));
    	Scene scene2 = new Scene(root);
		Stage window = new Stage();  
    	window.setScene(scene2);
    	window.setTitle("Main Menu");
    	window.show();
		
	}
	
	public void goToFinalWarning(ActionEvent event) throws IOException
	{
		/*
		FXMLLoader loader = new FXMLLoader(Main.class.getResource("GatesOfHell/finalWarning.fxml"));
		Parent root = (Parent) loader.load();



		
    	Scene scene2 = new Scene(root);
		Stage newWindow = (Stage) parentPane.getScene().getWindow();
		newWindow.setScene(scene2);
		newWindow.show(); 	
		*/
		
	}
	
}
