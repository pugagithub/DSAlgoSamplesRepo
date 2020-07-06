package com.sorting.quicksort;

import com.util.MyUtil;

public class PartitionJuly2020 {
	
	public static void main(String[] args) {
		
		int[] arr = {70,90,20,40,10,30,150,1,60,80,100,50};
				   //1,30,20,40,10,90,150,70,60,80,100,50
		
		partition(arr, 0 , arr.length-1);
		
		MyUtil.displayArray(arr);
		
		
		
	}

	static int partition(int[] arr , int low , int high) {

		int lastElemIndex = high;
		int lastElemValue = arr[lastElemIndex];

		int i = low, j = lastElemIndex -1 ; // Start one left from pivot
		if(i<j) {
		while (i < j) {
			while (arr[i] < lastElemValue && i < j ) i++;
			while (arr[j] > lastElemValue && j > i) j--;
			System.out.println("Swapping 1:"+ arr[i] +"   "+ arr[j]);
			if(i<j)MyUtil.swap(arr, i++, j++);
		}
		System.out.println("\nSwapping 2:"+ arr[i] +"   "+ arr[lastElemIndex]);
		MyUtil.swap(arr, i, lastElemIndex);
		}
		return i;
	}

}
