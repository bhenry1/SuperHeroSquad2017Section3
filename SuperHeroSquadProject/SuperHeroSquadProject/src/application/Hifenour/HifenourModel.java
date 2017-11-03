package application.Hifenour;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HifenourModel 
{

	public void rtnToWorldMap(ActionEvent event) throws IOException
	{
	
		Parent root = FXMLLoader.load(Main.class.getResource("WorldMap/WorldMapView.fxml"));
    	Scene scene2 = new Scene(root);
		Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow());  
    	window.setScene(scene2);
    	window.show();
		
	}
	
	public void goToHInn(ActionEvent event) throws IOException
	{
	
		Parent root = FXMLLoader.load(Main.class.getResource("CityElements/InnView.fxml"));
    	Scene scene2 = new Scene(root);
		Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow());  
    	window.setScene(scene2);
    	window.show();
		
	}
	
}
