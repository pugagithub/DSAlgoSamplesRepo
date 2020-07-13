package com.geeksforgeeks.dynamicProgramming;

import java.util.ArrayList;
import java.util.List;

import com.geeksforgeeks.string.Palindrome;

public class LongestPalindromicSubSequence {

	static String word = "BBABCBCAB";
	//static String word = "GEEKSFORGEEKS";
	static String longestPalindrome = "";
	List<String> list = new ArrayList<String>();

	public static void main(String[] args) {

		palindromicSubSequence_Backtracing_Approach("",0);
		System.out.println("Longest Palindrome is : "+ longestPalindrome);
	}


	static void palindromicSubSequence_Backtracing_Approach(String context , int startIdx) {
		
		if(startIdx>word.length()) return;
		
		for(int i=startIdx;i<word.length();i++) {
			
			String temp = context;
			context = context + (word.charAt(i)+"");
			
			if(Palindrome.checkForPalindrome(context,false)) {
				checkAndUpdateLongestPalindrome(context);
			}
			
			palindromicSubSequence_Backtracing_Approach( context ,  i+1);
			context = temp;  //====> only diff with subString and SubSeq
		}
		
		
	}
	
	

static void checkAndUpdateLongestPalindrome(String context) {
	if(Palindrome.checkForPalindrome(context,false)) {
		if(context.length()>longestPalindrome.length())longestPalindrome = context;
		if(context.length()==longestPalindrome.length())System.out.println("Palindromes are  :" + context);
	}
	
}
	
	
	
}
