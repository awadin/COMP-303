package src;

import java.util.ArrayList;

//Programmer: Aidan Wadin     
//Program: Course
//Created: Sept. 29, 2018
//Purpose: This will be the interface from which to build any kind of member to any kind of Institution. 
//These methods will need to be in place simply to be able to identify and distinguish members as well as update their membership to different events

public interface Member <C>
{
	//Get the name of a member
	public String getName();
	
	//Get the unique identifier for each member, so that duplicate names are not a problem
	public String getID();
	
	//This is to keep different type of members apart. This could be anything from different levels of membership to different privileges available. 
	public String getType();
	
	//List out all current events this member is a part of
	public void membership(ArrayList<C> events);
	
	//This method checks to make sure the number of events a member is in (input) is valid
	public boolean validMembership(int input);
	
	//When a member takes up a new event, their events ArrayList is updated accordingly
	public void takeEvent(int eventID, ArrayList<C> events);
	
}
