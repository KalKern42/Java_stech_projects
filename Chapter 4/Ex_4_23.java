/*
Author: Kal
Date: 11/9/18
Running a payrole application
*/

import java.util.Scanner;

class Ex_4_23 {
	public static void main(String[] args) {
		Scanner kygrb = new Scanner(System.in); 
		double hw, hpr, ftw, stw, gp, fw, sw, td, np, prettyftw, prettystw, round; 
		String nam;
		
		//info fetch
		System.out.print("Enter employee's name: ");
		nam = kygrb.nextLine();
		System.out.print("Enter the number of hours worked: ");
		hw = kygrb.nextDouble();
		System.out.print("Enter hourly pay rate: $");
		hpr = kygrb.nextDouble();
		System.out.print("Enter federal tax witholding rate: ");
		ftw = kygrb.nextDouble();
		System.out.print("Enter federal tax witholding rate: ");
		stw = kygrb.nextDouble();
		
		//calculations
		gp = hw * hpr;
		fw = gp * ftw;
		round = Math.rint(fw * 100);
		fw = round / 100;
		sw = gp * stw;
		round = Math.rint(sw * 100);
		sw = round / 100;
		td = fw + sw;
		round = Math.rint(td * 100);
		td = round / 100;
		np = gp - td;
		round = Math.rint(np * 100);
		np = round / 100;
		
		//display
		System.out.println("Employee's Name: " + nam);
		System.out.println("Hours worked: " + hw);
		System.out.println("Pay Rate: $" + hpr);
		System.out.println("Gross Pay: $" + gp);
		System.out.println("Deductions:");
		System.out.println("	Federal Withholding: $" + fw);
		System.out.println("	State Withholding: $" + sw);
		System.out.println("	Total Deduction: $" + td);
		System.out.println("Net Pay: $" + np);
	}
}
