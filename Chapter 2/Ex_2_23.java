/*
Author: Kal Kern
Date: 10/1/17

calculating the cost of a road trip
*/
import java.util.Scanner;

class Ex_2_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double tdd = 0; //the driving distance
		double mpg = 0; // miles per gallon
		double ppg = 0; // price per gallon
		double cos = 0; // cost 
		
		System.out.println("Enter the driving distance (miles):");
		tdd = input.nextDouble();
		
		System.out.println("Enter the miles per gallon:");
		mpg = input.nextDouble();
		
		System.out.println("Enter the price per gallon:");
		ppg = input.nextDouble();
		
		cos = (tdd / mpg) * ppg;

		System.out.println("the cost of driving is $" + cos); 
		

	}
}