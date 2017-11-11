package application;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

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
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TitleScreenControl
{
TitleScreenModel model = new TitleScreenModel();
Main view = new Main();
	
   
    @FXML private Button exitGameButton;
    @FXML private Button loadGameButton;
    @FXML private Button newGameButton;

    @FXML private Label matlock;
    @FXML private AnchorPane mainPane;
   
    @FXML private ImageView backgroundImage;

    @FXML
    void exitGameOnClick(ActionEvent event) 
    {
    	model.exitGame();
    }

    
    @FXML
    void LoadGameOnClick(ActionEvent event) throws IOException 
    {

    	model.changeToSaveScreen(event);
    	

    }

   

    @FXML
    void newGameOnClick(ActionEvent event) throws IOException 
    {
    	model.changeToSaveScreen(event);
    }
    
    @FXML
    void expirement2(ActionEvent event) 
    {
    	System.out.println("Do stuff");
    		
    }




}
