import com.sun.javafx.geometry.BoundsUtils;

/**
 * This class calculates the hoilday bonus for each store, and the total holiday bonus of every
 * store receives. 
 * @author Jeffrey Tam
 *
 */
public class HolidayBonus {
	
	/**
	 * This method return a list of bonuses for each store
	 * If the store does not have the item they sell in certain catagory, then they 
	 * do not receive a bonus
	 * Bounuses are given based on which stores ranks in certain sales
	 * @param data
	 * @param high
	 * @param low
	 * @param other
	 * @return bonusList[]
	 */
	public static double[] calculateHolidayBonus(double[][] data, double high, double low, double other){
		
		double[] bonusList = new double[data.length];		//The rows in the data is the number of stores
		TwoDimRaggedArrayUtility obj = new TwoDimRaggedArrayUtility();	//This object allows the program to use methods from 
																		//from another class.
		for(int i = 0; i < data.length; i++) {	//This initializes the bonuses to $0 in each element
			bonusList[i] = 0.0;
		}
		
		
		int maxCol = 0;		//Hold the most column in any of the rows
		
		//Loops until the last row
		//The loop finds the most amount of columns/categories by comparing each row's column amount
		for(int row = 0; row < data.length; row++) {
			if(maxCol < data[row].length) {			//If the current search column is higher than the current max column count
				maxCol = data[row].length;			//Then the current column being searched is the new max amount
			}
		}
		
		int currentRow = 0;		//Holds the store's current index
		
		//Loops until each column
		for(int currentCol = 0; currentCol < maxCol; currentCol++) {
			
				int highestStoreIndex = obj.getHighestInColumnIndex(data, currentCol);	//Finds the store with the highest profit
				int lowestStoreIndex = obj.getLowestInColumnIndex(data, currentCol);	//Finds the store with the lowest profit
			
			bonusList[highestStoreIndex] += high;	//Adds the store's highest index to high bonus amount
			bonusList[lowestStoreIndex] += low;		//Adds the store's lowest index to low bonus amount
			
			int othersCounter = 0;	//Holds the search number of the stores who will receive others bonus amount
			
			//Loops through each store
			while(othersCounter < data.length) {
				//This prevents from stores who already received the highest bonus amount and
				//stores received the lowest bonus amount, and stores who had not sold the catagory
				//To gain other bonuses
				//This will only give the bonus who does not have the highest and lowest sales, but also
				//Sell in the particular category
				if(othersCounter != highestStoreIndex && othersCounter != lowestStoreIndex && currentCol < data[othersCounter].length) {	
					bonusList[othersCounter] += other;
				}
			}
		}
		
		//Returns the total bonus amount each store will receive
		return bonusList;
	}
	
	/**
	 * This method adds all of the bonuses each store received and returns the total amount
	 * @param data
	 * @param high
	 * @param low
	 * @param other
	 * @return total
	 */
	public static double calculateTotalHolidayBonus(double[][] data, double high, double low, double other) {
		
		//This uses the method existed in the class to gain the bonus list information
		double[] bonusList = calculateHolidayBonus(data, high, low, other);
		
		double total = 0.0;	//holds the  combined amount of bonuses
		
		//Loops until the last element of the bonus list
		for(int i = 0; i < bonusList.length; i++) {
			total += bonusList[i];
		}
		return total;
	}
	
}
