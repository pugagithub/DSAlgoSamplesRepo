package com.graph;

import com.queue.Queue;
import com.queue.QueueGenerics;
import com.queue.QueueMainClass;
import com.util.MyUtil;

import javafx.scene.shape.VLineTo;

public class Graph {
	
	
	Vertex[] vList = new Vertex[10];
	int[][] adjacentMatrix = new int[vList.length][vList.length];
	
	int count=0;
	
	
	public Graph() {
		
	}
	
	void insertVertex(String label, int idx){
		vList[idx] = new Vertex(label,idx);
		count++;
	}
	
	void addEdge(int srcVertex , int targetVertex){
		adjacentMatrix[srcVertex][targetVertex]=1;
		adjacentMatrix[targetVertex][srcVertex]=1;
	}
	
	 void bfs(){
		
		QueueGenerics<Vertex> queue = new QueueGenerics(Vertex.class);
		queue.insert(vList[0]);
		vList[0].isVisited=true;
		System.out.println(queue.peek().lable);
		
		while(!queue.isEmpty()) {
		Vertex v = queue.peek();
		
		int adjVertexIdx = getAdjacentVertex(v.idx);
		
		if(adjVertexIdx!=-1) {
			queue.insert(vList[adjVertexIdx]);
			System.out.println(vList[adjVertexIdx].lable);
		}
		else queue.remove();
		}
		
	}
	
	private int getAdjacentVertex(int idx) {
	for(int i=0;i<count;i++) {
		if( (adjacentMatrix[idx][i] == 1) && (!vList[i].isVisited)) {vList[i].isVisited = true; return i;}
	}
	return -1;
	}

	void dfs() {
		
		
		
	}
	
	public static void main(String[] args) {
		
		Graph graph = new Graph();
		graph.insertVertex("A", 0);
		graph.insertVertex("B", 1);
		graph.insertVertex("C", 2);
		graph.insertVertex("D", 3);
		graph.insertVertex("E", 4);
		graph.insertVertex("F", 5);
		graph.insertVertex("G", 6);
		graph.insertVertex("H", 7);
		graph.insertVertex("I", 8);
		
		graph.addEdge(0, 1);
		graph.addEdge(0, 4);
		graph.addEdge(0, 6);
		graph.addEdge(1, 2);
		graph.addEdge(2, 3);
		graph.addEdge(4, 5);
		
		graph.addEdge(6, 7);
		graph.addEdge(7,8);
		
		for(int i=0;i<graph.count;i++) {
			System.out.println(graph.vList[i].lable);
		}
		
		for(int i=0;i<graph.count;i++) {
			System.out.println("");
			for(int j=0;j<graph.count;j++) {
				System.out.print(graph.adjacentMatrix[i][j]+" ");
			}
		}
		
		System.out.println("\n==============DFS Started==================");
		graph.bfs();
		
		
	}

}

class Vertex {
	
	boolean isVisited = false;
	
	public Vertex(String lable, int idx) {
		super();
		this.lable = lable;
		this.idx = idx;
	}
	String lable;
	int idx;
}
