/**
 * @author Cameron Moreau
 * 1001024865
 * 9/9/15
 * CSE 1325 - 003
 * 
 * Worker: Customers can place an order with the 
 * worker, and the worker delivers the ice cream.
 */

package hw01.cmm4865;

public class Worker {
	
	private String name;
	
	/**
	 * Empty constructor for Worker
	 * 
	 * @param 	none
	 * @return 	none
	 */
	public Worker() {
		System.out.println("Worker Created");
	}
	
	/**
	 * Worker constructor with worker's name
	 * 
	 * @param 	name	Worker's full name
	 * @return 	none
	 */
	public Worker(String name) {
		System.out.println("Worker Created");
		this.name = name;
	}
	
	/**
	 * Get the worker's name
	 * 
	 * @param 	none
	 * @return 	Worker's name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Set the worker's name
	 * 
	 * @param 	name	Worker's full name
	 * @return 	none
	 */
	public void setName(String name) {
		this.name = name;
	}
}
