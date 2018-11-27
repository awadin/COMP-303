import java.util.ArrayList; 
import java.util.InputMismatchException;    
import java.util.Scanner;

//Programmer: Aidan Wadin    
//Program: ContactsMain
//Created: Sept. 16, 2018
//Purpose: This class runs the user interface and holds the ArrayList for a contacts telephone book.

public class ContactsMain 
{
	public static void main(String args[])
	{
		//
		// ArrayList<Contact> contacts : This will be the data structure to hold the contacts list
		// int inputNum : This variable will be used to hold the users initial input, so that it can be validated before the rest of the program executes
		//                This also helps run all menu loops, as each number corresponds to a different action
		//
		ArrayList<Contact> contacts = new ArrayList<Contact>();
		int inputNum = 0;
		//This is the scanner
		Scanner input = new Scanner(System.in);
		//These prints are to initialize the entire program and prompt the user what to do
		System.out.println("Welcome to the phonebook!");
		//This is the menu loop. It only is exited when the inputNumber is 4
		while(inputNum == 0)
		{
			System.out.println("Please input the correct number of what function you would like to execute: ");
			System.out.println("1. Create New Contact");
			System.out.println("2. Find Current Contact");
			System.out.println("3. List All Contacts");
			System.out.println("4. Quit");
			System.out.println("User: ");

			//This while loop goes forever until a valid input is given by the user
			while(1 < 2)
			{
				//This try-catch is to make sure the user puts in an actual integer
				try
				{
					inputNum = input.nextInt();
				}
				catch (InputMismatchException exception)
				{
					//Inform the user of their error
					System.out.println("This is not a valid number! Please select a number 1-4: " );
					input.next();
					continue;
				}
				//If the integer input is not within the proper range, the loop resets
				if(inputNum < 1 || inputNum > 4)
				{
					System.out.println("This is not a valid number! Please select a number 1-4: " );
					continue;
				}
				else
					break;
			}
			
			//When the user types 1, they want to create a new contact
			while(inputNum == 1)
			{
				System.out.println("What kind of contact are you entering?" );
				System.out.println("Acquaintance, Business, or Friend? " );
				//This local variable will hold what the user next inputs
				String inputString = input.next();

				if(inputString.toLowerCase().equals("acquaintance"))
				{
					//Prompt the user what information has to be input
					ContactAq.createPrompt();
					//Create the new contact based on what is input. I don't check to validate what is input because the directions say that is not needed
					Contact aq = new ContactAq(input.next(), input.next());
					//Add this contact to the contacts list
					contacts.add(aq);
					//Change the input number back to 0 so that the menu loop resets
					inputNum = 0;
				}
				//This chunk of code is identical to the "Acquaintance" one, the only difference is what is printed and what inputs are required
				else if (inputString.toLowerCase().equals("business"))
				{
					ContactBus.createPrompt();
					Contact bus = new ContactBus(input.next(), input.next(), input.next(), input.next());
					contacts.add(bus);
					inputNum = 0;
				}
				//This chunk of code is identical to the "Acquaintance" one, the only difference is what is printed and what inputs are required
				else if(inputString.toLowerCase().equals("friend"))
				{
					ContactFriend.createPrompt();
					Contact friend = new ContactFriend(input.next(), input.next(), input.next(), input.next());
					contacts.add(friend);
					inputNum = 0;
				}
				//If the user doesn't type in any of these options, reset the local loop
				else
				{
					System.out.println("This is not a valid option");
					continue;
				}
				System.out.println( );
			}
			
			//When the user inputs 2, they want to search for an existing user
			while(inputNum == 2)
			{
				//If the size of the contacts data structure is 0, then there is nothing to search, so the user is redirected back to the original menu
				if(contacts.size() == 0)
				{
					System.out.println("There are no contacts to search!" );
					System.out.println( );
					//Reset menu loop
					inputNum = 0;
					break;
				}
				//Prompt the user
				System.out.println("Please enter the name of the person/business you'd like to find (case sensitive!)" );
				System.out.println("User: ");
				String inputString = input.next();
				//Loop through the entire array-list and check the getName() of each index against what was input
				inputNum = Contact.search(contacts, inputString);
				System.out.println( );
			}

			//When 3 is entered, the user wants to see the entire contact list
			while(inputNum == 3)
			{
				System.out.println("All current contacts: ");
				//Loop through the entire array-list and simply print out all contacts as specified by the directions
				for(int i = 0; i < contacts.size(); i++)
				{
					contacts.get(i).getInfo();
				}
				inputNum = 0;
				System.out.println( );
			}

			//When 4 is entered, the program ends
			while(inputNum == 4)
			{
				input.close();
				System.out.println("Terminating program");
				return;
			}
		}
	}
}
