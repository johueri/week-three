package daythree;
import java.util.HashMap;
import java.util.Map;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;


public class MapExercises {

	public static void main(String[] args) {
		// https://github.com/WeCanCodeIT/wcci-columbus-2017-fall/blob/master/week3/map-exercises.md

		Map<String, Double> menuItems = new HashMap<String, Double>();
		
		menuItems.put("Spaghetti", 8.97);
		menuItems.put("Lasagna", 10.98);
		menuItems.put("Pizza", 15.50);
		menuItems.put("Caesar Salad", 7.00);
		menuItems.put("Kale Salad", 7.00);
		
		NumberFormat usa = NumberFormat.getCurrencyInstance();
		
		System.out.println("The menu items and their prices are " + (menuItems));
		
		// Question 2a: A customer insists that the bill is incorrect and that the menu 
		//listed the price of spaghetti at $7.97. Print the menu price of the spaghetti.
		
		System.out.println("We double checked and the menu price of spaghetti is " + usa.format(menuItems.get(("Spaghetti"))));
		
		// Question 2b: The restaurant owner is losing customers to the restaurant next door because customers want more menu options.
	    // Print the number of menu items, so the owner will know how many more items she needs to add.
		System.out.println("There are " + menuItems.size() + " items on the menu."); 
		
		// Question 2c: Add a "Bottle of Champagne" that costs $200.00 and a "Bottle of Vintage Wine" that costs $175.00 to the menu. 
		// After adding each of these, print the item's price.
		menuItems.put("Bottle of Champagne", 200.00);
		menuItems.put("Bottle of Vintage Wine", 175.00);
		
		Double champagnePrice = menuItems.get(("Bottle of Champagne"));
		Double winePrice = menuItems.get(("Bottle of Vintage Wine"));
		
		System.out.println("The prices of the restaurants wine options are " + usa.format(champagnePrice) + " and " + usa.format(winePrice));
		
		//Questions 2d: A prospective customer calls the restaurant because she's interested in planning a birthday dinner for her best friend. 
		// She is planning the budget and needs to know whether the restaurant offers champagne that could be purchased for the table. 
		// Print the boolean response returned from the method that checks to see if the "Bottle of Champagne" key exists.
		
		if (menuItems.containsKey("Bottle of Chamapgne")) {
			System.out.println("Yes, we have a Bottle of Champagne");
		} else {
			System.out.println("Sorry. Take it easy on the sauce tonight.");
			
		// Question 2e: The ink on a customer's bill smeared from water spilled on the table. 
		// The customer can't tell whether the bill says an item was $13.50 or $15.50. 
		// Print the boolean response returned from the method that will check to see if $13.50 is a price on the menu.
			if (menuItems.containsValue(13.50)) {
				System.out.println("Yes, we have an item for $13.50.");
			} else {
				System.out.println("No. Get out of here.");
			
		}
		
			// Question 2f: There's a been a recall on the fresh kale sourced for the restaurant due to a rare invasive fungus 
			// that could make customers ill. Remove "Kale Salad" from the menu. Print a response showing that is no longer on the menu.
			
			menuItems.remove("Kale Salad");
			System.out.println("Menu contains fungus salad: " + menuItems.containsKey("Kale Salad"));
			
			// Questions 2g: The owner and chef have decided to do a complete revamp of the menu. Clear the menu, removing all of the items 
			//and their prices, so they can have a fresh start. Before the chef and owner begin entering new items and prices,
            // they ask you to double check that all items were removed. 
			//Print the boolean response returned by the method that will check to see if the menu is clear.
			
			menuItems.clear();
			if (menuItems.isEmpty()) {
				System.out.println("Menu is clear.");
				
			}
			
		
		
		
		
	}

}
}
