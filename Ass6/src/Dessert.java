//Author: Aidan Wadin
//Due Date: Nov. 15 2018
//Purpose: This simply takes exactly from the Item abstract class. It does not differ from that construction. 

public class Dessert extends Item
{
	private double price;
	private String name;
	private String type;
	
	public Dessert(String name, double price)
	{
		super(name, price, "dessert");
	}
	
}
