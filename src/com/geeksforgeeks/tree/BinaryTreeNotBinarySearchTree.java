package com.geeksforgeeks.tree;

import java.lang.reflect.InvocationTargetException;
import java.util.LinkedList;
import java.util.Queue;

import org.apache.commons.beanutils.BeanUtils;

import july2020.TreeMainClass;

public class BinaryTreeNotBinarySearchTree {
	
	

	Node root;
	Queue<Node> queue = new LinkedList<Node>();
	
	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {


		BinaryTreeNotBinarySearchTree binaryTree = new BinaryTreeNotBinarySearchTree(); 
		binaryTree.root = insertData(binaryTree);
		//new TreeMainClass().preOrderTraversal(binaryTree.root);
		
		//new LevelByLevelPrintingOfBinaryTree().levelOrderTraversal(binaryTree.root);
		new BTreePrinter().printNode(binaryTree.root);
	}
	
	static Node insertData(BinaryTreeNotBinarySearchTree binaryTree ){
		binaryTree.root = binaryTree.insert(binaryTree.root, new Node(1));
		binaryTree.root = binaryTree.insert(binaryTree.root, new Node(2));
		binaryTree.root = binaryTree.insert(binaryTree.root, new Node(3));
		binaryTree.root = binaryTree.insert(binaryTree.root, new Node(4));
		
		  binaryTree.root = binaryTree.insert(binaryTree.root, new Node(5));
		  binaryTree.root = binaryTree.insert(binaryTree.root, new Node(6));
		  binaryTree.root = binaryTree.insert(binaryTree.root, new Node(7));
		  binaryTree.root = binaryTree.insert(binaryTree.root, new Node(8));
		  binaryTree.root = binaryTree.insert(binaryTree.root, new Node(9));
		  return binaryTree.root;
	}

	public Node insert(Node root, Node newNode) {

		
		
		Node current = root;
		
		if (root == null) {
			root =newNode; 
			queue.add(root);
			return root;
		}
		

		while (!queue.isEmpty()) {
			current = queue.peek();
			if (current.leftChild != null && current.rightChild != null) {
			queue.remove();
			}
			else if(current.leftChild == null) {
				current.leftChild = newNode;
				queue.add(current.leftChild);
				return root;
			}

			else if (current.rightChild == null) {
				current.rightChild = newNode;
				queue.add(current.rightChild);
				return root;
			}
			
			
		}

		return root;
	}
	
	

}
