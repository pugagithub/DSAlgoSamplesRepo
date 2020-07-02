package com.sorting.bubblesort;

import com.util.MyUtil;

public class BubbleSortJuly2020 {
	
	//80 10 15 8 3 25 45 62 70
	static void bubbleSort(int[] arr){
		
		for(int i=0;i<arr.length-1;i++) {
			
			for(int j=(i+1); j < arr.length;j++) {
				
				if(arr[j] < arr[i]) MyUtil.swap(arr, i, j);
				
			}
		}
		
		MyUtil.displayArray(arr);
		
	}
	
	public static void main(String[] args) {
		int[] arr = {80, 10 , 15 , 8 , 3 , 25 , 45,  62,  70};
		bubbleSort(arr);
	}

}
