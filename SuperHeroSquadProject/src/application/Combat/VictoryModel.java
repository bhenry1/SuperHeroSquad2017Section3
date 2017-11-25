package application.Combat;

import java.io.IOException;

import application.Main;
import application.Dungeons.ClourtavDungeonControl;
import application.Dungeons.MorestetDungeonControl;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class VictoryModel
{

	public void backToClourtavDungeon(ActionEvent event, String monsterName) throws IOException
	{
		
		FXMLLoader loader = new FXMLLoader(Main.class.getResource("Dungeons/ClourtavDungeon.fxml"));
		Parent root = (Parent) loader.load();
		ClourtavDungeonControl cdc = loader.getController();
		
		if(monsterName.equals("Jiggy"))
	
		{
		
		cdc.room2.setVisible(true);
		cdc.room2MapLabel.setVisible(true);
		cdc.exit1.setVisible(true);
		cdc.monsTerSymbolImage.setVisible(true);
		cdc.playerLocation.setVisible(false);
		cdc.playerLocation1.setVisible(true);
		cdc.roomNumber = 2;
		cdc.roomName.setText("Room 2");
		}
		
		
		else if(monsterName.equals("Zaw"))
		{
			cdc.exit2.setVisible(true);
			cdc.room3.setVisible(true);
			cdc.room3MapLabel.setVisible(true);
			cdc.exit5.setVisible(true);
			cdc.room5.setVisible(true);
			cdc.room5MapLabel.setVisible(true);
			cdc.monsTerSymbolImage2.setVisible(true);
			cdc.playerLocation3.setVisible(true);
			cdc.playerLocation.setVisible(false);
			cdc.roomNumber = 5;
			cdc.roomName.setText("Room 5");
			
		}
		
		
		else if(monsterName.equals("Street Rat"))
		{
			cdc.exit3.setVisible(true);
			cdc.room10.setVisible(true);
			cdc.room10MapLabel.setVisible(true);
			cdc.exit9.setVisible(true);
			cdc.room7.setVisible(true);
			cdc.room7MapLabel.setVisible(true);
			cdc.monsTerSymbolImage3.setVisible(true);
			cdc.playerLocation61.setVisible(true);
			cdc.playerLocation.setVisible(false);
			cdc.roomNumber = 7;
			cdc.roomName.setText("Room 7");
			
			
		}
			
    	Scene scene2 = new Scene(root);
		Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow()); 
		window.setScene(scene2);
		window.setTitle("Matlock");
		window.show();



		
		
	}
	
	
	
	public void backToMorestetDungeon(ActionEvent event, String monsterName) throws IOException
	{
		FXMLLoader loader = new FXMLLoader(Main.class.getResource("Dungeons/MorestetDungeon.fxml"));
		Parent root = (Parent) loader.load();
		MorestetDungeonControl mdc = loader.getController();
		
		if(monsterName.equals("Bat"))
		{
			mdc.exit4.setVisible(true);
			mdc.room3.setVisible(true);
			mdc.room3MapLabel.setVisible(true);
			mdc.monsTerSymbolImage3.setVisible(true);
			mdc.playerLocation1.setVisible(false);
			mdc.playerLocation3.setVisible(true);
			mdc.roomNumber = 3;
			mdc.roomName.setText("Room 3");
			
		}
		
		
		if(monsterName.equals("DM: Goblin Capt."))
		{
			mdc.exit3.setVisible(true);
			mdc.room4.setVisible(true);
			mdc.room4MapLabel.setVisible(true);
			mdc.bossSymbolImage4.setVisible(true);
			mdc.playerLocation1.setVisible(false);
			mdc.playerLocation4.setVisible(true);
			mdc.roomNumber = 4;
			mdc.roomName.setText("Room 4");
			
		}
		
		
		Scene scene2 = new Scene(root);
		Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow()); 
		window.setScene(scene2);
		window.setTitle("Matlock");
		window.show();
	}

}
