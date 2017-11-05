package application.Dungeons;

import java.io.File;
import java.util.Scanner;

import javafx.animation.Animation;
import javafx.animation.Transition;
import javafx.scene.control.TextArea;
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
	
	public String readFile(int roomNumber)
	{
		
		while(txtReader.hasNext())
		{
			String deDescription = txtReader.nextLine();
			if(roomNumber == 0)
			return deDescription;
			
			String room3Description = txtReader.nextLine();
			if(roomNumber == 3)
			return room3Description;
			
			String room4Description = txtReader.nextLine();
			if(roomNumber == 4)
			return room4Description;
			
			String room8Description = txtReader.nextLine();
			if(roomNumber == 8)
			return room8Description;
			
			String room9Description = txtReader.nextLine();
			if(roomNumber == 9)
			return room9Description;
			
			String room10Description = txtReader.nextLine();
			if(roomNumber == 10)
			return room10Description;
					
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
            setCycleDuration(Duration.seconds(7.0));
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
	
	
	public void setTextArea(String discoveredMonster, TextArea navigationTextArea  )
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
	
	
	
	public void setTextAreaBoss(String discoveredBoss, TextArea navigationTextArea  )
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
