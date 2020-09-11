/**
 * @author Jeffrey Tam
 * Date: 9/11/20
 * CRN: 21559
 *This application helps with users internet connection by prompting possible solutions. 
 *The user can input yes or no statements 
 */

import java.util.Scanner;
public class WiFiDiagnosisDriver {

	/** This is the main method of the application
	 * The method displays possible solutions in the console by displaying yes or no questions
	 * @param args    //array of string arugments
	 */
	public static void main(String[] args) {
		
		
		//Scanner
		Scanner scan = new Scanner(System.in);		//Used to read user's input
		//Variables
		String userInput;							//Used to store/reference user's input
		
		//Displaying program's purpose
		System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work\n");
		
		//Display first solution and ask if solution works
		System.out.println("First step: reboot your computer");
		System.out.println("Are you able to connect with the internet? (yes or no)");
		userInput = scan.nextLine();		
		
		//When user enters no, goes/display next step. When user enters yes, display confirmation and terminate program
		if(userInput.equalsIgnoreCase("no")) {
			
			//Display Second solution and ask if solution works
			System.out.println("Second step: reboot your router.");
			System.out.println("Now are you able to connect with the internet? (yes or no)");
			userInput = scan.nextLine();
			
			//When user enters no, goes/display next step. When user enters yes, display confirmation and terminate program
			if(userInput.equalsIgnoreCase("no")) {
				
				//Display third solution and ask if solution works
				System.out.println("Third step: make sure the cables to your router are plugged in firmly and your router is getting power");
				System.out.println("Now are you able to connect with the internet? (yes or no)");
				userInput = scan.nextLine();
				
				//When user enters no, goes/display next step. When user enters yes, display confirmation and terminate program
				if(userInput.equalsIgnoreCase("no")) {
					
					//Display fourth solution and ask if solution works
					System.out.println("Fourth step: move your computer closer to your router");
					System.out.println("Now are you able to connect with the internet? (yes or no)");
					userInput = scan.nextLine();
					
					//When user enters no, goes/display next step. When user enters yes, display confirmation and terminate program
					if(userInput.equalsIgnoreCase("no")){		
						
						//Display last solution
						System.out.println("Fifth step: contact your ISP");
						System.out.println("Make sure your ISP is hooked up to your router.");	
						
					}else if(userInput.equalsIgnoreCase("yes")){
						//Display Confirmation message
						System.out.println("Moving the computer seemed to work");
						
					}
				
			}else if(userInput.equalsIgnoreCase("yes")){
				//Display Confirmation message
				System.out.println("Checking the router's cables seemed to work");
			}
		
		}else if(userInput.equalsIgnoreCase("yes")){
			//Display Confirmation message
			System.out.println("Rebooting your computer seemed to work");
		}
			
			//Close scanner
			scan.close(); 
			
			//Print name of author
			System.out.println("Programmer's name: Jeffrey Tam");
			
			//End of program
					
		}

	}
}
