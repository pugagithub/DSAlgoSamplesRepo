package com.DynamicProgramming;

public class KnapsackDynamicProgramming {
	
	public static void main(String[] args) {
		
		/**
		 * 
		 * See the Image knapsack.jpg which is present in current folder for the table structure
		 */
		
		int maxWt = 7;
		
		int[] wt = {1,3,4,5}; 
		int[] val ={1,4,5,7}; 
		
		/*
		 * 
		 * v 0 1 2 3 4 5 6 7
		 * 0 
		 * 1
		 * 3
		 * 4
		 * 5
		 */
		
		int[][] arr = new int[wt.length+1][maxWt+1];
		
		knapsack(arr,wt,val,maxWt);
		
		for (int i = 0; i <= wt.length; i++) {
			System.out.println();
			for (int j = 0; j <= maxWt; j++) {
				System.out.print(arr[i][j]);
			}

		}
		
	}

	private static void knapsack(int[][] arr , int[] wt, int[] val, int maxWt) {

		 
		
		for(int i=0;i<=wt.length;i++){
			for(int j=0;j<=maxWt;j++ ){
				
				if(i==0||j==0){  // This is why we have given (wt.length+1) as row and (maxWt+1) as column (it is less than and equal to not only less than)
					arr[i][j]=0;
					continue;
				}
				
				
				//Taken Weight (wt[i-1]) is more than j
				if(wt[i-1]>j){  
					// (i-1) instead of i bcoz arr row count is 5 but wt.lemgth=4 only. Zero row is added extra . 
					//wt[] is still zero based and zero is appenedd there.
					arr[i][j]=arr[i-1][j]; // Take the previous row's value when the current weight's value is greater than than the current max wt represented by j
				}else{
					arr[i][j] = Math.max(arr[i-1][j], val[i-1]+arr[i-1][j-wt[i-1]]); // Same applies for wt[i-1] and val[i-1] as the artificial zero is  added.
					//
				}
			}
		}
		
		
		
	}

}
