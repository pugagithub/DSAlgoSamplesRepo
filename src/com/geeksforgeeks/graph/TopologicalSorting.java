package com.geeksforgeeks.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import com.util.MyUtil;



public class TopologicalSorting {
	
	static int[][] adjMatrix = new int[5][5];
	
	
	
	public static void main(String[] args) {
		
		adjMatrix[0][1] = 1;
		adjMatrix[0][2] = 1;
		adjMatrix[1][3] = 1;
		adjMatrix[2][3] = 1;
		adjMatrix[3][4] = 1;
		adjMatrix[1][4] = 1;
		
		
	//	topoSort_AdjMatrixApproach();
		
		topoSort_AdjMatrixApproach_New();
		
		
	}
	
	
	
	static void  topoSort_AdjMatrixApproach(){
		
		
		
		 Stack<Integer> stack = new Stack<Integer>();
		 Queue<Integer> queue = new LinkedList<Integer>() ;
		 
		 int nodeWithoutSuccessor = getNodeWhichDoesntHaveAnySuccessor(stack);
		 queue.add(nodeWithoutSuccessor);
		 
		
		while(!queue.isEmpty()) {
			
			nodeWithoutSuccessor = queue.poll();
			stack.add(nodeWithoutSuccessor); // In Z-->A-->B , B is without any successor
			deleteEdgeFromPredecessor(nodeWithoutSuccessor);  // Delete edge from A --> B  , here B is Col . Not only from A but from all vertices
			int newNodeWithoutSuccessor = getNodeWhichDoesntHaveAnySuccessor(stack);
			System.out.println("newNodeWithoutSuccessor : "+ newNodeWithoutSuccessor);
			if(newNodeWithoutSuccessor!=-1) {
				queue.add(newNodeWithoutSuccessor);
			}
		}
		while(!stack.isEmpty()) {
			System.out.print(stack.pop()+1 + " ");
		}
	 }
	
	static void  topoSort_AdjMatrixApproach_New(){
		 Stack<Integer> stack = new Stack<Integer>();
			int nodeWithoutSuccessor = 100;
			while (nodeWithoutSuccessor != -1) {
				nodeWithoutSuccessor = getNodeWhichDoesntHaveAnySuccessor(stack);
				if (nodeWithoutSuccessor != -1) {
					deleteEdgeFromPredecessor(nodeWithoutSuccessor);
					stack.add(nodeWithoutSuccessor);
				}
			
		}
		while(!stack.isEmpty()) {
			System.out.print(stack.pop()+1 + " ");
		}
	 }
	
	
	private static void deleteEdgeFromPredecessor( int nodeWithoutSuccessor) {
		for (int m = 0; m < adjMatrix.length; m++) {
			if (adjMatrix[m][nodeWithoutSuccessor] == 1) {
				adjMatrix[m][nodeWithoutSuccessor] = 0;
			}
		}

	}

	static int getNodeWhichDoesntHaveAnySuccessor(Stack<Integer> stack){
		for(int i = adjMatrix.length - 1 ; i>=0 ;i--) {
			boolean allOutgoingEdgeIsZero = true;
			int j=0;
			for(j=0;j<adjMatrix.length;j++) {
				if(adjMatrix[i][j] == 1) {
					allOutgoingEdgeIsZero = false;break;
				}
			}
			
			// There may be many nodes which dont have any successor , but this function only returns the first node
			//System.out.println("allOutgoingEdgeIsZero :"+ allOutgoingEdgeIsZero +" j: "+ j);
			if(allOutgoingEdgeIsZero && j <= adjMatrix.length && !stack.contains(i)) return i; 
			
		}
		return -1;
	}
	
	

}
