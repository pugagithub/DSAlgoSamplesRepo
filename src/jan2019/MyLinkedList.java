package jan2019;

public class MyLinkedList {
	
	LinkNode firstNode;
	
	public static void main(String[] args) {
		
		MyLinkedList ll = new MyLinkedList();
		
		add(ll , new LinkNode(1, null));
		add(ll , new LinkNode(2, null));
		add(ll , new LinkNode(3, null));
		add(ll , new LinkNode(4, null));
		add(ll , new LinkNode(5, null));
		
		
		traverse(ll);
		
		delete(ll,2 , new LinkNode(10, null));
		
		System.out.println();
		
		traverse(ll);
		
		
		
		
	}
	
	
	
	public static void add(MyLinkedList ll , LinkNode node){
		
		if(ll.firstNode == null) ll.firstNode = node;
		else{
			LinkNode currentNode = ll.firstNode;
			while(currentNode.next != null){  // While Loop to move past the data
				currentNode = currentNode.next;  // Change the condition inside the while loop so the condition may fail later.
			}
			currentNode.next = node;
		}
	}
	
	
	public static void traverse(MyLinkedList ll){
		
		LinkNode currentNode = ll.firstNode;
		while(currentNode.next!=null){
			System.out.print(currentNode.data+"  |  ");
			currentNode = currentNode.next;
		}
		
	}
	
	
	public static void delete(MyLinkedList ll , int dataTobeDeleted , LinkNode newNode){
		
		LinkNode currentNode = ll.firstNode;
		LinkNode parentNode = null;
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

 class LinkNode {
	
	int data;
	LinkNode next;
	
	LinkNode(int data , LinkNode next){
		this.data = data;
		this.next = next;
	}
	
}








//Traverse Data in Linked List

//Delete Data in Linked List

