package jan2019.LinkedList;

public class MyLinkedList {
	
	Node firstNode;
	
	public static void main(String[] args) {
		
		MyLinkedList ll = new MyLinkedList();
		
		add(ll , new Node(1, null));
		add(ll , new Node(2, null));
		add(ll , new Node(3, null));
		add(ll , new Node(4, null));
		add(ll , new Node(5, null));
		
		
		traverse(ll);
		
		delete(ll,2 , new Node(10, null));
		
		System.out.println();
		
		traverse(ll);
		
		
		
		
	}
	
	
	
	public static void add(MyLinkedList ll , Node node){
		
		if(ll.firstNode == null) ll.firstNode = node;
		else{
			Node currentNode = ll.firstNode;
			while(currentNode.next != null){  // While Loop to move past the data
				currentNode = currentNode.next;  // Change the condition inside the while loop so the condition may fail later.
			}
			currentNode.next = node;
		}
	}
	
	
	public static void traverse(MyLinkedList ll){
		
		Node currentNode = ll.firstNode;
		while(currentNode.next!=null){
			System.out.print(currentNode.data+"  |  ");
			currentNode = currentNode.next;
		}
		
	}
	
	
	public static void delete(MyLinkedList ll , int dataTobeDeleted , Node newNode){
		
		Node currentNode = ll.firstNode;
		Node parentNode = null;
		while(currentNode.next!=null){
			if(currentNode.data == dataTobeDeleted){
				
				parentNode.next = newNode;
				
				newNode.next = currentNode.next;
				
				return;
				
			}
			
			parentNode = currentNode;
			currentNode = currentNode.next;
			
		}
		
	}
	

}// Class End

class Node {
	
	int data;
	Node next;
	
	Node(int data , Node next){
		this.data = data;
		this.next = next;
	}
	
}








//Traverse Data in Linked List

//Delete Data in Linked List

