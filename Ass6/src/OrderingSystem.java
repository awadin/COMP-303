//Author: Aidan Wadin
//Due Date: Nov. 15 2018
//Purpose: This class will also be implemented as a singleton, as having multiple ordering systems at once seems like it would cause easily avoidable problems
//This class simply organizes all past work into easily usable methods for the user (Driver) to use

public class OrderingSystem 
{
	//A single instance of OrderingSystem can be shred, but will not change during the program
	//Static because otherwise, each instance of OrderingSystem would have a different instance
	private static final OrderingSystem INSTANCE = new OrderingSystem();
			
	//Static way to access the instance 
	//Static because otherwise, you would need an instance to get the instance
	public static OrderingSystem getInstance()
	{
		return INSTANCE;
	}
	
	//The ordering system will be using an order and menu, for the user to have indirect access to
	private Order order;
	private Menu m;
	
	//A private constructor prevents others from creating new instances
	//This creates the private variables for the Ordering System object
	private OrderingSystem()
	{
		this.order = new Order();
		this.m = Menu.getInstance();
	}
	
	//Show the user everything in their current order
	public void listOrder()
	{
		order.getName();
	}
	
	//Put a new item into the Order
	public void addItem(String name)
	{
		order.addToOrder(m.get(name));
		if(m.get(name) == null)
			System.out.println("This item '" + name + "' does not exsist within our menu");
		else
			System.out.println("Item '" + name + "' has been added to your order!");
	}
	
	//Add the item of the day 
	//This method is separate from the addItemmethod because the item of the day is randomly generated with each menu instantiated, we want to be sure it is
	//not accidentally re-generated when it is put in the Order
	public void addIofd()
	{
		order.addToOrder(m.getItemOfTheDay());
		System.out.println("The item of the day has been added to your order!");
	}
	
	//Show the user the menu
	public void listMenu()
	{
		m.showMenu();
	}
	
	//Checks to see if anything in the current order has alcohol and will display the proper warning if there is
	public void hasAlcohol()
	{
		order.hasAlcohol();
	}
	
	//Get the total price of the current Order
	public void getPrice()
	{
		order.getPrice();
	}
	
	//Checks to see if the current order contains a meal, and therefore, is eligible for the half off dessert
	public void isMeal()
	{
		Meal meal = new Meal(this.order);
		boolean mealtrue = meal.isMeal();
		if(mealtrue)
			System.out.println("This order contains a meal");
		else
			System.out.println("This order does not contain a meal");
	}
	
	//Take an item out of the current order
	public void removeItem(String name)
	{
		order.removeFromOrder(m.get(name));
		if(m.get(name) == null)
			System.out.println("This item '" + name + "' does not exsist within your order");
		else
			System.out.println("Item '" + name + "' has been removed from to your order!");
	}
	
	//This method looks through the current order and looks to see what elements are missing to complete a meal. The user is then updated of what they need to add
	//It is then up to the user to pick their own items to complete their meal.
	public void createMeal()
	{
		Meal meal = new Meal(this.order);
		if(!meal.isMeal())
			meal.whatIsMissing();
	}
	
	//The end of the program. It assumes the user pays the proper amount
	public void pay()
	{
		System.out.println("Please pay the total amount indicated on your bill to the wait staff");
		System.out.println("Don't forget to tip the programmer ;)");
		System.exit(0);
	}
	
}
