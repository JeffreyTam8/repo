//Jeffrey Tam
//Lab 2 Java Fundamentals
//CRN: 21559

/**
 * This program calculates the volume of a sphere
 */

import java.util.Scanner;

public class SphereVolume {

	public static void main(String[] args) {
		//Variables
		final double PI = Math.PI; 
		double diam;
		double radius;
		double volume;
		//Scanner
		Scanner scanner = new Scanner(System.in);
		
		//Ask user for diameter 
		System.out.println("Enter in the diameter of your sphere: ");
		//Collect diameter
		diam = scanner.nextDouble();
		
		//Calculate radius
		radius = diam / 2d;
		
		//Calculate Sphere volume 
		volume = (4d/3d)*PI*(Math.pow(radius, 3));
		
		//Display Volume
		System.out.println("The volume of your sphere is: " + volume + " units");
		
		scanner.close();
		
	}

}
