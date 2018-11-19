/*
Author: Kal Kern
Date: 10/13/18

printing out numbers that are divisible by 5 or 6 but noth both
*/
import java.util.Scanner;

class Ex_5_11 {
	public static void main(String[] args) {
		Scanner kygrb = new Scanner(System.in);
		int num, xPerLine;
		
		num = 100;
		xPerLine = 0;
		while (num <= 200) {
			if (num % 5 == 0 ^ num % 6 == 0) {
				if (xPerLine < 10) {
					System.out.print(num + ", ");
					xPerLine++;
				}else {
					System.out.println("");
					xPerLine = 0;
				}
				
			}
			num++;
		}
	}
}