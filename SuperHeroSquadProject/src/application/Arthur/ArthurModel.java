package application.Arthur;

import java.io.IOException;
import java.net.URISyntaxException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ArthurModel 
{
	Media media;
	MediaPlayer mp;
		
	public void rtnToWorldMap(ActionEvent event) throws IOException
	{
		Parent root = FXMLLoader.load(Main.class.getResource("WorldMap/WorldMapView.fxml"));
    	Scene scene2 = new Scene(root);
		Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow());  
    	window.setScene(scene2);
    	window.show();
	}
	
	public void goToAInn(ActionEvent event) throws IOException
	{
		Parent root = FXMLLoader.load(Main.class.getResource("CityElements/InnView.fxml"));
    	Scene scene2 = new Scene(root);
		Stage innWindow = new Stage();  
    	innWindow.setScene(scene2);
    	innWindow.show();
	}
	
	public void goToTavern(ActionEvent event) throws IOException
	{
		Parent root = FXMLLoader.load(Main.class.getResource("CityElements/TavernView.fxml"));
    	Scene scene2 = new Scene(root);
		Stage innWindow = new Stage();  
    	innWindow.setScene(scene2);
    	innWindow.show();
	}
	
	public void goToShop(ActionEvent event) throws IOException
	{
		Parent root = FXMLLoader.load(Main.class.getResource("CityElements/ShopView.fxml"));
    	Scene scene2 = new Scene(root);
		Stage innWindow = new Stage();  
    	innWindow.setScene(scene2);
    	innWindow.show();
	}
	
	public void goToRiddle(ActionEvent event) throws IOException
	{
		Parent root = FXMLLoader.load(Main.class.getResource("CityElements/RiddleView.fxml"));
    	Scene scene2 = new Scene(root);
		Stage innWindow = new Stage();  
    	innWindow.setScene(scene2);
    	innWindow.show();
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
	
	public void goToDungeon(ActionEvent event) throws IOException
	{
		Parent root = FXMLLoader.load(Main.class.getResource("Dungeons/ArthurDungeon.fxml"));
    	Scene scene2 = new Scene(root);
		Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow());  
    	window.setScene(scene2);
    	window.setTitle("Main Menu");
    	window.show();
		
	}
	
	
	
	
	

}
