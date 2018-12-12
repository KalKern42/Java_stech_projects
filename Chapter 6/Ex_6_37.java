/*
Author: Kal Kern
Date: 12/12/18

returns a string with a number of characters equal to the width specified using 0s to fill in the extera space like so: 00067
*/

import java.util.Scanner;

class Ex_6_37 {
	public static void main(String[] args) {
		Scanner kygbr = new Scanner(System.in);
		int numb, wdth, size, number;
		
		System.out.print("Enter a number: ");
		numb = kygbr.nextInt();
		System.out.print("Enter the length you want it to be: ");
		wdth = kygbr.nextInt();
		
		
	}
	public static String format(int numb, int wdth){
		int size = 0;
		int number = numb;
			while (number > 0) {
				size += 1;
				number = number / 10;
			}
		if (size >= wdth) {
			System.out.println(Integer.toString(numb));
		}
		else {
			while (size != wdth) {
			
			}
		
	}
}