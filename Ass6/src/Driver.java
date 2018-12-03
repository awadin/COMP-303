//Author: Aidan Wadin
//Due Date: Nov. 15 2018
//Purpose: The main driver that executes the program as specified by the instructions

public class Driver 
{
	public static void main(String args[])
	{
		
		OrderingSystem order = OrderingSystem.getInstance();
		
		order.listMenu();
		System.out.println( );
		order.addItem("ice cream");
		System.out.println( );
		order.isMeal();
		System.out.println( );
		order.createMeal();
		System.out.println( );
		
		order.addItem("chicken");
		
		order.addItem("cheese");
		
		order.isMeal();
		
		System.out.println( );
		
		order.addItem("beer");
		
		order.addIofd();
		System.out.println( );
		order.listOrder();
		System.out.println( );
		order.hasAlcohol();
		
		System.out.println( );
		
		order.pay();
		
	}
}
