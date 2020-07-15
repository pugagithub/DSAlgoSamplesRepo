package com.geeksforgeeks.dynamicProgramming;

public class EditDistance_LevensteinDistance {
	
	static String word = "geeksmnop" /*"intention"*/ /*"horse"*/; 
	static String targetStr = "ge$eks" /*"execution"*/ /*"ros"*/; 
	
	
	public static void main(String[] args) {
		System.out.println("Count : "+ editDistance(word,0,0));	;
	}
	
	//We can use merge also
	static int editDistance(String orginalStr , int count , int startIdx){

		//int count = 0;
		if(startIdx>=orginalStr.length())return count;
		for(int i=startIdx;i<targetStr.length();i++) {
			
			if(i < orginalStr.length()) {
				
				if(!(orginalStr.charAt(i)+"").equals(targetStr.charAt(i)+"")) {
					
					String temp = orginalStr;
					
					String replacedString = replace(temp,i);
					String addedString = add(temp,i) ;
				//	String removedString = remove(temp,i);
					
					int countReplace = editDistance( replacedString,  count , i+1);
					
				//	System.out.println(" countReplace "+ countReplace);
					int countAdd =  editDistance(addedString,  count , i+1);
					//int countRemove = editDistance(removedString ,  count, i+1);
					
				//	int minCount = Math.min(Math.min(countReplace, countAdd), countRemove);
					
					orginalStr = temp;
					
					count = countReplace < countAdd ? countReplace : countAdd;
				}
			}
			else {
				orginalStr = orginalStr + targetStr.charAt(i); //if original is smaller
				count++;
			}
			
			
		}
		
		//If original is bigger
		if(orginalStr.length()>targetStr.length()) {
			//System.out.print("Before Removing Extra Chars :"+ orginalStr);
			count = count + (orginalStr.length() - targetStr.length());
			orginalStr = orginalStr.substring(0,targetStr.length());
			//System.out.print("  | After Removing Extra Chars "+ orginalStr);
			//System.out.println();
			
		}
		
		
		
		return count;
		
	}
	
	static String add(String orginalStr,int i ) {
		String temp =   orginalStr.substring(0,i)+targetStr.charAt(i)+orginalStr.substring(i); // Add
		//System.out.println("Original String : "+orginalStr+" Adding @ i : "+ i +" Before :"+ orginalStr +" After : "+ temp);
		return temp;
	}
	
	static String replace(String orginalStr,int i ) {
		String temp =    orginalStr.substring(0,i)+targetStr.charAt(i)+orginalStr.substring(i+1);
		//System.out.println("Original String : "+orginalStr+" Replacing @ i : "+ i +" Before :"+ orginalStr +" After : "+ temp);
		return temp;
	}
	
	static String remove(String orginalStr,int i) {
		
		String temp =     orginalStr.substring(0,i)+targetStr.charAt(i)+orginalStr.substring(i+1);
		System.out.println("Original String : "+orginalStr+" Removing @ i : "+ i +" Before :"+ orginalStr +" After : "+ temp);
		return temp;
	}
	
	//System.out.println("Printing orginalStr.substring(0,i) : "+ orginalStr.substring(0,i));
	//System.out.println("Printing orginalStr.substring(i+1) : "+ orginalStr.substring(i+1));
	//System.out.println("Printing newWord : "+ orginalStr);
	
	
	//newWord = orginalStr.substring(0,i+1)+targetStr.charAt(i)+orginalStr.substring(i+1); // Add
	
	

}
