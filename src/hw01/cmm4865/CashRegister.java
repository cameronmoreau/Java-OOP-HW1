/**
 * @author Cameron Moreau
 * 1001024865
 * 9/9/15
 * CSE 1325 - 003
 * 
 * Cash Register: The cash register holds the current 
 * amount of money in the ice cream shop. When orders 
 * are placed money goes into the register and change 
 * (if any) comes out.
 */

package hw01.cmm4865;

public class CashRegister {
	
	private double totalMoney;
	
	/**
	 * Empty constructor for CashRegister
	 * 
	 * @param 	none
	 * @return 	none
	 */
	public CashRegister() {
		System.out.println("CashRegister created");
	}
	
	/**
	 * Initialize CashRegister with money inside
	 * 
	 * @param 	totalMoney	total money in the register
	 * @return 	none
	 */
	public CashRegister(double totalMoney) {
		System.out.println("CashRegister created");
	}
	
	
	/**
	 * Get total money in the register
	 * 
	 * @param 	none
	 * @return 	total money in the register
	 */
	public double getTotalMoney() {
		return totalMoney;
	}
	
}
