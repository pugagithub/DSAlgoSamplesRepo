package com.util;

public class MyUtil {
	
	public static void displayArray(int[] a){
		
		for(int i : a){
			System.out.print(i+",");
		}
	}
	
public static void displayArray(Object[] a){
		
		for(Object i : a){
			System.out.print(i+",");
		}
	}
	
	
	
public static void swap(int[] a , int i , int j){
		
		int tmp = a[i];
		a[i]= a[j];
		a[j]=tmp;
		
		
	}

}
