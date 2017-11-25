package application.Combat;

import java.io.File;
import java.io.IOException;
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
	public String readFile()
	{
		
		while(txtReader.hasNext())
		{
			String equipWarning = txtReader.nextLine();
			return equipWarning;
			
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
	
	

}
