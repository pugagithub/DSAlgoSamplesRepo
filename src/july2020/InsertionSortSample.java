package july2020;

public class InsertionSortSample {
	
	static int[] a = {20 , 36 , 23 , 60 , 2, 7, 95 , 17 , 12, 94 };

	public static void main(String[] args) {

		
		for(int i=1;i<(a.length-1);i++){  // Mark start from a[1]
			
			int tmp = a[i];               // Marked value is set to the tmp
			int currentMark = i;          //Marked index is the starting index
		
			// Since Marked index is going to be decreased check for index>0 && 
			//the (first left of marked) is > marked(tmp)
			while(currentMark>0 && a[currentMark-1]>tmp){   
				
				a[currentMark]=a[currentMark-1]; // if left is greater then move it right by copying marked-1 to marked
				currentMark--;                   //current counter is decreased
			}
			a[currentMark]=tmp;
		
	}
		
		MyUtil.displayArray(a);
	}

}
