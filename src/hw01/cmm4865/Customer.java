/**
 * @author Cameron Moreau
 * 1001024865
 * 9/9/15
 * CSE 1325 - 003
 * 
 * Customer: Each customer has a name, a level 
 * of happiness, and a certain amount of money 
 * in their wallet.
 */

package hw01.cmm4865;

public class Customer {
	
	private String name;
	private int happiness;
	private double money;
	
	/**
	 * Basic constructor for Customer
	 * 
	 * @param 	none
	 * @return 	none
	 */
	public Customer() {
		System.out.println("CashRegister created");
	}
	
	/**
	 * Constructor for Customer with filled data
	 * 
	 * @param 	name		Customer's full name
	 * @param	happiness	The customer's happiness
	 * @param 	money		The amount of money they have
	 * @return 	none
	 */
	public Customer(String name, int happiness, double money) {
		System.out.println("Customer created");
		this.name = name;
		this.happiness = happiness;
		this.money = money;
	}

	/**
	 * Get the full name
	 * 
	 * @param 	none
	 * @return 	their full name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Update the customer name
	 * 
	 * @param 	name	the customer's full name
	 * @return 	none
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Get the customer's happiness
	 * 
	 * @param 	none
	 * @return 	their happiness
	 */
	public int getHappiness() {
		return happiness;
	}
	
	/**
	 * Set the customer's happiness
	 * 
	 * @param 	happiness how happy are they?
	 * @return 	none
	 */
	public void setHappiness(int happiness) {
		this.happiness = happiness;
	}
	
	/**
	 * Get the customer's total money
	 * 
	 * @param 	none
	 * @return 	their money
	 */
	public double getMoney() {
		return money;
	}
	
	/**
	 * Set the customer's money
	 * 
	 * @param 	money	Their new money
	 * @return 	none
	 */
	public void setMoney(double money) {
		this.money = money;
	}
	
}
