package com.sorting.insertionsort;

public class InsertionSortJune2017 {
	
	static int[] a = { 20, 36, 23, 60, 95, 17, 12, 94 };

	public static void main(String[] args) {
		insertionSort(a);
		display(a);
	}
	
	
	

private static void insertionSort(int[] a) {
	
		int size = a.length;
		for (int i = 1; i < size; i++) {

			int cursorVal = a[i]; // Store the insertion point
			int j;
			for (j = i; (j > 0 && a[j - 1] > cursorVal); j--) {  // Start from Insertion Point and go backwards till zero and cursorVal is smaller
				a[j] = a[j - 1]; // Move below to upper
			}
			a[j] = cursorVal;

		}
		
	}




public static void display(int[] a){
		
		for(int i : a){
			System.out.print(i+",");
		}
	}

}
