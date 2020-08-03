package july2020;

public class InsertionSortJuly2020 {
	
	//80 10 15 8 3 25 45 62 70
	static void insertionSort(int[] arr){
		
		for(int i=1;i<arr.length;i++) {
			int j =i-1;
			int temp = arr[i];
			while(j>=0) {
				if(arr[j] > temp) {
					arr[j+1] = arr[j];
					j--;
				}
				else break;
			}
			arr[j+1] = temp;  // ====> as arr[j] is less than temp
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {80, 10 , 15 , 8 , 3 , 25 , 45,  62,  70};
		insertionSort(arr);
		MyUtil.displayArray(arr);
	}

}
