package com.sorting.mergersort;

public class NormalSortingThroughMerge {
	
	
	//static int[] mainArr = { 36, 20, 23, 60, 95, 17, 12, 94 };
	
	static int[] mainArr = { 64 , 21 , 33 , 70,12, 85, 44, 03 };
	
	public static void main(String[] args) {
		
		
		
		mergeSort(0,mainArr.length-1);
		System.out.print("Main Array : "); 
		display(mainArr);
	}

	private static void mergeSort(int startPos , int endPos ) {
		
		if(startPos==endPos){
			System.out.println("Start Position : "+startPos+" == End Position : "+endPos+". Hence Returning " );
			System.out.println("=======================================================================");
			return;
		}
		
		System.out.println("Start Pos :"+ startPos);
		System.out.println("End Pos :"+ endPos);
		int mid = (startPos+endPos)/2;
		System.out.println("Mid Pos :"+ mid);
		
		System.out.println("============================Chumma===========================================");
		
		
		
		mergeSort(startPos,mid);
		mergeSort(mid+1,endPos);
		merge(new int[8],startPos,endPos);
		
		System.out.println("=======================End================================================");
		
	}
	
	
private static void merge(int[] tmpArr,int low,int high) {
	
	System.out.println("Am in Merge");
	
	System.out.println("low in merge "+ low);
	System.out.println("high in merge "+ high);	
		
		
		int mid = (low+high)/2;
		System.out.println("mid in merge "+ mid);
		
		int i=low;
		int j=mid+1; // j is from mid to high very important , if we dont put +1 , first array also includes mid , second array also includes mid , hence it starts from mid+1.
		int k=0;
		
		int aSize=mid;  // low to mid
		int bSize=high; //mid to high
		
		
		System.out.println("aSize in merge "+ aSize);
		System.out.println("bSize in merge "+ bSize);	
		
		while(i<=aSize && j<=bSize){
			
			System.out.println("Am inside while");
			
			if(mainArr[i]<mainArr[j]){
				System.out.println("Transferring Data From Left i : "+i+" j :"+j+": "+ mainArr[i] +" : "+ mainArr[j]);
				tmpArr[k++]=mainArr[i++];
			}
			else{
				System.out.println("Transferring Data From Right i : "+i+" j :"+j+": "+ mainArr[i] +" : "+ mainArr[j]);
				tmpArr[k++]=mainArr[j++];
			}
		}
		
			while(i<=aSize){
				System.out.println("Transferring extra Data From Left");
				tmpArr[k++]=mainArr[i++];
			}
		
			while(j<=bSize){
				System.out.println("Transferring extra Data From Right");
				tmpArr[k++]=mainArr[j++];
			}
		
			/**
			 * Transferring data back to the main array
			 */
		for(int m= 0 ;m<(high-low+1);m++){
			mainArr[low+m]=tmpArr[m];
		}
		display(tmpArr);
		System.out.println();
		display(mainArr);
		System.out.println();
	}
	
public static void display(int[] a){
	
	for(int i : a){
		System.out.print(i+",");
	}
}

}
