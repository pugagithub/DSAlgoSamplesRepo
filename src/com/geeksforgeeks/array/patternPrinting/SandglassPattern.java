package com.geeksforgeeks.array.patternPrinting;

public class SandglassPattern {
	
	
	public static void main(String[] args) {
	
		printSandGlassPattern(20);
	}
	
	static void printSandGlassPattern(int n){
		int start = 1;
		int end = n -1 ; // since last item is 1 elem , aways it should be odd , minus the length by 1
		int mid = n/2; 
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=end;j++) {
				
				int rowNumFromMiddle = i-n/2;
				System.out.print(" ");
				if(  i==1 || i==n || (j>=start+i-1  && j<=end-i+1) || (j>=mid-rowNumFromMiddle+1 && j<=mid+rowNumFromMiddle-1 ) ) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
		
	}
	

}
