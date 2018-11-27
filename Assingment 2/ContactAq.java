//Programmer: Aidan Wadin    
//Program: ContactAq
//Created: Sept. 16, 2018
//Purpose: This class holds the constructor and useful methods for Acquaintance objects created in the main program. 

public class ContactAq extends Contact
{
	//This constructor is just using the exact same constructor as the template class
	ContactAq(String name, String phone)
	{
		super(name, phone);
	}
	
	//The prompt for an AQ class overrides the original from the template
	public static void createPrompt()
	{
		System.out.println("Enter the following information seperated by the *enter* keystroke:");
		System.out.println("name, phone number: ");
	}
}
