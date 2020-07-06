package jan2019;


//Binary Search Tree
public class Tree {
	
	Node rootNode;
	
	public static void main(String[] args) {
		
		Tree tree = new Tree();
		
		add(tree , 100);
		add(tree , 200);
		add(tree , 300);
		add(tree , 50);
		add(tree , 40);
		add(tree , 60);
		
		inOrderTraversal(tree.rootNode);
		
		
/*		100 
	50	    200
40    60	       300  */
		
	}
	
	
	
	private static void inOrderTraversal(Node currentNode) {  // In recursive fn , the args must be changeable so pass rroNode not tree. since node will be updated inside loop
		// TODO Auto-generated method stub
		
		//Base case
		if(currentNode!=null){
			
			inOrderTraversal(currentNode.leftNode);
			System.out.println(currentNode.data);
			inOrderTraversal(currentNode.rightNode);
			
		}
		
		
	}



	public static void add(Tree tree , int data){
		
		if(tree.rootNode == null) tree.rootNode = new Node (data,null,null);
		else{
			
			Node currentNode = tree.rootNode;
			
			while(true){
				
				
				if(data > currentNode.data){
					if(currentNode.rightNode == null) {
						currentNode.rightNode = new Node(data,null,null);
						return;
					}
					else{
					currentNode = currentNode.rightNode;
					}
				}
				
				
				
				else if(data <= currentNode.data){
					
					
					if(currentNode.leftNode == null){
						currentNode.leftNode = new Node(data,null,null);
						return;
					}
					else{
					currentNode = currentNode.leftNode;
					}
					
				}
				
				
				
			}
			
		}
		
	}
	/*
	delete(){
		
	}
	
	insertAtMiddle(){
		
	}*/

}


class Node {
	
	int data;
	Node leftNode;
	Node rightNode;
	
	Node(int data , Node leftNode , Node rightNode){
		this.data = data;
		this.leftNode = leftNode;
		this.rightNode = rightNode;
	}
	
	
	
	
}