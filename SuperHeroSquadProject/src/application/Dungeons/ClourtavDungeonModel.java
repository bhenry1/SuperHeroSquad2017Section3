package application.Dungeons;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ClourtavDungeonModel 
{
	
	public int getRoomNumber4MovingUp(int roomNumber)
	{
		if(roomNumber == 0)
		{
			return 2;
		}
		
		if(roomNumber == 2)
		{
			return 2;
		}
		
		if(roomNumber == 3)
		{
			return 5;
		}
		
		if(roomNumber == 4)
		{
			return 8;
		}
		
		if(roomNumber == 5)
		{
			return 5;
		}
		
		if(roomNumber == 6)
		{
			return 6;
		}
		
		if(roomNumber == 7)
		{
			return 10;
		}
		
		if(roomNumber == 8)
		{
			return 8;
		}
		
		if(roomNumber == 9)
		{
			return 9;
		}
		
		if(roomNumber == 10)
		{
			return 0;
		}
		
		else
		
		return 1;
			
	}
	
	public int getRoomNumber4MovingDown(int roomNumber)
	{
		if(roomNumber == 0)
		{
			return 10;
		}
		
		if(roomNumber == 2)
		{
			return 0;
		}
		
		if(roomNumber == 3)
		{
			return 3;
		}
		
		if(roomNumber == 4)
		{
			return 4;
		}
		
		if(roomNumber == 5)
		{
			return 3;
		}
		
		if(roomNumber == 6)
		{
			return 6;
		}
		
		if(roomNumber == 7)
		{
			return 7;
		}
		
		if(roomNumber == 8)
		{
			return 4;
		}
		
		if(roomNumber == 9)
		{
			return 9;
		}
		
		if(roomNumber == 10)
		{
			return 7;
		}
		
		return 1;
			
	}
	
	public int getRoomNumber4MovingLeft(int roomNumber)
	{
		if(roomNumber == 0)
		{
			return 3;
		}
		
		if(roomNumber == 2)
		{
			return 2;
		}
		
		if(roomNumber == 3)
		{
			return 3;
		}
		
		if(roomNumber == 4)
		{
			return 0;
		}
		
		if(roomNumber == 5)
		{
			return 5;
		}
		
		if(roomNumber == 6)
		{
			return 4;
		}
		
		if(roomNumber == 7)
		{
			return 7;
		}
		
		if(roomNumber == 8)
		{
			return 8;
		}
		
		if(roomNumber == 9)
		{
			return 10;
		}
		
		if(roomNumber == 10)
		{
			return 10;
		}
		
		return 1;
			
	}
	
	
	
	public int getRoomNumber4MovingRight(int roomNumber)
	{
		if(roomNumber == 0)
		{
			return 4;
		}
		
		if(roomNumber == 2)
		{
			return 2;
		}
		
		if(roomNumber == 3)
		{
			return 0;
		}
		
		if(roomNumber == 4)
		{
			return 6;
		}
		
		if(roomNumber == 5)
		{
			return 5;
		}
		
		if(roomNumber == 6)
		{
			return 6;
		}
		
		if(roomNumber == 7)
		{
			return 7;
		}
		
		if(roomNumber == 8)
		{
			return 8;
		}
		
		if(roomNumber == 9)
		{
			return 9;
		}
		
		if(roomNumber == 10)
		{
			return 9;
		}
		
		return 1;
			
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
	
	public void leaveDungeon(ActionEvent event) throws IOException 
	{
		Parent root = FXMLLoader.load(Main.class.getResource("Clourtav/ClourtavView.fxml"));
    	Scene scene2 = new Scene(root);
		Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow());  
    	window.setScene(scene2);
    	window.show();
	}
	
	
	public boolean determineIfMove(int roomNumber)
	{
		if((roomNumber==2) || (roomNumber==5) )
		{
			return true;
		}
		
		return false;
		
	}
	
	
}
