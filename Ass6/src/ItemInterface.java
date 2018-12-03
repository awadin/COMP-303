//Author: Aidan Wadin
//Due Date: Nov. 15 2018
//Purpose: This interface acts as the interface for the composite pattern
//NOTES:
//It will act as the main way to relate the items together and group them in a common data structure, even if the items themselves may 
//have minor differences between them

public interface ItemInterface 
{
	//These methods are the most basic ones required to be implemented by any concrete composite or leaf that uses this interface
	public double getPrice();
	public String getName();
	public String getType();
}
