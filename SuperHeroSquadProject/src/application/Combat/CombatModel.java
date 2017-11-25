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
import javafx.stage.Modality;
import javafx.stage.Stage;

public class CombatModel extends Character
{
	
		public void fleeBattle(ActionEvent event) throws IOException
		{
			Parent root = FXMLLoader.load(Main.class.getResource("Dungeons/ClourtavDungeon.fxml"));
			Scene scene2 = new Scene(root);
			Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow());  
			window.setScene(scene2);
			window.show();
		}
		
		public void fleeMorstetBattle(ActionEvent event) throws IOException
		{
			Parent root = FXMLLoader.load(Main.class.getResource("Dungeons/MorestetDungeon.fxml"));
			Scene scene2 = new Scene(root);
			Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow());  
			window.setScene(scene2);
			window.show();
		}
		
		public void fleeMonetoncBattle(ActionEvent event) throws IOException
		{
			Parent root = FXMLLoader.load(Main.class.getResource("Dungeons/MonetoncDungeon.fxml"));
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
		
		
		public void outOfItems(ActionEvent event) throws IOException
		{
			Parent root = FXMLLoader.load(Main.class.getResource("Combat/OutOfItem.fxml"));
	    	Scene scene2 = new Scene(root);
			Stage window = new Stage();  
	    	window.setScene(scene2);
	    	window.setTitle("All out!");
			window.initModality(Modality.APPLICATION_MODAL);
			window.showAndWait();
			
		}
		
		public void showVictoryScreen(ActionEvent event, String monsterName) throws IOException
		{
			
			
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("Combat/victoryScreen.fxml"));
			Parent root = (Parent) loader.load();
			VictoryControl vc = loader.getController();
			
			vc.name = monsterName;
			
			
			//Parent root = FXMLLoader.load(Main.class.getResource("Combat/victoryScreen.fxml"));
	    	Scene scene2 = new Scene(root);
			Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow());  
	    	window.setScene(scene2);
	    	window.setTitle("Victory!");
	    	window.show();
			
		}
		
		
		public int getMonsterHealth(String monsterName)
		{
			switch(monsterName)
			{
				case "Jiggy": return 11;
				case "Zaw" : return 13;
				case "Street Rat" : return 12;
				case "Dungeon Master Zul" : return 30;
				case "Bat" : return 7;
				case "DM: Goblin Capt." : return 11;
				case "Elephant Kin" : return 10;
				case "Thief" : return 10;
				case "DM: Guardsman" : return 17;
				default : return 0;

				
				

				
				
			}
			
			
		}
		

		
		
	
		
}
