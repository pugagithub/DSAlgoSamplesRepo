
package com.geeksforgeeks.tree;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class VerticalTraversalOfTree {
	
static Map<Integer, String> map = new ConcurrentHashMap<Integer, String>();
	
	/**
	 * 
	 *    1
        /   \ 
       2      3
      / \   /   \
     4   5  6   7
    / \          
   8   9

//===================================Output =======================
4
2
1 5 6
3 8
7
9
	 *   
	 */
	public static void main(String[] args) {
		BinaryTreeNotBinarySearchTree binaryTree = new BinaryTreeNotBinarySearchTree();
		BinaryTreeNotBinarySearchTree.insertData(binaryTree);
		
		verticalTraversal(binaryTree.root,0);
		
		new BTreePrinter().printNode(binaryTree.root);
		
		System.out.println(map);
	}
	
	
	static void verticalTraversal(Node root , int levelNo){
		if(root==null)return;
		if(map.get(levelNo)!=null)map.put(levelNo,map.get(levelNo) + "  " +root.data);
		else map.put(levelNo, root.data+" ");
		verticalTraversal(root.leftChild, levelNo-1);
		verticalTraversal(root.rightChild, levelNo+1);
	}

}
