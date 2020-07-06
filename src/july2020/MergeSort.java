package july2020;

public class MergeSort {
	
	static int[] a = {20 , 36 , 23 , 60 , 2, 7, 95 , 17 , 12, 94 };
	
	public static void main(String[] args) {
		
		
	}
	
	public static void merge(int sizeA  , int sizeB){
		
		//A ---> Array
		//B ---> Array
		//C ---> Resultant Array
		
		//while (Aptr<sizeA && BPtr< sizeB ){
		/*if(A[counter]<B[counter]){
			C[countC++]=A[counterA++]
		}
		else c[counter++]=B[counter];*/
		//}
		
		//if(A is not finished )copy all the remaining contents from A to C
		//if(B is not finished) copy all the remaining contents from B to C
		
		
	}


static void mergeRec(int low , int mid , int high){
	
	//sizeA --> (mid-low)
	//sizeB(high-mid)
	
	
	
}

  static void mergeSort(int low , int high){
	  
	  if(low == high) return;
	  int mid = (low+ high)/2;
	  
	  mergeSort(low , mid);
	  mergeSort(mid+1, high);
	  mergeRec(low , mid , high);
	
  }
}
