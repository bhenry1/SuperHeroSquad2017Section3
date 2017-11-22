package application.MainMenu;

import com.sun.glass.ui.Window;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;

public class MainMenuModel 
{

	public void exitGame()
	{
		System.exit(0);
	}
	
	public void resumeGame(ActionEvent event)
	{
		Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow());  
  		window.close();
	}
	
	
	
	
}
