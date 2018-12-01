package src;
import java.util.*;

//Programmer: Aidan Wadin     
//Program: Institution
//Created: Sept. 29, 2018
//Purpose: This interface acts as a template for any other kinds of institutions(including the one we built earlier)
//It allows member to be made, events to be made, and members to be put into events. Those are the basics of any institution containing events and members for those events

public interface Institution <T, C, S>
{
	//Create a new member and add it to the arraylist of current members
	public T createMember(S name, S type, ArrayList<T> members);
		
	//Create a new event, it will be added to a list of events based on how the institution organizes them. 
	public C createEvent(S name, int eventSize, ArrayList<C> events);

	//This adds a new member to an existing event 
	public void registerMember(int memberID, int eventID);
}
