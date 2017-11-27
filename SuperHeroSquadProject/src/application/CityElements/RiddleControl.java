package application.CityElements;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

import Items.Inventory;
import application.WorldMap.WorldMapControl;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class RiddleControl extends Inventory implements Initializable 
{

    @FXML
    public TextField riddleTextfield;

    @FXML
    public Pane riddlePane;

    @FXML
    public Label riddleHintDisplay;

    @FXML
    public Button checkButton;

    @FXML
    public TextArea riddleTextArea;

    @FXML
    public ImageView scrollImage;
    
    RiddleModel rm = new RiddleModel();
    
    MediaPlayer mp;
    
    
    @FXML
    void validateAnswer(ActionEvent event) throws IOException, URISyntaxException 
    {
    	int cityValue = map.get("Cities");
    	Media media;
    	MediaPlayer mp2;

    	

    	
    	switch(cityValue)
    	{
    		case 0 :
    				if(riddleTextfield.getText().equalsIgnoreCase("Anchor"))
    				{
    					media = new Media(getClass().getResource("/music/correctSound.mp3").toURI().toString());
    					mp2 = new MediaPlayer(media);  
    					mp2.play();
    					rm.correctAnswer(event);

    				} 
    				
    				else
    				{
        				mp.play();
    				}
    				
    				mp.stop();
    					
    				break;
    				
    		case 1: 
    				if(riddleTextfield.getText().equalsIgnoreCase("Dragon"))
    				{
    					media = new Media(getClass().getResource("/music/correctSound.mp3").toURI().toString());
    					mp2 = new MediaPlayer(media);  
    					mp2.play();
    					rm.correctAnswer(event);

    				}
    				
    				else
    				{
        				mp.play();
    				}
    				
    				mp.stop();
    				break;
				
    		case 2:
    				if(riddleTextfield.getText().equalsIgnoreCase("Time"))
    				{
					
    					media = new Media(getClass().getResource("/music/correctSound.mp3").toURI().toString());
    					mp2 = new MediaPlayer(media);  
    					mp2.play();
    					rm.correctAnswer(event);

    				}
    				
    				else
    				{
        				mp.play();
    				}
    				
    				mp.stop();
    				break;
				
    		case 3:
    				if(riddleTextfield.getText().equalsIgnoreCase("Shield"))
    				{
					//placeholder
    					media = new Media(getClass().getResource("/music/correctSound.mp3").toURI().toString());
    					mp2 = new MediaPlayer(media);  
    					mp2.play();
    					rm.correctAnswer(event);

    				}
    				
    				else
    				{
        				mp.play();
    				}
    				
    				mp.stop();
    				break;
				
				
    		case 4:
    				if(riddleTextfield.getText().equalsIgnoreCase("Sword"))
    				{
					//placeholder
    					media = new Media(getClass().getResource("/music/correctSound.mp3").toURI().toString());
    					mp2 = new MediaPlayer(media);  
    					mp2.play();
    					rm.correctAnswer(event);

    				}
    				
    				else
    				{
        				mp.play();
    				}
    				
    				mp.stop();
				break;
				
    		case 5:
					if(riddleTextfield.getText().equalsIgnoreCase("Water"))
					{
						media = new Media(getClass().getResource("/music/correctSound.mp3").toURI().toString());
    					mp2 = new MediaPlayer(media);  
    					mp2.play();
    					rm.correctAnswer(event);

					}
					
					else
    				{
        				mp.play();
    				}
    				
    				mp.stop();
					break;
    			
			default: System.out.println("Didn't work");
				
    			
    	}
    	
    

    	
    	
    }
    
    
	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
    	int cityValue = map.get("Cities");
    	
    	Media media;
		try 
		{
			media = new Media(getClass().getResource("/music/wrong.mp3").toURI().toString());
			mp = new MediaPlayer(media);

		} 
		
		catch (URISyntaxException e1) 
		
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	
		
		rm.openRiddleText();
		String riddle;
		try 
		{
			riddle = rm.readPuzzle(cityValue);
			riddleTextArea.setText(riddle);

		} 
		
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rm.closeFile();
	}
    
    

}
