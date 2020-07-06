package com.queue;

public class Queue {
	
	int front = -1;
	int rear = -1;
	
	/**
	 * Both Front and Remove will increase the front and rear. (No Opposite Direction)
	 * Current program output is comig wrong
	 */
	
	int size = 30;
	
	int[] arr = new int[size];
	
	
	public void insert(int data){
		if(rear==size-1)rear=-1;
		arr[++rear]= data;
	}
	
	public int remove(){
		if(front==size-1)front=-1;;
		return arr[++front];
	} 
	
	public static void main(String[] args) {
		
		Queue q =new Queue();
		q.insert(1);
		q.insert(10);
		q.insert(100);
		q.insert(1);
		q.insert(10);
		q.insert(100);
		q.insert(1);
		q.insert(10);
		q.insert(100);
		q.insert(1);
		q.insert(10);
		q.insert(100);
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		
	}

}
