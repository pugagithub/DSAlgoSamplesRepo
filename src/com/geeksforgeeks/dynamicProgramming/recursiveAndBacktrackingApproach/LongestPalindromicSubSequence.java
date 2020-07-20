package com.geeksforgeeks.dynamicProgramming.recursiveAndBacktrackingApproach;

import java.util.ArrayList;
import java.util.List;

import com.geeksforgeeks.string.Palindrome;

public class LongestPalindromicSubSequence {

	static String word = "AMMAX";
	//static String word = "GEEKSFORGEEKS";
	static String longestPalindrome = "";
	List<String> list = new ArrayList<String>();

	public static void main(String[] args) {

		palindromicSubSequence_Backtracing_Approach("",0);
		System.out.println("Longest Palindrome is : "+ longestPalindrome);
	}


	static void palindromicSubSequence_Backtracing_Approach(String context , int startIdx) {
		if(startIdx>=word.length()) {
			System.out.println("i :"+ startIdx+ " hence returning");
			return;
		}
		for(int i=startIdx;i<word.length();i++) {
			String temp = context;
			context = context + (word.charAt(i)+"");
			System.out.println("i : "+i+" Before Context : "+ temp +" : After Context : "+ context);
			if(Palindrome.checkForPalindrome(context,false)) {
				checkAndUpdateLongestPalindrome(context);
			}
			palindromicSubSequence_Backtracing_Approach( context ,  i+1);
			context = temp;  
			System.out.println("Resetting Context as : "+ context );
		}
	}
	
	

static void checkAndUpdateLongestPalindrome(String context) {
	if(Palindrome.checkForPalindrome(context,false)) {
		if(context.length()>longestPalindrome.length())longestPalindrome = context;
		if(context.length()==longestPalindrome.length())System.out.println("Palindromes are  :" + context);
	}
	
}
	
	
	
}
