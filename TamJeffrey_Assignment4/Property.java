/**
 * Assignment 4 Property
 * 10/25/20
 * CRN: 21599
 * @author Jeffrey Tam
 *
 */
public class Property {
	
	private String city;		//Hold the city's name
	private String owner;		//Hold the owner's name
	private String propertyName;//Hold the property name
	private double rentAmount;	//Hold the rent amount of property
	private Plot plot;			//Hold the plot of property
	
	/**
	 * Default Constructor, empty name, owner, city, rentAmount, and plot
	 */
	Property(){
		city = "";
		owner = "";
		propertyName = "";
		rentAmount = 0;
		plot = new Plot(0, 0, 1, 1);
	}
	
	/**
	 * Constructor with one parameter property object
	 * Uses the property's object and set it to the new property object
	 * @param p
	 */
	Property(Property p){
		city = p.city;
		owner = p.owner;
		propertyName = p.propertyName;
		rentAmount = p.rentAmount;
		plot = p.plot;
	}
	
	/**
	 * Four parameter constructor
	 * Uses arguments to form a new property object
	 * Sets the plot to empty
	 * @param propertyName
	 * @param city
	 * @param RentAmount
	 * @param owner
	 */
	Property(String propertyName, String city, double RentAmount, String owner){
		
		this.city = city;
		this.owner = owner;
		this.propertyName = propertyName;
		this.rentAmount = rentAmount;
		plot = new Plot(0, 0, 1, 1);
		
	}
	
	/**
	 * Eight parameter constructor
	 * Uses arguments to form a new property object
	 * @param propertyName
	 * @param city
	 * @param rentAmount
	 * @param owner
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 */
	Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth){
		
		this.city = city;
		this.owner = owner;
		this.propertyName = propertyName;
		this.rentAmount = rentAmount;
		plot = new Plot(x, y, width, depth);
	}
	
	/**
	 * Returns the city name
	 * @return city
	 */
	public String getCity() {
		return city;
	}
	
	/**
	 * Returns the owner's name
	 * @return owner
	 */
	public String getOwner() {
		return owner;
	}
	
	/**
	 * Returns the property's name
	 * @return propertyName
	 */
	public String getPropertyName() {
		return propertyName;
	}
	
	/**
	 * Returns the rent of the property
	 * @return rentAmount
	 */
	public double getRentAmount() {
		return rentAmount;
	}
	
	/**
	 * Returns the plot
	 * @return plot
	 */
	public Plot getPlot() {
		return plot;
	}
	
	/**
	 * Sets the plots with coordinates, width, and depth values
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 */
	public void setPlot(int x, int y, int width, int depth) {
		plot = new Plot(x, y, width, depth);
	}
	
	/**
	 * Changes the city name with the argument
	 * @param city
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	/**
	 * Changes the owner's name with the argument
	 * @param owner
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	/**
	 * Changes the property name with the argument
	 * @param propertyName
	 */
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	
	/**
	 * Changes the rent amount with the argument
	 * @param rentAmount
	 */
	public void setRentAmount(double rentAmount) {
		this.rentAmount = rentAmount;
	}
	
	/**
	 * Returns the string value with the property, city, owners, and rent amount
	 */
	public String toString() {
		return "Property Name: " + propertyName + "\n" + 
				" Located in " + city + "\n" +
				" Belonging to: " + owner + "\n" +
				" Rent Amount: " + rentAmount + "\n";
	}
}
