
//Author: Aidan Wadin
//Date: November 26, 2018
//Purpose: This is our own created object FOOD. It holds the proper values and methods requested by the instructions

public class Food 
{
	private String name;
	private int carbs;
	private int fat;
	private int proteins;
	
	public Food(String name, int c, int f, int p)
	{
		this.name = name;
		this.carbs = c;
		this.fat = f;
		this.proteins = p;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getCarbs()
	{
		return this.carbs;
	}
	
	public int getFat()
	{
		return this.fat;
	}
	
	public int getProteins()
	{
		return this.proteins;
	}
}
