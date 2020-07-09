package com.geeksforgeeks.tree;

public class TopViewOfTree {
	
	static Node root;
	public static void main(String[] args) {
		BinaryTreeNotBinarySearchTree binaryTree = new BinaryTreeNotBinarySearchTree();
		BinaryTreeNotBinarySearchTree.insertData(binaryTree);
		
		root = binaryTree.root;
		topView(root,true);
		
		new BTreePrinter().printNode(root);
	}
	
	
	static void topView( Node current ,  boolean toggle){
		if(current == null) {
			System.out.println("Current is null");
			return;
		}
		
		
		if(toggle)topView( current.leftChild , toggle);
		System.out.println(current.data);
		if(current == root)toggle = false;
		if(!toggle)topView( current.rightChild , toggle);
		
	}

}

