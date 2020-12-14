/**
 * This class manages the order.
 * The class connects with the Beverage class, OrderInterface, and Comparable
 * @author Jeffrey Tam
 * CRN: 21599
 * 
 */

import java.util.ArrayList;
import java.util.Random;

public class Order extends Beverage implements Comparable<Order>, OrderInterface{
	
	public int orderNumber;			//Number of the order being made
	public String orderTime;		//Time of order being made
	public String orderDay;			//Day of order being made
	public ArrayList<Beverage> listOfBev;	//List of beverages made per order
	public final int MAX_ORDER_NUMBER = 80001;	//The max random order number
	public final int STARTING_ORDER_NUMBER = 10000;	//The min orstart random order number

	/**
	 * Constructor
	 * @param i
	 * @param monday
	 * @param customer
	 */
	public Order(int i, OrderInterface.DAY monday, Customer customer) {
		
		orderNumber = i;
		orderDay = monday.toString();
		listOfBev = new ArrayList<Beverage>();
		
	}

	/**
	 * This method creates a new order number per order
	 * @return new order number
	 */
	public int generateNewOrderNum() {
		Random rand = new Random();			//Uses the random class
		return STARTING_ORDER_NUMBER + rand.nextInt(MAX_ORDER_NUMBER);		//Adds the starting order number and adds the max
	}

	/**
	 * This is a getter method that obtains the total amount of beverages
	 */
	@Override
	public Beverage getBeverage(int itemNo) {
		
		return listOfBev.get(itemNo);
	}

	/**
	 * This method adds the coffee in the order
	 */
	@Override
	public void addNewBeverage(String bevName, OrderInterface.SIZE size, boolean extraShot, boolean extraSyrup) {
		
		Beverage coffee = new Coffee(bevName, size, extraShot, extraSyrup); //Creates a new coffee object
		listOfBev.add(coffee);	//added to the list of beverages
		
	}
	
	/**
	 * This method adds the alcohol in the order
	 */
	@Override
	public void addNewBeverage(String bevName, OrderInterface.SIZE size) {
		
		Beverage alcohol = new Alcohol(bevName, size);	//Creates a new alcohol object
		listOfBev.add(alcohol);	//added to the list of beverages
		
	}

	/**
	 * This method adds the smoothie in the order
	 */
	@Override
	public void addNewBeverage(String bevName, OrderInterface.SIZE size, int numOfFruits, boolean addPRotien) {
		
		Beverage smoothie = new Smoothie(bevName, size, numOfFruits, addPRotien);	//Creates a new smoothie object
		listOfBev.add(smoothie);	//added to the list of beverages
	}

	/**
	 * The method will look through the entire list and added the total cost
	 * @return total
	 */
	@Override
	public double calcOrderTotal() {
		
		double total = 0.0;			//Starting total
		
		for(int i = 0; i < listOfBev.size(); i++) {		//Loops through each element in the list
			
			total += listOfBev.get(i).calcPrice();		//Adds the total price using the methods of the subclass
			
		}
		
		if(orderDay.equals("SATURDAY") || orderDay.equals("SUNDAY")) {	//Adds additional weekend price if weekend occured
			total += .60;
		}
		return total;		//Returns the total amount of the order
		
	}
	
	@Override
	public int findNumOfBeveType(OrderInterface.TYPE type) {
		
		return 0;
	}

	@Override
	public String toString() {
		
		return null;
	}

	/**
	 * This method will return to see if the beverage's name is the same
	 */
	@Override
	public boolean equals(Beverage beverage) {
		
		String name1 = getName();
		String name2 = beverage.getName();
		
		if(name1.equals(name2)) {
			return true;
		}else {
			return false;
		}
		
	}

	/**
	 * Sets the name of the person who ordered
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Sets the type of the drink
	 */
	@Override
	public void setType(OrderInterface.TYPE type) {
		this.type = type;
	}

	/**
	 * Sets the size of the drink
	 */
	@Override
	public void setSize(OrderInterface.SIZE size) {
		this.size = size;
	}
	
	/**
	 * Returns the person's name of the order
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * Returns the type of drink of the order
	 */
	@Override
	public OrderInterface.TYPE getType() {
		return type;
	}
	
	/**
	 * Returns the size of the drink
	 */
	@Override
	public OrderInterface.SIZE getSize() {
		return size;
	}

	/**
	 * Returns the number of drinks in the order
	 * @return
	 */
	public int getTotalItems() {
		
		return listOfBev.size();
		
	}

	/**
	 * Comparison method that checks if the order number is correct
	 */
	@Override
	public int compareTo(Beverage o) {
		int firstOrdernum = o.getOrderNumer();
		int secondOrderNum = orderNumber;
		
		if(firstOrdernum == secondOrderNum) {
			return 0;
		}else if(firstOrdernum < secondOrderNum){
			return 1;
		}else if(firstOrdernum > secondOrderNum) {
			return -1;
		}
		
		return 0;
	}

	/**
	 * Comparison method that compares to see if the order number is correct.
	 */
	@Override
	public int compareTo(Order o) {
		int firstOrdernum = o.orderNumber;
		int secondOrderNum = orderNumber;
		
		if(firstOrdernum == secondOrderNum) {
			return 0;
		}else if(firstOrdernum < secondOrderNum){
			return 1;
		}else if(firstOrdernum > secondOrderNum) {
			return -1;
		}
		
		return 0;
	}

	/**
	 * Returns the order number
	 */
	@Override
	public int getOrderNumer() {
		
		return orderNumber;
	}

	/**
	 * Returns the day of the order made
	 */
	@Override
	public String getOrderDay() {
		
		return orderDay;
	}
	
	@Override
	public boolean getExtraShot() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getExtraSyrup() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getWeather() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getProtein() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getNumFruit() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected double calcPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public boolean isWeekend() {
		
		return false;
	}

	
	
}
