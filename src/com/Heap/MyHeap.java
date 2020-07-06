package com.Heap;

import com.util.MyUtil;

public class MyHeap extends MyUtil {

	Node[] nodeArr;
	int maxSize;
	int actualSize;
	
	/**
	 * To find Parent of ith Node     P =  (i-1)/2
	 * To find Left Child of ith Node : 2*i+1 
	 * To find Right Child of ith Node : 2*i+2
	 * 
	 */
	
	public static void main(String[] args) {
		MyHeap myHeap = new MyHeap(10);
		myHeap.insert(10);
		myHeap.insert(20);
		myHeap.insert(30);
		myHeap.insert(40);
		myHeap.insert(50);
		myHeap.insert(60);
		myHeap.insert(70);
		myHeap.insert(80);
		myHeap.insert(90);
		myHeap.insert(100);
		displayArray(myHeap.nodeArr);
		System.out.println();
		myHeap.remove();
		/*myHeap.remove();
		myHeap.remove();*/
		displayArray(myHeap.nodeArr);
	}
	
	public void insert(int inKey){
		
		Node newNode = new Node(inKey);
		if(actualSize==0){             // For First Element no need for TrickleUp operations
			nodeArr[actualSize] = newNode;
			actualSize++;
		}
		else{
			nodeArr[actualSize] = newNode;  //Insert at last position
			trickleUp(actualSize++);  // Trickle upto the correct postion so that the parent is always greater than childrens
		}
		
		
		
			
		
		
	}
	
	public MyHeap(int maxSize){
		nodeArr = new Node[maxSize];
		actualSize = 0;
		
	}
	
	public Node remove(){
		Node firstNode = nodeArr[0];
		trickleDown(--actualSize);
		return firstNode;
	}
	
	
	
	/**
	 * For Insertion
	 */
	public void trickleUp(int index){
		
		int parent = (index-1)/2;           // Called index will be the last element in the array which is added newly.
		Node tmpNewNode = nodeArr[index];   // Store the new node to some temp Var
		
		
		while(index > 0){                   //when index is zero its parent obviosuly will also be zero hence no need to swap between same nodes
			
			if(nodeArr[parent].key < tmpNewNode.key ){  // Check whether parent node is less than newly inserted node  
				
				nodeArr[index] = nodeArr[parent];   //if it is , then copy parent node to current index. index will change for each iteration
				index = parent;                     // Now parent becomes index. Goion Up.
				parent = (parent -1 )/2;            // Now parent becomes previous parent's(current index) parent
				
			}
			else break;                             //If not parent is not less than new node , insertion has been reached hence break from it.
			
		}
		nodeArr[index] = tmpNewNode;
	}
	
	/**
	 * For Removal of Max Item at root location
	 */
	public void trickleDown(int size){
		
		nodeArr[0] = nodeArr[size];
		nodeArr[size] = null;
		Node tmpNode = nodeArr[0] ;  // copying the first node to the tmp variable
		
		int idx = 0;  // idx is the parent
		
		while(idx<actualSize/2){ //This step is very important. Upto N/2 nodes only the nodes will have children , others are just leaf nodes only.
			displayArray(nodeArr);
			System.out.println("-------------------------------------------------------------------------------------------");
			int leftChildIdx = 2*idx+1;
			int rightChildIdx = 2*idx+2;
			
			int largerChildIdx = (nodeArr[leftChildIdx].key > nodeArr[rightChildIdx].key)? leftChildIdx : rightChildIdx ; //Whether left or right is the largest child
			
			if(tmpNode.key < nodeArr[largerChildIdx].key ){ // If parent is less than the largest child
				nodeArr[idx]=nodeArr[largerChildIdx];       // Copying the largest child to the parent , child dont gets affected here
				idx=largerChildIdx;    // current index moves to the child idx
				
			}
			else break;  // If parent node is greater u can break , as it is alreay in correct position.
			
		}
		
		nodeArr[idx]=tmpNode;  // idx points to the current position
		
	}
	
}


class Node {
	
	int key;
	
	Node(int key){
		this.key=key;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return key+"";
	}
}
