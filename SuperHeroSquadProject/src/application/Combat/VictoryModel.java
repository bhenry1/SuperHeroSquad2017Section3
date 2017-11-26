package application.Combat;

import java.io.IOException;

import application.Main;

import application.Dungeons.ClourtavDungeonControl;

import application.Dungeons.ArthurDungeonControl;
import application.Dungeons.ClourtavDungeonControl;
import application.Dungeons.HackiponDungeonControl;
import application.Dungeons.HifenourDungeonControl;
import application.Dungeons.MonetoncDungeonControl;

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

	
	public void backToMonetoncDungeon(ActionEvent event, String monsterName) throws IOException
	{
		FXMLLoader loader = new FXMLLoader(Main.class.getResource("Dungeons/MonetoncDungeon.fxml"));
		Parent root = (Parent) loader.load();
		MonetoncDungeonControl modc = loader.getController();
		
		if(monsterName.equals("Elephant Kin"))
		{
			modc.exit3.setVisible(true);
			modc.room4.setVisible(true);
			modc.room4MapLabel.setVisible(true);
			modc.monsTerSymbolImage4.setVisible(true);
			modc.playerLocation1.setVisible(false);
			modc.playerLocation4.setVisible(true);
			
			modc.roomNumber = 4;
			modc.roomName.setText("Room 4");
			
		}
		
		if(monsterName.equals("Thief"))
		{
			modc.exit4.setVisible(true);
			modc.room5.setVisible(true);
			modc.room5MapLabel.setVisible(true);
			modc.monsTerSymbolImage5.setVisible(true);
			modc.playerLocation1.setVisible(false);
			modc.playerLocation5.setVisible(true);
			
			modc.roomNumber = 5;
			modc.roomName.setText("Room 5");
			
		}
		
		if(monsterName.equals("DM: Guardsman"))
		{
			modc.exit4.setVisible(true);
			modc.exit5.setVisible(true);
			modc.room6.setVisible(true);
			modc.room6MapLabel.setVisible(true);
			modc.bossSymbolImage6.setVisible(true);
			modc.room5.setVisible(true);
			modc.room5MapLabel.setVisible(true);
			modc.monsTerSymbolImage5.setVisible(true);
			modc.playerLocation1.setVisible(false);
			modc.playerLocation6.setVisible(true);
			
			modc.roomNumber = 6;
			modc.roomName.setText("Room 6");
			
		}
		
		
		
		
		
		Scene scene2 = new Scene(root);
		Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow()); 
		window.setScene(scene2);
		window.setTitle("Matlock");
		window.show();

	}
	
	

	public void backToHackiponDungeon(ActionEvent event, String monsterName) throws IOException
	{
		FXMLLoader loader = new FXMLLoader(Main.class.getResource("Dungeons/HackiponDungeon.fxml"));
		Parent root = (Parent) loader.load();
		HackiponDungeonControl hdc = loader.getController();
		
		if(monsterName.equals("Angry Slime"))
		{
			hdc.exit4.setVisible(true);
			hdc.room2.setVisible(true);
			hdc.room2MapLabel.setVisible(true);
			hdc.monsTerSymbolImage2.setVisible(true);
			hdc.playerLocation2.setVisible(true);
			hdc.playerLocation1.setVisible(false);
			
			hdc.roomNumber = 2;
			hdc.roomName.setText("Room 2");
		}
		
		
		if(monsterName.equals("Bugo"))
		{
			hdc.exit1.setVisible(true);
			hdc.exit11.setVisible(true);
			hdc.room3.setVisible(true);
			hdc.room3MapLabel.setVisible(true);
			hdc.room5.setVisible(true);
			hdc.room5MapLabel.setVisible(true);
			hdc.monsTerSymbolImage5.setVisible(true);
			hdc.playerLocation5.setVisible(true);
			hdc.playerLocation1.setVisible(false);
			
			hdc.roomNumber = 5;
			hdc.roomName.setText("Room 5");
		}
		
		
		if(monsterName.equals("Trickster"))
		{
			hdc.exit1.setVisible(true);
			hdc.exit9.setVisible(true);
			
			hdc.room3.setVisible(true);
			hdc.room3MapLabel.setVisible(true);
			hdc.room6.setVisible(true);
			hdc.room6MapLabel.setVisible(true);
			hdc.monsTerSymbolImage6.setVisible(true);
			hdc.playerLocation6.setVisible(true);
			hdc.playerLocation1.setVisible(false);
			
			hdc.roomNumber = 6;
			hdc.roomName.setText("Room 6");
		}
		
		if(monsterName.equals("DM: Ogre"))
		{
			hdc.exit2.setVisible(true);
			hdc.exit14.setVisible(true);
			
			hdc.room14.setVisible(true);
			hdc.room14MapLabel.setVisible(true);
			hdc.room10.setVisible(true);
			hdc.room10MapLabel.setVisible(true);
			hdc.bossSymbolImage10.setVisible(true);
			hdc.playerLocation10.setVisible(true);
			hdc.playerLocation1.setVisible(false);
			
			hdc.roomNumber = 10;
			hdc.roomName.setText("Room 10");
		}
		
		Scene scene2 = new Scene(root);
		Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow()); 
		window.setScene(scene2);
		window.setTitle("Matlock");
		window.show();
		
		
	}
	
	public void backToArthurDungeon(ActionEvent event, String monsterName) throws IOException
	{
		FXMLLoader loader = new FXMLLoader(Main.class.getResource("Dungeons/ArthurDungeon.fxml"));
		Parent root = (Parent) loader.load();
		ArthurDungeonControl adc = loader.getController();
		
		if(monsterName.equals("Hell Scout"))
		{
			adc.exit1.setVisible(true);
			adc.room2.setVisible(true);
			adc.room2MapLabel.setVisible(true);
			adc.monsTerSymbolImage2.setVisible(true);
			
			adc.playerLocation2.setVisible(true);
			adc.playerLocation1.setVisible(false);
			
			adc.roomNumber = 2;
			adc.roomName.setText("Room 2");
		}
		
		if(monsterName.equals("Mercenary"))
		{
			adc.exit5.setVisible(true);
			adc.exit6.setVisible(true);
			adc.room5.setVisible(true);
			adc.room5MapLabel.setVisible(true);
			adc.room7.setVisible(true);
			adc.room7MapLabel.setVisible(true);
			adc.monsTerSymbolImage7.setVisible(true);
			
			adc.playerLocation7.setVisible(true);
			adc.playerLocation1.setVisible(false);
			
			adc.roomNumber = 7;
			adc.roomName.setText("Room 7");
		}
		
		if(monsterName.equals("DM: Slime King"))
		{
			adc.exit5.setVisible(true);
			adc.exit6.setVisible(true);
			adc.exit7.setVisible(true);
			adc.exit11.setVisible(true);
			
			adc.room5.setVisible(true);
			adc.room5MapLabel.setVisible(true);
			adc.room7.setVisible(true);
			adc.room7MapLabel.setVisible(true);
			adc.room10.setVisible(true);
			adc.room10MapLabel.setVisible(true);
			adc.room11.setVisible(true);
			adc.room11MapLabel.setVisible(true);
			adc.monsTerSymbolImage7.setVisible(true);
			adc.bossSymbolImage1.setVisible(true);
			
			adc.playerLocation10.setVisible(true);
			adc.playerLocation1.setVisible(false);
			
			adc.roomNumber = 10;
			adc.roomName.setText("Room 10");
		}
		
		
		
		Scene scene2 = new Scene(root);
		Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow()); 
		window.setScene(scene2);
		window.setTitle("Matlock");
		window.show();
	}
	
	public void backToHifenourDungeon(ActionEvent event, String monsterName) throws IOException
	{
		
		FXMLLoader loader = new FXMLLoader(Main.class.getResource("Dungeons/HifenourDungeon.fxml"));
		Parent root = (Parent) loader.load();
		HifenourDungeonControl hidc = loader.getController();
		
		if(monsterName.equals("Devourer"))
		{
			hidc.exit2.setVisible(true);
			hidc.room2.setVisible(true);
			hidc.room2MapLabel.setVisible(true);
			hidc.monsTerSymbolImage2.setVisible(true);
			
			hidc.playerLocation2.setVisible(true);
			hidc.playerLocation1.setVisible(false);
			
			hidc.roomNumber = 2;
			hidc.roomName.setText("Room 2");
			
		}
		
		if(monsterName.equals("Succubus"))
		{
			hidc.exit2.setVisible(true);
			hidc.exit10.setVisible(true);
			hidc.exit11.setVisible(true);
			
			hidc.room5.setVisible(true);
			hidc.room5MapLabel.setVisible(true);
			hidc.room4.setVisible(true);
			hidc.room4MapLabel.setVisible(true);
			hidc.room2.setVisible(true);
			hidc.room2MapLabel.setVisible(true);
			hidc.monsTerSymbolImage4.setVisible(true);
			
			hidc.playerLocation4.setVisible(true);
			hidc.playerLocation1.setVisible(false);
			
			hidc.roomNumber = 4;
			hidc.roomName.setText("Room 4");
			
		}
		
		if(monsterName.equals("DM: Dark Knight"))
		{
			hidc.exit5.setVisible(true);
			hidc.exit6.setVisible(true);
			hidc.exit8.setVisible(true);
			
			hidc.room10.setVisible(true);
			hidc.room10MapLabel.setVisible(true);
			hidc.room8.setVisible(true);
			hidc.room8MapLabel.setVisible(true);
			hidc.room7.setVisible(true);
			hidc.room7MapLabel.setVisible(true);
			hidc.bossSymbolImage7.setVisible(true);
			
			hidc.playerLocation7.setVisible(true);
			hidc.playerLocation1.setVisible(false);
			
			hidc.roomNumber = 7;
			hidc.roomName.setText("Room 7");
			
		}
		
		Scene scene2 = new Scene(root);
		Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow()); 
		window.setScene(scene2);
		window.setTitle("Matlock");
		window.show();
	
	}
	
	public void beatGame(ActionEvent event, String monsterName) throws IOException
	{
		Parent root = FXMLLoader.load(Main.class.getResource("GatesOfHell/FinScreen.fxml"));
		Scene scene2 = new Scene(root);
		Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow());  
		window.setScene(scene2);
		window.show();
		
	}
	

}
