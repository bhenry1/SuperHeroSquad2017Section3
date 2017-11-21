package application.WorldMap;

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

public class WorldMapModel 
{
	Media media;
	MediaPlayer mp;

	
	public void goToMorestet(ActionEvent event) throws IOException
	{
		Parent root = FXMLLoader.load(Main.class.getResource("Morestet/MorestetView.fxml"));
    	Scene scene2 = new Scene(root);
		Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow());  
    	window.setScene(scene2);
    	window.show();
		
	}
	
	public void goToMonetonc(ActionEvent event) throws IOException
	{
		Parent root = FXMLLoader.load(Main.class.getResource("Monetonc/MonetoncView.fxml"));
    	Scene scene2 = new Scene(root);
		Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow());  
    	window.setScene(scene2);
    	window.show();
		
	}
	
	
	public void goToHifenour(ActionEvent event) throws IOException
	{
		Parent root = FXMLLoader.load(Main.class.getResource("Hifenour/HifenourView.fxml"));
    	Scene scene2 = new Scene(root);
		Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow());  
    	window.setScene(scene2);
    	window.show();
		
	}
	
	public void goToClourtav(ActionEvent event) throws IOException
	{
		Parent root = FXMLLoader.load(Main.class.getResource("Clourtav/ClourtavView.fxml"));
    	Scene scene2 = new Scene(root);
		Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow());  
    	window.setScene(scene2);
    	window.show();
		
	}
	
	public void goToHackipon(ActionEvent event) throws IOException
	{
		Parent root = FXMLLoader.load(Main.class.getResource("Hackipon/HackiponView.fxml"));
    	Scene scene2 = new Scene(root);
		Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow());  
    	window.setScene(scene2);
    	window.show();
		
	}
	
	public void goToArthur(ActionEvent event) throws IOException
	{
		Parent root = FXMLLoader.load(Main.class.getResource("Arthur/ArthurView.fxml"));
    	Scene scene2 = new Scene(root);
		Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow());  
    	window.setScene(scene2);
    	window.show();
		
	}
	
	
	public void goToGatesOfHell(ActionEvent event) throws IOException
	{
		Parent root = FXMLLoader.load(Main.class.getResource("GatesOfHell/GatesOfHellView.fxml"));
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
	
	
	public void playMusic() throws URISyntaxException
	{
		media = new Media(getClass().getResource("/music/CityMusic.mp3").toURI().toString());
		mp = new MediaPlayer(media);
		mp.setAutoPlay(true);
		mp.setVolume(0.1);
		
		mp.setOnEndOfMedia(new Runnable()
		{
			public void run()
			{
				mp.seek(Duration.ZERO);
			}
		});
		mp.play();
	}
	
	public void stopMusic()
	{
		mp.stop();
	}
	
	
	
	
	
}
