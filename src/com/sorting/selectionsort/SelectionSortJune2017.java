package com.sorting.selectionsort;

public class SelectionSortJune2017 {
	
	static int[] a = { 20, 36, 23, 60, 95, 17, 12, 94 };

	public static void main(String[] args) {
		selectionSort(a);
		display(a);
	}
	
private static void selectionSort(int[] a) {
	
	int size = a.length;
	
	for(int i=0;i<(size-1);i++){         // Here for condition we have used i less than as well as (size-1) . Here size-1 bcoz in inner loop (i+1) is checked
		//int min = a[i];
		for(int j=(i+1);j<size;j++){
			
			if(a[j]<a[i]){                  // initially a[i] is assumed to be minimum. Here for inner loop a[i] dont change as in Bubble Sort.
				
				int tmp = a[i];
				a[i]=a[j];
				a[j]=tmp;
				
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
