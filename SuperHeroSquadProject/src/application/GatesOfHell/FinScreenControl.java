package application.GatesOfHell;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.animation.FadeTransition;
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
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FinScreenControl implements Initializable
{

	MediaPlayer mp;
    @FXML
    private Button newGameBtn;

    @FXML
    private ImageView backgroundImage;

    @FXML
    private Label devolpedByLabel;

    @FXML
    private ImageView superHeroSquadLogo;

    @FXML
    private AnchorPane parentPane;

    @FXML
    private Label finLabel;

  
    @FXML
    void startOver(ActionEvent event) throws IOException 
    {
    	mp.stop();
    	Parent root = FXMLLoader.load(Main.class.getResource("TitleScreen.fxml"));
    	Scene scene2 = new Scene(root);
		Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow());  
    	window.setScene(scene2);
    	window.show();
    	
    }
    
    private void fadeInTransition() 
	{
		 FadeTransition fadeTrans = new FadeTransition();
		 fadeTrans.setDuration(Duration.millis(3000));
		 fadeTrans.setNode(parentPane);
		 fadeTrans.setFromValue(0);
		 fadeTrans.setToValue(1);
		 fadeTrans.play();
		
	}


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) 
	{
		fadeInTransition();		

		try
		{
			Media media = new Media(getClass().getResource("/music/Fin.mp3").toURI().toString());
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
