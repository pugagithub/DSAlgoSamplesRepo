package july2020;

import com.geeksforgeeks.tree.Node;

public class TreeMainClass {
	
	BinarySearchTree tree = new BinarySearchTree();
	public Node root = tree.root;
	
	
	/**
	 * 
	 *           30
	 *         
	 *       10       40
	 *       
	 *    5       20         
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		TreeMainClass mainClass =new TreeMainClass();
		/*
		 * mainClass.insert(new Node(30)); mainClass.insert(new Node(10));
		 * mainClass.insert(new Node(20)); mainClass.insert(new Node(40));
		 * mainClass.insert(new Node(5));
		 */
		insertData(mainClass);
		
		System.out.println("======InOrder traversal=====================");
		mainClass.inOrderTraversal(mainClass.root);
		System.out.println("======PreOrder traversal=====================");
		mainClass.preOrderTraversal(mainClass.root);
		System.out.println("======PostOrder traversal=====================");
		mainClass.postOrderTraversal(mainClass.root);
		
		System.out.println("=================Finding Node=====================");
		Node foundNode = mainClass.find(40);
		System.out.println(foundNode==null? "Key Not Found": "Found Key : "+ foundNode.data);
	}
	
	public static void insertData(TreeMainClass tree){
		
		tree.insert(new Node(30));
		tree.insert(new Node(10));
		tree.insert(new Node(20));
		tree.insert(new Node(40));
		tree.insert(new Node(5));
	}
	
	public void insert(Node newNode) {
		
		if(root == null) {root = newNode; return;}  // Check For Root Node is empty
		Node current = root;
		Node previous = root;   // For imsert always have previous
		boolean isLeftChild = false;
		
		while(current!=null) {
			previous = current;
			if(newNode.data < current.data) {
				current = current.leftChild;
				isLeftChild = true;
			}
			else {
				current = current.rightChild;
				isLeftChild = false;
			}
		}
		if(isLeftChild)previous.leftChild = newNode;
		else previous.rightChild = newNode;
	}
	public void inOrderTraversal(Node node) {
		if(node==null) return;
		inOrderTraversal(node.leftChild);
		System.out.println(node.data + "  ");
		inOrderTraversal(node.rightChild);
	}
	public void preOrderTraversal(Node node) {
		if(node==null) return;
		System.out.println(node.data + "  ");
		preOrderTraversal(node.leftChild);
		preOrderTraversal(node.rightChild);
	}
	void postOrderTraversal(Node node) {
		if(node==null) return;
		postOrderTraversal(node.leftChild);
		postOrderTraversal(node.rightChild);
		System.out.println(node.data + "  ");
	}
	
	Node find(int key) {
		
		Node current = root;
		
		while(current!=null) {
			if(current.data==key) return current;
			if(key < current.data) current = current.leftChild;
			else current = current.rightChild;
		}
		
		return null;
		
		
	}
	

}
