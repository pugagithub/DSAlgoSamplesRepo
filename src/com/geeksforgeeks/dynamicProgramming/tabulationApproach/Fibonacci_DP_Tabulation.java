package com.geeksforgeeks.dynamicProgramming.tabulationApproach;

import com.util.MyUtil;

public class Fibonacci_DP_Tabulation {
	
	
	public static void main(String[] args) {
		
		
		MyUtil.displayArray(fibonacci(10));
	}
	
	static int[] fibonacci(int n){
		
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			if(i==0) {arr[0] = 0;continue;}
			else if(i==1) {arr[1] = 1;continue;}
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		return arr;
		
		
	}

}
