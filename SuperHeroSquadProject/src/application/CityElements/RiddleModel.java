package application.CityElements;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RiddleModel 
{
	private Scanner rInput;
	
	
	public void openRiddleText()
	{
		try 
		{
			rInput = new Scanner(new File("TextFiles/Riddles.txt"));
		} 
			catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
	
	public String readPuzzle(int cityValue) throws IOException
	{
		while(rInput.hasNext())
		{
			if(cityValue == 0)
			{
				String morstetRiddle = Files.readAllLines(Paths.get("TextFiles/Riddles.txt")).get(0);
				return morstetRiddle;
			}
			
			else if(cityValue == 1)
			{
				String monetoncRiddle = Files.readAllLines(Paths.get("TextFiles/Riddles.txt")).get(1);
				return monetoncRiddle;
			}
			
			else if(cityValue == 2)
			{
				String clourtavRiddle = Files.readAllLines(Paths.get("TextFiles/Riddles.txt")).get(2);
				return clourtavRiddle;
			}
			
			else if(cityValue == 3)
			{
				String hackiponRiddle = Files.readAllLines(Paths.get("TextFiles/Riddles.txt")).get(3);
				return hackiponRiddle;
			}
			
			else if(cityValue == 4)
			{
				String arthurRiddle = Files.readAllLines(Paths.get("TextFiles/Riddles.txt")).get(4);
				return arthurRiddle;
			}
			
			else if(cityValue == 5)
			{
				String hifenourRiddle = Files.readAllLines(Paths.get("TextFiles/Riddles.txt")).get(5);
				return hifenourRiddle;
			}
			
			
		}
		
		return "";
	}
	
	public void closeFile()
	{
		rInput.close();
	}
	
	public void correctAnswer(ActionEvent event) throws IOException
	{
		Parent root = FXMLLoader.load(Main.class.getResource("CityElements/correct.fxml"));
    	Scene scene2 = new Scene(root);
		Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow());  
    	window.setScene(scene2);
    	window.show();
	}
	
	
	public void inCorrectAnswer(ActionEvent event) throws IOException
	{
		Parent root = FXMLLoader.load(Main.class.getResource("WorldMap/WorldMapView.fxml"));
    	Scene scene2 = new Scene(root);
		Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow());  
    	window.setScene(scene2);
    	window.show();
	}
	
	
	
}
