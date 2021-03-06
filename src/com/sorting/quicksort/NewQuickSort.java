package com.sorting.quicksort;

public class NewQuickSort {
	
	public static void main(String[] args) {
		
		//int[] arr = { 2, 6 , 57, 90, 20, 10, 30, 1 , 5 ,9 };
		int[] arr = {70,90,20,40,30};
		System.out.print("Data Before ---->");
		for(int data : arr)System.out.print(""+data+",");
		
		quicksort(arr,0,arr.length-1);
		
		System.out.print("\nData After ---->");
		for(int data : arr)System.out.print(""+data+",");	}
	
	
	public static void quicksort(int[] arr, int startPos , int endPos){
		if(startPos>=endPos){
			return;
		}
		int pivot = partition(arr, startPos, endPos);
		quicksort(arr, startPos, pivot-1); // 1 lesser than pivot because pivot is already in the correct position
		quicksort(arr, pivot+1, endPos);
		
	}
	
	public static int partition(int[] arr, int startPos, int endPos) {

		int leftPtr = startPos;
		int rightPtr = endPos - 1;  // -1 bcoz in enPos we have pivot , see next line.
		int pivot = arr[endPos];
		
		
		   if (leftPtr < rightPtr) {  // This if condition is very important 

			while (leftPtr < rightPtr) {

				while (arr[leftPtr] < pivot) {
					leftPtr++;
				}

				while (rightPtr > leftPtr && arr[rightPtr] > pivot) {
					rightPtr--;
				}

				if (leftPtr < rightPtr)
					swap(arr, leftPtr++, rightPtr--);

			}

			swap(arr, leftPtr, endPos);
		}
		return leftPtr; // This step is very important

	}
	
	private static void swap(int[] arr, int leftPtr, int rightPtr) {		
		int tmp = arr[leftPtr];
		arr[leftPtr] = arr[rightPtr];
		arr[rightPtr] = tmp;
		
	}

}
