//Author: Aidan Wadin 
//Due Date: Nov. 15 2018
//Purpose: This is the Main Menu class. It is a singleton! As there should only be 1 menu that can be used by multiple people.
//NOTE:
//Having multiple menus would create inconsistencies in the restaurant

import java.util.ArrayList; 
import java.util.Iterator;
import java.util.Random;

public class Menu
	{
		//This ArrayList holds all objects on the Menu. Notice it is a list of the common interface used by all items, therefore they all can be 
		//added to the list easily despite them having slightly different characteristics as they all share the same interface. 
		private ArrayList<ItemInterface> menuItems;
		
		//A single instance of Menu can be shred, but will not change during the program
		//Static because otherwise, each instance of Menu would have a different instance
		private static final Menu INSTANCE = new Menu();
		
		//Static way to access the instance 
		//Static because otherwise, you would need an instance to get the instance
		public static Menu getInstance()
		{
			return INSTANCE;
		}
		
		//A private constructor prevents others from creating new instances
		private Menu() 
		{
			//This is the Menu. The items it contains are simply hard-coded in for the sake of this assignment (As stated, this is allowed per instructions)
			Appetizer cheese = new Appetizer("cheese", 5);
			Appetizer wings = new Appetizer("wings", 10);
			Appetizer chips = new Appetizer("chips", 3);
			Dessert cake = new Dessert("cake", 7);
			Dessert iceCream = new Dessert("ice cream", 5);
			//The following 2 lines are just templates for the decorator of Drink, so that alcoholic drinks can be created
			Drink beertemp = new Drink("beer", 6);
			Drink winetemp = new Drink("wine", 10);
			DrinkADecorator beer = new DrinkADecorator(beertemp);
			DrinkADecorator wine = new DrinkADecorator(winetemp);
			Drink soda = new Drink("soda", 3);
			Side fries = new Side("fries", 4);
			Side dip = new Side("dip", 6);
			MainDish steak = new MainDish("steak", 16);
			MainDish chicken = new MainDish("chicken", 14);
			MainDish salad = new MainDish("salad", 9);
			
			//The ArrayList is created
			menuItems = new ArrayList<ItemInterface>();
			
			//Everything is added to the menu
			menuItems.add(cheese);
			menuItems.add(wings);
			menuItems.add(chips);
			menuItems.add(cake);
			menuItems.add(iceCream);
			menuItems.add(beer);
			menuItems.add(wine);
			menuItems.add(soda);
			menuItems.add(fries);
			menuItems.add(dip);
			menuItems.add(steak);
			menuItems.add(chicken);
			menuItems.add(salad);
			//This is added last as it is generated daily, and it removes its regularly price counterpart from the menu
			menuItems.add(ItemOfTheDay());
			
		}
		
		//This method uses the Iterator pattern to traverse the menu ArrayList
		//It simply displays the menu items to the user
		public void showMenu()
		{
			System.out.println("The menu is: ");
			Iterator<ItemInterface> iter = menuItems.iterator();
			while(iter.hasNext())
			{
				ItemInterface i = iter.next();
				System.out.println(i.getName() + " " + i.getPrice() + "$");
			}
			System.out.println( );
		}
		
		//This method uses the Iterator pattern to traverse the menu ArrayList
		//It allows other classes access to a certain item/ see if it exists in the current menu
		public ItemInterface get(String item)
		{
			Iterator<ItemInterface> iter = menuItems.iterator();
			while(iter.hasNext())
			{
				ItemInterface i = iter.next();
				if(i.getName().equals(item))
				{
					return i;
				}
			}
			return null;
		}
		
		//This method creates the Item of the Day, as this is created with every instantiation of the Menu (changes daily presumably)
		public ItemInterface ItemOfTheDay()
		{
			//The first 3 lines are the following:
			//They pick a random index within the menu, and select that item to be the item of the day - it is random
			Random rand = new Random();
			int itemIndex = rand.nextInt(menuItems.size());
			ItemOfTheDay iotd = new ItemOfTheDay(menuItems.get(itemIndex));
			//Alert the user of the item of the day and what that exactly means
			System.out.println("The Item of the day is: " + iotd.getName() + "\n" + "With the discount price of: " + iotd.getPrice() + "$ \n" + "Compared to the normal price of: " + menuItems.get(itemIndex).getPrice() + "$");
			//Remove the original item from the menu, as it is replaced as the Item of the day
			menuItems.remove(itemIndex);
			return iotd;
		}
		
		//This is a special method to add the item of the day to the order
		//Because the item of the day is generated randomly when its generation method is called, we don't want to accidentally re-randomize the item for the same menu
		public ItemInterface getItemOfTheDay()
		{
			ItemInterface iotd = null;
			Iterator<ItemInterface> iter = menuItems.iterator();
			while(iter.hasNext())
			{
				ItemInterface i = iter.next();
				if(i.getClass().getName().equals("ItemOfTheDay"))
				{
					iotd = i;
					break;
				}
			}
			return iotd;
		}
}
