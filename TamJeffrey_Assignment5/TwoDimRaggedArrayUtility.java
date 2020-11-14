import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

/**
 * This class is used to find specific information base on the selected row, column, and the data provided
 * The class can find the highest and lowest of the entire data
 * The class can find the highest and lowest of the data's row
 * The class can find the highest and lowest of the data's column
 * The class can create and write files of the data in an appropriate format
 * The class can collect data from a file and convert it into program langaue data
 * @author Jeffrey Tam
 *
 */
public class TwoDimRaggedArrayUtility {
	
	/**
	 * This method adds all of the data and averages by the number of data
	 * @param data
	 * @return (total/numOfData)
	 */
	public static double getAverage(double[][] data) {
		
		double numOfData = 0;	//Stores the number of profits
		double total = 0;		//Stores the value of the profits
		for(int i = 0; i < data.length; i++) {		//Loops through each data in every row and column
			for(int j = 0; j < data[i].length; j++) {
				
				total += data[i][j];	//Adds the current searched profit to the total
				numOfData++;			//Increases the counter 
			}
		}
		return (total/numOfData);	//Returns the average by dividing the total profit by the number of data
	}
	
	/**
	 * This method returns the total of the profits in the selected column
	 * When there is no column in a searched row, the method will skip the row
	 * @param data
	 * @param col
	 * @return total
	 */
	public static double getColumnTotal(double[][] data, int col) {
		
		double total = 0;	//Stores the total of the columns
		for(int i = 0; i < data.length; i++) {	//Loops through the data's columns
			if(data[i].length > col) {			//If there is no selected index column in certain rows, the method will skip the row
				total += data[i][col];			//Otherwise, the searched data is added to the total. 
			}else {
				total += 0;						
			}
		}
			return total;						//Returns the total
	}

	/**
	 * This method will get the highest amount of the data
	 * @param data
	 * @return maxValue
	 */
	public static double getHighestInArray(double[][] data) {
		
		double maxValue = data[0][0];		//Starting value
		
		//Loops through all of the data
		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[i].length; j++) {
				if(data[i][j] > maxValue) {		//If the current value is lower than the current searched, then the current
					maxValue = data[i][j];		//Then the current searched will replace the maxValue	
				}
			}
		}
		return maxValue;			//Returns the highest value of the data
	}
	
	/**
	 * This method will search through the highest value in the column
	 * @param data
	 * @param col
	 * @return
	 */
	public static double getHighestInColumn(double[][] data, int col) {
		
		double maxValue = data[0][col];	//Starting value
		
		//Loops through all of the data's columns 
		for(int i = 0; i < data.length; i++) {	
			if(data[i].length > col) {		//If the column does not exist in the searched row, then the value is not added
				if(maxValue < data[i][col]) {	//If the current maxValue is, lower than the searched, then the searched replaces the current max value
					maxValue =  data[i][col];
				}
			}
		}
		return maxValue;		//Returns the highest 
	}
	
	/**
	 * This method returns the index of the highest column selected
	 * @param data
	 * @param col
	 * @return
	 */
	public static int getHighestInColumnIndex(double[][] data, int col) {
		
		
		double maxValue = data[0][col];	//Starting value
		int highIndex = 0;				//Highest index storage
		//Loops through all of the data's columns 
		for(int i = 0; i < data.length; i++) {	
			if(data[i].length > col) {		//If the column does not exist in the searched row, then the value is not added
				if(maxValue < data[i][col]) {	//If the current maxValue is, lower than the searched, then the searched replaces the current max value
					maxValue =  data[i][col];
					highIndex = i;				//The highest index is changed when the current max changes
				}
			}
		}
		
		return highIndex;		//Returns the highest 	
	}
	
	/**
	 * This method searches the selected row of the data and returns the highest value
	 * @param data
	 * @param row
	 * @return maxValue
	 */
	public static double getHighestInRow(double[][] data, int row) {
		
		double maxValue = data[row][0];	//holds the highest value
		//Loops through each column of the row
		for(int i = 0; i < data[row].length; i++) {
			if(maxValue < data[row][i]) {	//If the current max is lower than the searched,
				maxValue = data[row][i];	//Then the searched value replaces the max value
			}
		}
		return maxValue;	//Returns the max value

	}
	/**
	 * This method searches the selected row of the data and returns the index of the highest value
	 * @param data
	 * @param row
	 * @return maxValueIndex
	 */
	public static int getHighestInRowIndex(double[][] data, int row) {
		
		double maxValue = data[row][0];	//Holds the highest value
		int maxValueIndex = 0;			//Holds the index of the highest value in the row
		
		//Loops through each column of the row
		for(int i = 0; i < data[row].length; i++) {
			if(maxValue < data[row][i]) {	//If the current max is lower than the searched,
				maxValue = data[row][i];	//Then the search value replaces the max value
				maxValueIndex = i;			//And the index changes
			}
		}
		return maxValueIndex;	//Returns the index of the highest value
	}
	/**
	 * This method returns the lowest value of the array
	 * @param data
	 * @return lowestValue
	 */
	public static double getLowestInArray(double[][] data) {
		
		double lowestValue = data[0][0];	//Holds the lowest value
		
		//Loops through each element of the data array
		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[i].length; j++) {
				if(lowestValue > data[i][j]) {	//If the current value is lower than the searched
					lowestValue = data[i][j];	//Then the search replaces the lower value
				}
			}
		}
		
		return lowestValue;		//Returns the lowest value
	}
	
	/**
	 * This method returns the lowest value of the array from the selected column
	 * @param data
	 * @param col
	 * @return lowestValue
	 */
	public static double getLowestInColumn(double[][] data, int col) {
		
		double lowestValue = data[0][col];	//Holds the lowest value
		//Loops through each row of the data
		for(int i = 0; i < data.length; i++) {
			if(data[i].length > col) {				//If the selected column is less than the amount of columns in the searched row
				if(lowestValue > data[i][col]) {	//If the lowest value is higher than the searched value
					lowestValue = data[i][col];		//Then the current lowest value will be replaced by the searched value
				}
			}
		}
		return lowestValue;			//Returns the lowest value of the data's column
	}
	
	/**
	 * This method will look through the selected column and returns the lowest index
	 * @param data
	 * @param col
	 * @return lowestValueIndex
	 */
	public static int getLowestInColumnIndex(double[][] data, int col) {
		
		double lowestValue = data[0][col];	//Holds the lowest value
		int lowestValueIndex = 0;
		
		//Loops through each row of the data
		for(int i = 0; i < data.length; i++) {
			if(data[i].length > col) {				//If the selected column is less than the amount of columns in the searched row
				if(lowestValue > data[i][col]) {	//If the lowest value is higher than the searched value
					lowestValue = data[i][col];		//Then the current lowest value will be replaced by the searched value
					lowestValueIndex = i;			//Also the lowest index changes to the current searched row index
				}
			}
		}
		return lowestValueIndex;			//Returns the lowest value of the data's column
	}
	
	/**
	 * This method returns the lowest value in the selected row
	 * @param data
	 * @param row
	 * @return lowestValue
	 */
	public static double getLowestInRow(double[][] data, int row) {
		
		double lowestValue = data[row][0];		//This holds the starting value of the lowest row
		
		//Loops through the column in the selected row
		for(int i = 0; i < data[row].length; i ++) {
			if(lowestValue > data[row][i]) {	//If the current lowest value is higher than the searched data
				lowestValue = data[row][i];		//Then the lowest value changes to the searched value
			}
		}
		return lowestValue;			//Returns the lowest value
	}
	
	/**
	 * This method find the lowest value's column index of the selected row
	 * @param data
	 * @param row
	 * @return
	 */
	public static double getLowestInRowIndex(double[][] data, int row) {
		
		double lowestValue = data[row][0];
		int lowestValueIndex = 0;
			for(int i = 0; i < data[row].length; i++) {
				if(lowestValue > data[row][i]) {
					lowestValue = data[row][i];
					lowestValueIndex = i;
				}
			}
		return lowestValueIndex;
	}
	
	/**
	 * This method adds all of the column values in a selected row
	 * @param data
	 * @param row
	 * @return total
	 */
	public static double getRowTotal(double[][] data, int row) {
		
		double total = 0;		//Hold the total value the row
			for(int i = 0; i < data[row].length; i++) {	//Loops through each column in the selected row
				total += data[row][i];					//Adds the total value by the searched data
			}
		return total;		//Returns the total value of the row
	}
	
	public static double getTotal(double[][] data) {
		
		double total = 0;	//holds the total
		
		for(int i = 0; i < data.length; i ++) {	//Loops thought every data
			for(int j = 0; j < data[i].length; j++) {
				total += data[i][j];		//Adds the current searched data to the total
			}
		}
		return total;
	}
	
	/**
	 * This method collects the data from a file
	 * It converts the Strings of the file into a double.
	 * The double values are stored in a jagged array
	 * @param file
	 * @return dataCollects
	 * @throws FileNotFoundException
	 */
	public static double[][] readFile(File file) throws FileNotFoundException{
		
		Scanner scan = new Scanner(file);		//Initialize and instance scanner object to read file
		double[][] dataCollects; 				//Data return to the program from file
		ArrayList colList = new ArrayList();	//Holds the # of columns in the file for each row
		ArrayList rowList = new ArrayList();	//Holds the # of row in the file 
		ArrayList allDataList = new ArrayList();//Holds all of the profits from the file
		int rowCount = 0;						//Counts the number of rows in the file
		int colCount = 0;						//Counts the number of columns in the file
		double holder;							//Stores the value of the profit from each store
		String takes;							//Holds the String form of the profit from each store
		
		while(scan.hasNextLine()) {				//This loops until all of the lines read in the file
			colCount = 0;						//Resets the count of number of columns
			takes = scan.nextLine();			//Stores the line of the file in string form
			
			//This loop is to serperate the strings profit form when being seperated by white spaces
			String [] tokens = takes.split(" "); //Removes the white spaces and adds in an array
			for(String k : tokens) {
				holder = Double.parseDouble(k);	//Converts the single String profit to double
				allDataList.add(holder);		//Adds the double value to the arraylist 
				colCount++;						//Adds the colCounter for keeping track of # of columns
			}				
			colList.add(colCount);		//Adds the value of the column to an arraylist
			rowCount++;					//Increases the number of rows
			rowList.add(rowCount);		//Adds the value of # of rows to an arraylist
		}
		
		//Inference the jagged array be forming the rows first
		dataCollects = new double[rowList.size()][];
	
		//This loops initializes the number of columns in each row
		for(int i = 0; i < rowList.size(); i++) {
			dataCollects[(int)rowList.get(i) - 1] = new double[(int) colList.get(i)];	//The value of columns comes from the arraylist 
		}
		
		
		int dataListCounter = 0; //Initializes the counter to 0
		
		//This loops sets the value of the profits to the jagged array
		for(int i = 0; i < dataCollects.length; i++) {
			for(int j = 0; j < dataCollects[i].length; j++) {
				
				dataCollects[i][j] = (double)allDataList.get(dataListCounter);	//The value comes from an arraylist that stores the profits
				dataListCounter++;		//Increment the counter to move ojn to the next index of the arraylist
			}
		}
		
		//Close scanner
		scan.close();
		//Returns array
		return dataCollects;
	}
	
	/**
	 * This method takes in all of the data from the object and stores in the selected file
	 * The data is separate by a space and creates rows for each store
	 * @param data
	 * @param outputFile
	 * @throws IOException
	 */
	public static void writeToFile(double[][] data, File outputFile) throws IOException{
		
		FileWriter writer = new FileWriter(outputFile); //Forms writer object
		String fileSTR = "";							//Stores the String value of all of the profits
		for(int i = 0; i < data.length; i++) {			//loops all through the data and adds to the string
			for(int j = 0; j < data[i].length; j++) {
				fileSTR = fileSTR.concat(String.valueOf(data[i][j]) + " ");		//Converts the double to a String and adds a space
			}
			fileSTR = fileSTR.concat("\n");		//Adds new line to the string
		}
		writer.write(fileSTR);	//Uses the string to write on the 
		writer.close();			//Closes the writer object
	}
}
