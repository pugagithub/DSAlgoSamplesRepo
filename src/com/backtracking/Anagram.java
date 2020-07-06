package com.backtracking;

public class Anagram {
	
	
	static int count=0;
	
	public static void main(String[] args) {
		doAnagram("","ABCD");
	}
	
	
	public static void doAnagram(String prefix,String word){
		
		System.out.println("----------------------------------------------");
		
		System.out.println("Word is : "+ word);
		System.out.println("Prefix is : "+ prefix);
		
		if(word.length()==0){
			System.out.println(++count +": Printing :"+prefix);
		};
		
		for(int i=0;i<word.length();i++){
			System.out.println("Inside For Loop at the "+i+"th iteration" );
			
			System.out.println("\ni is : "+ i + " " +
					        "\nWord inside For Loop : "+ word+"" +
							"\nCharacter selected this time : "+ word.charAt(i) +
							"\nWord Length : "+ word.length() +
							"\nSubstring From 0 to i : " + word.substring(0,i) +
							"\nSubstring From (i+1) to word.length() : " +word.substring(i+1, word.length()) );
			
			doAnagram(
					prefix+word.charAt(i),
					word.substring(0,i) + word.substring(i+1, word.length()) // In case of string: startIndex: inclusive . endIndex: exclusive
					);
			
			System.out.println("================At the end of "+i+" iteration of For Loop Word is "+word+"============================");
			
			
		}
	}


	
}
