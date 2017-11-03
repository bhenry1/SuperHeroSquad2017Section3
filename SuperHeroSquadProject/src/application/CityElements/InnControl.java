package application.CityElements;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class InnControl {
	
	InnModel im = new InnModel();

    @FXML
    private Button innYesButton;

    @FXML
    private Pane innPane;

    @FXML
    private Button innNoButton;

    @FXML
    private ImageView innImage;

    @FXML
    private TextArea innTextBox;

    @FXML
    void rest(ActionEvent event) 
    {
    	im.example();
    }

    @FXML
    void noRest(ActionEvent event) 
    {
    	im.leaveInn(event);
    }

}
