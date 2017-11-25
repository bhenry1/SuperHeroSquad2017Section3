package application.Dungeons;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ArthurDungeonModel 
{
	
	public int getRoomNumber4MovingUp(int roomNumber)
	{
		if(roomNumber == 0) return 2;
		
		if(roomNumber == 2) return 2;
		
		if(roomNumber == 6) return 6;
		
		if(roomNumber == 4) return 4;

		if(roomNumber == 3) return 3;

		if(roomNumber == 5) return 0;
		
		if(roomNumber == 7) return 5;
		
		if(roomNumber == 11) return 7;
		
		if(roomNumber == 8) return 8;
		
		if(roomNumber == 9) return 9;
		
		if(roomNumber == 10) return 11;
		
		else
		return 0;
	}
	
	
	public int getRoomNumber4MovingDown(int roomNumber)
	{
		if(roomNumber == 0) return 5;
		
		if(roomNumber == 2) return 0;
		
		if(roomNumber == 6) return 6;
		
		if(roomNumber == 4) return 4;

		if(roomNumber == 3) return 3;

		if(roomNumber == 5) return 7;
		
		if(roomNumber == 7) return 11;
		
		if(roomNumber == 11) return 10;
		
		if(roomNumber == 8) return 8;
		
		if(roomNumber == 9) return 9;
		
		if(roomNumber == 10) return 10;
		
		else
		return 0;
	}
	
	
	public int getRoomNumber4MovingRight(int roomNumber)
	{
		if(roomNumber == 0) return 3;
		
		if(roomNumber == 2) return 6;
		
		if(roomNumber == 6) return 6;
		
		if(roomNumber == 4) return 0;

		if(roomNumber == 3) return 3;

		if(roomNumber == 5) return 5;
		
		if(roomNumber == 7) return 7;
		
		if(roomNumber == 11) return 9;
		
		if(roomNumber == 8) return 11;
		
		if(roomNumber == 9) return 9;
		
		if(roomNumber == 10) return 10;
		
		else
		return 0;
	}
	
	public int getRoomNumber4MovingLeft(int roomNumber)
	{
		if(roomNumber == 0) return 4;
		
		if(roomNumber == 2) return 2;
		
		if(roomNumber == 6) return 2;
		
		if(roomNumber == 4) return 4;

		if(roomNumber == 3) return 0;

		if(roomNumber == 5) return 5;
		
		if(roomNumber == 7) return 7;
		
		if(roomNumber == 11) return 8;
		
		if(roomNumber == 8) return 8;
		
		if(roomNumber == 9) return 11;
		
		if(roomNumber == 10) return 10;
		
		else
		return 0;
	}
	
	
	
	
	


	public String getRoomName(int roomNumber)
		{
			if(roomNumber == 0) return "Dungeon Entrance";
			
			else return "Room " + roomNumber;
		}
		
	
		
	
	
	public void leaveDungeon(ActionEvent event) throws IOException 
	{
		Parent root = FXMLLoader.load(Main.class.getResource("Arthur/ArthurView.fxml"));
    	Scene scene2 = new Scene(root);
		Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow());  
    	window.setScene(scene2);
    	window.show();
	}
	

	public String getMonsterName(String roomName)
	{
		if(roomName.equals("Room 2"))
		{
			return "Hell Scout";
		}
		
		if(roomName.equals("Room 7"))
		{
			return "Mercenary";
		}
		
		if(roomName.equals("Room 10"))
		{
			return "DM: Slime King";
		}
		
		
		
		return "";
		
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
