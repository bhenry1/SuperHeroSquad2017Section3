package application;

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
import javafx.scene.control.TextField;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class SaveFilesControl implements Initializable
{
	SaveFilesModel  model2 = new SaveFilesModel ();

	  @FXML private Label saveFileLabel;
	  
	  @FXML private Button startButton;
	  @FXML private Button backButton;
	  
	  @FXML private TextField saveFile1;
	  @FXML private TextField saveFile2;
	  @FXML private TextField saveFile3;
	  @FXML private TextField saveFile4;
	  @FXML private TextField saveFile5;
	  @FXML private TextField saveFile6;
	  @FXML private TextField saveFile7;
    
MediaPlayer mp;
    @FXML
    void goBackToTitle(ActionEvent event) throws IOException 
    {
		model2.goBack(event);
		mp.stop();
    }

    @FXML
    void save(ActionEvent event) 
    {

    }

    

    @FXML
    void goToWorldMap(ActionEvent event) throws IOException 
    {
    	model2.start(event);
    	mp.stop();
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		NewGameController ngc = new NewGameController();
		
		
		Media media;
		try 
		{
			media = new Media(getClass().getResource("/music/SaveFileMusic.mp3").toURI().toString());
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
