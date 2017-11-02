package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SaveFilesControl 
{
	SaveFilesModel  model2 = new SaveFilesModel ();

	  @FXML private Label saveFileLabel;
	  
	  @FXML private Button startButton;
	  @FXML private Button backButton;
	  
	  @FXML private TextField saveFile1;
	  @FXML private TextField saveFile2;
	  @FXML private TextField saveFile3;
	  @FXML private TextField saveFile4;
	  @FXML private TextField saveFile5;
	  @FXML private TextField saveFile6;
	  @FXML private TextField saveFile7;
    

    @FXML
    void goBackToTitle(ActionEvent event) throws IOException 
    {
		model2.goBack(event);	
    }

    @FXML
    void save(ActionEvent event) 
    {

    }

    

    @FXML
    void goToWorldMap(ActionEvent event) throws IOException 
    {
    	model2.start(event);
    }

}
