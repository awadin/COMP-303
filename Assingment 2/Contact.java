import java.util.ArrayList;

//Programmer: Aidan Wadin    
//Program: Contact
//Created: Sept. 16, 2018
//Purpose: This class is a template to be used by the 3 children, Acquaintance, Business, and Friend.

//This class is used because a generic "contact" will never need to be created, but this template is used by every child of it
abstract class Contact 
{
	private String name = " ";
	private String phone = " ";
	
	//Basic constructor
	Contact(String n, String p)
	{
		this.name = n;
		this.phone = p;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getPhone()
	{
		return this.phone;
	}
	
	//Print out all information about a given contact
	public void getInfo()
	{
		System.out.println(getName() + " " + getPhone());
	}
	
	//This is for when a new contact is being created
	public static void createPrompt()
	{
		System.out.println("Enter the following information seperated by the *enter* keystroke:");
	}
	
	//This method takes in the main contact list, and loops through it to see if the user input from the main method can be found in the existing ArrayList
	public static int search(ArrayList<Contact> list, String input)
	{
		for (int i = 0; i < list.size(); i++)	
		{
			//If found, tell the user and show them the full contact info
			if(list.get(i).getName().equals(input))
			{
				System.out.println("I found them: " );
				list.get(i).getInfo();
				return 0;
			}
		}
		//If the name is not found, notify the user as well
		System.out.println("Not found");
		return 0;
	}
}
