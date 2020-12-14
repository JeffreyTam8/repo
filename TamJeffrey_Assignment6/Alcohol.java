/**
 * This class manages the Alcohol type
 * @author Jeffrey Tam
 * CRN: 21599
 * 
 */
public class Alcohol extends Beverage{
	
	public boolean weather;		//Checks the weather is clear or not
	public boolean weekend;		//Checks if the day of the order is the weekened
	
	/**
	 * Parameterize constructor that creates a new alcohol object
	 * @param name
	 * @param size
	 * @param weather
	 */
	public Alcohol(String name, SIZE size, boolean weather) {
		
		setName(name);
		setSize(size);
		setType(TYPE.ALCOHOL);
		this.weather = weather;
			
	}
	
	/**
	 * A second parameterize constructor that creates a new alcohol object
	 * @param name
	 * @param size
	 */
	public Alcohol(String name, SIZE size) {
		
		setName(name);
		setSize(size);
		setType(TYPE.ALCOHOL);
		this.weather = false;
	}

	public String toString() {
		return "";
	}
	
	/**
	 * This method calculates the price of the drink
	 */
	public double calcPrice () {
		double total = BASE_PRICE;
		
		if(size.equals(SIZE.MEDIUM)) {	
			total += 1.0;
		}else if(size.equals(SIZE.LARGE)) {
			total += 2.0;
		}
		
		if(weather == true) {
			
		}
		
		return total;
	}
	
	/**
	 * Returns the weathee
	 */
	@Override
	public boolean getWeather() {
		
		return weather;
	}

	/**
	 * Returns the weekened day
	 */
	@Override
	public boolean isWeekend() {
		
		return weekend;
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

	/**
	 * This method compares the order number of the drink to another drink
	 */
	@Override
	public boolean equals(Beverage beverage) {
		//Checks the name
		String name1 = getName();		
		String name2 = beverage.getName();
		//Checks the size
		SIZE size1 = getSize();
		SIZE size2 = beverage.getSize();
		//Checks the weather 
		boolean weather1 = weather;
		boolean weather2 = beverage.getWeather();
		//Checks the weekend day
		boolean weekend1 = weekend;
		boolean weekend2 = beverage.isWeekend();
		
		//If the instance matches with the other object's instances, then the method will return true
		//Otherwise, the method will return false
		if(name1.equals(name2) &&
			size1.equals(size2) &&
			weather1 == weather2 &&
			weekend1 == weather2) {
			return true;
		}else {
			return false;
		}
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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getExtraSyrup() {
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
	public String getOrderDay() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
