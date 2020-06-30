package com.linkedList;

public class LinkedListMainClass {
	
	 LinkedList list = new LinkedList();
	Link first = list.first;

	public static void main(String[] args) {
		
		
		LinkedListMainClass mainClass = new LinkedListMainClass();

		mainClass.insertLast(new Link(10));
		mainClass.insertLast(new Link(20));
		mainClass.insertLast(new Link(30));
		mainClass.insertLast(new Link(40));
		mainClass.insertLast(new Link(50));
		mainClass.insertLast(new Link(60));
		
		mainClass.traverse();
		
	}
	
	
   Link insertLast(Link newLink) {
	  
	  if(first == null) {
		  first = newLink; 
		  return first;
	  }
	
	   Link current = first;
	   Link previous = current;
	   
	  
	   
	   while(current!=null) {
		   
		   previous = current;
		   current = current.next;
		   
	   }
	   previous.next = newLink;
	   return first;
	   
	}
	
  
   void traverse() {
	
	  Link current = first;
	  while(current!=null) {
		  System.out.print(current.data+ "   ");
		  current = current.next;
		  
	  }
	  
	}
	
  static void delete() {
		
	}

}
