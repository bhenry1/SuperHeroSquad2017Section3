package application.Clourtav;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class ClourtavControl 
{

	ClourtavModel cvm = new ClourtavModel();
	
    @FXML
    private Button dungeonbtn;

    @FXML
    private Button tavernBtn;

    @FXML
    private Label cityLabel;

    @FXML
    private Button shopButton;

    @FXML
    private Button menuBtn;

    @FXML
    private AnchorPane pane;

    @FXML
    private Button backToWMbtn;

    @FXML
    private Button puzzleBtn;

    @FXML
    private ImageView Morestet;

    @FXML
    private Button innBtn;

    @FXML
    void returnToWM(ActionEvent event) throws IOException 
    {
    	
    	cvm.rtnToWorldMap(event);
    }

    @FXML
    void openMenu(ActionEvent event) {

    }

    @FXML
    void enterDungeon(ActionEvent event) throws IOException 
    {
    	cvm.goCDungeon(event);
    	
    }

    @FXML
    void startPuzzle(ActionEvent event) throws IOException
    {
    	cvm.goToRiddle(event);
    }

    @FXML
    void enterTavern(ActionEvent event) throws IOException 
    {
    	cvm.goToTavern(event);
    }

    @FXML
    void enterShop(ActionEvent event) throws IOException 
    {
    	cvm.goToShop(event);
    }

    @FXML
    void enterInn(ActionEvent event) throws IOException {
    	cvm.goToInn(event);
    }

}
