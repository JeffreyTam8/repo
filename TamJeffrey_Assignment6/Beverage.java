/**
 * This class manages the Beverage class
 * @author Jeffrey Tam
 * CRN: 21599
 * 
 */
public abstract class Beverage implements OrderInterface{
	
	public String name;		//Holds the name of drink
	public TYPE type;		//Holds the type of drink
	public SIZE size;		//Holds the size of drink
	
	//Starting price of the drink
	public final double BASE_PRICE = 2.0;
	public double size_Price;		//The price of the size of drinks increases
	
	/**
	 * Parameterize constructor of initializing the class' variables
	 * @param name
	 * @param type
	 * @param size
	 */
	public Beverage (String name, TYPE type, SIZE size) {
		this.name = name;
		this.type = type;
		this.size = size;
	}
	
	/**
	 * Starting initials
	 */
	public Beverage() {
		name = "";
		type = TYPE.ALCOHOL;
		size  = SIZE.LARGE;
		size_Price = 1.0;
		
	}
	
	//These abstract methods are a list to connect with the beverage and order class
	public abstract String toString();					//Gets string
	public abstract boolean equals(Beverage beverage);	//Compares two beverages
	public abstract int compareTo(Beverage o);			//Compares two beverages with options
	public abstract void setName(String name);			//Sets the name of drink
	public abstract void setType(TYPE type);			//Sets the type of drink
	public abstract void setSize(SIZE size);			//Sets the size of drink
	public abstract String getName();					//Returns the name
	public abstract TYPE getType();						//Returns the type
	public abstract SIZE getSize();						//Returns of size
	public abstract String getOrderDay();				//Returns the day
	public abstract Beverage getBeverage(int i);		//Returns the drink from a list made in the order class
	public abstract int getOrderNumer();				//Returns the order number
	
	public abstract boolean getExtraShot();				//Extra shots option
	public abstract boolean getExtraSyrup();			//Extra syrup option
	
	public abstract boolean getWeather();				//Checks weather
	
	public abstract boolean getProtein();				//Checks if customer wanted protein
	public abstract int getNumFruit();					//Check how much fruit customers want

	protected abstract double calcPrice();				//Gets the total of the whole order
	
}
