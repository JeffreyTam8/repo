//Jeffrey Tam
//Lab 2 Java Fundamentals
//9-2-20
//CRN: 21559

import java.util.Scanner;
/**
   This program demonstrates how numeric types and operators behave in Java
*/
public class NumericTypes {
	public static void main (String [] args) {
		//TASK #2 Create a Scanner object here 
		Scanner scanner = new Scanner(System.in);
		
		//identifier declarations
		final int NUMBER = 2; // number of scores
		int score1 = 100; // first test score original
		int score2 = 95; // second test score original
		final int BOILING_IN_F = 212; // boiling temperature
		double fToC; // temperature in Celsius
		double average; // arithmetic average
		String output; // line of output to print out
		
		//Task #2 declare a variable to hold the user’s temperature
		double userTemp; //Temperature the user will input
		//Task #2 prompt user to input score1
		System.out.println("Enter a the first score: ");
		//Task #2 read score1 
		score1 = scanner.nextInt();
		//Task #2 prompt user to input score2
		System.out.println("Enter the second score: ");
		//Task #2 read score2 
		score2 = scanner.nextInt();
		
		// Find an arithmetic average
		average = ((double)score1 + (double)score2) / NUMBER;
		output = score1 + " and " + score2 + " have an average of " + average;	
		System.out.println(output);
		// Convert Fahrenheit temperatures to Celsius
		fToC = (5d/9d) * (BOILING_IN_F - 32);
		output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
		
		//Task #2 prompt user to input another temperature
		System.out.println("Enter another temperature: ");
		//Task #2 read the user’s temperature in Fahrenheit
		userTemp = scanner.nextDouble();
		//Task #2 convert the user’s temperature to Celsius
		fToC = (5d/9d)*(userTemp - 32);
		//Task #2 print the user’s temperature in Celsius
		System.out.println("Your temperature " + userTemp + " degrees Fahrenheit is " + fToC + " degrees Celsius");
		
		scanner.close(); //Close scanner object
		
		System.out.println("Goodbye"); // to show that the program is ended	
		
	}
}

