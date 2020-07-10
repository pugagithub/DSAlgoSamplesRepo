package com.geeksforgeeks.array.patternPrinting;

public class HollowRectanglePattern {
	
	public static void main(String[] args) {
		
		printRectangle(40);
	}
	
	static void printRectangle(int n){
		
		for(int i=1;i<=n;i++) {
			System.out.println("");
			for(int j=1;j<=n;j++) {
				if(i==1 || j==1|| i==n || j==n)System.out.print("*");
				else System.out.print(" ");
			}
		}
	}
	
	

}
