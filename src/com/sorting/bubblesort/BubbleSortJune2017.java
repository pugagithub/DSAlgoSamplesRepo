package com.sorting.bubblesort;

public class BubbleSortJune2017 {

	static int[] a = { 20, 36, 23, 60, 95, 17, 12, 94 };

	public static void main(String[] args) {
		bubbleSort(a);
		display(a);
	}

	private static void bubbleSort(int[] a) {

		int size = a.length;

		for (int i = size - 1; i > 0; i--) {      // -1 as it is eqaul to in condition like i=size-1  not less than like i<size 
			
			for (int j = 0; j < i; j++) {        // j<i bcoz , greater than i is already sorted in right side
				
				if (a[j] > a[j + 1]) {              // current checked against next
					
					//Swapping
					int tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;

				}

			}
		}

	}
	
	
public static void display(int[] a){
		
		for(int i : a){
			System.out.print(i+",");
		}
	}

}
