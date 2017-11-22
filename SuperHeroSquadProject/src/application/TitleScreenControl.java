package application;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;

public class TitleScreenControl implements Initializable
{
TitleScreenModel model = new TitleScreenModel();
Main view = new Main();
MediaPlayer mp;
   
    @FXML private Button exitGameButton;
    @FXML private Button loadGameButton;
    @FXML private Button newGameButton;

    @FXML private Label matlock;
    @FXML private AnchorPane mainPane;
   
    @FXML private ImageView backgroundImage;

    @FXML
    void exitGameOnClick(ActionEvent event) 
    {
    	model.exitGame();
    }

    
    @FXML
    void LoadGameOnClick(ActionEvent event) throws IOException, URISyntaxException 
    {

    	model.changeToSaveScreen(event);
    	mp.stop();
    	

    }

   

    @FXML
    void newGameOnClick(ActionEvent event) throws IOException 
    {
    	model.newGameScreen(event);
    	mp.stop();
    }
    
    @FXML
    void playMusic(ActionEvent event) 
    {
    	System.out.println("Do stuff");
    		
    }


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) 
	{
		Media media;
		try 
		{
			media = new Media(getClass().getResource("/music/introMusic.mp3").toURI().toString());
			mp = new MediaPlayer(media);
			mp.setVolume(0.5);
			mp.play();
			
			
		
		} 
		catch (URISyntaxException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}







}
