package july2020;

public class LinkedListMainClass {

	LinkedList list = new LinkedList();
	Link first = list.first;

	public static void main(String[] args) {

		LinkedListMainClass mainClass = new LinkedListMainClass();

		//============Insertion======================================
		mainClass.insertLast(new Link(10));
		mainClass.insertLast(new Link(20));
		mainClass.insertLast(new Link(30));
		mainClass.insertLast(new Link(40));
		mainClass.insertLast(new Link(50));
		mainClass.insertLast(new Link(60));
		//============================================================
		
		
		mainClass.traverse();
		
		mainClass.reverseLinkedList();
		
		if(true)return;
		
		//=======================Finding Link==========================
		Link foundLink = mainClass.find(40);
		System.out.println(foundLink==null? "\nCouldnt find link":"\nFound Link : "+ foundLink.data );
	
		foundLink = mainClass.find(80);
		System.out.println(foundLink==null? "\nCouldnt find link 80":"Found Link : "+ foundLink.data );
		//==========================================================
		
		//=======================Delete==============================
		System.out.println("\nDeleting Link 30 ");
		mainClass.delete(30);
		mainClass.traverse();
		//==============================================================
		
		
		//==================InsertAfter===============================
		System.out.println("\nInsert 45 after 40 : ");
		mainClass.insertAfterKey(40,new Link(45));
		mainClass.traverse();
		System.out.println("\nInsert 53 after 50 : ");
		mainClass.insertAfterKey(50,new Link(53));
		mainClass.traverse();
		//===============================================================
		
		
		//==================InsertBefore===============================
				System.out.println("\nInsert 25 Before 40 : ");
				mainClass.insertBeforeKey(40,new Link(25));
				mainClass.traverse();
				System.out.println("\nInsert 5 Before 10 : ");
				mainClass.insertBeforeKey(10,new Link(5));
				mainClass.traverse();
				System.out.println("\nInserting at 500 ");
				mainClass.insertBeforeKey(500,new Link(100));
				mainClass.traverse();
		//===============================================================
		
				System.out.println("Completed All Functions");
		
	}

	Link insertLast(Link newLink) {

		if (first == null) {
			first = newLink;
			return first;
		}

		Link current = first;
		Link previous = current;

		while (current != null) {

			previous = current;
			current = current.next;

		}
		previous.next = newLink;
		return first;

	}

	void traverse() {

		Link current = first;
		while (current != null) {
			System.out.print(current.data + "   ");
			current = current.next;

		}
		
		System.out.println("");

	}
	
	void traverse(Link firstLink) {

		Link current = firstLink;
		while (current != null) {
			System.out.print(current.data + "   ");
			current = current.next;

		}
		
		System.out.println("");

	}
	

	Link find(int key) {
		Link current = first;
		while (current != null) {
			if(current.data == key) return current;
			current = current.next;
		}
		return null;

	}

	void delete(int keyToBeDeleted) {

		Link current = first;
		Link previous = current;
		while(current.data!=keyToBeDeleted) {
			
			previous = current;
			current = current.next;
		}
		
		previous.next=current.next;
		
	}

	void insertAfterKey(int findKey , Link newLink) {
		
		Link current = first ;
		
		while(current!=null) {
			
			if(current.data == findKey) {
				Link temp = current.next;
				current.next = newLink;
				newLink.next = temp;
			}
			current = current.next;
		}
		
	}

	void insertBeforeKey(int findKey , Link newLink) {
		
		Link current = first;
		Link previous = current;
		
		while(current!=null  && current.data != findKey) {
			previous = current;
			current = current.next;
		}
		
		if(current!=null) {
			
			//To prevent circular dependency
			if(current == first) {Link temp =  first; first = newLink ; newLink.next = temp; return;}
			
			previous.next = newLink;
			newLink.next = current;
			
			
		}
	}

	void reverseLinkedList() {
		Link current = first;
		Link previous = null;
		while(current!=null) {
			Link nextToCurrent = current.next; 
			current.next= previous; 
			previous = current; 
			current = nextToCurrent;  
		}
		
		traverse(previous);
	}

}
