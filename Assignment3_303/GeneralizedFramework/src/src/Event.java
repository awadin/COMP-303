package src;

//Programmer: Aidan Wadin     
//Program: Event Interface
//Created: Sept. 29, 2018
//Purpose: This interface holds the information for a template for some event.

//This interface acts as a template for any kind of event, the most basic things in it would be the ability to see whos in the class, and adding more people to that class
//Also, since variables cannot be put in an interface, the first method is a clue to the programmer that they must create a list of some sort to hold the members during their implementation
public interface Event 
{
	//Print out who is in the class as well as how many spots are left
	public void eventList();
		
	//Add a new student to the class
	public void addMember(int memberID);
		
}
