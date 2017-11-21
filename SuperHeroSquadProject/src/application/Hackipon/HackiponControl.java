package application.Hackipon;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

public class HackiponControl implements Initializable
{
	
	HackiponModel hpm = new HackiponModel();
	MediaPlayer mp;

    @FXML
    private Button dungeonbtn;

    @FXML
    private Button tavernBtn;

    @FXML
    private Label cityLabel;

    @FXML
    private Button shopButton;

    @FXML
    private Button menuBtn;

    @FXML
    private AnchorPane pane;

    @FXML
    private Button backToWMbtn;

    @FXML
    private Button puzzleBtn;

    @FXML
    private ImageView Morestet;

    @FXML
    private Button innBtn;

    @FXML
    void returnToWM(ActionEvent event) throws IOException 
    {
    	hpm.rtnToWorldMap(event);
    	mp.stop();

    }

    @FXML
    void openMenu(ActionEvent event) throws IOException 
    {
    	hpm.goToMainMenu(event);
    }

    @FXML
    void enterDungeon(ActionEvent event) throws IOException 
    {
    	hpm.goHDungeon(event);
    	mp.stop();
    }

    @FXML
    void startPuzzle(ActionEvent event) throws IOException 
    {
    	hpm.goToRiddle(event);
    }

    @FXML
    void enterTavern(ActionEvent event) throws IOException 
    {
    	hpm.goToTavern(event);
    }

    @FXML
    void enterShop(ActionEvent event) throws IOException
    {
    	hpm.goToShop(event);
    }

    @FXML
    void enterInn(ActionEvent event) throws IOException 
    {
    	hpm.goToAInn(event);
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		try
		{
			Media media = new Media(getClass().getResource("/music/CityMusic.mp3").toURI().toString());
			mp = new MediaPlayer(media);
			mp.play();
			mp.setVolume(0.5);
			
			//Test this and add to rest of classes with music
			mp.setOnEndOfMedia(new Runnable() 
			{
			       public void run() 
			       {
			         mp.seek(Duration.ZERO);
			       }
			   });
			  mp.play();
		}
		catch (URISyntaxException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	// TODO 
		
	}

}
