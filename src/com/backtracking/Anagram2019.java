package com.backtracking;

public class Anagram2019 {
	
	
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
			System.out.println("Inside For Loop");
			
			System.out.println("i is : "+ i + ". Word inside For Loop : "+ word);
			
			System.out.println("Going to call doAnagram("+prefix + word.charAt(i)+ " : "
			+word.substring(0,i) + word.substring(i+1, word.length())+")");
			
			doAnagram(
					prefix + word.charAt(i),
					word.substring(0,i) + word.substring(i+1, word.length()) // This will reduce the word by len 1.
					);
			
			System.out.println("Recursive Function completed for prefix : "+prefix + ": word : "+word+" . Hence moving to next index of word : ");
			
			System.out.println("============================================");
			
			
		}
	}


	
}
