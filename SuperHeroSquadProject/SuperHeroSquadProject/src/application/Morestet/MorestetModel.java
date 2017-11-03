package application.Morestet;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MorestetModel 
{

	public void rtnToWorldMao(ActionEvent event) throws IOException
	{
	
		Parent root = FXMLLoader.load(Main.class.getResource("WorldMap/WorldMapView.fxml"));
    	Scene scene2 = new Scene(root);
		Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow());  
    	window.setScene(scene2);
    	window.show();
		
	}
	
	public void goToMInn(ActionEvent event) throws IOException
	{
	
		Parent root = FXMLLoader.load(Main.class.getResource("CityElements/InnView.fxml"));
    	Scene scene2 = new Scene(root);
		Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow());  
    	window.setScene(scene2);
    	window.show();
		
	}
	
	
	
	
	
	public void goToMDungeon(ActionEvent event) throws IOException
	{
	
		Parent root = FXMLLoader.load(Main.class.getResource("Dungeons/MorestetDungeon.fxml"));
    	Scene scene2 = new Scene(root);
		Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow());  
    	window.setScene(scene2);
    	window.show();
		
	}
	
}
