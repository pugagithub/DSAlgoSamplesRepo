package july2020;

public class SelectionSort {
	
	static int[] a = {20 , 36 , 23 , 60 , 95 , 12 , 17 , 94};

	public static void main(String[] args) {
		
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){		// j=(i+1) --> Start from the next element of i		
				if(a[j]<a[i]){					// if the right element is less than the a[i] swap it
					int tmp = a[i];
					a[i]= a[j];
					a[j]=tmp;					
				}			
			}
		}
		
		
		
		for(int i : a){
			System.out.print(i+",");
		}
	}
	
	public static void swap(int i , int minIndex){
		
		int tmp = a[i];
		a[i]= a[minIndex];
		a[minIndex]=tmp;
		
		
	}

}
