package application.Dungeons;

import java.io.File;
import java.util.Scanner;

import javafx.animation.Animation;
import javafx.animation.Transition;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class ClourtavDungeonNavigationTextModel 
{

	private Scanner txtReader;
	
	public void openFile()
	{
		try
		{
			txtReader = new Scanner(new File("TextFiles/Matlock.txt"));
		}
		
		catch(Exception e)
		{
			System.out.println("Couldn't find the file");
		}
	}
	
	public String readFile()
	{
		
		while(txtReader.hasNext())
		{
			String a = txtReader.nextLine();
			return a;
		}
		
		return "";
	}
	
	public void closeFile()
	{
		txtReader.close();
	}
	
	
	    	  
		  
		
	
}
