//Programmer: Aidan Wadin    
//Program: ContactFriend
//Created: Sept. 16, 2018
//Purpose: This class holds the constructor and useful methods for Friend objects created in the main program. 

public class ContactFriend extends Contact
{
	private String address;
	private String birthday;
	
	//The constructor uses the original abstract constructor, but also adds on its own 2 fields
	ContactFriend(String name, String phone, String add, String birthday)
	{
		super(name, phone);
		this.address = add;
		this.birthday = birthday;
	}
	
	public String getAddress()
	{
		return this.address;
	}
	
	public String getBirthday()
	{
		return this.birthday;
	}
	
	//overridden method
	public void getInfo()
	{
		System.out.println(getName() + " " + getPhone() + " " + getAddress() + " " + getBirthday());
	}
	
	//overridden method
	public static void createPrompt()
	{
		System.out.println("Enter the following information seperated by the *enter* keystroke:");
		System.out.println("name, phone number, address, birthday: ");
	}
}
