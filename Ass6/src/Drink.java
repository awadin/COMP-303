//Author: Aidan Wadin
//Due Date: Nov. 15 2018
//Purpose: This simply takes exactly from the Item abstract class. It does not differ from that construction. 
//NOTE: This class will use a decorator to turn a drink alcoholic

public class Drink extends Item
{
	private double price;
	private String name;
	private String type;
	
	public Drink(String name, double price)
	{
		super(name, price, "drink");
	}

}
