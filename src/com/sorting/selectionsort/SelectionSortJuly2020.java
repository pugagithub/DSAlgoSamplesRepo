package com.sorting.selectionsort;

import com.util.MyUtil;

public class SelectionSortJuly2020 {

	
	//25 35 45 10 20 30 40 50 60
	static void selectionSort(int[] arr){
		
		for(int i=0;i<arr.length-1;i++) {
			
			for(int j=(i+1);j<arr.length;j++) {
				
				if(arr[j] < arr[i]) MyUtil.swap(arr,i,j);
			}
		}
		
		MyUtil.displayArray(arr);
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = {100, 50 , 20  , 15 , 80, 60 , 7 , 3 , 40};
		selectionSort(arr);
	}
	

}
