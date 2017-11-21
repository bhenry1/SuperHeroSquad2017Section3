package application.Dungeons;

import java.io.File;
import java.util.Scanner;

import javafx.animation.Animation;
import javafx.animation.Transition;
import javafx.scene.control.TextArea;
import javafx.util.Duration;

public class ArthurDungeonNavigationTextModel 
{
	private Scanner txtReader;
	
	public void openFile()
	{
		try
		{
			txtReader = new Scanner(new File("TextFiles/ArthurDungeon.txt"));
		}
		
		catch(Exception e)
		{
			System.out.println("Couldn't find the file");
		}
	}
	
	public String readFile(int roomNumber)
	{
		
		while(txtReader.hasNext())
		{
			String deDescription = txtReader.nextLine();
			if(roomNumber == 0) return deDescription;
			
			String room2Description = txtReader.nextLine();
			if(roomNumber == 2) return room2Description;
			
			String room3Description = txtReader.nextLine();
			if(roomNumber == 3) return room3Description;

			String room4Description = txtReader.nextLine();
			if(roomNumber == 4) return room4Description;

			String room5Description = txtReader.nextLine();
			if(roomNumber == 5) return room5Description;
	
			String room6Description = txtReader.nextLine();
			if(roomNumber == 6) return room6Description;
			
			String room7Description = txtReader.nextLine();
			if(roomNumber == 7) return room7Description;
			
			String room8Description = txtReader.nextLine();
			if(roomNumber == 8) return room8Description;
			
			String room9Description = txtReader.nextLine();
			if(roomNumber == 9) return room9Description;
			
			String room10Description = txtReader.nextLine();
			if(roomNumber == 10) return room10Description;
			
			String room11Description = txtReader.nextLine();
			if(roomNumber == 11) return room11Description;
			
		}
		
		return "";
	}

	public void closeFile()
	{
		txtReader.close();
	}
	
	
	public void tyingAnimation(String roomDescription, TextArea navigationTextArea)
	{
    final Animation animation = new Transition()
    {
        {
            setCycleDuration(Duration.seconds(3.0));
        }

        protected void interpolate(double frac) 
        {
            final int length = roomDescription.length();
            final int n = Math.round(length * (float) frac);
            navigationTextArea.setText(roomDescription.substring(0, n));
           
        }

    };
    animation.play();

	}
	
	public void setDiscoveredMonsterText(String discoveredMonster, TextArea navigationTextArea  )
	{
		
		final Animation animation = new Transition() 
	    {
	        {
	            setCycleDuration(Duration.seconds(1.0));
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
	
	
	
	
}
