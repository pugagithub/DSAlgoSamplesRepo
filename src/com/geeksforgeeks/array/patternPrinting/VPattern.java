package com.geeksforgeeks.array.patternPrinting;

public class VPattern {

	/**
	 * * * * *
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		printVPattern(10);
	}

	// n ---> num of rows
	// So actual rectangle should be 2*n
	// mid = n
	// 2n + 1 to fill the last gap
	static void printVPattern(int n) {
		int start =1;
		int end = 2*n -1 ; // end is 2n , -1 is bcoz width should be odd num
		for (int i = 1; i <= n  ; i++) {       // Lenth is n
			for (int j = 1; j <= 2*n  ; j++) {  // Width is 2n
				System.out.print("  ");
				if(j == start+i-1 || j==end-i + 1 ) System.out.print("*");  // Since i is starting from 1 need to minus 1.  // Start = 1 , end =19
				else System.out.print(" ");
				
			}
			System.out.println("\n");
		}
	}

}
