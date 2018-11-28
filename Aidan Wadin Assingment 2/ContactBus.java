//Programmer: Aidan Wadin    
//Program: ContactBus
//Created: Sept. 16, 2018
//Purpose: This class holds the constructor and useful methods for Business objects created in the main program. 

public class ContactBus extends Contact
{
	private String address;
	private String busName;
	
	//This constructor uses the same name, phone number fields as the abstract class, but adds 2 more of its own
	ContactBus(String name, String phone, String add, String busName)
	{
		super(name, phone);
		this.address = add;
		this.busName = busName;
	}
	
	public String getAdd()
	{
		return this.address;
	}
	
	public String getBusName()
	{
		return this.busName;
	}
	
	//This overrides the abstract, adding the more specific pieces 
	public void getInfo()
	{
		System.out.println(getName() + " " + getPhone() + " " + getAdd() + " " + getBusName());
	}
	
	//This is also an overriding method, in order to add specifications 
	public static void createPrompt()
	{
		System.out.println("Enter the following information seperated by the *enter* keystroke:");
		System.out.println("name, phone number, address, buissness name: ");
	}
}
