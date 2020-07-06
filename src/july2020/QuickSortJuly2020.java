package july2020;

public class QuickSortJuly2020 {
	
	public static void main(String[] args) {
		//int[] arr = {70,90,20,40,10,30,150,1,60,80,100,50};
		int[] arr = {70,90,20,40,30};
		quickSort(arr,0,arr.length-1);
		System.out.println("\n ------------");
		MyUtil.displayArray(arr);
	}
	
	static void quickSort(int[] arr ,int low ,int high) {
		if(low > high)return;
		int pivot = PartitionJuly2020.partition(arr, low , high);
		System.out.println("\n");
		MyUtil.displayArray(arr);
		
		quickSort(arr, low, pivot-1);
		quickSort(arr, pivot+1, high );
	}

}
