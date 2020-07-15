package com.geeksforgeeks.recursion;

public class BinarySearchRecursive {
	
	static int[] a = {0,10,20,30,40,50,60,70,80,90,100};
	
	static int key = 10;
	
	
	public static void main(String[] args) {
		
		
		
		binarySearch(0,a.length-1);
	}
	
	
	public static void binarySearch(int low ,int high){
		
		
		/*System.out.println("Low : "+ a[low]);
		System.out.println("High : "+ a[high]);*/
		
		if(low > high){
			
				System.out.println("Key Not Found");
				return;
		}
		
		int mid = (low+high)/2;
		//System.out.println("Mid : "+ a[mid]);
		
		if (key == a[mid]) {
			System.out.println("Found at index :" + mid);
			return;
		} 
		
		else if(key<a[mid]){
			//System.out.println("Key is less than mid which is : "+ a[mid]);
			binarySearch(low ,mid-1);
		}
		
		else if(key>a[mid]){
			//System.out.println("Key is greater than mid which is : "+ a[mid]);
			binarySearch(mid+1 ,high);
		}
		
		
	}
	

}
