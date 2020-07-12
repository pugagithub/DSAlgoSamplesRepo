package com.geeksforgeeks.string;

/**
 *  A palindrome number is a number that is same after reverse.
 *
 */
public class Palindrome {
	
	public static void main(String[] args) {
		
		String word = "abba";
		checkForPalindrome(word,0,word.length()-1);
	}
	
	public static boolean checkForPalindrome(String word , int startIdx , int endIdx){
		
		boolean isPalindrme = true;
		while(startIdx<=endIdx) {
			if(word.charAt(startIdx++) == word.charAt(endIdx--)) continue;
			else {isPalindrme = false; break;}
		}
		
		if(isPalindrme) {
			System.out.println("Word is Palindrome");
			return true;
		}
		else {
			System.out.println("Word is not Palindrome");
			return false;
		}
		
		
	}

}
