/**
 * @author Cameron Moreau
 * 1001024865
 * 9/9/15
 * CSE 1325 - 003
 * 
 * Shop: The shop itself is a class that includes 
 * all the components of the ice cream shop. The 
 * shop controls and manipulates the rest of the 
 * system.
 */

package hw01.cmm4865;

public class Shop {
	
	private Order order;
	
	@SuppressWarnings("unused")
	private CashRegister register;
	
	//Temp for first hw
	private IceCream iceCream;
	private Serving serving;
	private Customer customer;
	private Worker worker;
	
	/**
	 * Empty constructor for Shop
	 * Also creates the register
	 * 
	 * @param 	none
	 * @return 	none
	 */
	public Shop() {
		System.out.println("Shop created");
		this.register = new CashRegister(187);
	}
	
	/**
	 * Create an IceCream
	 * 
	 * @param 	none
	 * @return 	none
	 */
	public void createIceCream() {
		this.iceCream = new IceCream(
			"Chocolate Chunk", "Chocolate", 
			"Cream flavor with broken bits of dark chocolate", 1
		);
	}
	
	/**
	 * Create the servings
	 * Also creates the IceCream if it doesn't exist
	 * 
	 * @param 	none
	 * @return 	none
	 */
	public void createServing() {
		if(iceCream == null) createIceCream();
		this.serving = new Serving(iceCream, 2, iceCream.getPrice() * 2);
	}
	
	/**
	 * Create the Customer with some dummy data
	 * 
	 * @param 	none
	 * @return 	none
	 */
	public void createCustomer() {
		this.customer = new Customer("Cameorn Moreau", 9, 188.50);
	}
	
	/**
	 * Create the worker with some dummy data
	 * 
	 * @param 	none
	 * @return 	none
	 */
	public void createWorker() {
		this.worker = new Worker("Jacob Smith");
	}
	
	/**
	 * Create the worker with some dummy data
	 * Also creates the customer, worker and serving
	 * if they do not exist
	 * 
	 * @param 	none
	 * @return 	none
	 */
	public void createOrder() {
		if(customer == null) createCustomer();
		if(worker == null) createWorker();
		if(serving == null) createServing();
		this.order = new Order(customer, worker, serving, 1337, false);
	}
	
	/**
	 * Get the order object
	 * 
	 * @param 	none
	 * @return 	shop's single order
	 */
	public Order getOrder() {
		return order;
	}
	
	/**
	 * Set the order for the shop
	 * 
	 * @param 	order	new order object
	 * @return 	none
	 */
	public void setOrder(Order order) {
		this.order = order;
	}
	
	/**
	 * Get the single ice cream
	 * 
	 * @param 	none
	 * @return 	the shop's and order's ice cream
	 */
	public IceCream getIceCream() {
		return iceCream;
	}
	
	/**
	 * Set an ice cream
	 * 
	 * @param 	iceCream	New icecream for the order
	 * @return 	none
	 */
	public void setIceCream(IceCream iceCream) {
		this.iceCream = iceCream;
	}
	
	/**
	 * Get the single serving
	 * 
	 * @param 	none
	 * @return 	the shop's serving
	 */
	public Serving getServing() {
		return serving;
	}
	
	/**
	 * Set the serving
	 * 
	 * @param 	serving	A new serving
	 * @return 	none
	 */
	public void setServing(Serving serving) {
		this.serving = serving;
	}
	
	/**
	 * Get the customer
	 * 
	 * @param 	none
	 * @return 	the shop's customer
	 */
	public Customer getCustomer() {
		return customer;
	}
	
	/**
	 * Set the customer
	 * 
	 * @param 	customer	new customer for the shop
	 * @return 	none
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	/**
	 * Get the shop's worker
	 * 
	 * @param 	none
	 * @return 	the shop's worker
	 */
	public Worker getWorker() {
		return worker;
	}
	
	/**
	 * Set the worker
	 * 
	 * @param 	worker	Set the shop's new worker
	 * @return 	none
	 */
	public void setWorker(Worker worker) {
		this.worker = worker;
	}
	
}
