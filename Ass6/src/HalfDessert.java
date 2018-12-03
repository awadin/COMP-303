//Author: Aidan Wadin
//Due Date: Nov. 15 2018
//Purpose: Its function is to change a dessert to a half price dessert when a whole meal is ordered. 
//NOTE: This is another implementation of a decorator class

public class HalfDessert implements ItemInterface
{
	//Takes an already existing dessert to alter
	private Dessert dessert;
	
	//Creates the new decorated object from the old dessert
	public HalfDessert(Dessert dessert)
	{
		this.dessert = dessert;
	}
	
	//The following 3 methods are identical to the Drink class (and inherently the Item abstract class) 
	
	public double getPrice()
	{
		return (this.dessert.getPrice()/2);
	}
	
	public String getName()
	{
		return this.dessert.getName();
	}
	
	public String getType()
	{
		return "halfdessert";
	}
	
}
