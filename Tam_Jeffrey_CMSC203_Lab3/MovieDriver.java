/*Jeffrey Tam
 * 9/9/20
 * CRN:21559
 * 
 */

import java.util.Scanner;

/**
 * This is a driver class to test methods
 */
public class MovieDriver {

	public static void main(String[] args) {
		
		//Variables
		String title;				//title of the movie
		String rating;				//rating of the movie
		int soldTickets;			//tickets sold
		String userInput = "y";		//User input, if want to submit another movie	
		
		//Scanner for collecting user data
		Scanner scan = new Scanner(System.in);	//Scanner to collect user input
		Movie movie = new Movie();				//Movie Object
		
		//Loops until user says "n"
		do {
			//Ask Title of Movie
			System.out.println("Enter the name of a movie");	
			title = scan.nextLine();
			movie.setTitle(title);
			
			//Ask Rating of movie
			System.out.println("Enter the rating of the movie");
			rating = scan.nextLine();
			movie.setRating(rating);
			
			//Ask tickets sold at the movie
			System.out.println("Enter the number of tickets sold for this movie");
			soldTickets = scan.nextInt();
			movie.setSoldTickets(soldTickets);
			
			//Print summary of the movie
			System.out.println(movie.toString());
			
			//ask user if want to enter another movie
			System.out.println("Do you want to enter another? (y or n)");
			
			userInput = scan.nextLine();
			userInput = scan.nextLine();
		
		}while(userInput.equalsIgnoreCase("y"));
		
		System.out.println("Good Bye!");
		
		scan.close();			//Close Scanner

	}

}
