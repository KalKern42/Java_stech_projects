/*
Author: Kal Kern
Date: 2/28/19


*/

import java.util.Scanner;
import java.nio.*;

class Ex_8_11 {
	public static void main(String[] args) {
		Scanner kygbr = new Scanner(System.in);
		//variables and arrays
		int usrNum = 0;
		int numSpace = 0; 
		String binNum = "";
		String[][] hORt = new String[3][3];
		
		System.out.print("Enter a number between 1 and 512: ");
		usrNum = kygbr.nextInt();
		usrNum = usrNum - 1; //because the binary goes from 0 - 512 but asking for 1 - 512 is mor intuitive
		binNum = Integer.toBinaryString(usrNum);
		//Making sure the number is 9 charicters long
		for (int i = binNum.length(); i < 9; i++) {
			binNum = "0" + binNum;
		}
		//creating the array 
		for (int row = 0; row < 3; row++) { 
			for (int coll = 0; coll < 3; coll++) {
				if (binNum.charAt(numSpace) == '0') {
					hORt[row][coll] = "H";
				}else if (binNum.charAt(numSpace) == '1') {
					hORt[row][coll] = "T";
				}
				numSpace++;
			}
		}
		for(int r = 0; r < hORt.length; r++){
			System.out.println(hORt[r][0] + " " + hORt[r][1] + " " + hORt[r][2]);
		}
	}
}