package com.geeksforgeeks.dynamicProgramming.recursiveAndBacktrackingApproach;

import com.geeksforgeeks.string.Palindrome;
import com.geeksforgeeks.string.PalindromeRecursive;

//Substring is continuous
//Subsequence can have elems in between
public class LongestPalindromicSubString_Recursive {

	static String word = "xyabbamnop" ;
	//static String word = "abxyba";

	static String longestPalindrome = "";
	
	public static void main(String[] args) {
		
		//palindromicSubString_Iterative(word);
		
		for(int i=0;i<word.length();i++)palindromicSubString_Backtracing_Approach("",i);
		System.out.println("Longest Palindrome is : "+ longestPalindrome);
	}

	static void palindromicSubString_Iterative(String word) {


		for (int i = 0; i < word.length(); i++) {

			String startChar = word.charAt(i) + "";
			for (int j = word.length()-1; j >i; j--) {

				if (startChar.equals(word.charAt(j)+"")) {

					
					if (Palindrome.checkForPalindrome(word.substring(i,j+1),false)) {
						if (j - i >= longestPalindrome.length()) {
							longestPalindrome = word.substring(i, j + 1);
						}
						//i= j+1;
					}
					else continue;

				}
				

			}

		}

	}

static void palindromicSubString_Backtracing_Approach(String context , int startIdx) {
		
		if(startIdx>=word.length()) return;
		
		//for(int i=startIdx;i<word.length();i++) {
			
			String temp = context;
			context = context + (word.charAt(startIdx)+"");
			
			if(Palindrome.checkForPalindrome(context,false)) {
				checkAndUpdateLongestPalindrome(context);
			}
			
			palindromicSubString_Backtracing_Approach( context ,  startIdx+1);
			context = temp; 
		//}
		
		
	}

static void checkAndUpdateLongestPalindrome(String context) {
	if(Palindrome.checkForPalindrome(context,false)) {
		if(context.length()>longestPalindrome.length())longestPalindrome = context;
		if(context.length()==longestPalindrome.length())System.out.println("Palindromes are  :" + context);
	}
	
}


}
