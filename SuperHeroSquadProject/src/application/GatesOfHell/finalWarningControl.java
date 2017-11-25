package application.GatesOfHell;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class finalWarningControl 
{

    @FXML
    private Pane displayPane;

    @FXML
    private Label warningLabel;

    @FXML
    private Button confirmBtn;

    @FXML
    private ImageView warningIcon2;

    @FXML
    private ImageView warningIcon1;

    @FXML
    private Label displayWarningLabel;

    @FXML
    private Button closeWindowBtn;
    
    finalWarningModel fwm = new finalWarningModel();

    @FXML
    void startFinalBattle(ActionEvent event) 
    {

    }

    @FXML
    void closeWindow(ActionEvent event) throws IOException 
    {
    	fwm.closeWindow(event);
    }

}
