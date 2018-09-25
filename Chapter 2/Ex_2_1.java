/*
Author: Kal Kern
Date: 9/21/18
Edited: 9/25/18
celsius to fahrenheit conversion
*/
import java.util.Scanner;

class Ex_2_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("What is the temperature in Celsius? ");
		double cel = input.nextDouble(); //celcius value
		
		double fah = (9.0/5) * cel + 32; //fahrenheit value ^w^
		
		System.out.println(cel + " Celcius is also " + fah + " in Fahrenheit");
		
	}
}