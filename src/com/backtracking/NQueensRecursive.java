package com.backtracking;

public class NQueensRecursive {
	
	public static void main(String[] args) {
		
		int size=16;
		Queen[] qArr = new Queen[size];
		
			
		if (Nqueen(0, qArr)) {
			System.out.println(true);
			for (Queen q : qArr) {
				System.out.println(q);
			}
			return;
		} else {
			System.out.println(false);
		}
		
	}
	
	private static boolean Nqueen(int row  , Queen[] qArr  ) {
		
		if(row == qArr.length)return true; // Base Condition for the recursive function
		
			for(int j=0;j<qArr.length;j++){
				
				Queen q = new Queen(row,j);
					if(!q.correctPositionFound(qArr)){
						//System.out.println(false);
						continue;
					}else{
						System.out.println( "Correct Position Found : ("+ row+","+j+")");
						qArr[row]=q;
						if( Nqueen(row+1,qArr))return true; // It will come out of the function
						else {
							System.out.println("Cancelling already true Position : ("+ row+","+j+")");
							for(int k=row;k<qArr.length;k++)qArr[k]=null;
							continue; // It will just continue the loop
						}
					}
				
				
			}
			return false;
			
	}

	static class Queen{
		int x;
		int y;
		
		Queen(int x , int y){
			this.x=x;
			this.y=y;
			
		}
		
		boolean correctPositionFound(Queen[] qArr){
			for(Queen q : qArr ){
			if(q==null)return true;
			if(this.x==q.x)return false;
			if(this.y==q.y)return false;
			if((this.x-this.y)==(q.x-q.y))return false;
			if((this.x+this.y)==(q.x+q.y))return false;
			}
			return true;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return this.x+" "+this.y;
		}
	}

}
