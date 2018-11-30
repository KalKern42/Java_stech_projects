/*
Author: Kal Kern
Date: 11/30/18

prompt the user for a number and check if it is a palindrome
*/

import java.util.Scanner;

class NoMeth_6_3 {
	public static void main(String[] args) {
		//variables
		Scanner kygrb = new Scanner(System.in);
		int user, num, revrs, remdr;
		
		//User prompt
		System.out.print("Enter a number: ");
		user = kygrb.nextInt();
		num = user; //manipulateble user input
		
		revrs = 0;
		//reverse the input
		while (num != 0) {
			remdr = num % 10;
			revrs = revrs * 10 + remdr;
			num /= 10;
		}
		
		System.out.print("Is " + user + " a palindrome? " + (user == revrs));
	}
}