package com.sorting.mergersort;

public class NormalMerging {
	
	/*static int[] a = {23,47,81,95};
	static int[] b ={7,14,39,55,62,74};
	static int[] c = new int[a.length+b.length];*/
	
	public static void main(String[] args) {
		
		int[] a = {23,47,81,95};
		int[] b ={7,14,39,55,62,74};
		int[] c = new int[a.length+b.length];
		
		merge(a,b,c);
		display(c);
	}

	private static void merge(int[] a,int[] b,int[] c) {
		
		int i=0;
		int j=0;
		int k=0;
		int aSize=a.length;
		int bSize=b.length;
		
		while(i<aSize && j<bSize){
			
			if(a[i]<b[j]){
				c[k++]=a[i++];
			}
			else{
				c[k++]=b[j++];
			}
		}
		
		if(i<aSize){
			while(i<aSize){
				c[k++]=a[i++];
			}
		}
		
		if(j<bSize){
			while(j<bSize){
				c[k++]=b[j++];
			}
		}
	}
	
	
public static void display(int[] a){
		
		for(int i : a){
			System.out.print(i+",");
		}
	}



}
