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
		
		

		public String getMonsterName()
		{
			ClourtavDungeonControl cdc = new ClourtavDungeonControl();
			
			return "test";
			
		}
		
		
	
		
}
