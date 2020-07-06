package com.Recursion;

public class Factorials {
	
	public static void main(String[] args) {
		System.out.println("Factorial : " + factorials(5));
	}

	private static int factorials(int n) {
		if(n==0)return 1;
		
		return n*factorials(n-1);
		
	}

}
