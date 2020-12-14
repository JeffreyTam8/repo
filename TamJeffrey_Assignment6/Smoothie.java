/**
 * This class manages the Smoothie type orders
 * @author Jeffrey Tam
 * CRN: 21599
 * 
 */

public class Smoothie extends Beverage{
	
	public boolean proteinPowder;		//Holds option of added protein powder
	public int fruit;					//Holds the number of fruit customer wants
	
	/**
	 * Parameterize constructor, creates a new smoothie object
	 * @param name
	 * @param size
	 * @param fruit
	 * @param proteinPowder
	 */
	public Smoothie(String name, SIZE size, int fruit, boolean proteinPowder) {
		
		setName(name);
		setSize(size);
		setType(TYPE.SMOOTHIE);
		this.proteinPowder = proteinPowder;
		this.fruit = fruit;
		
	}

	/**
	 * Returns the information of the smoothie in string form
	 */
	public String toString() {
		return "";
	}
	
	/**
	 * This method calculates the price of the smoothie based on the options made by the customer
	 */
	public double calcPrice	() {
		
		double total = BASE_PRICE;		//The starting price is based on the starting beverage price
		
		if(size.equals(SIZE.MEDIUM)) {			//If the size of the drink increases, then the total cost increases by a dollar
			total += 1.0;
		}else if(size.equals(SIZE.LARGE)) {
			total += 2.0;
		}
		
		//If the customer wanted protein powder, then the total is added by $1.50
		if(proteinPowder == true) {
			total += 1.50;
		}
		
		//The total is added based on the amount of fruit, which is 50 cents per fruit
		total = total + (fruit * .50);
		
		return total;
	}
	
	/**
	 * This method returns the option of protein
	 */
	@Override
	public boolean getProtein() {
		
		return proteinPowder;
	}

	/**
	 * This method return the amount of fruit the customer wanted
	 */
	@Override
	public int getNumFruit() {
		
		return fruit;
	}
	/**
	 * This method checks if the smoothie is the same within another beverage
	 */
	@Override
	public boolean equals(Beverage beverage) {
		//Initizlizing the names, size, and the fruits
		String name1 = getName();
		String name2 = beverage.getName();
		
		SIZE size1 = getSize();
		SIZE size2 = beverage.getSize();
		
		boolean protein1 = getProtein();
		boolean protein2 = beverage.getProtein();
		
		int fruit1 = getNumFruit();
		int fruit2 = beverage.getNumFruit();
		
		//If all of the instances match to another object, then return tru, otherwise, return false
		if(name1.equals(name2) &&
			size1.equals(size2) &&
			protein1 == protein2 &&
			fruit1 == fruit2) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public boolean isWeekend() {
	
		return false;
	}

	@Override
	public Beverage getBeverage(int itemNo) {
		
		return null;
	}

	@Override
	public void addNewBeverage(String bevName, OrderInterface.SIZE size, boolean extraShot, boolean extraSyrup) {
		
		
	}

	@Override
	public void addNewBeverage(String bevName, OrderInterface.SIZE size) {
		
		
	}

	@Override
	public void addNewBeverage(String bevName, OrderInterface.SIZE size, int numOfFruits, boolean addPRotien) {
		
		
	}

	@Override
	public double calcOrderTotal() {
		
		return 0;
	}

	@Override
	public int findNumOfBeveType(OrderInterface.TYPE type) {
		
		return 0;
	}

	@Override
	public void setName(String name) {
		
		this.name = name;
	}

	@Override
	public void setType(OrderInterface.TYPE type) {
		this.type = type;
		
	}

	@Override
	public void setSize(OrderInterface.SIZE size) {
		this.size = size;
		
	}

	@Override
	public String getName() {
		
		return name;
	}

	@Override
	public OrderInterface.TYPE getType() {
		
		return type;
	}

	@Override
	public OrderInterface.SIZE getSize() {
		
		return size;
	}

	public double getBasePrice() {
		
		return 0;
	}

	@Override
	public int compareTo(Beverage o) {
		
		return 0;
	}

	@Override
	public int getOrderNumer() {
		
		return 0;
	}

	@Override
	public boolean getExtraShot() {
		
		return false;
	}

	@Override
	public boolean getExtraSyrup() {
		
		return false;
	}

	@Override
	public boolean getWeather() {
		
		return false;
	}

	@Override
	public String getOrderDay() {
		// TODO Auto-generated method stub
		return null;
	}


	
}
