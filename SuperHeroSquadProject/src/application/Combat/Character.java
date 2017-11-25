package application.Combat;

import Items.Inventory;

public class Character extends Inventory
{
	//Player
	public int playerLevel = 1;
	public int maxPlayerHealth =  20;
	public int playerHealth =  20;

	public int playerstrength = 1; 
	public int playerDefense = 1; 
	public int expirence;
	public int damageDealt;
	
	//Weapons
	public int knifePower = 3;
	public int swordPower = 5;
	public int longSwordPower = 7;
	public int gunBladePower = 12;
	public int mightyAxePower = 15;
	
	public boolean knifeEquipped;
	public boolean swordEquipped;
	public boolean longSwordEquipped;
	public boolean gunBladeEquipped;
	public boolean mightyAxeEquipped;

	CombatTextModel cbmtm = new CombatTextModel();




	//Monsters
	public int monsterHealth;
	public int damageRecived; 
	public int jiggyAttackPower = 3;
	public int jiggyHealth = 11;
	public int zawAttackPower = 4;
	public int streetRatPower = 3;
	public int dungeonMasterZulPower = 7;
	public int batPower = 3;
	public int goblinComPower = 5;
	public int elephantkinPower = 4;
	public int thiefPower = 3;
	public int dmGuardsmanPower = 6;
	
	public int monsterCounterAtk(String monsterName)
	{
		if(monsterName.equals("Jiggy"))
		{
			System.out.println(playerDefense);
			damageRecived = jiggyAttackPower - playerDefense;
    		damageRecived = 2 + (int)(Math.random() * ((damageRecived - 1) + 1));

			return damageRecived;
		
			
		}
		
		if(monsterName.equals("Zaw"))
		{
			damageRecived = zawAttackPower - playerDefense;
    		damageRecived = 3 + (int)(Math.random() * ((damageRecived - 1) + 1));

			return damageRecived;
			
		}
		
		if(monsterName.equals("Street Rat"))
		{
			damageRecived = streetRatPower - playerDefense;
    		damageRecived = 2 + (int)(Math.random() * ((damageRecived - 1) + 1));

			return damageRecived;
			
		}
		
		if(monsterName.equals("Dungeon Master Zul"))
		{
			damageRecived = dungeonMasterZulPower - playerDefense;
    		damageRecived = 5 + (int)(Math.random() * ((damageRecived - 1) + 1));

			return damageRecived;
			
		}
		
		if(monsterName.equals("Bat"))
		{
			damageRecived = batPower - playerDefense;
    		damageRecived = 1 + (int)(Math.random() * ((damageRecived - 1) + 1));

			return damageRecived;
			
		}
		
		
		if(monsterName.equals("DM: Goblin Capt."))
		{
			damageRecived = goblinComPower - playerDefense;
    		damageRecived = 3 + (int)(Math.random() * ((damageRecived - 1) + 3));

			return damageRecived;
			
		}
		

		if(monsterName.equals("Elephant Kin"))
		{
			damageRecived = elephantkinPower - playerDefense;
    		damageRecived = 3 + (int)(Math.random() * ((damageRecived - 1) + 3));

			return damageRecived;
			
		}
		
		
		
		
		
		return 0;
	}
	
	public int getNewHealth(int monsterDamage)
	{
		playerHealth = playerHealth - monsterDamage;
		return playerHealth;
		
	}
	
	
	
}
