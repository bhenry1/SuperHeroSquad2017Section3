package application.GatesOfHell;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class GatesOfHellControl 
{
	
	GatesOfHellModel gohm = new GatesOfHellModel();

    @FXML
    private Button enterButton;

    @FXML
    private Button menuBtn;

    @FXML
    private AnchorPane pane;

    @FXML
    private Button backToWMbtn;

    @FXML
    private ImageView Morestet;

    @FXML
    void returnToWM(ActionEvent event) throws IOException 
    {
    	gohm.rtnToWorldMap(event);

    }

    @FXML
    void openMenu(ActionEvent event) {

    }

    @FXML
    void enterFinalBoss(ActionEvent event) {

    }

}
