package application.Dungeons;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HackiponDungeonModel 
{

	public int getRoomNumber4MovingUp(int roomNumber)
	{
		if(roomNumber == 0) return 2;
		if(roomNumber == 2) return 2;
		if(roomNumber == 3) return 5;
		if(roomNumber == 4) return 4;
		if(roomNumber == 5) return 5;
		if(roomNumber == 6) return 8;
		if(roomNumber == 7) return 7;
		if(roomNumber == 8) return 8;
		if(roomNumber == 9) return 9;
		if(roomNumber == 10) return 14;
		if(roomNumber == 11) return 13;
		if(roomNumber == 13) return 4;
		if(roomNumber == 14) return 0;
		if(roomNumber == 15) return 3;
		
		else
		return 0;
	}
	
	public int getRoomNumber4MovingDown(int roomNumber)
	{
		if(roomNumber == 0) return 14;
		if(roomNumber == 2) return 0;
		if(roomNumber == 3) return 15;
		if(roomNumber == 4) return 13;
		if(roomNumber == 5) return 3;
		if(roomNumber == 6) return 6;
		if(roomNumber == 7) return 7;
		if(roomNumber == 8) return 6;
		if(roomNumber == 9) return 9;
		if(roomNumber == 10) return 10;
		if(roomNumber == 11) return 11;
		if(roomNumber == 13) return 11;
		if(roomNumber == 14) return 10;
		if(roomNumber == 15) return 15;
		
		else
		return 0;
	}
	
	public int getRoomNumber4MovingRight(int roomNumber)
	{
		if(roomNumber == 0) return 4;
		if(roomNumber == 2) return 2;
		if(roomNumber == 3) return 0;
		if(roomNumber == 4) return 4;
		if(roomNumber == 5) return 5;
		if(roomNumber == 6) return 3;
		if(roomNumber == 7) return 2;
		if(roomNumber == 8) return 8;
		if(roomNumber == 9) return 14;
		if(roomNumber == 10) return 10;
		if(roomNumber == 11) return 11;
		if(roomNumber == 13) return 13;
		if(roomNumber == 14) return 14;
		if(roomNumber == 15) return 15;
		
		else
		return 0;
	}
	
	public int getRoomNumber4MovingLeft(int roomNumber)
	{
		if(roomNumber == 0) return 3;
		if(roomNumber == 2) return 7;
		if(roomNumber == 3) return 6;
		if(roomNumber == 4) return 0;
		if(roomNumber == 5) return 5;
		if(roomNumber == 6) return 6;
		if(roomNumber == 7) return 7;
		if(roomNumber == 8) return 8;
		if(roomNumber == 9) return 9;
		if(roomNumber == 10) return 10;
		if(roomNumber == 11) return 11;
		if(roomNumber == 13) return 13;
		if(roomNumber == 14) return 9;
		if(roomNumber == 15) return 15;
		
		else
		return 0;
	}
	
	public String getRoomName(int roomNumber)
	{
		
		if(roomNumber == 0)
		{
			return "Dungeon Entrance";
		}
		else
		{
			return "Room " + roomNumber;
		}
		
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
	
	
	public void leaveDungeon(ActionEvent event) throws IOException 
	{
		Parent root = FXMLLoader.load(Main.class.getResource("Hackipon/HackiponView.fxml"));
    	Scene scene2 = new Scene(root);
		Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow());  
    	window.setScene(scene2);
    	window.show();
	}
	
	public String getMonsterName(String roomName)
	{
		if(roomName.equals("Room 2"))
		{
			return "Angry Slime";
		}
		
		if(roomName.equals("Room 5"))
		{
			return "Bugo";
		}
		
		if(roomName.equals("Room 6"))
		{
			return "Trickster";
		}
		
		if(roomName.equals("Room 10"))
		{
			return "DM: Ogre";
		}
		
		
	
		
		return "";
		
	}
	
	
	
}
