/*
 * Jeffrey Tam
 * 9-27-2020
 * CMSC 203 21559
 * 
 */

import java.util.Scanner;
/**
 * This is the driver class that uses RNG class' methods
 * This program prompts the user to guess the random number until the user
 * guesses the number correctly. The user is also provided with the possible 
 * range, and displays an error if the user guesses outside the range
 * @author Jeffrey Tam
 *
 */
public class RandomNumberGuesser {
	
	//Declare Variables
	private static int lowGuess;			//lowest range
	private static int highGuess;			//highest range
	private static int nextGuess;			//user input guess
	private static int randNum;				//random number user has to guess
	private static String tryAgain;			//user input to play the program again
	private static int state;				//user loops guesses depending on this value 
	private static boolean rtnValue;		//hold value of test if guess is out of range
	private static boolean again;			//hold value if player wants to play the program again
	
	/**
	 * This method is the driver, controlling the display and guess
	 * @param args
	 */
	public static void main (String[] args) {
		//RNG Object
		RNG rng = new RNG();
		//Scanner Object
		Scanner scan = new Scanner(System.in);
		//Reset/Set values
		resetRange();
		//loops until user says no
		while(again == true) {
			//Reset/Set Values
			resetRange();
			//Obtain and set random integer
			randNum = rng.rand();
			
			System.out.println("Enter your first guess");
			
			//loops until user guess is the same as random number selected
			while(state == 0) {
				nextGuess = Integer.parseInt(scan.nextLine());
				System.out.println("Number of guesses is " + rng.getCount());
				rtnValue = rng.inputValidation(nextGuess, lowGuess, highGuess);
				//Occurs when user guess the random number exactly; exit the current guess
				if(nextGuess == randNum && rtnValue == true) {
					
					System.out.println("Congratulations, you guessed correctly");
					rng.resetCount();
					state++;
					
				//Occurs when the user's guess input is higher than the random number
				}else if(nextGuess > randNum && rtnValue == true) {
					
					System.out.println("Your guess is too high");
					highGuess = nextGuess;
				//Occurs when the user's guess input is lower than the random number	
				}else if(nextGuess < randNum && rtnValue == true) {
					
					System.out.println("Your guess is too low");
					lowGuess = nextGuess;

				}
				//Display newest highest and lowest range the user can guess
				System.out.println("Enter your next guess between " + lowGuess + " and " + highGuess);
				
			}
			
			//Prompt the user the option in trying again
			System.out.println("Try again? (yes or no)");
			tryAgain = scan.nextLine();
			
			//If the user enters yes, reset all class values
			if(tryAgain.equalsIgnoreCase("yes")) {
				resetRange();
			//If the user enters no, program terminate
			}else if(tryAgain.equalsIgnoreCase("no")) {
				again = false;
			}
		}
		
		//Close scanner and prompt program end
		scan.close();
		System.out.println("Thanks for playing...");
		System.out.println("Programmer: Jeffrey Tam");

	}
	
	/**
	 * Displays a message if the guess is the same as the random number
	 * @return String
	 */
	public static String guessCorrect() {
		
		return "Congratulations, you guessed correctly";
	}
	
	/**
	 * Displays a message if the guess is the higher as the random number
	 * @return String
	 */
	public static String guessTooHigh() {
		
		return "Your guess is too high";
		
	}
	
	/**
	 * Displays a message if the guess is the lower as the random number
	 * @return String
	 */
	public static String guessTooLow() {
		
		return "Your guess is too low";
		
	}
	
	/**
	 * Resets the highGuess, lowGuess, state, rtnValue, again, and tryAgain values
	 */
	public static void resetRange() {
		highGuess = 100;
		lowGuess = 0;
		state = 0;
		rtnValue = false;
		again = true;
		tryAgain = "";
	}
	
}
