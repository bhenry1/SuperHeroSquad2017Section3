package application.CityElements;

import Items.Items;

public class ShopModel extends Items
{
    int swordCounter;

	
	public int buySword()
	{
		swordCounter++;
		return swordCounter;
	}
	
	public int getSwordCounter()
	{

		return swordCounter;
			
	}
	
	
	
	
	
	
	
	
	
}
