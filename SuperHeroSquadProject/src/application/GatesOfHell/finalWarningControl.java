package application.GatesOfHell;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import application.Combat.CombatControl;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class finalWarningControl implements Initializable
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
    void startFinalBattle(ActionEvent event) throws IOException, URISyntaxException 
    {
    	FXMLLoader loader = new FXMLLoader(Main.class.getResource("Combat/BattleView.fxml"));
		Parent root = (Parent) loader.load();

		CombatControl cc = loader.getController();

		cc.monsterName = "F. Boss:Satan Emp.";

		cc.setMonsterArea("F. Boss:Satan Emp.");
		
    	Scene scene2 = new Scene(root);
		Stage newWindow = (Stage) displayPane.getScene().getWindow();
		newWindow.setScene(scene2);
		newWindow.show();    
		
		}

    @FXML
    void closeWindow(ActionEvent event) throws IOException 
    {
    	fwm.backToWorldMap(event);
    }
    
    private void fadeInTransition() 
	{
		 FadeTransition fadeTrans = new FadeTransition();
		 fadeTrans.setDuration(Duration.millis(2000));
		 fadeTrans.setNode(displayPane);
		 fadeTrans.setFromValue(0);
		 fadeTrans.setToValue(1);
		 fadeTrans.play();
		
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) 
	{
		fadeInTransition();		
	}

}
