package com.common_algorithms;

import java.util.Stack;

public class KnapSack {
	
	static int capacity = 20;	
	static int[] items ={11,8,7,6,5};
	
	public static void main(String[] args) {
		
		for(int i=0;i<items.length;i++)
			knapSack(i,0, new Stack());
		
		
	}
	
	
	static void knapSack(int startIndex , int sum , Stack stack){
		
		if(startIndex >= items.length)return;
		stack.push(items[startIndex]);
		
		sum = sum + items[startIndex];
		if(sum < capacity){
		System.out.println(items[startIndex]);
		knapSack(++startIndex ,sum,stack );
		}
		else{
			
			for(int i=startIndex;i<items.length;i++){
				sum = sum+ items[i];
				if(sum>capacity){
					sum=sum-items[i];
				}
			}
		}
		
		/*int count = startIndex;
		for(int i=startIndex;i<items.length;i++){
			System.out.println("Hi Pugal --->  "+ items[count++] + "----> index is ---------->"+ count);
			
		}
		System.out.println("-----------------------------------------");
		
		*/
	}
	
}
