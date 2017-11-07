package application.Combat;

public class Monster 
{
	public int monsterHealth;
	public int monsterPower;
	
	
	
	public void setMonsterStats(String monsterName)
	{
		if(monsterName.equals("Jiggy"))
		{
			monsterHealth = 11;
			monsterPower = 3;
		}
		
		if(monsterName.equals("Zaw"))
		{
			monsterHealth = 13;
			monsterPower = 4;
		}
		
		if(monsterName.equals("Street Rat"))
		{
			monsterHealth = 12;
			monsterPower = 7;
		}
		
		if(monsterName.equals("Dungeon Master Zul"))
		{
			monsterHealth = 30;
			monsterPower = 10;
		}
		
		
	}
	
}
