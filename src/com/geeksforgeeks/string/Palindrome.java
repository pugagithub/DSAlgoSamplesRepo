package com.geeksforgeeks.string;

/**
 *  A palindrome number is a number that is same after reverse.
 *
 */
public class Palindrome {
	
	public static void main(String[] args) {
		
		String word = "geekskeeg";
		checkForPalindrome(word, true);
	}
	
	public static boolean checkForPalindrome(String word , boolean printPalindrome ){
		
		
		int startIdx =0 ;
		int endIdx = word.length()-1;
		boolean isPalindrme = true;
		while(startIdx<=endIdx) {
			if(word.charAt(startIdx++) == word.charAt(endIdx--)) continue;
			else {isPalindrme = false; break;}
		}
		
		if(isPalindrme) {
			if(printPalindrome)System.out.println("Word is Palindrome : "+ word);
			return true;
		}
		else {
			if(printPalindrome)System.out.println("Word is not Palindrome : "+ word);
			return false;
		}
		
		
	}
	
	/**
	 * for (int i = 0 , j= word.length()-1 ; i<=j; i++,j--) {
			
			if(Palindrome.checkForPalindrome(word, i, j)) {
				
				System.out.println(word.substring(i,j+1));
				if((j-i) >= longestPalindromeSize ){
					longestPalindromeSize = j-i +1 ;
				}
				
			}
	 * 
	 */

}
