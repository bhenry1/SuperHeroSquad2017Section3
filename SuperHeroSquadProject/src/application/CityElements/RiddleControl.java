package application.CityElements;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class RiddleControl implements Initializable {

    @FXML
    private TextField riddleTextfield;

    @FXML
    private Pane riddlePane;

    @FXML
    private Label riddleHintDisplay;

    @FXML
    private Button checkButton;

    @FXML
    private TextArea riddleTextField;

    @FXML
    private ImageView scrollImage;
    
    RiddleModel rm = new RiddleModel();
    
    @FXML
    void validateAnswer(ActionEvent event) 
    {

    }
    
    
	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		rm.openRiddleText();
		String riddle = rm.readPuzzle();
		rm.closeFile();
		
		riddleTextField.setText(riddle);
	}
    
    

}
