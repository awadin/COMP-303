//Author: Aidan Wadin
//Due Date: Nov. 15 2018
//Purpose: This class takes any item, and turns it into the item of the day, giving it the corresponding traits specified in the directions
//NOTE: This is yet another example of a decorator class
public class ItemOfTheDay implements ItemInterface
{
	//Takes any item
	private ItemInterface item;
	
	//Creates the new ItemOfTheDay object
	public ItemOfTheDay(ItemInterface i)
	{
		this.item = i;
	}
	
	//This getPrice method is a bit different, as the price must be altered accoring to the "daily" discount
	public double getPrice()
	{
		//This is a changeable number that ultimately becomes the percentage of the discount
		double discount = 15;
		//This variable turns the above number into the proper percentage, and calculates how many dollars that discount comes out to
		double moneyOff = (this.item.getPrice()*(discount/100));
		//This variable holds the final new price after the discounted amount has been subtracted
		double total = this.item.getPrice() - moneyOff;
		//These last 2 lines simple truncate the final answer to 1 decimal place, to keep calculations simple and clear
		total = Math.round(total* 10);
		return total/10;
	}
	
	//These following 2 methods are simply repeats of the Item class, assigning the proper values to the proper get methods
	
	public String getName()
	{
		return this.item.getName();
	}
	
	public String getType()
	{
		return this.item.getType();
	}
	
}
