package com.geeksforgeeks.dynamicProgramming.recursiveAndBacktrackingApproach;

public class LongestCommonSubstrring {
	
	static String str1 = "tutorialhorizon";
	static String str2 = "dynamictutorialProgramming";
	
	static int maxCount = 0;
	public static void main(String[] args) {
	
		longestCommonSubString(str1,str2);
		
		
		System.out.println(" Max LCS : "+ maxCount);
		
	}
	
	static void longestCommonSubString(String str1 , String str2){
		
		for(int i=0;i<str1.length();i++) {
			
			for(int j=0;j<str2.length();j++) {
				
				if (str1.charAt(i) == str2.charAt(j)){
					int count = 1; // Already first characters are checked
					int m = i + 1;
					int n = j + 1;
					while(m < str1.length() && n < str2.length() && str1.charAt(m) == str2.charAt(n)) {
						m++;
						n++;
						count++;
						
					}
					if(count >= maxCount) {
						maxCount = count;
						System.out.println("Max Length Word : "+ str1.substring(i , i+count));
					}
				}
				
				
			}
				
		}
		
		
	}

}
