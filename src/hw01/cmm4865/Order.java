/**
 * @author Cameron Moreau
 * 1001024865
 * 9/9/15
 * CSE 1325 - 003
 * 
 * Order: Every order is a combination of the other 
 * components: the Customer, the Worker, and the Serving. 
 * Orders have an order number and either a paid or 
 * unpaid status.
 * */

package hw01.cmm4865;

public class Order {
	
	private Customer customer;
	private Worker worker;
	private Serving serving;
	private int orderNumber;
	private boolean hasPaid;
	
	/**
	 * Empty constructor for Order
	 * 
	 * @param 	none
	 * @return 	none
	 */
	public Order() {
		System.out.println("Order created");
	}
	
	/**
	 * Full constructor for Order
	 * 
	 * @param 	customer		The customer
	 * @param	worker			Which worker?
	 * @param	serving			The serving object
	 * @param	orderNumber		The order number
	 * @param	hasPaid			has the customer paid?	
	 * @return 	none
	 */
	public Order(Customer customer, Worker worker, Serving serving,
			int orderNumber, boolean hasPaid) {
		System.out.println("Order created");
		this.customer = customer;
		this.worker = worker;
		this.serving = serving;
		this.orderNumber = orderNumber;
		this.hasPaid = hasPaid;
	}
	
	/**
	 * Get the customer
	 * 
	 * @param 	none
	 * @return 	the customer
	 */
	public Customer getCustomer() {
		return customer;
	}
	
	/**
	 * Set a new customer
	 * 
	 * @param 	customer	new customer
	 * @return 	none
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	/**
	 * Get the worker
	 * 
	 * @param 	none
	 * @return 	worker
	 */
	public Worker getWorker() {
		return worker;
	}
	
	/**
	 * Set the worker
	 * 
	 * @param 	worker	new worker
	 * @return 	none
	 */
	public void setWorker(Worker worker) {
		this.worker = worker;
	}
	
	/**
	 * Get the serving
	 * 
	 * @param 	none
	 * @return 	serving
	 */
	public Serving getServing() {
		return serving;
	}

	/**
	 * Set a new serving
	 * 
	 * @param 	none
	 * @return 	serving
	 */
	public void setServing(Serving serving) {
		this.serving = serving;
	}
	
	/**
	 * Get the order number
	 * 
	 * @param 	none
	 * @return 	orderNumber
	 */
	public int getOrderNumber() {
		return orderNumber;
	}
	
	/**
	 * Set the order number
	 * 
	 * @param 	orderNumber 	number of the order
	 * @return 	none
	 */
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	
	/**
	 * Check if the customer has paid
	 * 
	 * @param 	none
	 * @return 	paid
	 */
	public boolean isHasPaid() {
		return hasPaid;
	}
	
	/**
	 * Set if the customer has paid
	 * 
	 * @param 	hasPaid		if they have paid
	 * @return 	none
	 */
	public void setHasPaid(boolean hasPaid) {
		this.hasPaid = hasPaid;
	}
	
}
