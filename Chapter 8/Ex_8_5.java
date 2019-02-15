/*




*/

import java.util.Scanner;

class Ex_8_5 {
	public static void main(String[] args) {
		Scanner kygbr = new Scanner(System.in);
		//the arays 
		double[][] a = new double[3][3];
		double[][] b = new double[3][3];
		double[][] c = new double[3][3];
		
		System.out.print("Enter 9 numbers for matrix A: ");
		for(int row = 0; row < a.length; row++){
			for(int col = 0; col < a[0].length; col++){
				a[row][col] = kygbr.nextDouble();
			}
		}
		System.out.print("Enter 9 numbers for matrix B: ");
		for(int row = 0; row < b.length; row++){
			for(int col = 0; col < b[0].length; col++){
				b[row][col] = kygbr.nextDouble();
			}
		}
		c = addmatrix(a, b); //storing to be printed
		//printing out the array
		/*for (double[] row : c){
			for(double col : row){
				System.out.print(col + " ");
			}
		}*/
		for(int r = 0; r < b.length; r++){   //can also do a for each loop
			System.out.print(a[r][0] + " " + a[r][1] + " " + a[r][2]);
			if (r == 1) {
				System.out.print("  +  ");
			}else {
				System.out.print("     ");
			}
			System.out.print(b[r][0] + " " + b[r][1] + " " + b[r][2]);
			if (r == 1) {
				System.out.print("  =  ");
			}else {
				System.out.print("     ");
			}
			System.out.println(c[r][0] + " " + b[r][1] + " " + c[r][2]);	
		}

		
	}
	public static double[][] addmatrix(double[][] a, double[][] b){
		double[][] c = new double[3][3];
		
		for(int r = 0; r < c.length; r++){   //can also do a for each loop
			for(int o = 0; o < c[0].length; o++){
				c[r][o] = a[r][o] + b[r][o];
			}
			
		}
		return c;
		
	}
}
