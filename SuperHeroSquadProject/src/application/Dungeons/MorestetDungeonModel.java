package application.Dungeons;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MorestetDungeonModel 
{

	public int getRoomNumber4MovingUp(int roomNumber)
	{
		if(roomNumber == 0) return 0;
		if(roomNumber == 2) return 2;
		if(roomNumber == 3) return 3;
		if(roomNumber == 4) return 0;
		
		else
		return 0;
	}
	
	public int getRoomNumber4MovingDown(int roomNumber)
	{
		if(roomNumber == 0) return 4;
		if(roomNumber == 2) return 2;
		if(roomNumber == 3) return 3;
		if(roomNumber == 4) return 4;
		
		else
		return 0;
	}
	
	public int getRoomNumber4MovingRight(int roomNumber)
	{
		if(roomNumber == 0) return 3;
		if(roomNumber == 2) return 0;
		if(roomNumber == 3) return 3;
		if(roomNumber == 4) return 4;
		
		else
		return 0;
	}
	
	public int getRoomNumber4MovingLeft(int roomNumber)
	{
		if(roomNumber == 0) return 2;
		if(roomNumber == 2) return 2;
		if(roomNumber == 3) return 0;
		if(roomNumber == 4) return 4;
		
		else
		return 0;
	}
	
	public String getRoomName(int roomNumber)
	{
		if(roomNumber == 0) return "Dungeon Entrance";
		
		else return "Room " + roomNumber;
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
		Parent root = FXMLLoader.load(Main.class.getResource("Morestet/MorestetView.fxml"));
    	Scene scene2 = new Scene(root);
		Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow());  
    	window.setScene(scene2);
    	window.show();
	}
	
	
	
}
