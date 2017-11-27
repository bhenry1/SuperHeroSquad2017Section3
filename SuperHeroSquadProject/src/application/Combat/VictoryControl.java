package application.Combat;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import application.Main;
import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.animation.Transition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;


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
    
    @FXML
    private Label gainedBoatPiece;
    
    public String name;

	MediaPlayer mp;
	int goldGained;
	int currentGold;
	



    @FXML
    void rtnToDungeon(ActionEvent event) throws IOException 
    {
    	
    	

    	//if(name.equals("DM: Guardsman") || (name.equals("DM: Goblin Capt.")) || (name.equals("DM: Ogre")) || (name.equals("DM: Slime King")) || (name.equals("DM: Dark Knight")) || (name.equals("Dungeon Master Zul")) )
    	//{	
    		//gainedBoatPiece.setVisible(true);
    		
    	//}

    

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
    	
    	else if(name.equals("F. Boss:Satan Emp."))
    	{
    		fadeOut();
    	}
    	

    	else
    	vm.backToClourtavDungeon(event, name);
    }
    
    

	private void fadeOut() 
	{
			 FadeTransition fadeTrans = new FadeTransition();
			 fadeTrans.setDuration(Duration.millis(3000));
			 fadeTrans.setNode(victoryPane);
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
		FXMLLoader loader = new FXMLLoader(Main.class.getResource("GatesOfHell/FinScreen.fxml"));
		Parent root = (Parent) loader.load();

    	Scene scene2 = new Scene(root);
		Stage newWindow = (Stage) victoryPane.getScene().getWindow();
		newWindow.setScene(scene2);
		newWindow.show();		
	}
	
	

	



	@Override
	public void initialize(URL arg0, ResourceBundle arg1) 
	{
		Random r = new Random();
		

		goldGained = r.nextInt(100 - 1) + 1;
		goldLabel.setText("Gold Gained: " + goldGained);

	
		
		//System.out.println("I have " + map.get("Gold") + " gold.");
		
		//goldLabel.setText("Gold Gained: " + goldGained);
		
		//System.out.println("I have: " + getGold());
		
		

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
