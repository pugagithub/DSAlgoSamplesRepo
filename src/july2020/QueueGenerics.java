package july2020;

import java.lang.reflect.Array;

public class QueueGenerics<T> {
	T[]  arr;
	
	public QueueGenerics(Class<T> clazz){
		arr = (T[])Array.newInstance(clazz, 1000);
	}
		
		int elemCount=0;
		
		
		
		int front = 0;   // Remove From Front , Front is always 0
		
		int rear =-1;  // Insert From Back . Insert From i=len-1
		
		public void insert(T data) {  // INSERT AT BACK
			
			arr[++rear]=data;
			elemCount++;
		}
		
		public T remove(){  // REMOVE FROM FRONT
			elemCount--;
			return arr[front++];
			
		}
		
		public T peek(){  // REMOVE FROM FRONT
			return arr[front];
			
		}
		
		public boolean isEmpty() {
			return rear==-1? true : false;
		}
		
		
		


}
