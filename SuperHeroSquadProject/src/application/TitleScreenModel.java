package application;

import java.io.IOException;
import java.net.URISyntaxException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;

public class TitleScreenModel 
{
	
	
	MediaPlayer mp;
	
	public void exitGame()
	{
		System.exit(0);
	}
	
	public void changeToSaveScreen(ActionEvent event) throws IOException
	{
		Parent secondPane = FXMLLoader.load(getClass().getResource("SaveDataScreen.fxml"));
    	Scene scene2 = new Scene(secondPane);
    	
    	Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow());  
    	window.setScene(scene2);
    	window.show();
	}
	
	public void newGameScreen(ActionEvent event) throws IOException
	{
		Parent secondPane = FXMLLoader.load(getClass().getResource("NewGameView.fxml"));
    	Scene scene2 = new Scene(secondPane);
    	
    	Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow());  
    	window.setScene(scene2);
    	window.show();
	}
	
	public void playMusic(String startButton) throws URISyntaxException
	{
		
		
		Media media = new Media(getClass().getResource("/music/introMusic.mp3").toURI().toString());
		mp = new MediaPlayer(media);
		
		mp.setAutoPlay(true);
		mp.setVolume(0.2);
		
		mp.setOnEndOfMedia(new Runnable()
		{
			public void run()
			{
				mp.seek(Duration.ZERO);
			}
		});
		mp.play();
		
		
		
	}
	
	public void stopMusic() throws URISyntaxException
	{
		mp.stop();
	}
	
	
}
