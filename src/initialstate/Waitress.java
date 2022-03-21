package initialstate;

/*
 * Implement below code carries the burden of working with two different types of collection
 * from DinerMenu and PancakeHouseMenu
 */

import java.util.ArrayList;

public class Waitress {
	private PancakeHouseMenu pancakeHouseMenu;
	private DinerMenu dinerMenu;
 
	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}
	
	// prints ALL menus (both breakfast and lunch)
	public void printMenu() {
		printBreakfastMenu();
		printLunchMenu();
	}

	// prints just breakfast menu
	public void printBreakfastMenu() { 
		ArrayList breakfastMenuArrayList = pancakeHouseMenu.getMenuItems();
		for(Object o : breakfastMenuArrayList) {
			System.out.println(o);
		}
	}
 
	// prints just lunch menu
	public void printLunchMenu() {
		// implement here
		MenuItem[] lunchMenuArray = dinerMenu.getMenuItems();
		for(MenuItem oneMenu : lunchMenuArray) {
			System.out.println(oneMenu);
		}
	}
	

	// prints all vegetarian menu from both breakfast and lunch
	public void printVegetarianMenu() {
		//implement here
		ArrayList breakfastMenuArrayList = pancakeHouseMenu.getMenuItems();
		for(Object o : breakfastMenuArrayList) {
			MenuItem oneMenu = (MenuItem) o;
			if(oneMenu.isVegetarian())
				System.out.println(oneMenu);
		}

		MenuItem[] lunchMenuArray = dinerMenu.getMenuItems();
		for(MenuItem oneMenu : lunchMenuArray) {
			if(oneMenu.isVegetarian())
				System.out.println(oneMenu);
		}
	}
 
	// returns a particular name menu is vegetarian or not
	public boolean isItemVegetarian(String name) {
		ArrayList breakfastMenuArrayList = pancakeHouseMenu.getMenuItems();
		for(Object o : breakfastMenuArrayList) {
			MenuItem oneMenu = (MenuItem) o;
			if(oneMenu.getName().equals(name) && oneMenu.isVegetarian())
				return true;
		}

		MenuItem[] lunchMenuArray = dinerMenu.getMenuItems();
		for(MenuItem oneMenu : lunchMenuArray) {
			if(oneMenu.getName().equals(name) && oneMenu.isVegetarian())
				return true;
		}
		return false;
	}
}
