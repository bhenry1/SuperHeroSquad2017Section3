package application.Combat;

import java.io.IOException;

import application.Main;
import application.Dungeons.ClourtavDungeonControl;
import application.Dungeons.ClourtavDungeonModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CombatModel
{
	
		public void fleeBattle(ActionEvent event) throws IOException
		{
			Parent root = FXMLLoader.load(Main.class.getResource("Dungeons/ClourtavDungeon.fxml"));
			Scene scene2 = new Scene(root);
			Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow());  
			window.setScene(scene2);
			window.show();
		}
		
		
		public int attackMonster(int playerStrength, int equipedWeaponStrength)
		{
			int damageDealt = playerStrength + equipedWeaponStrength;
			return damageDealt;
			
		}
		
		
		public int takeDamageFromMonster(int MonsterPower, int playerDefense)
		{
			int damageRecived = MonsterPower - playerDefense;
			return damageRecived;
		}
		
		public void goToMainMenu(ActionEvent event) throws IOException
		{
			Parent root = FXMLLoader.load(Main.class.getResource("MainMenu/MainMenuView.fxml"));
	    	Scene scene2 = new Scene(root);
			Stage window = new Stage();  
	    	window.setScene(scene2);
	    	window.setTitle("Main Menu");
	    	window.show();
			
		}
		

		
		
	
		
}
