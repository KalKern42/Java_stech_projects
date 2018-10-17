/*
Author:Kal Kern
Date:10/17/18

determin if the given sides form a triangel
*/

import java.util.Scanner;

class Ex_3_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Double s1, s2, s3, prim;
		
		System.out.print("side 1: ");
		s1 = input.nextDouble();
		System.out.print("side 2: ");
		s2 = input.nextDouble();
		System.out.print("side 3: ");
		s3 = input.nextDouble();
		
		if (s1 + s2 > s3 && s2 + s3 > s1 && s1 + s3 > s2){ //triangle test (if the sum of two sides are grater than the remaning) 
			prim = s1 + s2 + s3;//primiter calculation 
			
			System.out.print("The triangle's primiter is " + prim);
			
		}
		else {
			//error message
			System.out.print("Sorry but this is not a triangle (ノಠ益ಠ)ノ彡┻━┻");
			
		}
	}
}