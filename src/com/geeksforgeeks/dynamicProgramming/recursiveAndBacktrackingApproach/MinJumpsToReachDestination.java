package com.geeksforgeeks.dynamicProgramming.recursiveAndBacktrackingApproach;

public class MinJumpsToReachDestination {
	
	//static int[] arr =  {4,2,0,3,2,0,1,8}; // 3
	//static int[] arr =  {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}; // 3
	static int[] arr =  {1, 1, 1, 1 , 1 , 1}; // 3
	static int minJumpCount = 10000;
	
	public static void main(String[] args) {
		
		jumpCount(0 , 0 , arr[0]+"");
		
		System.out.println("Min count : "+ minJumpCount);
		
	}
	
	
	static int jumpCount(int startIdx  , int jumpCount , String path ){
		
		
		int maxPossiblePoistionReachable = startIdx  +  arr[startIdx] ;
		
		if(maxPossiblePoistionReachable >= arr.length ) {
			if(startIdx!=arr.length-1)jumpCount++;
			System.out.println(" Path : "+ path +" : Jump : "+ jumpCount);
			return jumpCount;
		}
		
		//
		
		for (int i=startIdx ; i < maxPossiblePoistionReachable ; i++) {
			if(arr[i+1] != 0) {
				
				
			int currentCount = jumpCount(i  + 1  , jumpCount + 1   , path + " --> "+ arr[i+1] + "" );
			
			if( currentCount < minJumpCount) {
				
				
				minJumpCount = currentCount;
			}
			}
			
		}
		
		return 1000000;
		
	}

}
