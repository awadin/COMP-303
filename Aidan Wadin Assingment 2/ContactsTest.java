//Programmer: Aidan Wadin     
//Program: ContactsTest
//Created: Sept. 16, 2018
//Purpose: This class runs the tests on the constructors and methods in every class BUT the main method of ContactsMain

import java.util.ArrayList;

public class ContactsTest 
{
	public static void main(String args[])
	{
		AqTester();
		BusTester();
		FriendTester(); 
		PromptTester();
		searchTester();
	}
	
	//This tests the constructor of Acquaintance, since it has no supporting methods within it, this is the only thing tested
	public static void AqTester()
	{
		System.out.println("The following method tests the class ContactAq");
		System.out.println("It is this classes job to create and manage Aquaintance contacts properly");
		
		System.out.println();
		
		//Notify the user on what is going to occur
		System.out.println("The following people will be created and should be valid: ");
		System.out.println("Bob, 617");
		System.out.println("Jake, 793");
		System.out.println("Jacey, 19309");
		
		System.out.println();
		System.out.println("We will now create these Aquaintances: ");
		
		//Create the Acquaintances
		Contact bob = new ContactAq("Bob", "617");
		Contact jake = new ContactAq("Jake", "793");
		Contact jacey = new ContactAq("Jacey", "19309");
		
		System.out.println("No errors occured! Let us see if the getInfo() method works properly as well: ");
		
		//Display to the user the getInfo() method prints properly
		bob.getInfo();
		jake.getInfo();
		jacey.getInfo();
		
		System.out.println("It does! :)");
		System.out.println();
		//Notify the User on what is going to happen next and what to expect
		System.out.println("Now we will make sure businesses and friends create errors when we try and create them as Aquaintances: ");
		System.out.println("These next people will be Businesses and Friends, so they should come up as invalid: ");
		System.out.println("Businesses: ");
		System.out.println("Hodor, 777, GOT, Door Maintinance");
		System.out.println("Stark, 333, GOT, Pest Control");
		System.out.println("Friend: ");
		System.out.println("Jesus, 0001, Jerusalem, Christmas");
		
		System.out.println();
		
		//These next try-catch statements do the following:
		//Create a contact of the improper type (not Acquaintances)
		//Cast that contact as an acquaintance
		//Try to call the getInfo() method
		//An error will occur because the getInfo() method for the other contacts is not the same as Acquaintance, so an exception will be thrown and shown to the user
		
		try
		{
			Contact hodor = new ContactBus("Hodor", "777", "GOT", "Door Maintinance");
			hodor = (ContactAq) hodor;
			hodor.getInfo();
		}
		catch (Exception e)
		{
			System.out.println("Error! Invalid values for aquaintance");
		}
		
		try
		{
			Contact stark = new ContactBus("Stark", "333", "GOT", "Pest Control");
			stark = (ContactAq) stark;
			stark.getInfo();
		}
		catch (Exception e)
		{
			System.out.println("Error! Invalid values for aquaintance");
		}
		
		try
		{
			Contact jesus = new ContactBus("Jesus", "0001", "Jerusalem", "Christmas");
			jesus = (ContactAq) jesus;
			jesus.getInfo();
		}
		catch (Exception e)
		{
			System.out.println("Error! Invalid values for aquaintance");
		}
		
		System.out.println( );
		
		System.out.println("None of those are valid Aquaintances, so the Aquaintance class works properly!" );
		System.out.println( );
		System.out.println( );
	}
	
	//This method tests the ContactBus Constructor
	//Very similar to the AqTester()
	public static void BusTester()
	{
		System.out.println("The following method tests the class ContactBus");
		System.out.println("It is this classes job to create and manage Business contacts properly");
		
		System.out.println();
		
		//Notify the user on what is happening
		System.out.println("The following people will be created and should be valid: ");
		System.out.println("Hodor, 777, GOT, Door Maintinance");
		System.out.println("Stark, 333, GOT, Pest Control");
		
		System.out.println();
		System.out.println("We will now create these Businesses: ");
		
		//Create the contacts
		Contact hodor = new ContactBus("Hodor", "777", "GOT", "Door Maintinance");
		Contact stark = new ContactBus("Stark", "333", "GOT", "Pest Control");
		
		//Show that the getInfo() method works
		System.out.println("No errors occured! Let us see if the getInfo() method works properly as well: ");
		
		hodor.getInfo();
		stark.getInfo();
		
		System.out.println("It does! :)");
		System.out.println();
		//Update the user on what is occurring
		System.out.println("Now we will make sure Aquaintances and friends create errors when we try and create them as Aquaintances: ");
		
		System.out.println("These next people will be Businesses and Friends, so they should come up as invalid: ");
		System.out.println("Aquaintances: ");
		System.out.println("Bob, 617");
		System.out.println("Jake, 793");
		System.out.println("Jacey, 19309");
		System.out.println("Friend: ");
		System.out.println("Jesus, 0001, Jerusalem, Christmas");
		
		System.out.println();
		//These next try-catch statements do the following:
		//Create a contact of the improper type (not Businesses)
		//Cast that contact as an business
		//Try to call the getInfo() method
		//An error will occur because the getInfo() method for the other contacts is not the same as Business, so an exception will be thrown and shown to the user
		
		try
		{
			Contact bob = new ContactAq("Bob", "617");
			bob = (ContactBus) bob;
			bob.getInfo();
		}
		catch (Exception e)
		{
			System.out.println("Error! Invalid values for Business");
		}
		
		try
		{
			Contact jake = new ContactAq("Jake", "793");
			jake = (ContactBus) jake;
			jake.getInfo();
		}
		catch (Exception e)
		{
			System.out.println("Error! Invalid values for Business");
		}
		
		try
		{
			Contact jacey = new ContactAq("Jacey", "19309");
			jacey = (ContactBus) jacey;
			jacey.getInfo();
		}
		catch (Exception e)
		{
			System.out.println("Error! Invalid values for Business");
		}
		
		try
		{
			Contact jesus = new ContactFriend("Jesus", "0001", "Jerusalem", "Christmas");
			jesus = (ContactBus) jesus;
			jesus.getInfo();
		}
		catch (Exception e)
		{
			System.out.println("Error! Invalid values for Business");
		}
		
		System.out.println( );
		
		System.out.println("None of those are valid Businesses, so the Business class works properly!" );
		
		System.out.println( );
		System.out.println( );
	}
	
	//This method tests the ContactFriend Constructor
	//It is very similar to the 2 above methods
	public static void FriendTester()
	{
		//Update the user on what is happening
		System.out.println("The following method tests the class ContactFriend");
		System.out.println("It is this classes job to create and manage Friend contacts properly");
		
		System.out.println();
		
		System.out.println("The following people will be created and should be valid: ");
		System.out.println("Jesus, 0001, Jerusalem, Christmas");
		
		System.out.println();
		System.out.println("We will now create this Friend: ");
		
		//Create the object
		Contact jesus = new ContactFriend("Jesus", "0001", "Jerusalem", "Christmas");
		
		System.out.println("No errors occured! Let us see if the getInfo() method works properly as well: ");
		
		//Show that getInfo() works
		jesus.getInfo();
		
		System.out.println("It does! :)");
		System.out.println();
		//Update the user on what is happening
		System.out.println("Now we will make sure Aquaintances and Businesses create errors when we try and create them as Aquaintances: ");
		
		System.out.println("These next people will be Aquaintances and Friends, so they should come up as invalid: ");
		System.out.println("Aquaintances: ");
		System.out.println("Bob, 617");
		System.out.println("Jake, 793");
		System.out.println("Jacey, 19309");
		System.out.println("Businesses: ");
		System.out.println("Hodor, 777, GOT, Door Maintinance");
		System.out.println("Stark, 333, GOT, Pest Control");
		
		System.out.println();
		
		//These next try-catch statements do the following:
		//Create a contact of the improper type (not Friends)
		//Cast that contact as an acquaintance
		//Try to call the getInfo() method
		//An error will occur because the getInfo() method for the other contacts is not the same as Friend, so an exception will be thrown and shown to the user
		
		try
		{
			Contact bob = new ContactAq("Bob", "617");
			bob = (ContactFriend) bob;
			bob.getInfo();
		}
		catch (Exception e)
		{
			System.out.println("Error! Invalid values for Friend");
		}
		
		try
		{
			Contact jake = new ContactAq("Jake", "793");
			jake = (ContactFriend) jake;
			jake.getInfo();
		}
		catch (Exception e)
		{
			System.out.println("Error! Invalid values for Friend");
		}
		
		try
		{
			Contact jacey = new ContactAq("Jacey", "19309");
			jacey = (ContactFriend) jacey;
			jacey.getInfo();
		}
		catch (Exception e)
		{
			System.out.println("Error! Invalid values for Friend");
		}
		try
		{
			Contact hodor = new ContactBus("Hodor", "777", "GOT", "Door Maintinance");
			hodor = (ContactFriend) hodor;
			hodor.getInfo();
		}
		catch (Exception e)
		{
			System.out.println("Error! Invalid values for Friend");
		}
		
		try
		{
			Contact stark = new ContactBus("Stark", "333", "GOT", "Pest Control");
			stark = (ContactFriend) stark;
			stark.getInfo();
		}
		catch (Exception e)
		{
			System.out.println("Error! Invalid values for Friend");
		}
		
		System.out.println();
		
		System.out.println("None of those are valid Friends, so the Friend class works properly!" );
		
		System.out.println( );
		System.out.println( );
	}
	
	//This method tests the prompt in each of the Contact classes
	public static void PromptTester()
	{
		System.out.println("We will now run the prompt() test on each type of contact");
		System.out.println("Each type of contact should print their own respective prompt: ");
		
		System.out.println("ContactAq: ");
		ContactAq.createPrompt();
		System.out.println("ContactBus: ");
		ContactBus.createPrompt();
		System.out.println("ContactFriend: ");
		ContactFriend.createPrompt();
		
		System.out.println( );
		
		System.out.println("Everything was printed correctly! Test passed! ");
		System.out.println( );
		System.out.println( );
	}
	
	//This method tests the search() method in Contact
	public static void searchTester()
	{
		System.out.println( "This final test tests the search() method: ");
		System.out.println("We will create an arrayList of 6 different types of contacts and try looking through it to make sure it works properly" );
		//Create a new ArrayList
		ArrayList<Contact> contacts = new ArrayList<Contact>();
		
		//Create objects to fill the ArrayList
		Contact bob = new ContactAq("Bob", "617");
		Contact jake = new ContactAq("Jake", "793");
		Contact jacey = new ContactAq("Jacey", "19309");
		Contact hodor = new ContactBus("Hodor", "777", "GOT", "Door Maintinance");
		Contact stark = new ContactBus("Stark", "333", "GOT", "Pest Control");
		Contact jesus = new ContactFriend("Jesus", "0001", "Jerusalem", "Christmas");
		
		//Fill the ArrayList
		contacts.add(bob);
		contacts.add(jake);
		contacts.add(jacey);
		contacts.add(hodor);
		contacts.add(stark);
		contacts.add(jesus);
		
		//Try out different valid and invalid inputs to make sure the proper operation occurs!
		System.out.println("Stark");
		Contact.search(contacts, "Stark");
		System.out.println( );
		
		System.out.println("Bob");
		Contact.search(contacts, "Bob");
		System.out.println( );
		
		System.out.println("Jesusus");
		Contact.search(contacts, "Jesusus");
		System.out.println( );
		
		System.out.println("gabby");
		Contact.search(contacts, "gabby");
		System.out.println( );
		
		System.out.println("As you can see, the method works properly!");
		System.out.println("This concludes the testing program!! :)");
	}
}
