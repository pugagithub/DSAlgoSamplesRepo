package july2020;

public class MergeSortJuly2020 {
	
	
	public static void main(String[] args) {
		
		int[] arr1 = {10,30,50,70,90};
		int[] arr2 = {20,40,60,80,100};
		int[] arr3 = new int[arr1.length+arr2.length];
		
		int[] arr4 = {70,90,20,40,10,30,150,1,60,80,100,50};
		
		normalMerge(arr1,arr2,arr3);
		
		MyUtil.displayArray(arr3);
		
		System.out.println("\n");
		mergeSort(arr4,0,arr4.length-1);
		MyUtil.displayArray(arr4);
		
	}
	
	static void mergeSort(int[] arr, int low , int high){
		
		if(low==high) return;
		int mid = (low + high) / 2;
		
		mergeSort(arr,low, mid);
		mergeSort(arr,mid+1,high);
		mergeForMergeSort(arr,low,high);
		
		
		
		
	}
	
	static public void normalMerge(int[] arr1 , int[] arr2 , int[] arr3){
		
		int i=0,j=0,k=0;
		
		while(i<arr1.length && j<arr2.length) {
			arr3[k++] = (arr1[i]<arr2[j])?arr1[i++]:arr2[j++];
		}
		if(i<arr1.length)for(;i<arr1.length;i++)arr3[k++]=arr1[i++];
		else if(j<arr2.length)for(;j<arr2.length;j++)arr3[k++]=arr2[j++];
		
	
		
	}
	
static public void mergeForMergeSort(int[] arr , int low , int high){
		
		int mid = (low + high)/2;
		int i=low,j=mid+1,k=0;
		
		
		int[] arrTemp = new int[high-low+1];
		
		while(i<=mid && j<=high) {
			arrTemp[k++] = (arr[i]<arr[j])?arr[i++]:arr[j++];
		}
		while(i<=mid)arrTemp[k++]=arr[i++];
		while(j<=high)arrTemp[k++]=arr[j++];
		
	   for(int m=0;m<arrTemp.length;m++) {
		   arr[low++]= arrTemp[m];  //Transferring temp array to normal arr.
	   }
		
	}


}
