package application.GatesOfHell;

import java.io.IOException;
import java.net.URISyntaxException;

import application.Main;
import application.Combat.CombatControl;
import application.Combat.VictoryControl;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;

public class finalWarningModel 
{
	
	MediaPlayer mp;
	public void backToWorldMap(ActionEvent event) throws IOException
	{
		Parent root = FXMLLoader.load(Main.class.getResource("WorldMap/WorldMapView.fxml"));
    	Scene scene2 = new Scene(root);
		Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow());  
    	window.setScene(scene2);
    	window.show();
		
	}
	
	public void startFinalBattle(ActionEvent event) throws IOException
	{
		
		 
		 
		/*
		FXMLLoader loader = new FXMLLoader(Main.class.getResource("Combat/BattleView.fxml"));
		Parent root = (Parent) loader.load();

		CombatControl cc = loader.getController();

		cc.monsterName = "Final Boss: Satan Emperor";

		cc.setMonsterArea("Final Boss: Satan Emperor");
		
    	Scene scene2 = new Scene(root);
		Stage newWindow = (Stage) parentPane.getScene().getWindow();
		newWindow.setScene(scene2);
		newWindow.show();
		 */
		 
		}

		
		//Parent root2 = FXMLLoader.load(Main.class.getResource("Combat/BattleView.fxml"));
    	//Scene scene2 = new Scene(root2);
    	//Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow());      	
    	//window.setScene(scene2);
    	//window.setTitle("Matlock");
    	//window.show();
		
	
		//Parent root = FXMLLoader.load(Main.class.getResource("Combat/BattleView.fxml"));
    	//Scene scene2 = new Scene(root);
    	//Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow());  
    	//window.close();
    	
		
	}
	


