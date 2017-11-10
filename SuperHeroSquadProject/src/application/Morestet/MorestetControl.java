package application.Morestet;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class MorestetControl 
{
	MorestetModel mm  = new MorestetModel();
	
    @FXML
    private Button dungeonbtn;

    @FXML
    private Button tavernBtn;

    @FXML
    private Label morestetLabel;

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

    	mm.rtnToWorldMao(event);
    }

    @FXML
    void openMenu(ActionEvent event) 
    {

    }

    @FXML
    void enterDungeon(ActionEvent event) throws IOException 
    {
    }

    @FXML
    void startPuzzle(ActionEvent event) 
    {

    }

    @FXML
    void enterTavern(ActionEvent event) throws IOException 
    {
    	mm.goToTavern(event);
    	
    }

    @FXML
    void enterShop(ActionEvent event) throws IOException 
    {
    	mm.goToShop(event);
    }

    @FXML
    void enterInn(ActionEvent event) throws IOException 
    {
    	mm.goToInn(event);

    }

}
