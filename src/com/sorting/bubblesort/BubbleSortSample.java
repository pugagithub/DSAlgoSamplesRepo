package com.sorting.bubblesort;

import com.util.MyUtil;

public class BubbleSortSample {
	
	static int[] a = {20 , 36 , 23 , 60 , 95 , 17 , 12, 94 };

	public static void main(String[] args) {
		
		//Bubble the adjacent data . Right Sorting
		//The outer loop is just for count only . Since we want the count to be decreased by one we start from max.
		for (int i = (a.length - 1); i > 0; i--) {
			// Here the outer loop is not significant and it is used to restrict the already sorted 
			//right side sub array only
			System.out.println("i value is --->"+ i);
			for (int j = 0; j < i; j++) {
				System.out.println("\nInner Val First-->"+ a[j]);
				System.out.println("\nInner Val Second-->"+ a[j+1]);
				 MyUtil.displayArray(a);
				if (a[j] > a[j+1]) {   
					System.out.println("Swap Happened");
					// comparison between (j) and (j+1) only not between j and i.
					MyUtil.swap(a, j, (j+1)); 	 
					
				}
			}
			System.out.println("**************End of Outer Loop***********");
		}
		
		//MyUtil.displayArray(a);
		
		
		
	}
	
	

}
