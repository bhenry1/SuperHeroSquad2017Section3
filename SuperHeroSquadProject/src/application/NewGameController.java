package application;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;



 
 
 public class NewGameController 
 {
	 NewGameModel ngm = new NewGameModel();
	 
	 
    @FXML
    private Button beginButton;

    @FXML
    private Label enterNameLabel;

    @FXML
    private Button backButton;

    @FXML
    private Pane newGamePane;

    @FXML
    private ImageView startScreen;

    @FXML
    public TextField charName;
    
    

    @FXML
    void saveCharName(ActionEvent event) throws IOException 
    {
    	
    	System.out.println(charName.getText());
    	if(charName.getText().equals(""))
    	{
    		ngm.emptyUserName(event);
    	}
    	
    	else
    	{
    		ngm.backToWorldMap(event);
    		PrintWriter savedNames = new PrintWriter("SuperHeroSquadProject/TextFiles/SavedNames.txt", "UTF-8");
    		savedNames.println(charName.getText());
    		savedNames.close();
    		
    	}
    
   }

    @FXML
    void backToTitleScreen(ActionEvent event) throws IOException 
    {
    	ngm.backToTitleScreen(event);
    }

}