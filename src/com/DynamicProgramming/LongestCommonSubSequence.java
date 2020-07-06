package com.DynamicProgramming;

public class LongestCommonSubSequence {
	
	/**
	 * 
	 * What is Longest Common Sub Sequence
	 * 
	 * Please see the Longest Common Sub Sequence Picture
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		String str1 = "ABCDHJIKL";
        String str2 = "ABCIJKD";
        
      
		
		str1 = "R"+str1;  // ========> so str1 becomes RABCD
		str2 = "C"+str2 ; // ========> so str2 becomes CAZD
		
		  int m = str1.length(); 
			int n = str2.length();
        
        int[][]  arr = lcs(str1.toCharArray(),str2.toCharArray());
       
        
        //========Output Section=====================
        System.out.print("V    ");
        for(int j=0;j<str2.length();j++){
			System.out.print(str2.charAt(j)+"  ");
		}
        System.out.println("    ");
        for(int j=0;j<=str2.length()+1;j++){System.out.print("-- ");}
    	for(int i=0;i<m;i++){
    		System.out.println();
			for(int j=0;j<n;j++){
				if(j==0) System.out.print(str1.charAt(i)+" |  ");
				System.out.print(arr[i][j]+"  ");
			}
    	}
		
	}

	private static int[][]  lcs(char[] str1, char[] str2) {
		
		int m = str1.length; 
		int n = str2.length;
		
		int[][] arr = new int[m][n];
		
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(i==0 || j==0)arr[i][j]=0;
				else{
					
					if(str1[i]==str2[j]){  // If row char is equal to col char
						arr[i][j]= 1 + arr[i-1][j-1];
					}
					
					else{
						arr[i][j] = Math.max(arr[i][j-1], arr[i-1][j]);
					}
					
				}
			}
		}
		
		return arr;
	}

}
