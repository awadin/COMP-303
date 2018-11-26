//Programmer: Aidan Wadin
//Program: MapTest
//Created: Sept. 8, 2018
//Purpose: This class tests all the methods within the Map class.
public class MapTest
{
	public static void main(String args[])
	{
		//First I will test the constructor and printMap methods. 
		//The constructor is tested with various maxRow/Width inputs, we see whether there were any errors through the output. 
		//The print map simply displays what we just created, therefore if there are any errors there as well we would see them
		System.out.println("(1) Test case for printMap(): ");
		System.out.println("This test showcases the constructor validity and the printMap() effectivness");
		for(int i = -5; i < 5; i++)
		{
			for(int j = 5; j > -5; j--)
			{
				printMapTest(i, j);
			}
		}
		
		//These prints will be put in between each test to make it easier for the graders to find where one test ends and the next begins ;)
		System.out.println( );
		System.out.println( );
		
		//Second test is for whether or not the input values will be allowed or not for the maxRow and maxWidth variables according to the instructions
		//This tests the validIntInput test by giving it negative AND positive integers to make sure the program handles both properly
		System.out.println("(2) This second test will be for the validIntInput(): ");
		for(int i = -10; i < 20; i++)
		{
			validIntInputTest(i);
		}
		
		System.out.println( );
		System.out.println( );
		
		//This third test is to test the inputs for the prompt() method
		//The prompt() method is given both valid and invalid arguments to make sure all are properly evaluated
		System.out.println("(3)The third test will be for the prompt() method: ");
		for(int i = 0; i < 128; i++)
		{
			char input = (char)i;
			promptTest(input);
		}
		
		System.out.println( );
		System.out.println( );
	
		//This fourth test is to test the inputs for the rowColInputValid() method
		//This test is a bit more complicated to test, the i input of this test sets the maxRow/maxWidth variable
		//Then, the j variable gives a range of negative and positive integers are tested against this input variable to see if the map would have the input coordinate, and whether it could be altered or not
		System.out.println("(4) The fourth test will be for the rowColInputValid(): ");
		for(int i = 10; i > -5; i--)
		{
			//This loop checks a range of values to each of the input dimensions, ensure a full test of the method
			for(int j = -5; j < 10; j++ )
			{
				rowColInputValidTest(i, j);
			}
		}
		
		System.out.println( );
		System.out.println( );
		
		//This fifth test is to test the inputs for the isValidSymbol() method
		//The isValidSymbol is given  range of inputs and shows how the program would handle both valid and invalid inputs
		System.out.println("(5) The fifth test will be for the isValidSymbol() method: ");
		for(int i = 0; i < 128; i++)
		{
			char input = (char)i;
			isValidSymbolTest(input);
		}
		
		System.out.println( );
		System.out.println( );
		
		//This test is to show that the update function updates an entire map correctly, as well as if an incorrect input is given, the map is replaced entirely with blank space
		System.out.println("(6) The final test will be for update(): ");
		System.out.println("If the operation runs correctly on the following, the after maps will be completly changed: ");
		updateTest('#');
		updateTest('G');
		System.out.println("This next input represents an invalid input, 'a' so if the method runs correctly, it will return blank characters ");
		updateTest('a');
						
		System.out.println("All tests concluded :)" );
		
	}
	
	//This prints out the results of the test according to the directions
	public static void printMapTest(int i, int j)
	{
		System.out.println("The dimensions will be (row, width): " + i + " , " + j);
		map newMap = new map(i, j);
		newMap.printMap();
		System.out.println( );
	}
	
	//This prints out the results of the test according to the directions
	public static void validIntInputTest(int in)
	{
		int value = -1;
		System.out.println("When looking at " + in + " the test concluded: ");
		value = map.validIntInput(in);
		//If the returned value from validIntInput is -1, then it is not a valid input!
		if(value != -1)
			System.out.println("The integer " + value + " IS valid according to my program");
		System.out.println( );
	}
	
	//This prints out the results of the test according to the directions
	public static void promptTest(char input)
	{
		String in = Character.toString(input);
		boolean tf;
		
		System.out.println("When looking at " + in + " the test concluded: ");
		tf = map.prompt(in);
		//If the prompt method returns true, N, or n, then the input is valid, else, its an invalid input
		if(tf)
			System.out.println("For the input '" + in + "' the result is a valid input!");
		else if(in.equals("N")||in.equals("n"))
			System.out.println("For the input '" + in + "' the result is a valid input!");
		System.out.println( );
	}
	
	//This prints out the results of the test according to the directions
	public static void rowColInputValidTest(int maxDimension, int i)
	{	
		int result;
		System.out.println("The value " + i + " with maxNum at " + maxDimension + " outputs: " );
		result = map.rowColInputValid(i, maxDimension);
		//If the result of rowColInputValid is -1, it is not a valid input!
		if(result != -1)
			System.out.println("The value " + i + " with maxNum at " + maxDimension + " is valid!" );
		System.out.println( );
		
	}
	
	//This prints out the results of the test according to the directions
	public static void isValidSymbolTest(char in)
	{
		char result;
		result = map.isValidSymbol(in);
		//If the result of the isValidSymbol method is an empty char, the input is invalid
		if(result == ' ')
			System.out.println("The input of ' " + in + " ' is invalid!");
		else
			System.out.println("The input of ' " + in + " ' is valid!");
	}
	
	//This prints out the results of the test according to the directions
	public static void updateTest(char in)
	{
		map newMap = new map(10, 10);
		System.out.println("The original map: ");
		newMap.printMap();
		for(int i = 0; i < 10; i++)
		{
			for(int j = 9; j > -1; j--)
			{
					newMap.update(i, j, map.isValidSymbol(in));
			}
		}
		System.out.println("The updated map for " + in + ":");
		newMap.printMap();
	}
}
