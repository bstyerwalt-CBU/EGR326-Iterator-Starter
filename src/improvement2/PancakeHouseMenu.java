package improvement2;

import java.util.ArrayList;
import java.util.Iterator;

// Lou's PancakeHouse Menu uses ArrayList internally
// Lou spent a lot of time implementing this code testing and debugging
// so we DO NOT want to change the internal implementation using MenuItem Array

public class PancakeHouseMenu implements Menu {
	private ArrayList menuItems;
 
	public PancakeHouseMenu() {
		menuItems = new ArrayList();
    
		addItem("K&B's Pancake Breakfast", 
			"Pancakes with scrambled eggs, and toast", 
			true,
			2.99);
 
		addItem("Regular Pancake Breakfast", 
			"Pancakes with fried eggs, sausage", 
			false,
			2.99);
 
		addItem("Blueberry Pancakes",
			"Pancakes made with fresh blueberries",
			true,
			3.49);
 
		addItem("Waffles",
			"Waffles, with your choice of blueberries or strawberries",
			true,
			3.59);
	}

	public void addItem(String name, String description, boolean vegetarian, double price) 	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
	
	public String toString() {
		return "Objectville Pancake House Menu";
	}

	@Override
	public Iterator createIterator() {
		return menuItems.iterator();
	}

}
