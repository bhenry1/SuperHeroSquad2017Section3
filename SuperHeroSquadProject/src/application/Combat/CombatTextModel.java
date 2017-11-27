package application.Combat;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

import application.Main;
import javafx.animation.Animation;
import javafx.animation.Transition;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextArea;
import javafx.util.Duration;

public class CombatTextModel 
{
	
	
private Scanner txtReader;


	
	public void openFile()
	{
		try
		{
			txtReader = new Scanner(new File("TextFiles/Combat.txt"));
		}
		
		catch(Exception e)
		{
			System.out.println("Couldn't find the file");
		}
	}
	
	public void openMonsterFile()
	{
		try
		{
			txtReader = new Scanner(new File("TextFiles/Monsters.txt"));
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
			String equipWarning = txtReader.nextLine();
			return equipWarning;
			
		}
		
		return "";
	}
	
	public String readMonsterFile(String monsterName) throws IOException
	{
		
		while(txtReader.hasNext())
		{
			switch(monsterName)
			{
			case "F. Boss:Satan Emp." : return Files.readAllLines(Paths.get("TextFiles/Monsters.txt")).get(0);
			case "Jiggy" : return Files.readAllLines(Paths.get("TextFiles/Monsters.txt")).get(1);
			case "Zaw" : return Files.readAllLines(Paths.get("TextFiles/Monsters.txt")).get(2);
			case "Dungeon Master Zul" : return Files.readAllLines(Paths.get("TextFiles/Monsters.txt")).get(3);
			case "Bat" : return Files.readAllLines(Paths.get("TextFiles/Monsters.txt")).get(4);
			case "DM: Goblin Capt." : return Files.readAllLines(Paths.get("TextFiles/Monsters.txt")).get(5);
			case "Elephant Kin" : return Files.readAllLines(Paths.get("TextFiles/Monsters.txt")).get(6);
			case "Thief" : return Files.readAllLines(Paths.get("TextFiles/Monsters.txt")).get(7);
			case "DM: Guardsman" : return Files.readAllLines(Paths.get("TextFiles/Monsters.txt")).get(8);
			case "Angry Slime" : return Files.readAllLines(Paths.get("TextFiles/Monsters.txt")).get(9);
			case "Bugo" : return Files.readAllLines(Paths.get("TextFiles/Monsters.txt")).get(10);
			case "Trickster" : return Files.readAllLines(Paths.get("TextFiles/Monsters.txt")).get(11);
			case "DM: Ogre" : return Files.readAllLines(Paths.get("TextFiles/Monsters.txt")).get(12);
			case "Hell Scout" : return Files.readAllLines(Paths.get("TextFiles/Monsters.txt")).get(13);
			case "Mercenary" : return Files.readAllLines(Paths.get("TextFiles/Monsters.txt")).get(14);
			case "DM: Slime King" : return Files.readAllLines(Paths.get("TextFiles/Monsters.txt")).get(15);
			case "Devourer" : return Files.readAllLines(Paths.get("TextFiles/Monsters.txt")).get(16);
			case "Succubus" : return Files.readAllLines(Paths.get("TextFiles/Monsters.txt")).get(17);
			case "DM: Dark Knight" : return Files.readAllLines(Paths.get("TextFiles/Monsters.txt")).get(18);
			case "Street Rat" : return Files.readAllLines(Paths.get("TextFiles/Monsters.txt")).get(19);
			
			default : System.out.println("Didn't work");
			
			
			}
			
		}
		
		return "";
	}
	
	public void closeFile()
	{
		txtReader.close();
	}
	
	
	
	public void typingAnimationForBattles(String battleState, TextArea battleTextArea  )
	{
		
		final Animation animation = new Transition() 
	    {
	        {
	            setCycleDuration(Duration.seconds(2.0));
	        }

	        protected void interpolate(double frac) 
	        {
	            final int length = battleState.length();
	            final int n = Math.round(length * (float) frac);
	            battleTextArea.setText(battleState.substring(0, n));
	            
	           
	           
	        }

	    };
	    animation.play();
		
		
	}
	

	public void typingAnimationForCounterAttakcs(String displayDamageRecived, TextArea battleTextArea  )
	{
		
		final Animation animation = new Transition() 
	    {
	        {
	            setCycleDuration(Duration.seconds(0.5));
	        }

	        protected void interpolate(double frac) 
	        {
	            final int length = displayDamageRecived.length();
	            final int n = Math.round(length * (float) frac);
	            battleTextArea.setText(displayDamageRecived.substring(0, n));
	            
	           
	        }

	    };
	    animation.play();
		
	    
	  
		 
		
	}
	
	
	
	public void typingAnimationForExaminingMonsters(String battleState, TextArea battleTextArea  )
	{
		
		final Animation animation = new Transition() 
	    {
	        {
	            setCycleDuration(Duration.seconds(2.0));
	        }

	        protected void interpolate(double frac) 
	        {
	            final int length = battleState.length();
	            final int n = Math.round(length * (float) frac);
	            battleTextArea.setText(battleState.substring(0, n));
	            
	           
	           
	        }

	    };
	    animation.play();
	    
	  
		
		
	}
	
	

}
