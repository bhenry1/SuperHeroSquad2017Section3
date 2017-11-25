package application.Combat;

import java.io.IOException;
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

    @FXML
    void rtnToDungeon(ActionEvent event) throws IOException 
    {
    	if(name.equals("Bat") || (name.equals("DM: Goblin Capt.") ))
    	{	
    		vm.backToMorestetDungeon(event, name);
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
		
		
		
		
	}

}
