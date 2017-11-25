package application.Combat;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class VictoryControl extends CombatControl implements Initializable
{
	VictoryModel vm = new VictoryModel();
	
    @FXML
    private Label goldLabel;

    @FXML
    private ImageView victoryImage;

    @FXML
    private Button okBtn;

    @FXML
    private Pane victoryPane;
    
    public String name;
	MediaPlayer mp;


    @FXML
    void rtnToDungeon(ActionEvent event) throws IOException 
    {
    	if(name.equals("DM: Goblin Capt."))
    	{
        	mp.stop();

    	}
    	
    	//mp.stop();
    	if(name.equals("Bat") || (name.equals("DM: Goblin Capt.") ))
    	{	
    		vm.backToMorestetDungeon(event, name);
    	}
    	
    	else if( (name.equals("Elephant Kin")) || (name.equals("Thief")) || (name.equals("DM: Guardsman")) )
    	{
    		vm.backToMonetoncDungeon(event, name);
    	}
    	
    	else if( (name.equals("Angry Slime")) || (name.equals("Bugo")) || (name.equals("Trickster")) || (name.equals("DM: Ogre")) )
    	{
    		vm.backToHackiponDungeon(event, name);
    	}
    	
    	else if((name.equals("Hell Scout")) || (name.equals("Mercenary")) || (name.equals("DM: Slime King")) )
    	{
    		vm.backToArthurDungeon(event, name);
    	}
    	
    	else if((name.equals("Devourer")) || (name.equals("Succubus")) || (name.equals("DM: Dark Knight")) )
    	{
    		vm.backToHifenourDungeon(event, name);
    	}
    	
    	else
    	vm.backToClourtavDungeon(event, name);
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) 
	{
		Random r = new Random();
		int goldGained = r.nextInt(100-1) + 1;
		
		goldLabel.setText("Gold Gained: " + goldGained);
		
		try 
		{
			Media media = new Media(getClass().getResource("/music/DMVictory.mp3").toURI().toString());
			mp = new MediaPlayer(media);
			mp.play();
			mp.setVolume(0.5);	
		} 
		
		catch (URISyntaxException e) 
		{
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
