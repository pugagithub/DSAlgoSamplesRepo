package com.geeksforgeeks.array.patternPrinting;

public class Triangle {
	
	public static void main(String[] args) {
		printTriangle(9);
	}
	
	static void printTriangle(int n){
		int mid = n;
		for(int i=1;i<=n;i++) {  // row is n , col is 2n
			for(int j=1;j<=2*n - 1 ;j++) {  // col should be odd num
				System.out.print(" "); // This is just to beautify
				if(i==n || j ==mid-i +1   || j == mid+i -1) {
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
