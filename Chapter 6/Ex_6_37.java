/*
Author: Kal Kern
Date: 12/12/18
Edit: 12/14/18
returns a string with a number of characters equal to the width specified using 0s to fill in the extera space like so: 00067
*/

import java.util.Scanner;
import java.text.*;

class Ex_6_37 {
	public static void main(String[] args) {
		Scanner kygbr = new Scanner(System.in);
		int numb, wdth, size, number;
		
		System.out.print("Enter a number: ");
		numb = kygbr.nextInt();
		System.out.print("Enter the length you want it to be: ");
		wdth = kygbr.nextInt();
		
		System.out.println(format(numb, wdth));
	}
	public static String format(int numb, int wdth){
		int size = 0;
		int number = numb;
		//finding the numbers length
			while (number > 0) {
				size += 1;
				number = number / 10;
			}
		String numb1 = Integer.toString(numb); //converting it to a string
		//retuning the string adding zeros if it isn't long enough
		if (size >= wdth) {
			numb1 = numb1;
		}
		else {
			while (size != wdth) {
				numb1 = "0".concat(numb1);
				size++;
			}
		}
		return numb1;
	}
}