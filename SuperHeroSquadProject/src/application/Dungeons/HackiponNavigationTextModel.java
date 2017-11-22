package application.Dungeons;

import java.io.File;
import java.util.Scanner;

import javafx.animation.Animation;
import javafx.animation.Transition;
import javafx.scene.control.TextArea;
import javafx.util.Duration;

public class HackiponNavigationTextModel 
{
	public Scanner reader;
	
	public void openFile()
	{
		try
		{
			 reader = new Scanner(new File("TextFiles/HackiponDungeon.txt"));
		}
		
		catch(Exception e)
		{
			System.out.println("Couldn't find the file");
		}
	}
	
	
	public String readFile(int roomNumber)
	{
		
		while(reader.hasNext())
		{
			String deDescription = reader.nextLine();
			if(roomNumber == 0)
			return deDescription;
			
			String room2Description = reader.nextLine();
			if(roomNumber == 2)
			return room2Description;
			
			String room3Description = reader.nextLine();
			if(roomNumber == 3)
			return room3Description;
			
			String room4Description = reader.nextLine();
			if(roomNumber == 4)
			return room4Description;
			
			String room5Description = reader.nextLine();
			if(roomNumber == 5)
			return room5Description;
			
			String room6Description = reader.nextLine();
			if(roomNumber == 6)
			return room6Description;
			
			String room7Description = reader.nextLine();
			if(roomNumber == 7)
			return room7Description;
			
			String room8Description = reader.nextLine();
			if(roomNumber == 8)
			return room8Description;
			
			String room9Description = reader.nextLine();
			if(roomNumber == 9)
			return room9Description;
			
			String room10Description = reader.nextLine();
			if(roomNumber == 10)
			return room10Description;
			
			String room11Description = reader.nextLine();
			if(roomNumber == 11)
			return room11Description;
			
			//Doesnt exist
			String room12Description = reader.nextLine();
			if(roomNumber == 12)
			return room12Description;
			
			String room13Description = reader.nextLine();
			if(roomNumber == 13)
			return room13Description;
			
			String room14Description = reader.nextLine();
			if(roomNumber == 14)
			return room14Description;
			
			//Bugged out
			String room15Description = reader.nextLine();
			if(roomNumber == 15)
			return room15Description;
					
		}
		
		return "";
	}
	
	
	public void closeFile()
	{
		reader.close();
	}
	
	
	public void setTextArea(String discoveredMonster, TextArea navigationTextArea  )
	{
		
		final Animation animation = new Transition() 
	    {
	        {
	            setCycleDuration(Duration.seconds(6.0));
	        }

	        protected void interpolate(double frac) 
	        {
	            final int length = discoveredMonster.length();
	            final int n = Math.round(length * (float) frac);
	            navigationTextArea.setText(discoveredMonster.substring(0, n));
	           
	        }

	    };
	    animation.play();
		
		
	}
	
	
	public void setTextAreaMonster(String discoveredBoss, TextArea navigationTextArea  )
	{
		
		final Animation animation = new Transition() 
	    {
	        {
	            setCycleDuration(Duration.seconds(1.0));
	        }

	        protected void interpolate(double frac) 
	        {
	            final int length = discoveredBoss.length();
	            final int n = Math.round(length * (float) frac);
	            navigationTextArea.setText(discoveredBoss.substring(0, n));
	           
	        }

	    };
	    animation.play();
		
		
	}
	
	
	
}
