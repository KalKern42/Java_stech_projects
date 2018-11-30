/*
Author: Kal Kern
Date: 11/30/18

prompt the user for a number and check if it is a palindrome
*/

import java.util.Scanner;

class Ex_6_3 {
	public static int reverse(int num){ //method to reverse the user input
		int remdr, revrs;
		revrs = 0;
		while (num != 0) {
			remdr = num % 10;
			revrs = revrs * 10 + remdr;
			num /= 10;
		}
		return revrs;
	}
	public static boolean isPalindrome(int num){ //checking if the input is actually a palindrome
		boolean pali = reverse(num) == num;
		return pali;
	}
	public static void main(String[] args) {
		//variables
		Scanner kygrb = new Scanner(System.in);
		boolean tst;
		int usr;
		//prompting the user
		System.out.print("Enter a number: ");
		usr = kygrb.nextInt();
		
		tst = isPalindrome(usr); //printing out and calling my methods
		System.out.print("Is " + usr + " a palindrome? " + tst);

	}
}