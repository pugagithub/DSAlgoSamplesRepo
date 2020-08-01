package com.geeksforgeeks.dynamicProgramming.recursiveAndBacktrackingApproach;

 import static java.lang.Math.max;
 import static java.lang.Math.min;

public class EggDroppingPuzzle_Recursive {
	
	static int N = 2;
	static int K =100;
	
	public static void main(String[] args) {
		
		System.out.println("Min Trial is :"+ eggDrop(N , K , 0 , K));
	}
	
	static int eggDrop(int remainingEggCount , int remainingFloorCount , int trialCount ,int currentFloorNumber){
		
		//Base Cond
		if(remainingEggCount==1  ) {
			return remainingFloorCount;
		}
		
		else if(remainingFloorCount==1  ) {
			return 1;
		}
		
		else if(remainingFloorCount ==0) return 0;
		
		
		
		//Rec Cond
		return  
				max (
						eggDrop(remainingEggCount-1 , remainingFloorCount - 1 , trialCount + 1 , currentFloorNumber - 1) ,
						eggDrop(remainingEggCount ,remainingFloorCount - 1 ,trialCount + 1 , currentFloorNumber + 1)
					
				);
		
	}

}
