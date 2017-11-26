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
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;

public class GatesOfHellControl implements Initializable
{
	
	GatesOfHellModel gohm = new GatesOfHellModel();
	
	public MediaPlayer mp;
	public MediaPlayer mp2;


    @FXML
    public Button enterButton;

    @FXML
    public Button menuBtn;

    @FXML
    public AnchorPane pane;

    @FXML
    public Button backToWMbtn;

    @FXML
    public ImageView Morestet;
    
    public int four;

    public boolean stop;
    
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
    void enterFinalBoss(ActionEvent event) throws IOException, URISyntaxException 
    {
    	mp.stop();
    	Media media = new Media(getClass().getResource("/music/DoorCreek.mp3").toURI().toString());
		mp2 = new MediaPlayer(media);
		mp2.setVolume(0.5);
		mp2.play();
		makeFadeOut();

		
    }
    
    private void makeFadeOut() 
    {

		 FadeTransition fadeTrans = new FadeTransition();
		 fadeTrans.setDuration(Duration.millis(8000));
		 fadeTrans.setNode(pane);
		 fadeTrans.setFromValue(1);
		 fadeTrans.setToValue(0);
		 fadeTrans.play();
		 
		 fadeTrans.setOnFinished((ActionEvent event) ->
		 {
			try 
			{

				loadNextScene(event);
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			
		 });		
	}

	private void loadNextScene(ActionEvent event) throws IOException 
	{
		FXMLLoader loader = new FXMLLoader(Main.class.getResource("GatesOfHell/finalWarning.fxml"));
		Parent root = (Parent) loader.load();



		
    	Scene scene2 = new Scene(root);
		Stage newWindow = (Stage) pane.getScene().getWindow();
		newWindow.setScene(scene2);
		newWindow.show(); 			
	}

	public void stopMusic()
    {
    	mp.stop();
    	System.out.println("Hello?");
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		
	
		
		
		try
		{
			Media media = new Media(getClass().getResource("/music/TheGatesOfHell.mp3").toURI().toString());
			mp = new MediaPlayer(media);
			mp.setVolume(0.5);

			mp.play();
			
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
