package com.geeksforgeeks.array.patternPrinting;


/**
 *              *
 *             * *
 *            *   *
 *           *     *
 *          *       *
 *         *         *
 *        *           *
 */

public class InvertedVPattern {
	
	public static void main(String[] args) {
		printInvertedV(9);
	}
	
	// n ---> num of rows
	//So actual rectangle should be 2*n
	//mid = n
	//2n + 1 to fill the last gap
	static void printInvertedV(int n){
		int mid = n;
		for(int i=1;i<=n;i++) {  // row is n , col is 2n
			for(int j=1;j<=2*n -1 ;j++) {  // col should be odd num
				System.out.print(" "); // This is just to beautify
				if(j ==mid-i +1   || j == mid+i -1) {
					System.out.print("*"); 
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("\n");
		}
	}

}
