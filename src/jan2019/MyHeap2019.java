package jan2019;

import com.util.MyUtil;

public class MyHeap2019 {
	
	int max = 10;
	int[] arr = new int[max];
	
	int actualSize = 0;
	
	
	void insert(int data){
		
		arr[actualSize] = data ;
		trickleUp(actualSize);
		actualSize = actualSize + 1;
		
		
		
	}
	
	int remove(){
		
		int maxValTobeReturned =  arr[0];
		trickleDown(actualSize);
		actualSize = actualSize -1 ;
		return maxValTobeReturned;
	}
	
	
	void trickleUp(int currentIndex){
		
		while (currentIndex > 0) {
			int parentIdx = (currentIndex - 1) / 2;
			if (arr[parentIdx] < arr[currentIndex]) {
				this.swap(currentIndex, parentIdx);
				currentIndex = parentIdx;
				

			}
			else{
				return;
			}
		}
		
		
	}
	
	
	void trickleDown(int lastIndex){
		
		//Make last elem as first elem
		
		arr[0] = arr[lastIndex];
		
		int currentIdx = 0;
		
		while(currentIdx < (actualSize/2)){
			
			int leftChild = arr[ 2 * currentIdx + 1];
			int rightChild = arr[ 2 * currentIdx + 2 ];
			
			int highestChildIdx = leftChild > rightChild ? 2 * currentIdx + 1 : 2 * currentIdx + 2;
			
			if(arr[currentIdx] < arr[highestChildIdx]){
				swap(currentIdx , highestChildIdx);
				currentIdx = highestChildIdx;
				
			}
			
			else{
				return;
			}
			
			
			
		}
		
		
	}
	
	
	void swap(int currentIdx , int parentIdx){
		
		int tmp = arr[currentIdx];
		arr[currentIdx] = arr[parentIdx];
		arr[parentIdx] = tmp;
	}
	
	public static void main(String[] args) {
		
		MyHeap2019 heap = new MyHeap2019();
		
		heap.insert(10);
		heap.insert(6);
		heap.insert(7);
		heap.insert(20);
		heap.insert(9);
		heap.insert(3);
		
		for(int i=0;i<6;i++)System.out.print(heap.remove()+" , ");
		
		
		
		
	}

}
