package application.GatesOfHell;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

public class GatesOfHellControl implements Initializable
{
	
	GatesOfHellModel gohm = new GatesOfHellModel();
	MediaPlayer mp;

    @FXML
    private Button enterButton;

    @FXML
    private Button menuBtn;

    @FXML
    private AnchorPane pane;

    @FXML
    private Button backToWMbtn;

    @FXML
    private ImageView Morestet;

    @FXML
    void returnToWM(ActionEvent event) throws IOException 
    {
    	gohm.rtnToWorldMap(event);
    	mp.stop();

    }

    @FXML
    void openMenu(ActionEvent event) throws IOException 
    {
    	gohm.goToMainMenu(event);
    }

    @FXML
    void enterFinalBoss(ActionEvent event) 
    {
    	mp.stop();
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		try
		{
			Media media = new Media(getClass().getResource("/music/TheGatesOfHell.mp3").toURI().toString());
			mp = new MediaPlayer(media);
			mp.play();
			mp.setVolume(0.3);
			
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
