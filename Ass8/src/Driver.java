import java.util.ArrayList;

//Author: Aidan Wadin
//Date: November 26, 2018
//Purpose: This is the main driver class. It creates the needed variables and data structures to test my code 
//and output its values for the graders to see.

public class Driver 
{
	public static void main(String args[])
	{
		//The header is filled with the proper values as defined by the instructions
		ArrayList<String> header = new ArrayList<>();
		header.add("Name");
		header.add("Calories");
		
		//These food objects are created and will be used to show off my codes implementation
		Food banana = new Food("banana", 27, 0, 1 );
		Food egg = new Food("egg", 0, 5, 6);
		Food bagel = new Food("bagel", 56, 2, 11);
		
		//First, the strategy implementation
		System.out.println("Strategy:");
		System.out.println( );
		
		//Our new strategy uses the FOOD implementation
		Strategy foodstrat = new ContextFood();
		Table table = new Table(foodstrat, header);
		table.addItem(banana);
		table.addItem(egg);
		table.addItem(bagel);
		table.print();
		
		System.out.println( );
		
		//Template implementation
		System.out.println("Template: ");
		System.out.println( );
		
		//We use the FOOD subclass to complete this implementation
		TableTM tableT = new TableFoodTM(header);
		tableT.addItem(banana);
		tableT.addItem(egg);
		tableT.addItem(bagel);
		tableT.print();
		
		System.out.println( );
		
		System.out.println(":)");
	}
}
