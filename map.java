//Programmer: Aidan Wadin
//Program: Map
//Created: Sept. 8, 2018
//Purpose: This class creates the map upon request from the MapMain method and is altered accordingly by user input. 
public class map 
{	
	//These to variables are privately stored in this class as requested by the assignment 
	private int maxRow;
	private int maxWidth;
	private char[][] matrix;
	
	//This is the constructor class that creates the basic map by filling a 2d array with water characters in the given dimensions.
	map(int maxRow, int maxWidth)
	{
		//When the constructor is called, the private variables holding the maxRow and maxWidth information are updated
		if(maxRow > 0 && maxWidth > 0)
		{
			this.maxRow = maxRow;
			this.maxWidth = maxWidth;
		}
		else
		{
			System.out.println("Negative values are not allowed!");
			return;
		}
		//The new map is created with the given dimensions, it also updates the private variable giving the map its proper dimensions
		this.matrix = new char[maxRow][maxWidth];
		//This nested for loop fills the 2d array with the "~" character as per instructed
		for(int r = 0; r < maxRow; r++)
		{
			for(int c = 0; c < maxWidth; c++)
			{
				this.matrix[r][c] = '~';
			}
		}
	}
	
	//This method will be called from the MapMain method to update the map by looping through the created 2d array and replacing the proper value
	public void update(int row, int column, char symbol)
	{
		this.matrix[row][column] = symbol;
	}
	
	//This method simply loops through the entire map and prints it out for the user to see
	public void printMap()
	{
		for(int r = 0; r < maxRow; r++)
		{
			for(int c = 0; c < maxWidth; c++)
			{
				System.out.print(this.matrix[r][c]);
			}
			System.out.println();
		}
	}
	
	//This method is used to check and see if the integer put in by the user to take the place of the maxRow or maxWidth variable is a valid one
	//It is already checked in the mapMain method whether or not the input value is an integer or not
	public static int validIntInput(int in)
	{
		if(in > 0)
			return in;
		else
		{
			System.out.println("This is not a valid coordinate! Please try again.");
			return -1;
		}
	}
	
	//This method is used to ask the user if they would like to make another alteration to the map
	//The value returned determines if the loop in the main method will continue
	//False = end program
	//True = continue program
	public static boolean prompt(String in)
	{
		if(in.equals("N") || in.equals("n"))
		{
			return false;
		}
		else if(in.equals("Y") || in.equals("y"))
		{
			return true;
		}
		else
		{
			System.out.println("Invalid input detected, terminating program");
			return false;
		}
	}
	
	//This method is to check if a user inputed integer is a valid place within the previously created map
	public static int rowColInputValid(int in, int maxNum)
	{	
		if(in < 0 || in > maxNum)
		{
			System.out.println("This is not within your created map, please try again.");
			//This information is to help the user understand what values are allowed
			System.out.println("Valid values lie bewteen: 0-" + maxNum);
			return -1;
		}
		else
		{
			//The only way to break this loop is to enter an integer that fits within the already created number of rows/columns
			return in;
		}

	}
	
	//This method is to check if a user inputed character is valid or not
	public static char isValidSymbol(char in)
	{
		if(in == '~')
		{ 
			return '~';
		}
		else if(in == 'G')
		{
			return 'G';
		}
		else if(in == '#')
		{
			return '#';
		}
		else
			//If none of these characters are matched, an empty char is returned, restarting the loop and asking the user for a new char
			return ' ';
	}
	

}
