package com.geeksforgeeks.dynamicProgramming.recursiveAndBacktrackingApproach;

public class CoinChanging_BacktrackingApproach {
	
	static int[] arr = {1, 5, 10};
	static int target = 10;
	static int count = 0;
	
	
	public static void main(String[] args) {
		
		System.out.println(coinChanging(0,0));
		
	}
	
	static int coinChanging(int startIdx , int sum ){
		
		for(int i=startIdx;i<arr.length;i++) {
			
			sum = sum + arr[i];
			
			if(sum == target) {count++; }
			else if(sum < target) coinChanging(i , sum);
			else if(sum > target) {}
			
			sum = sum - arr[i];
		}
		
		return count;
		
		
	}

}
