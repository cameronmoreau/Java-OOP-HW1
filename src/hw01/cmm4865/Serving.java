/** 
 * @author Cameron Moreau
 * 1001024865
 * 9/9/15
 * CSE 1325 - 003
 * 
 * Serving: A class that holds the number 
 * of flavors in a serving and overall 
 * price of a serving of ice cream
 * */

package hw01.cmm4865;

public class Serving {
	
	private IceCream iceCeram;
	private int totalFlavors;
	private double price;
	
	/**
	 * Empty constructor for Serving
	 * 
	 * @param 	none
	 * @return 	none
	 */
	public Serving() {
		System.out.println("Serving created");
	}
	
	/**
	 * Filled constructor for Serving
	 * 
	 * @param 	iceCream		Some kind of IceCream
	 * @param	totalFlavors	Total amount of flavors in serving
	 * @param 	price			The price of it all
	 * @return 	none
	 */
	public Serving(IceCream iceCream, int totalFlavors, double price) {
		System.out.println("Serving created");
		this.iceCeram = iceCream;
		this.totalFlavors = totalFlavors;
		this.price = price;
	}

	/**
	 * Get the IceCream
	 * 
	 * @param 	none
	 * @return 	the serving's ice cream
	 */
	public IceCream getIceCeram() {
		return iceCeram;
	}
	
	/**
	 * Set the IceCream
	 * 
	 * @param 	iceCream	New IceCream object
	 * @return 	none
	 */
	public void setIceCeram(IceCream iceCeram) {
		this.iceCeram = iceCeram;
	}
	
	/**
	 * GET ALL THE FLAVOORRSSS
	 * 
	 * @param 	none
	 * @return 	the amount of flavors
	 */
	public int getTotalFlavors() {
		return totalFlavors;
	}
	
	/**
	 * Set how many flavors
	 * 
	 * @param 	totalFlavors	Amount of flavors
	 * @return 	none
	 */
	public void setTotalFlavors(int totalFlavors) {
		this.totalFlavors = totalFlavors;
	}
	
	/**
	 * Get the total price
	 * 
	 * @param 	none
	 * @return 	the price
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * Set the price
	 * 
	 * @param 	price	a new price
	 * @return 	none
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * Turns the nth total flavors into a reasonable
	 * String we typically use when buying ice cream
	 * 
	 * @param 	none
	 * @return 	English form of number of flavors
	 */
	public String getTotalFlavorsToString() {
		switch(this.totalFlavors) {
		case 1:
			return "Single Dip";
		case 2:
			return "Double Dip";
		case 3:
			return "Tripple Dip";
		default:
			return totalFlavors + " Dip";
		}
	}
}
