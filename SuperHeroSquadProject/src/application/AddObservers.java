package application;

import java.io.IOException;

import application.CityElements.ShopControl;
import application.MainMenu.MainMenuControl;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class AddObservers 
{
	
	public AddObservers() throws IOException
	{
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("MainMenu/MainMenuView.fxml"));
		Parent root = (Parent) loader.load();
		//Observer
		MainMenuControl mmc =loader.getController();
		
		
		//FXMLLoader loader2 = new FXMLLoader(getClass().getResource("CityElements/ShopView.fxml"));
		//Parent root2 = (Parent) loader.load();
		//Subject
		//ShopControl sc =loader.getController();
		
		//sc.AddObserver(mmc);
	}
	
	
	
}
