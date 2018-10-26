/*
Author: Kal Kern
Date: 10/26/18

determining the number of days in a given month
*/

import java.util.Scanner;

class Ex_4_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String month;
		int year;
		
		System.out.print("Please enter a year: ");
		year = input.nextInt();
		System.out.print("and enter a month: ");
		month = input.next();
		
				
		if (month == "Jan" || month == "Mar" || month == "May" || month == "Jul" || month == "Aug" || month == "Oct" || month == "Dec" ) {
			System.out.print(month + " " + year + " has 31 days");
		}else if (month == "Apr" || month == "Jun" || month == "Sep" || month == "Nov" ) {
		}else {
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				System.out.print(month + " " + year + " has 29 days");
			}
			else {
				System.out.print(month + " " + year + " has 28 days");
			}
		}
		
	}
}