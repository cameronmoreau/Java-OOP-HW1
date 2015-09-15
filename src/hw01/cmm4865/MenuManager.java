/**
 * @author Cameron Moreau
 * 1001024865
 * 9/9/15
 * CSE 1325 - 003
 * 
 * MenuManager: Manages the menus
 * */

package hw01.cmm4865;

import java.util.Scanner;

public class MenuManager {
	
	private Shop shop;
	private Scanner keyboard;
	
	/**
	 * Constructor for the MenuManager
	 * Takes the sub controller "shop" as
	 * a parameter
	 * 
	 * @param 	shop	the subcontroller
	 * @return 	none
	 */
	public MenuManager(Shop shop) {
		System.out.println("MenuManager created");
		this.shop = shop;
		this.keyboard = new Scanner(System.in);
	}
	
	/**
	 * Display the main menu screen and get input
	 * 
	 * @param 	none
	 * @return 	none
	 */
	public void displayMainMenu() {
		System.out.print(
			"Main Menu\n" +
			"=====================\n" +
			"1. Create Menu\n" +
			"2. Update Menu\n" +
			"3. Display\n" +
			"4. Quit\n" +
			"=====================\n" +
			"::>"
		);
			
		//Get input
		switch(keyboard.nextLine()) {
		case "1":
			displayCreateMenu();
			break;
		case "2":
			displayUpdateMenu();
			break;
		case "3":
			displaySummary();
			break;
		case "4":
			System.exit(0);
			break;
		default:
			displayMainMenu();
		}
	}
	
	/**
	 * Display the create menu screen and get input
	 * 
	 * @param 	none
	 * @return 	none
	 */
	public void displayCreateMenu() {
		System.out.print(
			"Create Menu\n" +
			"=====================\n" +
			"1. Create Ice Cream\n" +
			"2. Create Serving\n" +
			"3. Create Customer\n" +
			"4. Create Worker\n" +
			"5. Create Order\n" +
			"6. Return to Previous Menu\n" +
			"=====================\n" +
			"::>"
		);
		
		//Get input
		switch(keyboard.nextLine()) {
		case "1":
			shop.createIceCream();
			displayCreateMenu();
			break;
		case "2":
			shop.createServing();
			displayCreateMenu();
			break;
		case "3":
			shop.createCustomer();
			displayCreateMenu();
			break;
		case "4":
			shop.createWorker();
			displayCreateMenu();
			break;
		case "5":
			shop.createOrder();
			displayCreateMenu();
			break;
		case "6":
			displayMainMenu();
			break;
		default:
			displayCreateMenu();
		}
		
	}
	
	/**
	 * Display the update menu screen and get input
	 * 
	 * @param 	none
	 * @return 	none
	 */
	public void displayUpdateMenu() {
		System.out.print(
			"Update Menu\n" +
			"=====================\n" +
			"1. Update Ice Cream\n" +
			"2. Update Serving\n" +
			"3. Update Customer\n" +
			"4. Update Worker\n" +
			"5. Update Order\n" +
			"6. Return to Previous Menu\n" +
			"=====================\n" +
			"::>"
		);
		
		//Get input
		switch(keyboard.nextLine()) {
		case "1":
			updateIceCream();
			break;
		case "2":
			updateServing();
			break;
		case "3":
			updateCustomer();
			break;
		case "4":
			updateWorker();
			break;
		case "5":
			updateOrder();
			break;
		case "6":
			displayMainMenu();
			break;
		default:
			displayUpdateMenu();
		}
	}
	
	/**
	 * Replace the last IceCream with a
	 * new based off user input
	 * 
	 * @param 	none
	 * @return 	none
	 */
	public void updateIceCream() {
		if(shop.getIceCream() == null) shop.createIceCream();
		IceCream currentIceCream = shop.getIceCream();
		
		System.out.println(
			"Update IceCream\n" +
			"====================="
		);
		
		//Update Name
		System.out.print("Name: ");
		currentIceCream.setName(keyboard.nextLine());
		
		//Update Flavor
		System.out.print("Flavor: ");
		currentIceCream.setFlavor(keyboard.nextLine());
		
		//Update Description
		System.out.print("Description: ");
		currentIceCream.setDesc(keyboard.nextLine());
		
		//Update Price
		System.out.print("Price: $");
		currentIceCream.setPrice(keyboard.nextDouble());
		
		//Update previous IceCram
		shop.setIceCream(currentIceCream);
		displayUpdateMenu();
	}
	
	/**
	 * Replace the last Serving with a
	 * new based off user input
	 * 
	 * @param 	none
	 * @return 	none
	 */
	public void updateServing() {
		if(shop.getServing() == null) shop.createServing();
		Serving currentServing = shop.getServing();
		
		System.out.println(
			"Update Serving\n" +
			"====================="
		);
		
		//Update Total Flavors
		System.out.print("Total Flavors: ");
		currentServing.setTotalFlavors(keyboard.nextInt());
		
		//Update Price
		System.out.print("Price: $");
		currentServing.setPrice(keyboard.nextDouble());
		
		//Update previous Serving
		shop.setServing(currentServing);
		displayUpdateMenu();
	}
	
	/**
	 * Replace the last Customer with a
	 * new based off user input
	 * 
	 * @param 	none
	 * @return 	none
	 */
	public void updateCustomer() {
		if(shop.getCustomer() == null) shop.createCustomer();
		Customer currentCustomer = shop.getCustomer();
		
		System.out.println(
			"Update Customer\n" +
			"====================="
		);
		
		//Update Name
		System.out.print("Name: ");
		currentCustomer.setName(keyboard.nextLine());
		
		//Update Happiness
		System.out.print("Happiness: ");
		currentCustomer.setHappiness(keyboard.nextInt());
		
		//Update Money
		System.out.print("Money: $");
		currentCustomer.setMoney(keyboard.nextDouble());
		
		//Update previous Customer
		shop.setCustomer(currentCustomer);
		displayUpdateMenu();
	}
	
	/**
	 * Replace the last Worker with a
	 * new based off user input
	 * 
	 * @param 	none
	 * @return 	none
	 */
	public void updateWorker() {
		if(shop.getWorker() == null) shop.createWorker();
		Worker currentWorker = shop.getWorker();
		
		System.out.println(
			"Update Worker\n" +
			"====================="
		);
		
		//Update Name
		System.out.print("Name: ");
		currentWorker.setName(keyboard.nextLine());
		
		//Update previous Worker
		shop.setWorker(currentWorker);
		displayUpdateMenu();
	}
	
	/**
	 * Replace the last Order with a
	 * new based off user input
	 * 
	 * @param 	none
	 * @return 	none
	 */
	public void updateOrder() {
		if(shop.getOrder() == null) shop.createOrder();
		Order currentOrder = shop.getOrder();
		
		System.out.println(
			"Update Order\n" +
			"====================="
		);
		
		//Update Number
		System.out.print("Order Number: ");
		currentOrder.setOrderNumber(keyboard.nextInt());
		
		//Update Has Paid
		System.out.print("Has Paid(true, false): ");
		currentOrder.setHasPaid(keyboard.nextBoolean());
		
		//Update previous Worker
		shop.setOrder(currentOrder);
		displayUpdateMenu();
	}
	
	/**
	 * Display the summary and status by grabbing
	 * things from the sub controller
	 * 
	 * @param 	none
	 * @return 	none
	 */
	public void displaySummary() {
		if(shop.getOrder() == null) shop.createOrder();
		if(shop.getWorker() == null) shop.createWorker();
		if(shop.getServing() == null) shop.createServing();
		
		System.out.print(
			"Status\n" +
			"=====================\n" +
			"Order Number: " + shop.getOrder().getOrderNumber() +
			"\nWorker: " + shop.getWorker().getName() +
			"\nServing: " + shop.getServing().getTotalFlavorsToString() +
			"\nContains: " + shop.getServing().getIceCeram().getName() +
			"\nPress any enter to continue..."
		);
		
		keyboard.nextLine();
		System.out.println();
		displayMainMenu();
	}
}
