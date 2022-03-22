package improvement2;

/*
 * Implement below code carries the burden of working with two different types of collection
 * from DinerMenu and PancakeHouseMenu
 */

import java.util.Iterator;

public class Waitress {
	private Menu pancakeHouseMenu;
	private Menu dinerMenu;
 
	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}
	
	// prints ALL menus (both breakfast and lunch)
	public void printMenu() {
		Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator dinerIterator = dinerMenu.createIterator();
		System.out.println("Menu\n----\nBREAKFAST");
		printMenu(pancakeIterator);
		System.out.println("\nLUNCH");
		printMenu(dinerIterator);
	}

	private void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem) iterator.next();
			printMenuItem(menuItem);
		}
	}

	// prints just breakfast menu
	public void printBreakfastMenu() {
		Iterator it = pancakeHouseMenu.createIterator();
		printMenu(it);
	}
 
	// prints just lunch menu
	public void printLunchMenu() {
		Iterator it = dinerMenu.createIterator();
		printMenu(it);
	}

	/* helper */
	private void printMenuItem(MenuItem menuItem) {
		System.out.print(menuItem.getName() + ", ");
		System.out.print(menuItem.getPrice() + " -- ");
		System.out.println(menuItem.getDescription());
	}

	/* helper */
	private boolean isVegetarian(String name, Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			if (menuItem.getName().equals(name)) {
				if (menuItem.isVegetarian()) {
					return true;
				}
			}
		}
		return false;
	}


	public void printVegetarianMenu() {
		//implement here
		// Print breakfast menu item
		Iterator pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
		printVegetarianMenu(pancakeHouseMenuIterator);

		Iterator dinerMenuIterator = dinerMenu.createIterator();
		printVegetarianMenu(dinerMenuIterator);
	}

	// prints all vegetarian menu from both breakfast and lunch
	private void printVegetarianMenu(Iterator it) {
		while(it.hasNext())
		{
			MenuItem menuItem = (MenuItem) it.next();
			if(menuItem.isVegetarian()) {
				printMenuItem(menuItem);
			}
		}
	}
 
	// returns a particular name menu is vegetarian or not
	public boolean isItemVegetarian(String name) {
		Iterator breakfastIterator = pancakeHouseMenu.createIterator();
		if (isVegetarian(name, breakfastIterator)) {
			return true;
		}
		Iterator dinnerIterator = dinerMenu.createIterator();
		if (isVegetarian(name, dinnerIterator)) {
			return true;
		}
		return false;
	}
}
