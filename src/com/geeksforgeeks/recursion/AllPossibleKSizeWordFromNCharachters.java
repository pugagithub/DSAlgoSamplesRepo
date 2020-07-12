package com.geeksforgeeks.recursion;

public class AllPossibleKSizeWordFromNCharachters {

	//static String word = "ABC";

	static int K = 2;
	//static int N = word.length();
	
	static String givenWord = "ABC";

	public static void main(String[] args) {
		//combinationOfWord("ABC" , "");
		//anagram(givenWord,"");
		permutation(givenWord,"",0);
	}

	static void combinationOfWord(String word,String context ) {

		if(word.equals("")) {
			System.out.println(context);
			return;
		}
		for (int i = 0; i < word.length(); i++) {
			String temp = getMeReminingString(word, i);
			String s = context;
			context = context + word.charAt(i);
			combinationOfWord(temp , context);
			context = s;
		}
		
	}
	
	static void permutation(String dynamicWord , String context , int startIdx){
		
		for(int i=startIdx;i<dynamicWord.length();i++) {   // For permutation I starts from startIdx
			String newContext = context + dynamicWord.charAt(i);
			if(newContext.length()<K) {
				String temp = getMeReminingString(dynamicWord,i);
				permutation( temp, newContext , i);  // no (i+1) as you reduce dynamic string size by 1 , so it is i
			}
			else {
				combination(context + dynamicWord.charAt(i),"");
				//System.out.println(context + dynamicWord.charAt(i));
			}
		}
		
	}
	
	
	static void combination(String dynamicWord , String context  ){  
		
		if(dynamicWord.equals("")) {
			System.out.println(context);
		//	System.out.println("=====================================================================");
			return;
		}
		for(int i=0;i<dynamicWord.length();i++) {  // For Combination i starts from 0
		//	System.out.println("Context : "+ context);
			String nextContext  = context + dynamicWord.charAt(i);  
			String newDynamicWord = getMeReminingString(dynamicWord,i);
			combination(newDynamicWord , nextContext);
		}
	}

	static String getMeReminingString(String word, int idx) {
		String temp = "";
		for (int i = 0; i < word.length(); i++) {
			if (i != idx)
				temp = temp + word.charAt(i);
		}
		return temp;
	}

}
