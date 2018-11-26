//Programmer: Aidan Wadin   
//Program: MapMain
//Created: Sept. 8, 2018
//Purpose: This class runs the user interface for the Map class. 
import java.util.InputMismatchException;   
import java.util.Scanner;

public class mapmain 
{
	public static void main(String args[])
	{
		//These are the two variables that are the length and width of the created map
		int maxRow = -1;
		int maxWidth = -1;
		//These two variables will be used to hold the coordinates to where the user wants to update on the map
		int rowIn = -1;
		int colIn = -1;
		//This variable is first used around line 60, it manages the loop for whether the user would like to make a second, or third alteration to the map
		boolean yn = true; 
		//This variable will first be used around line 100, it will be the variable that holds what symbol the user would like to put into the map when altering it
		char charIn = ' ';
		
		//This is the scanner that will handle the user input
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Map!");
		
		//This is an infinite loop that will reset whenever an improper input is given by the user
		while(1 < 2)
		{
			//This try-catch statement is used to make sure the user inputs an integer
			try
			    {
					//If the maxRow field has not been changed, then continue operations to update row
					if(maxRow == -1)
					{
						System.out.println("Please input the maximum number of rows: ");
						//This checks if the input integer is valid per the instructions
						maxRow = map.validIntInput(input.nextInt());
					}
					//If the maxRow field has been changed, then continue operations to update column
					else
					{
						System.out.println("Please input the maximum number of columns: ");
						maxWidth = map.validIntInput(input.nextInt());
					}
			    }
			//If the input is an incorrect value (aka not an integer), the user will be told of the error and the loop will reset.
			catch (InputMismatchException exception)
			    {
			        System.out.println("Integers only, try again");
			        input.next();
			        continue; 
			    }
			//The infinite loop will only break if both maxRow and maxWidth have been successfully updated
			if(maxRow > 0 && maxWidth > 0)
				break;
		}	

		//Inform the user the map has successfully been created
		map newMap = new map(maxRow, maxWidth);
		System.out.println("The map has been created!");
		
		//Inform the user on what actions they may take now
		System.out.println("You may now alter the map using ~ for water, G for grass, or # for trees ");
		
		//This is the loop that will continue until the user types "N" or "n" when prompted, or when the user inputs the wrong input when prompted
		while(yn)
		{
		
			//Infinite loop for entering the row and column coordinates to be changed, if an error occurs, the user is returned to the beginning of this loop
			while(1 < 2)
			{
				//If the row input variable has not been updated, run the function on it, otherwise run it on columns
				if(rowIn == -1)
					System.out.println("Row: ");
				else
					System.out.println("Column: ");
				//This try-catch is to make sure the user inputs an integer, the loop will automatically reset if they do not
				try
				{
					//If the row input variable has not been updated, then run the function on it, otherwise run it on columns
					if(rowIn == -1)
						rowIn = map.rowColInputValid(input.nextInt(), maxRow - 1);
					else
						colIn = map.rowColInputValid(input.nextInt(), maxWidth - 1);
				}
				catch (InputMismatchException exception)
				{
					System.out.println("Integers only, try again");
					input.next();
					continue;
				}
				//The loop will only ever end if both coordinates have been properly stored in their respective variables
				if(rowIn != -1 && colIn != -1)
					break;
				else
					continue;
			}

			//infinite while loop for what symbol the user will be placing in their map
			while(1 < 2)
			{
				System.out.println("Symbol: ");
				//This parses the input so that only the first char entered is read
				charIn = map.isValidSymbol(input.next().charAt(0));
				//If the isValidSymbol doesn't return a valid symbol, the loop will reset
				if(charIn == ' ')
				{
					System.out.println("valid characters only, try again");
					System.out.println("valid characters are: #, G, or ~");
					continue;
				}
				else
				{
					break;
				}
			}
			
			//Call to the map class to alter the map at the recently input coordinates
			newMap.update(rowIn, colIn, charIn);
			//Ask the user if they would like to update it again
			System.out.println("Would you like to make another alteration (Y/N)?: ");
			yn = map.prompt(input.next());
			//If the loop resets, so does the input row and column values so that the loop executes properly
			if(yn)
			{
				rowIn = -1;
				colIn = -1;
			}
		}
	//Display the final Map
	newMap.printMap();
	//Close input stream buffer	
	input.close();	
	}
}
