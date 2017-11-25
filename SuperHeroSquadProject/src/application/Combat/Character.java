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

	//Hackipon
	public int angrySlimePower = 5;
	public int bugoPower = 4;
	public int tricksterPower = 4;
	public int dmOgrePower = 8;
	//Arthur
	public int hellScoutPower = 4;
	public int mercenaryPower = 5;
	public int slimeKingPower = 7;
	//Hifenoir
	public int devourerPower = 6;
	public int sucPower = 6;
	public int darkKnightPower = 8;
	


	
	

	
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

    		damageRecived = 2 + (int)(Math.random() * ((damageRecived - 1) + 2));

			return damageRecived;
			
		}
		
		if(monsterName.equals("Thief"))
		{
			damageRecived = elephantkinPower - playerDefense;
    		damageRecived = 2 + (int)(Math.random() * ((damageRecived - 1) + 2));

			return damageRecived;
			
		}
		
		if(monsterName.equals("DM: Guardsman"))
		{
			damageRecived = elephantkinPower - playerDefense;
    		damageRecived = 4 + (int)(Math.random() * ((damageRecived - 1) + 4));

			return damageRecived;
			
		}
		
		if(monsterName.equals("Angry Slime"))
		{
			damageRecived = angrySlimePower - playerDefense;
    		damageRecived = 4 + (int)(Math.random() * ((damageRecived - 1) + 4));

			return damageRecived;
			
		}
		
		if(monsterName.equals("Bugo"))
		{
			damageRecived = bugoPower - playerDefense;
    		damageRecived = 3 + (int)(Math.random() * ((damageRecived - 1) + 3));

			return damageRecived;
			
		}
		
		
		if(monsterName.equals("Trickster"))
		{
			damageRecived = tricksterPower - playerDefense;
    		damageRecived = 3 + (int)(Math.random() * ((damageRecived - 1) + 3));

			return damageRecived;
			
		}
		
	
		
		if(monsterName.equals("DM: Ogre"))
		{
			damageRecived = dmOgrePower - playerDefense;
    		damageRecived = 3 + (int)(Math.random() * ((damageRecived - 1) + 3));

			return damageRecived;
			
		}
		
		if(monsterName.equals("Hell Scout"))
		{
			damageRecived = hellScoutPower - playerDefense;
    		damageRecived = 2 + (int)(Math.random() * ((damageRecived - 1) + 1));

			return damageRecived;
			
		}
		
		if(monsterName.equals("Mercenary"))
		{
			damageRecived = mercenaryPower - playerDefense;
    		damageRecived = 2 + (int)(Math.random() * ((damageRecived - 1) + 2));

			return damageRecived;
			
		}
		
		if(monsterName.equals("DM: Slime King"))
		{
			damageRecived = mercenaryPower - playerDefense;
			damageRecived = 3 + (int)(Math.random() * ((damageRecived - 1) + 3));
			return damageRecived;
			
		}
		

		if(monsterName.equals("Devourer"))
		{
			damageRecived = devourerPower - playerDefense;
    		damageRecived = 5 + (int)(Math.random() * ((damageRecived - 1) + 3));

			return damageRecived;
			
		}
		
		if(monsterName.equals("Succubus"))
		{
			damageRecived = sucPower - playerDefense;
    		damageRecived = 3 + (int)(Math.random() * ((damageRecived - 1) + 1));

			return damageRecived;
			
		}
		
		if(monsterName.equals("DM: Dark Knight"))
		{
			damageRecived = darkKnightPower - playerDefense;
    		damageRecived = 5 + (int)(Math.random() * ((damageRecived - 1) + 2));

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
