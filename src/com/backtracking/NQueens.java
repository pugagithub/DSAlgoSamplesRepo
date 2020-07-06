package com.backtracking;

public class NQueens {
	
	static int size=4;
	static int[][] a = new int[size][size];
	
	static Queen[] qArr = new Queen[size];
	
	
	static class Queen{
		
		int i;
		int j;
		
		Queen(int i, int j){
			this.i=i;
			this.j=j;
		}
		
		@Override
		public String toString() {
			return i+","+j;
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		nqueens(0);
	}

	/**
	 * 
	 * As of now this program output is wrong you can take this for understanding purpose only
	 * @param n
	 * @return
	 */

	private static boolean nqueens(int n) {

		int m=0;
		
		
		for (int i = 0; i < size && m<size; i++) {
			
			
			
			if(i==0){
				qArr[i] = new NQueens.Queen(i, m); // Her row:i ; col:m. 
				continue; // If it is first row , no need to check the prev rows.
			}
			
			int j = 0;
			while (j < size) {
				if (!correctPositionFound(i,j,qArr)) {
					j++;
				} else {
					qArr[i] = new NQueens.Queen(i, j); // If correct position found , u can break to the for loop for next row
					break;
				}
			}
			
			
			if(j==size){
				i=i-1;  // Again start from the first row as correctPositionFound not found and j becomes more than size. 
				m++;  //I think m is concerned with the first row only . It denotes where the queen should be placed in the first row. Upto size only
				for(int k=i;k<qArr.length;k++)qArr[k]=null;
			}

		}

		for(Queen q1:qArr)System.out.println(q1);
		return false;
		
	}


	private static boolean correctPositionFound(int i , int j, Queen[] qArr) {
		// TODO Auto-generated method stub
		for(Queen q1 : qArr){
			
			if(q1 == null) return true;  // If the queue is not populated bcoz it is 4th row queen but am still at first row only.
			
			if(q1.i==i || q1.j==j){
				return false;
			}
			if(q1.i-q1.j == i-j){
				return false;
			}
			
			if(q1.i+q1.j==i+j){
				return false;
			}
		}
		return true;
		
	}

}
