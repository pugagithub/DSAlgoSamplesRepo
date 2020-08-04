package com.ApplicationProblems;

public class LeftRightRotation {
	
	
	//Deque
	//Circular Queue
	
	public static void main(String[] args) {
		
		String str = "abcdefg";
		CircularQueue circQ = new CircularQueue(str);
		circQ.rotate(RotationDirection.left , 2);
		circQ.rotate(RotationDirection.right ,8 );
		circQ.printQ();
	}
	
	
	//cdefgab

}

enum RotationDirection {
	
	left,
	right;
	
}

class CircularQueue {
	
	int size ;
	String[] arr;
	int frontPointer = 0;
	int rearPointer = -1;
	
	CircularQueue(String s){
		this.size = s.length() + 1;
		arr = new String[size];
		
		for(int i=0;i<this.size - 1;i++) {
			insertInRear(s.charAt(i)+"");
		}
	}
	
	
	
	 void insertInRear(String c){
		 System.out.println("rearPointer : "+ rearPointer);
		 System.out.println("size : "+ size);
		if(rearPointer == size -1 ) rearPointer = -1;
		arr[++rearPointer] = c;
	}
	
	 String removeFromFront(){
		if(frontPointer == size ) frontPointer = 0;
		String s =  arr[frontPointer];
		 arr[frontPointer] = "-1";
		 frontPointer++;
		 return s;
	}
	 
	 String removeFromRear() {
		 
		 //return arr[rearPointer++];
		 String s =  arr[rearPointer];
		 arr[rearPointer] = "-1";
		
		 rearPointer--;
		 if(rearPointer == -1) rearPointer = size-1;
		 return s;
	 }
	 
	 void insertInFront(String c){
		 	if(frontPointer == 0 ) frontPointer = size;
			arr[--frontPointer] = c;
			
		}
	 
	 void printQ(){
		
		 int temp = size-1-1;
		 while(temp>=0){
			 System.out.print(removeFromFront());
			 temp--;
		 }
		 System.out.println("");
	}
	 
	 void rotate(RotationDirection direction , int count ){
			
			for(int i=0;i<count;i++) {
				if(direction == RotationDirection.left) {
					insertInRear(removeFromFront());
				}
				else {
					
					insertInFront(removeFromRear());
					
				}
			}
		}

	
}

