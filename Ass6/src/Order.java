//Author: Aidan Wadin
//Due Date: Nov. 15 2018
//Purpose: This class represents the Composite component of the Composite pattern, as it can act upon a whole selection of items at once. 
//It also implements the same ItemInterface, putting it in a similar category as its leaves, allowing for easy manipulation

import java.util.ArrayList;    
import java.util.Iterator;

public class Order implements ItemInterface
{
	//This will be the list of items in a given order
	private ArrayList<ItemInterface> list;
	
	//Ther constructor simply created the list properly
	public Order()
	{
		this.list = new ArrayList<ItemInterface>();
	}
	
	//Allows new items to be added to the order
	//These items must be of the proper type, not just items, but anything implementing the ItemIneterface
	public void addToOrder(ItemInterface item)
	{
		if(item == null)
			return;
		else
			this.list.add(item);
	}
	
	//Allows items to be removed from the order
	//These items must be of the proper type, not just items, but anything implementing the ItemIneterface
	public void removeFromOrder(ItemInterface item)
	{
		if(this.list.contains(item))
			this.list.remove(item);
		else
			System.out.println("This item was not found in your order, therefore your order has not been altered");
					
	}
	
	//It does what composite patterns do best, uses a common method across all leaves and brings them all together and calculates a common value. 
	public double getPrice()
	{
		double sum = 0;
		for(ItemInterface i : list)
		{
			sum += i.getPrice();
		}
		return sum;
	}
	
	//This getName() method will get the name and the price for all current items in the order
	//It displays this information to the user
	public String getName()
	{
		for(ItemInterface i : list)
		{
			System.out.println(i.getName() + " " + i.getPrice() + "$");
		}
		System.out.println(getPrice() + "$");
		return null;
	}
	
	//This loops through all of the current items in the list and returns their type. 
	//this is useful when trying to decide if the order contains a full meal or not
	public String getType()
	{
		String s = "";
		for(ItemInterface i : list)
		{
			s += i.getType() + " ";
		}
		return s;
	}
	
	//This loops through all items in the current order and checks if any items are alcohol
	//If there is alcohol present, it displays the proper warning
	public void hasAlcohol()
	{
		for(ItemInterface i : list)
		{
			if(i.getClass().equals(DrinkADecorator.class))
			{
				System.out.println("Note! One item in your order requires the customer to be 18+");
			}
		}
	}
	
	//Method used to change the dessert to a half-priced dessert when a full meal is present in an order
	public void replaceDessert()
	{
		ItemInterface dessert = null;
		//Go through the current order
		for(ItemInterface i : list)
		{
			//When the current dessert in the order is found, it has to be replaced with the new half-priced dessert
			if(i.getType().equals("dessert"))
			{
				//The item of the day cannot be cast as a dessert, so this restaurant took the easy solution and said no one item can have multiple discounts :)
				if(i.getClass().getName().equals("ItemOfTheDay"))
				{
					System.out.println("The item of the day cannot be given additional discounts.");
					break;
				}
				else
					System.out.println("The orignal price of your dessert has now been halved! Thanks for ordering a full meal!");
				//If the dessert has already been turned to its half price cousin, do not try to change it again!
				if(i.getType().equals("halfdessert"))
					break;
				//This variable is here so that the ArrayList is not altered while it is being iterated over, as that would raise an exception
				dessert = i;
			}
		}
		//This creates the half dessert, removes the old dessert from the order and puts in the discounted one!
		HalfDessert discount = new HalfDessert((Dessert) dessert);
		removeFromOrder(dessert);
		addToOrder(discount);
	}
	
}
