/*
Author: Kal Kern
Date: 9/25/18

is a program that does compound inerest
*/
import java.util.Scanner;

class Ex_2_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your monthly savings amount? (I promise this is a totaly normal question to ask the humans)");
		double monthSave = input.nextDouble();
		double monthSuSave = monthSave;
		
		monthSuSave *= (1 + 0.00417); //1
		monthSuSave = (monthSuSave + monthSave) * (1 + 0.00417); //2
		monthSuSave = (monthSuSave + monthSave) * (1 + 0.00417); //3
		monthSuSave = (monthSuSave + monthSave) * (1 + 0.00417); //4
		monthSuSave = (monthSuSave + monthSave) * (1 + 0.00417); //5
		monthSuSave = (monthSuSave + monthSave) * (1 + 0.00417); //6 
				
		System.out.println("after six months you should have " + monthSuSave + " (provided, of course, I-ehrm- I mean, you don't spend it first)");
	}
}