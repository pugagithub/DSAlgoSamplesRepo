package com.geeksforgeeks.string;

public class PalindromeRecursive {
	static String word = "geekskeeg";
	public static void main(String[] args) {
	
		System.out.println(checkForpalindrome(0, word.length()-1));
		
	}
	
	public static boolean checkForpalindrome(int startIdx , int endIdx){
		
		if(startIdx >= endIdx)return true;
		if((word.charAt(startIdx)+"").equals(word.charAt(endIdx)+"")) {
			
			return checkForpalindrome(startIdx + 1 , endIdx - 1);
				
			
		}
		else return false;
		
		
	}

}
