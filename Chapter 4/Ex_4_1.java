/*
Author: Kal Kern
Date: 10/26/18

calculating the area of a pentagon
*/

import java.util.Scanner;

class Ex_4_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//variables yay :3
		Double r, s, area, round;
		 
		System.out.print("Enter the distance from the center to the vertex: ");
		r = input.nextDouble();
		
		s = (2 * r) * Math.sin(Math.PI / 5); // calculating the side length
		area = (5 * s * s) / (4 * Math.tan(Math.PI / 5));
		round = Math.rint(area * 100);
		area = round/100;
		System.out.print("The area of your pentagon is " + area);
		
	}
}