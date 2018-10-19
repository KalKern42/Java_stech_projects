/*
Author: Kal Kern
Date: 10/19/18

checking if a point on the xy coordinate plane is within a rectangle 
centered over the origin with a width of 10 and a height of 5
*/

import java.util.Scanner;

class Ex_3_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double xLoc, yLoc;
		boolean yIs, xIs;
		
		System.out.print("x value: ");
		xLoc = input.nextDouble();
		System.out.print("y value: ");
		yLoc = input.nextDouble();
		
		
		if (yLoc > -2.5 && yLoc < 2.5){ //checking the y location
			yIs = true;
		}
		else {
			yIs = false;
		}
		
		if (xLoc > -2.5 && xLoc < 2.5){ //checking the x location
			xIs = true;
		}
		else {
			xIs = false;
		}
		
		
		if (xIs == true && yIs == true) {
			System.out.print("point (" + xLoc + "," + yLoc + ") is in the rectangle");
		}
		else {
			System.out.print("point (" + xLoc + "," + yLoc + ") isn't in the rectangle");
		}

	}
}