package com.geeksforgeeks.dynamicProgramming;

import com.geeksforgeeks.string.Palindrome;

//Substring is continuous
//Subsequence can have elems in between
public class LongestPalindromicSubString_Recursive {

	static String word1 = "forgeeksskeegfor" ;
	static String word = "Geeks";

	static String longestPalindrome = "";
	
	public static void main(String[] args) {
		
		palindromicSubString(word);
		System.out.println(longestPalindrome);
	}

	static void palindromicSubString(String word) {

		for (int i = 0; i < word.length(); i++) {

			String startChar = word.charAt(i) + "";
			for (int j = word.length()-1; j >i; j--) {

				if (startChar.equals(word.charAt(j)+"")) {

					int m = i ;
					int n = j ;

					if (Palindrome.checkForPalindrome(word, m, n)) {
						if (n - m >= longestPalindrome.length()) {
							longestPalindrome = word.substring(i, j + 1);
						}
						i= j+1;
					}
					else break;

				}
				

			}

		}

	}

}
