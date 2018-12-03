//Author: Aidan Wadin
//Due Date: Nov. 15 2018
//Purpose: This acts as a composite to the composite Order. It takes information from an order and analyzes it so that it can be transformed into a meal and manipulated as such
//NOTE:
//This also holds useful methods to check if an order contains a meal, and what is missing from the order to make a valid meal etc. 

public class Meal implements ItemInterface {
	private Order order;

	// When it is created, it takes the current Order as input, it will use its methods and info to judge whether a meal is present in it or not
	public Meal(Order order) {
		this.order = order;
	}

	//Get the normal price as the order
	public double getPrice() {
		return order.getPrice();
	}

	//Same implementation as the Order class
	public String getName() {
		return order.getName();
	}

	//Same implementation as Order class
	public String getType() {
		return order.getType();
	}

	// This method is to check if there is a full meal or not
	public boolean isMeal() {
		// An appetizer, mainDish, and dessert must be present for there to be a
		// valid meal
		boolean app = false;
		boolean main = false;
		boolean dessert = false;
		// This gets the full string of all types of dishes in the current order
		String currentOrder = getType();
		// This then parses that string and looks at each substring (the types
		// themselves)
		String[] tokens = currentOrder.split(" ");
		for (String s : tokens) {
			if (s.equals("appetizer")) {
				app = true;
			}
			if (s.equals("main")) {
				main = true;
			}
			if (s.equals("dessert")) {
				dessert = true;
			}
		}

		// If all 3 items are present, then it is a meal
		if (app && main && dessert) {
			order.replaceDessert();
			return true;
		} else
			return false;
	}

	// This method will look through the current order and tell the user what
	// food items they are missing in order to complete their meal
	// It is then up to the user to listen to this method and add their own food
	// items to the order
	public void whatIsMissing() {
		// An appetizer, mainDish, and dessert must be present for there to be a
		// valid meal
		boolean app = false;
		boolean main = false;
		boolean dessert = false;
		// This gets the full string of all types of dishes in the current order
		String currentOrder = getType();
		// This then parses that string and looks at each substring (the types
		// themselves)
		String[] tokens = currentOrder.split(" ");
		for (String s : tokens) {
			if (s.equals("appetizer")) {
				app = true;
			}
			if (s.equals("main")) {
				main = true;
			}
			if (s.equals("dessert")) {
				dessert = true;
			}
		}
		if (!app)
			System.out.println("You are missing an appetizer to complete your meal!");
		if (!main)
			System.out.println("You are missing a main dish to complete your meal!");
		if (!dessert)
			System.out.println("You are missing a dessert to complete your meal!");
	}
}
