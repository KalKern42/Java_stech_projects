/*
Author: Kal Kern
Date: 10/15/18

determining if a number is pos or neg and keeping track of the number of pos or neg num inputed
*/
import java.util.Scanner;

class Ex_5_1 {
	public static void main(String[] args) {
		Scanner kygrb = new Scanner(System.in);
		Double usrNum;
		int posNum, negNum, total, total2;
		
		posNum = 0;
		negNum = 0;
		
		do {
			System.out.print("Enter a postitive or negative number (0 to quit): ");
			usrNum = kygrb.nextDouble();
			
			if (usrNum > 0) {
				posNum++;
			}else if (usrNum < 0) {
				negNum++;
			}else {
				System.out.println("Oh ok then, here are the totals:");
			}
			
		} while (usrNum != 0);
		
		total = posNum + negNum;
		total2 = posNum + negNum + 1;
		System.out.println("	There were " + posNum + " positive numbers");
		System.out.println("	There were " + negNum + " negative numbers");
		System.out.println("	The total is " + total + " (" + total2 + " if you include 0)");

	}
}