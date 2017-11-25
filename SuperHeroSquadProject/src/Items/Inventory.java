package Items;

import java.util.ArrayList;
import java.util.HashMap;

public class Inventory 
{

	public static final HashMap<String, Integer> map = new HashMap<>();
	
    public int knifeCounter;
	public int swordCounter;
    public int longSwordCounter;
    public int gunBladeCounter;
    public int mightyAxeCounter;
    
    public int robeCounter;
    public int leatherClothesCounter;
    public int ironPlatingCounter;
    public int steelArmorCounter;
    
    public int potionCounter;
    public int highPotionCounter;
    public int powerPotionCounter;
    public int defensePotionCounter;


	public void addKnife()
	{
		knifeCounter++;
		map.put("Knife", knifeCounter);
	}
	
	public void addSword()
	{
		swordCounter++;
		map.put("Sword", swordCounter);
		
	}
	
	public void addLongSword()
	{
		longSwordCounter++;
		map.put("LongSword", longSwordCounter);
	}
	
	public void addGunBlade()
	{
		gunBladeCounter++;
		map.put("GunBlade", gunBladeCounter);
	}
	
	public void addMightyAxe()
	{
		mightyAxeCounter++;
		map.put("MightyAxe", mightyAxeCounter);
	}
	
	public void addRobe()
	{
		robeCounter++;
		map.put("Robe", robeCounter);
	}
	
	public void addLeatherClothes()
	{
		leatherClothesCounter++;
		map.put("LeatherClothes", leatherClothesCounter);
	}
	
	public void addIronPlating()
	{
		ironPlatingCounter++;
		map.put("IronPlating", ironPlatingCounter);
	}
	
	public void addSteelArmor()
	{
		steelArmorCounter++;
		map.put("SteelArmor", steelArmorCounter);
	}

	public void addPotion()
	{
		potionCounter++;
		map.put("Potion", potionCounter);
	}
	
	
	public void addHighPotion()
	{
		highPotionCounter++;
		map.put("HighPotion", highPotionCounter);
	}
	
	public void addPowerPotion()
	{
		powerPotionCounter++;
		map.put("PowerPotion", powerPotionCounter);
	}
	
	public void addDefensePotion()
	{
		defensePotionCounter++;
		map.put("DefensePotion", defensePotionCounter);
	}
	
	public int removePotion()
	{
		potionCounter--;
		return potionCounter;
		
	}
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
}
