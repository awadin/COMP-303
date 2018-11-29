import java.util.ArrayList;

//Author: Aidan Wadin
//Date: November 26, 2018
//Purpose: This is the Table class that uses the Template design pattern. It is the subclass and concrete implementation of TableTM

public class TableFoodTM  extends TableTM<Food>
{
	
	public TableFoodTM(ArrayList<String> header)
	{
		super(header);
	}
	
	//This is a repeat method from its super class that allows for alterations using FOOD instead of just a generic
	public void addItem(Food item)
	{
		super.addItem(item);
	}
	
	//This is a repeat method from its super class that allows for alterations using FOOD instead of just a generic
	public void removeItem(Food item)
	{
		super.addItem(item);
	}

	//This method is particular to this kind of table, so it is only implemented in the foodTable class
	@Override
	protected int calculate(int carbs, int fat, int protein) 
	{
		return (carbs*4) + (fat*9) + (protein*4);
	}

	//This method is particular to this kind of table, so it is only implemented in the foodTable class
	@Override
	protected void printRow(Food t, int headerLength)
	{
		String foodName = "";
		Food food = (Food) t;
		foodName = food.getName();
		int calories = calculate(food.getCarbs(), food.getFat(), food.getProteins());
		String cals = calories + "";
		String calWord = "cals";
		
		System.out.format("%9s %6s %5s", foodName, cals, calWord);
		
	}
}
