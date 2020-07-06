package com.Stack;

public class MyStack {
	
	
	int currentPointer;
	
	int[] arr;
	
	MyStack(){
		arr = new int[10];
		currentPointer=-1;
	}
	
	public int pop(){
		
		//Boundary Condition
		if(currentPointer==-1)return -1;
		
		return arr[currentPointer--];
	}
	
	public void push(int val){
		
		//Boundary Condition
		if(currentPointer==10)return;
		
		arr[++currentPointer]=val;
	}
	
	public int peek(){
		return arr[currentPointer];
	}
	
	public static void main(String[] args) {
		
		MyStack stack = new MyStack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
	
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}

}
