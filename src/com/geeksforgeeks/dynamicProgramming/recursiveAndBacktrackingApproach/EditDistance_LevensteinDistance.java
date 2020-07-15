package com.geeksforgeeks.dynamicProgramming.recursiveAndBacktrackingApproach;

import java.util.Arrays;
import java.util.Collections;

public class EditDistance_LevensteinDistance {
	
	static String word = "intention" /*"intention"*/ /*"horse"*/; 
	static String targetStr = "execution" /*"execution"*/ /*"ros"*/; 
	
	
	public static void main(String[] args) {
		System.out.println("Count : "+ editDistance(word,0,0,"Main Fn"));	;
	}
	
	//We can use merge also
	static int editDistance(String orginalStr , int count , int startIdx , String calledBy){
		
		System.out.println("Called By : "+ calledBy +" with i : "+ (startIdx));
		
		int i = startIdx;
		if (orginalStr.equals(targetStr)){
			System.out.println("Found String hence returning");
			return count;
		}
		if( startIdx>=orginalStr.length() || startIdx>=targetStr.length()) {
			
			if(startIdx>=targetStr.length()) {
				System.out.println("Index is more than target string index. orginalStr : "+ orginalStr + " targetStr : "+ targetStr +" startIdx : "+ startIdx+ ": count :"+ count);
				count = count + orginalStr.length() - startIdx;
				
						
			}
			
			else if(startIdx>=orginalStr.length()) {
				count = count + targetStr.length() - startIdx;
				System.out.println("Index is more than orginal string index. orginalStr  : "+ orginalStr + " targetStr : "+ targetStr +" startIdx : "+ startIdx+ ": count :"+ count);	
			}
			return count;
		}
		
			
		String replacedString ="", addedString ="", removedString = "";
		
		
				if((orginalStr.charAt(i)+"").equals(targetStr.charAt(i)+"")) {
					
					
					 System.out.println("Both are equal");
					 return editDistance( orginalStr,  count  , i+1 ,"BOTH EQUAL") ;
				}
				
				else {
					
					//String temp = orginalStr;
					//System.out.println("Called By :" + calledBy);
					 replacedString = replace(orginalStr,i);
					 
					 if(replacedString.equals(targetStr)) {
						 System.out.println("Found String hence returning after replacing");
						 return ++count;
					 }
					 
					 addedString = add(orginalStr,i) ;
					 if(addedString.equals(targetStr)) {
						 System.out.println("Found String hence returning after adding");
						 return ++count;
					 }
					 
					 removedString = remove(orginalStr,i);
					 if(removedString.equals(targetStr)) {
						 System.out.println("Found String hence returning after removing");
						 return ++count;
					 }
					
					count = count + 1;
					
					
					return  min(
							editDistance( replacedString,  count  , i+1 ,"REPLACE") ,
							editDistance(addedString,  count  , i+1 ,"ADD") ,
							editDistance(removedString ,  count , i , "REMOVE")
							
							
							
							
							);
					
					
					
				}
				
				
				
				
				
			
				
			
				
				
				
			/*
			 * else { orginalStr = orginalStr + targetStr.charAt(i); //if original is
			 * smaller count++; }
			 */
			
			
	//	}
		
		//If original is bigger
		/*
		 * if(orginalStr.length()>targetStr.length()) {
		 * //System.out.print("Before Removing Extra Chars :"+ orginalStr); count =
		 * count + (orginalStr.length() - targetStr.length()); orginalStr =
		 * orginalStr.substring(0,targetStr.length());
		 * //System.out.print("  | After Removing Extra Chars "+ orginalStr);
		 * //System.out.println();
		 * 
		 * }
		 */
		
		
		
		
	}
	
	static String add(String orginalStr,int i ) {
		String temp =   orginalStr.substring(0,i)+targetStr.charAt(i)+orginalStr.substring(i); // Add
		System.out.println("Original String : "+orginalStr+" Adding @ i : "+ i +" Before :"+ orginalStr +" After : "+ temp);
		return temp;
	}
	
	static String replace(String orginalStr,int i ) {
		String temp =    orginalStr.substring(0,i)+targetStr.charAt(i)+orginalStr.substring(i+1);
		System.out.println("Original String : "+orginalStr+" Replacing @ i : "+ i +" Before :"+ orginalStr +" After : "+ temp);
		return temp;
	}
	
	static String remove(String orginalStr,int i) {
		
		String temp =     orginalStr.substring(0,i)+orginalStr.substring(i+1);
		//System.out.println("Original String : "+orginalStr+" Removing @ i : "+ i +" Before :"+ orginalStr +" After : "+ temp);
		return temp;
	}
	
	//System.out.println("Printing orginalStr.substring(0,i) : "+ orginalStr.substring(0,i));
	//System.out.println("Printing orginalStr.substring(i+1) : "+ orginalStr.substring(i+1));
	//System.out.println("Printing newWord : "+ orginalStr);
	
	
	//newWord = orginalStr.substring(0,i+1)+targetStr.charAt(i)+orginalStr.substring(i+1); // Add
	
	static int min (Integer... a ){
		return Collections.min(Arrays.asList(a));
	}

}
