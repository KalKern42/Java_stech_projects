/*
Author: Kal Kern
Date: 11/19/18

printing out a pyrimid of numbers depending on how many lvls the user wants.
*/
import java.util.Scanner;

class Ex_5_17 {
	public static void main(String[] args) {
		Scanner kygrb = new Scanner(System.in);
		int pylvl, lvlcount, curlvl, blnkspace, spcCount;
		
		System.out.print("How many pyramid tiers do you want? ");
		pylvl = kygrb.nextInt();
		
		lvlcount = 1;
		while (lvlcount <= pylvl) {
			curlvl = lvlcount;
			blnkspace = pylvl - lvlcount;
			spcCount = 1;
			while (curlvl >= 1) {
				if (spcCount <= blnkspace) {
					System.out.print("  "); //prints blank spaces to format the numbers correctly
					spcCount++;
				}else {
					System.out.print(curlvl + " ");  //doesn't print till above is done
					curlvl--;
				}
				
			}
			curlvl = 1;
			while (curlvl <= lvlcount + 1) {
				if (curlvl == 1) {
					System.out.print(""); //makes sure i don't have two ones
					curlvl++;
				}else if (curlvl <= lvlcount) {
					System.out.print(curlvl + " "); //other half of the pyramid
					curlvl++;
				}else {
					System.out.println(""); //goes to the next line
					curlvl++; //one more num just to end this loop
				}
			}
			lvlcount++; // main loop counter
		}
		
	}
}
