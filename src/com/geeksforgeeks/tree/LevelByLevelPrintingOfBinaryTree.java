package com.geeksforgeeks.tree;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.LinkedBlockingQueue;

import org.apache.commons.beanutils.BeanUtils;

import com.queue.Queue;

import july2020.QueueGenerics;
import july2020.TreeMainClass;

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


public class LevelByLevelPrintingOfBinaryTree {

	// Level order traversal of a tree is breadth first traversal for the tree.
	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
		TreeMainClass tree = new TreeMainClass();
		TreeMainClass.insertData(tree);
		
		tree.inOrderTraversal(tree.root);
		System.out.println("########################");
		levelOrderTraversal(tree.root);
	}

	public static void levelOrderTraversal(Node root) {

		// Print The Node
		// Take Left Child + Print + Put it in Queue
		// Take Right Child + print Put it in Queue

		// Take From Queue

		// Print the Node
		// Left Child + Queue
		java.util.Queue<Node> pugalQueue = new LinkedBlockingQueue<Node>();
		pugalQueue.add(root);
		System.out.println(root.data);
		while (!pugalQueue.isEmpty()) {

			Node currentNode = pugalQueue.remove();
			if (currentNode != null) {
				

				Node leftChild = currentNode.leftChild;
				if(leftChild!=null) {
					System.out.print(leftChild.data + "  ");
					pugalQueue.add(leftChild);
				}
				

				Node rightChild = currentNode.rightChild;
				if(rightChild!=null) {
					System.out.print(rightChild.data+ "  ");
					pugalQueue.add(rightChild);
				}
				
			}
System.out.println("");
		}

	}

}


