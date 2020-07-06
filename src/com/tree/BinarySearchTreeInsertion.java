package com.tree;

public class BinarySearchTreeInsertion  {
	
	/**
	 * 
	 * Insertion in Tree
	 * 
	 * InOrder 
	 * 
	 * Pre Order
	 */
	
	
	
	
	public static void main(String[] args) {
		
		int[] a={50,30,60,20,40};
		
		Tree tree = new Tree();
		Node rootNode = tree.rootNode;
		
		BinarySearchTreeInsertion mainClass = new BinarySearchTreeInsertion();
		
		for(int i=0;i<a.length;i++){
			rootNode = mainClass.insert(rootNode,a[i]);
		}
		
		inOderTraversal(rootNode,"root");
		
		System.out.println("=================Pre Order Traversal=========================");
		
		//preOderTraversal(rootNode);
			
		
		
		
	}



	private static void inOderTraversal(Node rootNode, String side) {
		if(rootNode!=null){ // When it is null just dont do anything , it is the base case here.
		System.out.println(side);
		inOderTraversal(rootNode.leftChild,"left");
		System.out.println(rootNode.data);
		inOderTraversal(rootNode.rightChild,"right");
		}else{
			System.out.println("Node is null");
		}
	}
	
	private static void preOderTraversal(Node rootNode) {
		if(rootNode!=null){		
		System.out.println(rootNode.data);
		preOderTraversal(rootNode.leftChild);
		preOderTraversal(rootNode.rightChild);
		}
	}



	private Node insert(Node rootNode,int data) {
		
		Node current = rootNode;
		Node parent = rootNode;
		
		while(true){
			
			if(current==null){
				System.out.println("Current is null Hence it is root");
				System.out.println("Insering data :"+ data);
				return new Node(data);
			}
			
			if(data>current.data  ){
				
				if(current.rightChild==null){
					current.rightChild=new Node(data);
					System.out.println("Insering data :"+ data);
					return rootNode;
				}
				else current = current.rightChild;
			}
			
			else if(data<current.data ){
				if(current.leftChild==null){
					current.leftChild=new Node(data);
					System.out.println("Insering data :"+ data);
					return rootNode;
				}
				else current = current.leftChild;
			}
			
			else{
				current = current.rightChild;
			}
		}
		
		
		
	}
	
	
	
	

}




class Tree{
	
	Node rootNode;
	
}

class Node{
	
	@Override
	public String toString() {
		return this.data+"";
	}
	
	Node(int data){
		this.data=data;
	}
	
	int data;
	Node leftChild;
	Node rightChild;
}
