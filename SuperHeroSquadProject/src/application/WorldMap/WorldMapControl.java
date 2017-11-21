package application.WorldMap;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ResourceBundle;

import application.CityElements.RiddleControl;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.shape.Path;
import javafx.util.Duration;

public class WorldMapControl implements Initializable
{
	WorldMapModel wm = new WorldMapModel();

    @FXML
    private Button Monetonc;

    @FXML
    private Button Hackipon;

    @FXML
    private Button gatesOfHell;

    @FXML
    private ImageView WorldMap;

    @FXML
    private Button Clourtav;

    @FXML
    private Button Hifenour;

    @FXML
    private Button Morestet;

    @FXML
    private Button Aruthor;
    
    @FXML
    private Button menuBtn;
    
  String value;
  MediaPlayer mp;
    
   
    @FXML
    void enterMorestet(ActionEvent event) throws IOException, URISyntaxException
    {
    	wm.goToMorestet(event);
    	mp.stop();
    }
  

    @FXML
    void enterMonetonc(ActionEvent event) throws IOException, URISyntaxException 
    {
    	wm.goToMonetonc(event);
    	mp.stop();
    }

    @FXML
    void enterCloutav(ActionEvent event) throws IOException, URISyntaxException 
    {
    	wm.goToClourtav(event);
    	mp.stop();
    }

    @FXML
    void enterHackipon(ActionEvent event) throws IOException, URISyntaxException 
    {
    	wm.goToHackipon(event);
    	mp.stop();

    }

    @FXML
    void enterArthor(ActionEvent event) throws IOException, URISyntaxException 
    {
    	wm.goToArthur(event);
    	mp.stop();

    }

    @FXML
    void enterHifenour(ActionEvent event) throws IOException, URISyntaxException 
    {
    	wm.goToHifenour(event);
    	mp.stop();
    }

    @FXML
    void enterGatesOfHell(ActionEvent event) throws IOException 
    {
    	wm.goToGatesOfHell(event);
    	mp.stop();
    		
    }
    

    @FXML
    void openMenu(ActionEvent event) throws IOException 
    {

    	wm.goToMainMenu(event);
    	
    }
    
    
    
    
    public String getValue(String value)
    {
    	return value;
    }


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) 
	{
		try
		{
			Media media = new Media(getClass().getResource("/music/WorldMapMusic.mp3").toURI().toString());
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
		}
	}

}
