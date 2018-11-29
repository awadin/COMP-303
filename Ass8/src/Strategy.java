
//Author: Aidan Wadin
//Date: November 26, 2018
//Purpose: This is the interface of the strategy pattern. It holds the methods needed by implementing concrete classes.
//They can be implemented in many different ways to complete different tasks while still maintaining the same method headers.

public interface Strategy<T>
{
	//This could become ANY kind of formula that takes in 3 ints and returns an answer
	public int calculate(int num1, int num2, int num3);
	
	//This can be re-formatted many different ways to display different tables rows in many different manners
	public void printRow(T t, int headerLength);
}
