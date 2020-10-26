/**
 * Assignment 4 ManagementCompany
 * 10/25/20
 * CRN: 21599
 * @author Jeffrey Tam
 *
 */
public class ManagementCompany {

	private int MAX_PROPERTY = 5;	//Holds the max value of properties
	private double mgmFeePer;		//Holds the fees of per property
	private String name;			//Holds the name of the management
	private Property[]  properties;	//Holds the properties in a list
	private String taxID;			//Holds the taxID 
	private int MGMT_WIDTH = 10;	//Holds the width of the property
	private int MGMT_DEPTH = 10;	//Holds the depth of the property
	private Plot plot;				//Holds the plot of the management property
	
	/**
	 * Default constructor of the ManagementCompany object
	 */
	ManagementCompany() {
		mgmFeePer = 0;
		name = "";
		properties = new Property[MAX_PROPERTY];
		taxID = "";
		plot = new Plot(0, 0, 10, 10);
	}
	
	/**
	 * Four parameter constructor, creates a new management object with the parameters
	 * @param name
	 * @param taxID
	 * @param mgmFee
	 */
	ManagementCompany(String name, String taxID, double mgmFee){
		mgmFeePer = mgmFee;
		this.name = name;
		properties = new Property[MAX_PROPERTY];
		this.taxID = taxID;
		plot = new Plot(0, 0, 10, 10);
	}
	
	/**
	 * Seven parameter constructor, creates a new management object with the parameters
	 * @param name
	 * @param taxID
	 * @param mgmFee
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 */
	ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth){
		mgmFeePer = mgmFee;
		this.name = name;
		properties = new Property[MAX_PROPERTY];
		this.taxID = taxID;
		plot = new Plot(x, y, width, depth);
	}
	
	/**
	 * One parameter constructor, creates a new management object with another ManagementCompany object
	 * @param otherCompany
	 */
	ManagementCompany(ManagementCompany otherCompany){
		mgmFeePer = otherCompany.mgmFeePer;
		name = otherCompany.name;
		properties = otherCompany.properties;
		taxID = otherCompany.taxID;
		plot = otherCompany.plot;
	}
	
	/**
	 * This adds a property in the properties' list 
	 * If the properties' list is full, it will return -1
	 * If the argument is null, then it will return -2
	 * If the property is not encompass with the property, then it will return -3
	 * If the properties of the properties' list over lap, then it will return -4
	 * @param property
	 * @return -1, -2, -3, -4, counter
	 */
	public int addProperty(Property property) {
		
		int counter = 0;
		for(int i = 0; i < properties.length; i++) {
			if(properties[i] != null) {
				counter++;
			}else if(properties[i] == null) {
				if(property == null) {
					return -2;
				}
				properties[i] = property;
				i = properties.length;
			}
		}
		if(counter == MAX_PROPERTY) {
			return -1;
		}else if(!plot.encompasses(property.getPlot())){
			return -3;
		}
		
		
		for(int i = 0; i < counter; i++) {
			if(properties[i].getPlot().overlaps(property.getPlot())) {
				return -4;
			}
		}
		return counter;
	}
	/**
	 * This adds a property in the properties' list 
	 * If the properties' list is full, it will return -1
	 * If the argument is null, then it will return -2
	 * If the property is not encompass with the property, then it will return -3
	 * If the properties of the properties' list over lap, then it will return -4
	 * @param name
	 * @param city
	 * @param rent
	 * @param owner
	 * @return
	 */
	public int addProperty(String name, String city, double rent, String owner) {
		
		int counter = 0;
		for(int i = 0; i < properties.length; i++) {
			if(properties[i] != null) {
				counter++;
			}else if(properties[i] == null) {
				if(name.equalsIgnoreCase(null) || city.equalsIgnoreCase(null) || owner.equalsIgnoreCase(null)) {
					return -2;
				}
				properties[i] = new Property(name, city, rent, owner);
			}
		}
		
		if(counter == MAX_PROPERTY) {
			return -1;
		}else if(!plot.encompasses(properties[counter].getPlot())) {
			return -3;
		}
		
		for(int i = 0; i < counter; i++) {
			if(properties[i].getPlot().overlaps(properties[counter].getPlot())) {
				return -4;
			}
		}
		
		return counter;
	}
	
	/**
	 * This adds a property in the properties' list 
	 * If the properties' list is full, it will return -1
	 * If the argument is null, then it will return -2
	 * If the property is not encompass with the property, then it will return -3
	 * If the properties of the properties' list over lap, then it will return -4
	 * @param name
	 * @param city
	 * @param rent
	 * @param owner
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 * @return
	 */
	public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth) {
		int counter = 0;
		
		for(int i = 0; i < properties.length; i++) {
			if(properties[i] != null) {
				counter++;
			}else if(properties[i] == null) {
				if(name.equalsIgnoreCase(null) || city.equalsIgnoreCase(null) || owner.equalsIgnoreCase(null)) {
					return -2;
				}
				properties[i] = new Property(name, city, rent, owner);
				properties[i].setPlot(x, y, width, depth);
			}
		}
		
		if(counter == MAX_PROPERTY) {
			return -1;
		}else if(!plot.encompasses(properties[counter].getPlot())) {
			return -3;
		}
		
		for(int i = 0; i < counter; i++) {
			if(properties[i].getPlot().overlaps(properties[counter].getPlot())) {
				return -4;
			}
		}
		return counter;
	}
	
	
	/**
	 * Uses the argument as the index of the properties' list
	 * returns the properties' toString/ information
	 * @param i
	 * @return properties[i].toString()
	 */
	public String displayPropertyAtIndex(int i) {
		
		return properties[i].toString();
		
	}
	
	/**
	 * Returns the max property of the list
	 * @return MAX_PROPERTY
	 */
	public int getMAX_PROPERTY() {
		return MAX_PROPERTY;
	}
	
	/**
	 * Returns the highest rent of the array list with linear search
	 * @return max
	 */
	public double maxRentProp() {
		double max = 0;
		
		for(int i = 0; i < properties.length; i++) {
			if (max < properties[i].getRentAmount()) {
				max = properties[i].getRentAmount();
			}
		}
		return max;
	}
	
	/**
	 * Search the index of the properties's list that had the highest rent 
	 * Returns the index of the property with the highest rent
	 * @return indexProp
	 */
	public int maxRentPropertyIndex() {
		double max = 0;
		int indexProp = 0;
		for(int i = 0; i < properties.length; i++) {
			if (max < properties[i].getRentAmount()) {
				max = properties[i].getRentAmount();
				indexProp = i;
			}
		}
		return indexProp;
	}
	
	/**
	 * Displays all of the properties' information in string form
	 * @return allPropString
	 */
	public String toString() {
		String allPropString = "";
		
		for(int i = 0; i < properties.length; i++) {
			allPropString += properties[i].toString();
		}
		
		return allPropString;
	}
	
	/**
	 * Calculates the total rent amount from all of the properties
	 * @return total
	 */
	public double totalRent() {
		double total = 0.0;
		
		for(int i = 0; i < properties.length; i++) {
			total += properties[i].getRentAmount();
		}
		
		return total;
	}

}
		
	

