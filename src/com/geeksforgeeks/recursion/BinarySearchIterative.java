package com.Recursion;

public class BinarySearchIterative {
	
	
	public static void main(String[] args) {
		
		int[] a = {10,20,30,40,50,60,70,80,90,100};
		
		int key = 40;
		
		int low = 0;
		int high = a.length-1;
		
		int count =0;
		
		while(low<=high){
			
			count++;
			
			int mid = (low+high)/2;
			
			if(key==a[mid]){
				System.out.println("Key Found At Index : "+ mid +" in "+ count+" steps");
				return;
			}
			
			else if(key<a[mid]){
				System.out.println("Key is less than mid");
				high = mid-1;
				continue;
			}
			
			else if(key>a[mid]){
				System.out.println("Key is more than mid");
				low = mid+1;
			}
			
		}
		
		System.out.println("Key Not Found  ");

		
	}
	
	
}
