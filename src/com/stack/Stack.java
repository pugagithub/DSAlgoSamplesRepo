package com.stack;

public class Stack {
	
	//Data Block
	private String[] arr =new String[10];
	private int top=-1;
	
	
	void push(String data) {
		arr[++top] = data;
	}
	
	String pop() {
		return arr[top--];
	}
	
	String peek() {
		return arr[top];
	}
	
	boolean isEmpty() {
		if(top==-1) return true;
		else return false;
	}
	
	void display(){
		for(int i=0;i<=top;i++)System.out.print(arr[i]+"  ");
	}
	
	
	

}
