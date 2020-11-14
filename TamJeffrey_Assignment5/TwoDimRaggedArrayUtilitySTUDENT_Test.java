import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
 * This is a junit test for my student data 
 * @author Jeffrey Tam
 *
 */
public class TwoDimRaggedArrayUtilitySTUDENT_Test {
	//STUDENT fill in dataSetSTUDENT with values, it must be a ragged array
	private double[][] dataSetSTUDENT = {	{300, 400, 500, 600, 700, 800},
											{100, 200, 150},
											{3000, 4000, 5000, 6000, 7000, 8000},
											{950, 970, 1000},
											{70, 80, 90, 105, 110, 120},
											{1200, 1300, 1400, 1500, 1600, 1700}	};

	private File inputFile,outputFile;	//File used to read and write

	@Before
	public void setUp() throws Exception {
		outputFile = new File("TestOut.txt");
	}

	@After
	public void tearDown() throws Exception {
		dataSetSTUDENT = null;
		inputFile = outputFile = null;
	}

	/**
	 * Student Test getTotal method
	 * Return the total of all the elements in the two dimensional array
	 */
	@Test
	public void testGetTotal() {
		
		assertEquals(48945.0, TwoDimRaggedArrayUtility.getTotal(dataSetSTUDENT), .001);
		
	}

	/**
	 * Student Test getAverage method
	 * Return the average of all the elements in the two dimensional array
	 */
	@Test
	public void testGetAverage() {
		
		assertEquals(1631.5, TwoDimRaggedArrayUtility.getAverage(dataSetSTUDENT), .001);
		
	}

	/**
	 * Student Test getRowTotal method
	 * Return the total of all the elements of the row.
	 * Row 0 refers to the first row in the two dimensional array
	 */
	@Test
	public void testGetRowTotal() {
		assertEquals(3300, TwoDimRaggedArrayUtility.getRowTotal(dataSetSTUDENT, 0), 0.001);
		assertEquals(450, TwoDimRaggedArrayUtility.getRowTotal(dataSetSTUDENT, 1), 0.001);
		assertEquals(33000, TwoDimRaggedArrayUtility.getRowTotal(dataSetSTUDENT, 2), 0.001);
		assertEquals(2920, TwoDimRaggedArrayUtility.getRowTotal(dataSetSTUDENT, 3), 0.001);
		assertEquals(575, TwoDimRaggedArrayUtility.getRowTotal(dataSetSTUDENT, 4), 0.001);
		assertEquals(8700, TwoDimRaggedArrayUtility.getRowTotal(dataSetSTUDENT, 5), 0.001);
	}


	/**
	 * Student Test getColumnTotal method
	 * Return the total of all the elements in the column. If a row in the two dimensional array
	 * doesn't have this column index, it is not an error, it doesn't participate in this method.
	 * Column 0 refers to the first column in the two dimensional array
	 */
	@Test
	public void testGetColumnTotal() {
		
		assertEquals(5620, TwoDimRaggedArrayUtility.getColumnTotal(dataSetSTUDENT, 0),0.001);
		assertEquals(6950, TwoDimRaggedArrayUtility.getColumnTotal(dataSetSTUDENT, 1),0.001);
		assertEquals(8140, TwoDimRaggedArrayUtility.getColumnTotal(dataSetSTUDENT, 2),0.001);
		assertEquals(8205, TwoDimRaggedArrayUtility.getColumnTotal(dataSetSTUDENT, 3),0.001);
		assertEquals(9410, TwoDimRaggedArrayUtility.getColumnTotal(dataSetSTUDENT, 4),0.001);
		assertEquals(10620, TwoDimRaggedArrayUtility.getColumnTotal(dataSetSTUDENT, 5),0.001);
		
	}


	/**
	 * Student Test getHighestInArray method
	 * Return the largest of all the elements in the two dimensional array.
	 */
	@Test
	public void testGetHighestInArray() {
		
		assertEquals(8000, TwoDimRaggedArrayUtility.getHighestInArray(dataSetSTUDENT), 0.001);
	}
	

	/**
	 * Test the writeToFile method
	 * write the array to the outputFile File
	 * then read it back to make sure formatted correctly to read
	 * @throws FileNotFoundException 
	 * 
	 */
	@Test
	public void testWriteToFile() throws FileNotFoundException {
		double[][] array=null;
		try {
			TwoDimRaggedArrayUtility.writeToFile(dataSetSTUDENT, outputFile);
		} catch (Exception e) {
			fail("This should not have caused an Exception");
		}
		array = TwoDimRaggedArrayUtility.readFile(outputFile);
		assertEquals(300, array[0][0],.001);
		assertEquals(400, array[0][1],.001);
		assertEquals(500, array[0][2],.001);
		assertEquals(600, array[0][3],.001);
		assertEquals(700, array[0][4],.001);
		assertEquals(800, array[0][5],.001);
		
		assertEquals(100, array[1][0],.001);
		assertEquals(200, array[1][1],.001);
		assertEquals(150, array[1][2],.001);
		
		assertEquals(3000, array[2][0],.001);
		assertEquals(4000, array[2][1],.001);
		assertEquals(5000, array[2][2],.001);
		assertEquals(6000, array[2][3],.001);
		assertEquals(7000, array[2][4],.001);
		assertEquals(8000, array[2][5],.001);
		
		assertEquals(950, array[3][0],.001);
		assertEquals(970, array[3][1],.001);
		assertEquals(1000, array[3][2],.001);
		
		assertEquals(70, array[4][0],.001);
		assertEquals(80, array[4][1],.001);
		assertEquals(90, array[4][2],.001);
		assertEquals(105, array[4][3],.001);
		assertEquals(110, array[4][4],.001);
		assertEquals(120, array[4][5],.001);
		
		assertEquals(1200, array[5][0],.001);
		assertEquals(1300, array[5][1],.001);
		assertEquals(1400, array[5][2],.001);
		assertEquals(1500, array[5][3],.001);
		assertEquals(1600, array[5][4],.001);
		assertEquals(1700, array[5][5],.001);
		
	
	}

}