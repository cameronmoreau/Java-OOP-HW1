/**
 * @author Cameron Moreau
 * 1001024865
 * 9/9/15
 * CSE 1325 - 003
 * 
 * Ice Cream: A class that holds the flavor, price, name, and description 
 * of an ice cream. The available selections are listed in the appendix.
 */

package hw01.cmm4865;

public class IceCream {
	
	private String name, flavor, desc;
	private double price;
	
	/**
	 * Empty constructor for IceCream
	 * 
	 * @param 	none
	 * @return 	none
	 */
	public IceCream() {
		System.out.println("IceCream created");
	}
	
	/**
	 * Filled constructor for IceCream
	 * 
	 * @param 	name	The name of the ice cream
	 * @param	flavor	The Flavorrr!
	 * @param	desc	The description
	 * @param 	price	the price of the ice cream
	 * @return 	none
	 */
	public IceCream(String name, String flavor, String desc, double price) {
		System.out.println("IceCream created");
		this.name = name;
		this.flavor = flavor;
		this.desc = desc;
		this.price = price;
	}
	
	/**
	 * Get the ice cream's name
	 * 
	 * @param 	none
	 * @return 	the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Set a new name of the ice cream
	 * 
	 * @param 	name	The ice cream's name
	 * @return 	none
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get the current flavor
	 * 
	 * @param 	none
	 * @return 	flavor
	 */
	public String getFlavor() {
		return flavor;
	}

	/**
	 * Set a new flavor
	 * 
	 * @param 	flavor	New flavor!
	 * @return 	none
	 */
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	/**
	 * Get the description
	 * 
	 * @param 	none
	 * @return 	description
	 */
	public String getDesc() {
		return desc;
	}
	
	/**
	 * Set a new description
	 * 
	 * @param 	desc	The description
	 * @return 	none
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	/**
	 * Get the price per serving
	 * 
	 * @param 	none
	 * @return 	price
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * Set a new price
	 * 
	 * @param 	price	price of the ice cream
	 * @return 	none
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
}
