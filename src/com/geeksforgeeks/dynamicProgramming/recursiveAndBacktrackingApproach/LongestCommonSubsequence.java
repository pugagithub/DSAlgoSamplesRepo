package com.geeksforgeeks.dynamicProgramming.recursiveAndBacktrackingApproach;

public class LongestCommonSubsequence {
	
	static String str1 = "ABCDGH";
	static String str2 = "AEDFHR";
	static int maxSubSeq = 0;
	
	public static void main(String[] args) {
		
		longestCommonSubSeq();
		System.out.println("Max Sub Seq : "+ maxSubSeq);
		
	}
	
	static void longestCommonSubSeq(){
		
		for (int m = 0; m < str1.length(); m++) {

			int tempJ = 0;
			int count = 0;
			String tempSubSeq = "";
			for (int i = m; i < str1.length(); i++) {

				for (int j = tempJ; j < str2.length(); j++) {

					if (str1.charAt(i) == str2.charAt(j)) {

						tempJ = j + 1;
						count++;
						tempSubSeq = tempSubSeq + str1.charAt(i);
					}
				}
			}
			
			if(count > maxSubSeq) {
				
				System.out.println(" Temp Sub Seq : " + tempSubSeq);
				maxSubSeq = count ;
				
			}

		}
		
		
	}

	
	
}

