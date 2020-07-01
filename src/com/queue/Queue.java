package com.queue;

public class Queue {
	
	int[] arr = new int[20];
	
	
	
	int front = 0;   // Remove From Front , Front is always 0
	
	int rear =-1;  // Insert From Back . Insert From i=len-1
	
	void insert(int data) {  // INSERT AT BACK
		
		arr[++rear]=data;
	}
	
	int remove(){   // REMOVE FROM FRONT
		return arr[front++];
	}
	
	
	

}
