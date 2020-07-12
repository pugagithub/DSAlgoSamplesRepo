package com.geeksforgeeks.recursion;

import com.util.MyUtil;

public class Anagram_Swap_Based_WithoutSubstring {
	
	static String word = "ABC";
	static int lastIdx = word.length()-1;
	
	public static void main(String[] args) {
		
		anagram(word,0);
	}
	
	static void anagram(String str , int startIdx){
		
		 if (startIdx == lastIdx) System.out.println(str); 
		
		for(int i=startIdx;i<word.length();i++) {  // here startIdx acts like row
			str = MyUtil.swap_in_string(str, startIdx, i);
			anagram(str , startIdx+1);
			str = MyUtil.swap_in_string(str, startIdx , i);
		}
		
	}

}
