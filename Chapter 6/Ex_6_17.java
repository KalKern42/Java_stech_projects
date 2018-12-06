/*
Author: Kal Kern
Date: 12/6/18

prints out a matrix with a number of rows equal to the users input
*/

import java.util.Scanner;

class Ex_6_17 {
	public static void main(String[] args) {
		Scanner kygbr = new Scanner(System.in);
		int rowColm;
		
		System.out.print("Enter the number of rows and columns: ");
		rowColm = kygbr.nextInt();
		
		matrix(rowColm);
		
	}
	public static void matrix(int num){
		for (int x = 1; x <= num; x++) {
			//rows
			for (int y = 1; y <= num; y++) {
				//columns
				System.out.print((int)((Math.random()) * 2));
			}
			System.out.println("");	
		}
	}
}