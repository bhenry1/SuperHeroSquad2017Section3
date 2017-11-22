package application.CityElements;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RiddleModel 
{
	private Scanner rInput;
	
	
	public void openRiddleText()
	{
		try {
			rInput = new Scanner(new File("TextFiles/Riddles.txt"));
		} 
			catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
	
	public String readPuzzle()
	{
		while(rInput.hasNext())
		{
			String clourtavRiddle = rInput.nextLine();
			
			return clourtavRiddle;
			
			
		}
		
		return "";
	}
	
	public void closeFile()
	{
		rInput.close();
	}
}
