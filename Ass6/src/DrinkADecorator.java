//Author: Aidan Wadin
//Due Date: Nov. 15 2018
//Purpose: It creates a drink as an alcoholic drink, so that the order program is aware to give the customer the proper 18+ warning
//NOTES:
//This is an implementation of a decorator class
//This is the decorator for the Drink class

public class DrinkADecorator implements ItemInterface
{
	//Take an already existing drink
	private Drink alcohol;
	
	//Turn that drink into an alcoholic drink
	public DrinkADecorator(Drink drink)
	{
		this.alcohol = drink;
	}
	
	//The following 3 methods are identical to the Drink class (and inherently the Item abstract class)
	
	public double getPrice()
	{
		return this.alcohol.getPrice();
	}
	
	public String getName()
	{
		return this.alcohol.getName();
	}
	
	public String getType()
	{
		return this.alcohol.getType();
	}
	
}
