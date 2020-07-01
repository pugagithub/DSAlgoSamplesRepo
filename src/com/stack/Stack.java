package com.stack;

public class Stack {
	
	int[] arr =new int[10];
	int top=-1;
	
	
	void push(int data) {
		arr[++top] = data;
	}
	
	int pop() {
		return arr[top--];
	}
	
	int peek() {
		return arr[top];
	}
	

}
