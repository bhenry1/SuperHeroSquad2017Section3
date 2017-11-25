package application.Combat;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class OutOfItemControl 
{

    @FXML
    private Label outOfItemLabel;

    @FXML
    private Pane displayPane;

    @FXML
    private Button confirmBtn;


    @FXML
    void closeWindow(ActionEvent event) 
    {
		Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow());
		window.close();

    }

	

}
