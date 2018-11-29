
//Author: Aidan Wadin
//Date: November 26, 2018
//Purpose: This is the concrete class that uses the strategy interface
//It implements a class whose methods deal with food items, it could have been designed to handle other specific implementations as well
//This class defines how the interface methods will be executed, in order to fit a certain need/ implementation

public class ContextFood<T> implements Strategy<T>
{
	
	//Calculates calories using the given formula
	public int calculate(int carbs, int fat, int protein)
	{
		return (carbs*4) + (fat*9) + (protein*4);
	}
	
	//Prints out a given row to the user in the proper format
	public void printRow(T t, int headerLength)
	{
		String foodName = "";
		//Cast the generic to fit this classes certain implementation
		Food food = (Food) t;
		foodName = food.getName();
		int calories = calculate(food.getCarbs(), food.getFat(), food.getProteins());
		String cals = calories + "";
		String calWord = "cals";
		
		//This is a special print statement that allows the user to configure how the information is displayed
		System.out.format("%9s %6s %5s", foodName, cals, calWord);
		
	}
}
