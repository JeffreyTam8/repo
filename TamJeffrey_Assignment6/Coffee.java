/**
 * This class manages the Coffee type
 * @author Jeffrey Tam
 * CRN: 21599
 * 
 */
public class Coffee extends Beverage{

	public boolean extraShot;		//Holds option of another shot
	public boolean extraSyrup;		//Holds option of more syrup
	
	/**
	 * Parameterize constructor to create a coffee object
	 * @param string
	 * @param small
	 * @param extraShot
	 * @param extraSyrup
	 */
	public Coffee(String string, OrderInterface.SIZE small, boolean extraShot, boolean extraSyrup) {
		setName(string);
		setSize(small);
		setType(TYPE.COFFEE);
		this.extraShot = extraShot;
		this.extraSyrup = extraSyrup;
	}

	public String toString() {
		return "";
	}
	
	/**
	 * This method calculates the price of the coffee based on the options made by the customer
	 */
	public double calcPrice () {
		
		double total = BASE_PRICE;
		
		if(size.equals(SIZE.MEDIUM)) {	
			total += 1.0;
		}else if(size.equals(SIZE.LARGE)) {
			total += 2.0;
		}
		
		if(extraShot == true) {
			total += .50;
		}
		
		if(extraSyrup == true) {
			total += .50;
		}
		
		return total;
	}
	
	/**
	 * Returns the extra shot option
	 */
	@Override
	public boolean getExtraShot() {
		return extraShot;
	}
	
	/**
	 * Returns the extra syrup option
	 */
	@Override
	public boolean getExtraSyrup() {
		return extraSyrup;
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

	/**
	 * This checks if the two drinks are equal to each other based on the instances
	 */
	@Override
	public boolean equals(Beverage beverage) {
		
		//Checks name
		String name1 = getName();
		String name2 = beverage.getName();
		
		//Checks size
		SIZE size1 = getSize();
		SIZE size2 = beverage.getSize();
		
		//Checks shot amount
		boolean extraShot1 = getExtraShot();
		boolean extraShot2 = beverage.getExtraShot();
		
		//Check syrup amount
		boolean extraSyrup1 = getExtraSyrup();
		boolean extraSyrup2 = beverage.getExtraSyrup();
		
		//If the instances matches with another drink, then the method will return true, otherwise, the method returns false
		if(name1.equals(name2) &&
			size1.equals(size2) &&
			extraShot1 == extraShot2 &&
			extraSyrup1 == extraSyrup2) {
			return true;
		}else {
			return false;
		}
		
	}

	/**
	 * This method compares the order number of the drink to another drink
	 */
	@Override
	public int compareTo(Beverage o) {
		
		int firstOrdernum = o.getOrderNumer();
		int secondOrderNum = getOrderNumer();
		
		if(firstOrdernum == secondOrderNum) {
			return 0;
		}else if(firstOrdernum < secondOrderNum){
			return 1;
		}else if(firstOrdernum > secondOrderNum) {
			return -1;
		}
		
		return 0;
		
	}
	
	@Override
	public int getOrderNumer() {
		
		return 1;
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
	public String getOrderDay() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
