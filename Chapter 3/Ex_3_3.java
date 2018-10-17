/*
Author: Kal Kern
Date: 10/15/18

using camer's law so solve the thing
*/
import java.util.Scanner;

class Ex_3_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a, b, c, d, e, f, x, y;
		
		System.out.println("For this, what is a?");
		a = input.nextDouble();
		System.out.println(" ... and b?");
		b = input.nextDouble();
		System.out.println(" ... and c?");
		c = input.nextDouble();
		System.out.println(" ... and d?");
		d = input.nextDouble();
		System.out.println(" ... and e?");
		e = input.nextDouble();
		System.out.println(" ... and f?");
		f = input.nextDouble();
		
		
		if ((a * d) - (b * c) != 0) {
			x = ((e * d) - (b * f)) / ((a * d) - (b * c));
			y = ((a * f) - (e * c)) / ((a * d) - (b * c));
			
			System.out.println("x = " + x);
			System.out.println("y = " + y);
			
		}
		else {
			System.out.print("Cannot divide by zero you fool."); 
		}
	}
}