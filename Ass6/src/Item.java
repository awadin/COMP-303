//Author: Aidan Wadin
//Due Date: Nov. 15 2018
//Purpose: All separate food items have these similar methods implemented in similar ways, so this abstract class is where the common methods are taken from for each separate item
//This is created to prevent repeat of common code
//NOTES:
//Because there is no such thing as an "item" object, as that is too general, this class will never need to be instantiated, so it is abstract
//This also acts as the main "lighting rod" for leaves for the composite pattern
//Each item that extends this class will be a leaf of the composite pattern

public abstract class Item implements ItemInterface
{
	//These will be common private variables for every item
	private double price;
	private String name;
	private String type;
	
	//All items will follow similar constructor structures. If they stray from this template, they will be done so within their own constructor, overriding this one
	public Item(String name, double price, String type)
	{
		this.name = name;
		this.price = price;
		this.type = type;
	}
	
	//Access to the private variable
	public double getPrice()
	{
		return this.price;
	}
	
	//Access to the private variable
	public String getName()
	{
		return this.name;
	}
	
	//Access to the private variable
	public String getType()
	{
		return this.type;
	}
}
