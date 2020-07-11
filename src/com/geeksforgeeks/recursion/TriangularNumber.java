package com.Recursion;

public class TriangularNumber {
	
	public static void main(String[] args) {
		
		System.out.println("Triangle No  : "+triangle(6));
	}

	private static int triangle(int n) {
		if(n==1)return 1;
		return n+triangle(n-1);
		
	}

}
