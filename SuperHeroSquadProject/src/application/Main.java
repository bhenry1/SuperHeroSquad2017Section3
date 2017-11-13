package application;
	
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.URISyntaxException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;


public class Main extends Application 
{
	@Override
	public void start(Stage window) throws IOException 
	{	
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		try 
		{
			AnchorPane mainPane = FXMLLoader.load(getClass().getResource("TitleScreen.fxml"));
			Scene scene = new Scene(mainPane, 1000, 800);
			window.setScene(scene);
			window.setTitle("Matlock");
			window.show();
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) 
	{
		launch(args);
	}
}
