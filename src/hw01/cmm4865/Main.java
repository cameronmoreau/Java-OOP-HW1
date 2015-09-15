/**
 * @author Cameron Moreau
 * 1001024865
 * 9/9/15
 * CSE 1325 - 003
 * 
 * Main: Main class for project
 * */

package hw01.cmm4865;

public class Main {
	
	private static Shop shop;
	private static MenuManager menu;

	/**
	 * The Main
	 * 
	 * @param 	none
	 * @return 	none
	 */
	public static void main(String args[]) {
		shop = new Shop();
		menu = new MenuManager(shop);
		
		menu.displayMainMenu();
	}
}
