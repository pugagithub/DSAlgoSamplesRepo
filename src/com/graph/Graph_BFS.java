package com.graph;

import java.util.*;

public class Graph_BFS {
	
	/**
	 * BFS
	 * DFS
	 * MST
	 */
	
	
    List<Vertex> vertexList = new LinkedList<Vertex>();
    int n=0;
    int[][] adjacentMatrix ;
    Queue<Vertex> queue = new LinkedList<Vertex>();
    Stack<Vertex> stack= new Stack<Vertex>();
    
    Graph_BFS(int n){
    	this.n=n;
    	adjacentMatrix =  new int[n][n];    
    }
	
	
   public List<Vertex> getAdjacentVertexList(int vertexIndx){
	   ArrayList<Vertex> adjacentList = new ArrayList<Vertex>();
	   for(int i=0;i<n;i++){
		  if(adjacentMatrix[vertexIndx][i]==1 && vertexList.get(i).wasVisited==false) {
			  vertexList.get(i).wasVisited=true;
			  adjacentList.add(vertexList.get(i));
		  }
	   }
	   return adjacentList;
    }
   
   
   public List<Vertex> getAdjacentVertexList_MST(int vertexIndx){
	   ArrayList<Vertex> adjacentList = new ArrayList<Vertex>();
	   for(int i=0;i<n;i++){
		  if(adjacentMatrix[vertexIndx][i]==1 && vertexList.get(i).wasVisited==false) {
			  adjacentList.add(vertexList.get(i));
		  }
	   }
	   return adjacentList;
    }
   
	
    
    
	static class Vertex{
		
		int index;
		String label;
		boolean wasVisited = false;		
		Vertex(int index , String label){
			this.index=index;
			this.label=label;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return label;
		}
		
		
	}
	
	public static void main(String[] args) {
		
		int count = 5;
		Graph_BFS graph = new Graph_BFS(count);
		
		
		graph.addVertex(0, "A");
		graph.addVertex(1, "B");
		graph.addVertex(2, "C");
		graph.addVertex(3, "D");
		graph.addVertex(4, "E");
		//graph.addVertex(5, "F");
		
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		//graph.addEdge(1, 2);
		graph.addEdge(0, 3);
		//graph.addEdge(2, 3);
		graph.addEdge(3, 4);
		//graph.addEdge(4, 5);
		
	/*	         A
		    B         D
		    
		   C             E 
		   
		   */
 	
		
		System.out.println("*********************BFS******************************");
		graph.BFS();
		
		for(int i=0;i<count;i++){
			graph.vertexList.get(i).wasVisited=false;
		}
		
		System.out.println("*********************DFS******************************");
		
		graph.DFS();
		
		for(int i=0;i<count;i++){
			graph.vertexList.get(i).wasVisited=false;
		}
		
		System.out.println("*********************MST******************************");
		
		//Again creating list and matrix for Minimum Spannning Tree (MST)
		graph.vertexList= new LinkedList<Vertex>();
		int m=5;
		graph.adjacentMatrix =  new int[m][m];   
		
		graph.addVertex(0, "A");
		graph.addVertex(1, "B");
		graph.addVertex(2, "C");
		graph.addVertex(3, "D");
		graph.addVertex(4, "E");
		
		
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(0, 3);
		graph.addEdge(0, 4);
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);
		graph.addEdge(2, 3);
		graph.addEdge(2, 4);
		graph.addEdge(3, 4);
		
		
		/*
		 *                A
		 *        
		 *        B    C     D   E
		 * 
		 */
		
		graph.mst();;
	}
	
	
	
	public void addVertex(int index , String label){
		vertexList.add(index,new Vertex(index,label) );
	}
	
	public void addEdge(int i, int j){
		adjacentMatrix[i][j]=1;
		adjacentMatrix[j][i]=1;
	}
	
	public void  removeEdge(int i, int j){
		adjacentMatrix[i][j]=0;
		adjacentMatrix[j][i]=0;
	}
	
	
	public  void BFS(){
		
		Vertex root = vertexList.get(0);
		root.wasVisited=true;
		//System.out.println(root.label);
		queue.offer(root);
		
		while(queue.size()>0){
			Vertex removedVertex = queue.poll();
			System.out.println(removedVertex.label);
			List<Vertex> adjVertexList = getAdjacentVertexList(removedVertex.index);
			if(adjVertexList!=null)for(Vertex v : adjVertexList)queue.offer(v);
		}
		
		
		
	}
	
	
	public  void DFS(){
		
		Vertex root = vertexList.get(0);
		root.wasVisited=true;
		stack.push(root);
		
		while(!stack.isEmpty()){
			Vertex removedVertex =  stack.pop();
			System.out.println(removedVertex.label);
			 List<Vertex> adjVertexList = getAdjacentVertexList(removedVertex.index);
			 if(adjVertexList!=null){
				 for(Vertex v : adjVertexList)stack.push(v); // In the stack full adjacent vertices are placed.
			 }
				 
		}
	}
	
	/**
	 * Minimum Spanning Tree
	 */
public  void mst(){
		
		Vertex root = vertexList.get(0);
		root.wasVisited=true;
		stack.push(root);
		
		while(!stack.isEmpty()){
			Vertex removedVertex =  stack.pop();
			removedVertex.wasVisited=true;
			
			 List<Vertex> adjVertexList = getAdjacentVertexList_MST(removedVertex.index);
			 
			 if(adjVertexList.size()>0){
				 Vertex vertex = adjVertexList.get(0);  // Only the first element is considered not the list
				 vertex.wasVisited=true;
				 stack.push(vertex); // In the stack only one vertex is placed not list
				 System.out.println(removedVertex.label+vertex.label);
			 }
			 
			 
		}
	}
	
	

}
