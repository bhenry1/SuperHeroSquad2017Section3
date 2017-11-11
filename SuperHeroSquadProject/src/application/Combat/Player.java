package application.Combat;

public class Player 
{
	public int playerLevel;
	public int playerHealth;
	public int playerstrength;
	public int playerDefense;
	public int expirence;
	
	
	public Player(int playerLevel, int playerHealth, int playerstrength, int playerDefense, int expirence)
	{
		this.playerLevel = playerLevel;
		this.playerHealth = playerHealth;
		this.playerstrength = playerstrength;
		this.playerDefense = playerDefense;
		this.expirence = expirence;
				
	}
	
	
	
	public void levelUp()
	{
		playerLevel++;
		playerHealth+=2;
		playerstrength++;
		playerDefense++;
		
	}
	
	
	
	
	
	
}
