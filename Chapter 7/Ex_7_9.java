/*
Author: Kal Kern
Date: 2/1/19

a test program that prompts the user to enter ten numbers, invokes this method to return the minimum value, and displays the minimum value.
*/
import java.util.Scanner;
class Ex_7_9 {
	public static void main(String[] args) {
		//declared var
		Scanner kygbr = new Scanner(System.in);
		double[] array = new double[10];
		
		//usr prompt
		System.out.print("Enter 10 numbers (seperated by a space): ");
		for (int i = 0; i < 10; i++){
			array[i] = kygbr.nextDouble();
		}
		//output
		double min = min(array);
		System.out.println("Minimum: " + min);
	}
	public static double min(double[] array){
		//assuming its the first one
		double min = array[0];
		
		//loop through replacing if its smaller
		for (int i = 1; i < 10; i++){
			if (min > array[i]){
				min = array[i];
			}
		}
		return min;
	}
}