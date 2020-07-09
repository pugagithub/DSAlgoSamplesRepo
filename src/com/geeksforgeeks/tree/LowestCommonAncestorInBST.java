package com.geeksforgeeks.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import july2020.TreeMainClass;

public class LowestCommonAncestorInBST {
	
	static Node root;
	public static void main(String[] args) {
		
		TreeMainClass tree = new TreeMainClass();
		TreeMainClass.insertData(tree);
		root = tree.root;
		
		tree.insert(new Node(100));
		tree.insert(new Node(200));
		tree.insert(new Node(50));
		tree.insert(new Node(7));
		tree.insert(new Node(45));
		tree.insert(new Node(35));
		
		BTreePrinter.printNode(root);
		Node n = lca(root,50,35);
		System.out.println(n.data);
	}
	
	static List<Node> list1 = new ArrayList<Node>();
	static List<Node> list2= new ArrayList<Node>();
	
	
	static Node lca(Node root , int v1 ,int v2){
		
		Node current = root;
		while(current!=null) {
			list1.add(current);
			if(v1 == current.data) {

				break;
				
			}
			else if(v1 < current.data) {
				current = current.leftChild;
			}
			else {
				current =current.rightChild;
			}
		}
		
		current = root;
		while(current!=null) {
			list2.add(current);
			if(v2 == current.data) {

				break;
				
			}
			else if(v2 < current.data) {
				current = current.leftChild;
			}
			else {
				current =current.rightChild;
			}
		}
		
		/*
		 * for(Node i :list1 )System.out.println("List1 :"+ i.data); for(Node j :list2 )
		 * { System.out.println("List 2 "+j.data); }
		 * 
		 * list1.retainAll(list2); System.out.println("$$$$$$$$$$$$$$$$$$$$$$$4");
		 * for(Node j :list1 ) { System.out.println("List "+j.data); }
		 */
		list1.retainAll(list2);
		return list1.get(list1.size()-1);
		
		
	}

}
