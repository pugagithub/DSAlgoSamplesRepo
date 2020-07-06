package july2020;

public class QuickSort {

	

	public static void main(String[] args) {
		
		 int[] arr = { 2, 6 , 57, 90, 20, 10, 30, 1 , 5 ,9 };
		
		System.out.print("Data Before ---->");
		for(int data : arr)System.out.print(""+data+",");
		quickSort(arr,0,arr.length-1);
		System.out.print("\nData After ---->");
		for(int data : arr)System.out.print(""+data+",");

	}

	/*static int partition() {

		int leftPtr = 0;
		int rightPtr = arr.length-1;

		int leftIndex = 0;
		int rightIndex = arr.length-1; //If we dont put -1 we will get OutOfBoundsException as arr is starting with 0 but length is starting from 1.

		// If i crosses the j then datas less than the pivot value are in the
		// left side and
		// datas in the right side are more than pivot value
		while (leftPtr < rightPtr) {
			int pivotVal = arr[rightIndex];

			// Scan from left till the data is more than the pivot and stop
			// there. Now leftPtr points to the data
			// which is more than the pivotVal
			while (arr[leftPtr] < pivotVal) {
				leftPtr++;
			}

			while (arr[rightPtr] > pivotVal) {
				rightPtr--;
			}

			// Need to check the condition again bcoz leftPtr and rightPtr is
			// increased inside the while loop
			if (leftPtr < rightPtr) {
				swap(arr, leftPtr, rightPtr);
				leftPtr++;
				rightPtr++;
			}
		}
		
		swap(arr, leftPtr, rightIndex); //After all the swaps putting the pivot at its position by swapping with currentLeftPtr and last element.
		return leftPtr;
	}*/
	
	static int partitionForRecursiveVersion(int[] arr , int leftIndex , int rightIndex) {
		
		

		int leftPtr = leftIndex;
		int pivotVal = arr[rightIndex];
		int rightPtr = rightIndex-1;

	//	int leftIndex = left;
	//	int rightIndex = right; //If we dont put -1 we will get OutOfBoundsException for first iteration as arr is starting with 0 but length is starting from 1.
		
		// If i crosses the j then datas less than the pivot value are in the
		// left side and
		// datas in the right side are more than pivot value
		while (leftPtr <= rightPtr) {
		

			// Scan from left till the data is more than the pivot and stop
			// there. Now leftPtr points to the data
			// which is more than the pivotVal
			while (leftPtr < rightPtr &&  arr[leftPtr] < pivotVal) {
				leftPtr++;
			}

			while (rightPtr > leftPtr && arr[rightPtr] > pivotVal) {
				rightPtr--;
			}

			// Need to check the condition again bcoz leftPtr and rightPtr is
			// increased inside the while loop
			if (leftPtr < rightPtr) {
				swap(arr, leftPtr, rightPtr);
				leftPtr++;
				rightPtr--;
			}
		}
		
		swap(arr, leftPtr, rightIndex); //After all the swaps putting the pivot at its position by swapping with currentLeftPtr and last element.
		return leftPtr;
	}

	private static void swap(int[] arr, int leftPtr, int rightPtr) {
		System.out.println("\nArray Before Swapping");
		for(int data : arr)System.out.print(""+data+",");
		System.out.println("\nPointers inside the swap function ---> "+ leftPtr +"--->"+ rightPtr);
		System.out.println("\nSwapping values --------------------->"+ arr[leftPtr] +"," + arr[rightPtr]);
		
		int tmp = arr[leftPtr];
		arr[leftPtr] = arr[rightPtr];
		arr[rightPtr] = tmp;
		
		
		System.out.println("Array After Swapping");
		for(int data : arr)System.out.print(""+data+",");
	}
	static int recCount = 0;

	public static void quickSort(int[] arr, int left, int right){ 
		// We are passing the arguments bcoz we want the range to be halved after recursive calls (since array passed is constant we cant deduce from original 
		//array)
		if(left<right){
		System.out.println("\nAM INSIDE RECURSIVE CALLS --->"+ ++recCount +"--------> Left ----->"+ left +" ---> right --->"+ right);
		int pivot = partitionForRecursiveVersion(arr, left,right); // all the function inside also should get the lesser range for each recursive call
		System.out.println("\nPivot Loc --->"+ pivot);
		if(pivot>1)quickSort(arr,left,pivot-1);
		if(pivot>1)quickSort(arr, pivot, right);
		}
		
	}

}
